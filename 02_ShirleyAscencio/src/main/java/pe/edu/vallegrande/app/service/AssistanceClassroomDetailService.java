package pe.edu.vallegrande.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pe.edu.vallegrande.app.db.AccesoDB;
import pe.edu.vallegrande.app.model.AssistanceClassroomDetail;

public class AssistanceClassroomDetailService {

	private Connection connection;
	private PreparedStatement statement;

	// Insertamos nuevo registro
	public AssistanceClassroomDetail create(AssistanceClassroomDetail detail) {
		String sql = null;

		try {

			connection = AccesoDB.getConnection();

			sql = "INSERT INTO assistance_classroom_detail (states, assitance_classroom_id) VALUES (?, ?)";
			statement = connection.prepareStatement(sql);

			statement.setString(1, detail.getStates());
			statement.setInt(2, detail.getAssitance_classroom_id());

			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return detail;
	}

	private void closeResources() {
		try {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// obetemos registros por id
	public AssistanceClassroomDetail getAssistemId(int id) {
		AssistanceClassroomDetail sistem = null;
		String sql = "SELECT * FROM assistance_classroom_detail WHERE id = ?";

		try {
			connection = AccesoDB.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				sistem = new AssistanceClassroomDetail();
				sistem.setId(resultSet.getInt("id"));
				sistem.setStates(resultSet.getString("states"));
				sistem.setAssitance_classroom_id(resultSet.getInt("assitance_classroom_id"));
			}

			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}

		return sistem;
	}

	public AssistanceClassroomDetail update(AssistanceClassroomDetail detail) {
		String sql = null;
		try {
			connection = AccesoDB.getConnection();
			sql = "UPDATE assistance_classroom_detail SET states = ? WHERE id = ?";
			statement = connection.prepareStatement(sql);

			statement.setString(1, detail.getStates());

			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return detail;
	}

	public List<Map<String, String>> getAllAssistanceClassesDetail() throws SQLException {
		List<Map<String, String>> resultList = new ArrayList<>();
		try {
			String sql = "SELECT t.names AS DOCENTE, m.names AS MATERIA, CONCAT(s.names, ' ', s.lastname) AS ESTUDIANTE, ac.grade AS GRADO, ac.section AS SECCION, acd.states "
					+ "FROM assistance_classroom_detail AS acd "
					+ "INNER JOIN assistance_classroom AS ac ON acd.assitance_classroom_id = ac.student_id "
					+ "INNER JOIN student AS s ON ac.student_id = s.student_id "
					+ "INNER JOIN matter AS m ON ac.matter_id = m.id "
					+ "INNER JOIN teacher AS t ON ac.teacher_id = t.id";

			connection = AccesoDB.getConnection();
			statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Map<String, String> resultMap = new HashMap<>();
				resultMap.put("DOCENTE", resultSet.getString("DOCENTE"));
				resultMap.put("MATERIA", resultSet.getString("MATERIA"));
				resultMap.put("ESTUDIANTE", resultSet.getString("ESTUDIANTE"));
				resultMap.put("GRADO", resultSet.getString("GRADO"));
				resultMap.put("SECCION", resultSet.getString("SECCION"));
				resultMap.put("states", resultSet.getString("states"));

				resultList.add(resultMap);
			}

			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}

		return resultList;
	}

}
