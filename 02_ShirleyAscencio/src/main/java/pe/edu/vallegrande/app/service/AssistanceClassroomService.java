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
import pe.edu.vallegrande.app.model.AssistanceClassroom;

public class AssistanceClassroomService {

	private Connection connection;
	private PreparedStatement statement;

	// Insertamos Asistencia
	public void insert(AssistanceClassroom assistanceClass) throws SQLException {
		String sql = null;

		try {

			connection = AccesoDB.getConnection();

			sql = "INSERT INTO assistance_classroom (student_id, grade, section, shifts, matter_id, teacher_id) VALUES (?, ?, ?, ?, ?, ?)";
			statement = connection.prepareStatement(sql);

			statement.setInt(1, assistanceClass.getStudent_id());
			statement.setString(2, assistanceClass.getGrade());
			statement.setString(3, assistanceClass.getSection());
			statement.setString(4, assistanceClass.getShifts());
			statement.setInt(5, assistanceClass.getMatter_id());
			statement.setInt(6, assistanceClass.getTeacher_id());

			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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

	// Lista por Id las asistenciias.
	public AssistanceClassroom getAssistanceClassById(int id) throws SQLException {
		AssistanceClassroom sistem = null;
		String sql = "SELECT * FROM assistance_classroom WHERE id = ?";

		try {
			connection = AccesoDB.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				sistem = new AssistanceClassroom();
				sistem.setId(resultSet.getInt("id"));
				sistem.setStudent_id(resultSet.getInt("student_id"));
				sistem.setGrade(resultSet.getString("grade"));
				sistem.setSection(resultSet.getString("section"));
				sistem.setShifts(resultSet.getString("shifts"));
				sistem.setMatter_id(resultSet.getInt("matter_id"));
				sistem.setTeacher_id(resultSet.getInt("teacher_id"));
			}

			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}

		return sistem;
	}

	/// Lista general de las asistencias
	public List<Map<String, String>> getAllAssistanceClasses() throws SQLException {
		List<Map<String, String>> resultList = new ArrayList<>();
		String sql = "SELECT ac.id AS ID, T.names AS DOCENTE, m.names AS MATERIA, CONCAT(s.names, ' ', s.lastname) AS ESTUDIANTE, ac.grade AS GRADO, ac.section AS SECCION "
				+ "FROM assistance_classroom ac " + "JOIN student s ON ac.student_id = s.student_id "
				+ "LEFT JOIN matter m ON ac.matter_id = m.id " + "LEFT JOIN teacher t ON ac.teacher_id = t.id";

		try {
			connection = AccesoDB.getConnection();
			statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Map<String, String> resultMap = new HashMap<>();
				resultMap.put("ID", resultSet.getString("ID"));
				resultMap.put("DOCENTE", resultSet.getString("DOCENTE"));
				resultMap.put("MATERIA", resultSet.getString("MATERIA"));
				resultMap.put("ESTUDIANTE", resultSet.getString("ESTUDIANTE"));
				resultMap.put("GRADO", resultSet.getString("GRADO"));
				resultMap.put("SECCION", resultSet.getString("SECCION"));

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

	// Actualizacion de la asistencia
	public void update(AssistanceClassroom assistanceClass) throws SQLException {
		String sql = null;
		try {
			connection = AccesoDB.getConnection();
			sql = "UPDATE assistance_classroom SET student_id = ?, grade = ?, section = ?, shifts = ?, matter_id = ?, teacher_id = ? WHERE id = ?";
			statement = connection.prepareStatement(sql);

			statement.setInt(1, assistanceClass.getStudent_id());
			;
			statement.setString(2, assistanceClass.getGrade());
			statement.setString(3, assistanceClass.getSection());
			statement.setString(4, assistanceClass.getShifts());
			statement.setInt(5, assistanceClass.getMatter_id());
			statement.setInt(6, assistanceClass.getTeacher_id());
			statement.setInt(7, assistanceClass.getId());

			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public AssistanceClassroom getForGrade(String grade) {
		AssistanceClassroom assistance = null;
		String sql = "SELECT * FROM assistance_classroom WHERE grade = ? ";

		try {
			connection = AccesoDB.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, grade);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				assistance = new AssistanceClassroom();
				assistance.setId(resultSet.getInt("id"));
				assistance.setStudent_id(resultSet.getInt("student_id"));
				assistance.setGrade(resultSet.getString("grade"));
				assistance.setSection(resultSet.getString("section"));
				assistance.setShifts(resultSet.getString("shifts"));
				assistance.setMatter_id(resultSet.getInt("matter_id"));
				assistance.setTeacher_id(resultSet.getInt("teacher_id"));
			}

			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}

		return assistance;
	}

	public AssistanceClassroom getForSection(String section) {
		AssistanceClassroom assistance = null;
		String sql = "SELECT * FROM assistance_classroom WHERE section = ? ";

		try {
			connection = AccesoDB.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, section);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				assistance = new AssistanceClassroom();
				assistance.setId(resultSet.getInt("id"));
				assistance.setStudent_id(resultSet.getInt("student_id"));
				assistance.setGrade(resultSet.getString("grade"));
				assistance.setSection(resultSet.getString("section"));
				assistance.setShifts(resultSet.getString("shifts"));
				assistance.setMatter_id(resultSet.getInt("matter_id"));
				assistance.setTeacher_id(resultSet.getInt("teacher_id"));
			}

			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}

		return assistance;
	}

}
