	package pe.edu.vallegrande.app.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.edu.vallegrande.app.model.AssistanceClassroom;
import pe.edu.vallegrande.app.service.AssistanceClassroomService;

@WebServlet({ "/AssistanceProcesar","/AssistanceBuscar" })
public class AssistanceClassroomController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private AssistanceClassroomService service = new AssistanceClassroomService();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/AssistanceProcesar":
			procesar(request, response);
			break;
		case "/AssistanceBuscar":
			buscar(request, response);
			break;
		}
	}

	private void procesar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Datos
		String accion = request.getParameter("accion");

		AssistanceClassroom assistanceClass = new AssistanceClassroom();

		if (request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
			assistanceClass.setId(Integer.parseInt(request.getParameter("id")));
		}

		assistanceClass.setStudent_id(Integer.parseInt(request.getParameter("student_id")));
		assistanceClass.setGrade(request.getParameter("grade"));
		assistanceClass.setSection(request.getParameter("section"));
		assistanceClass.setShifts(request.getParameter("shifts"));
		assistanceClass.setMatter_id(Integer.parseInt(request.getParameter("matter_id")));
		assistanceClass.setTeacher_id(Integer.parseInt(request.getParameter("teacher_id")));
		// proceso
		try {
			switch (accion) {
			case "nuevo":
				service.insert(assistanceClass);
				break;
			case "editar":
				service.update(assistanceClass);
				break;
			}
			response.getWriter().println("AssistanceClass procesado con éxito");
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en el servidor");
		}
	}

	private void buscar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<Map<String, String>> assistanceClasses = service.getAllAssistanceClasses();
			// preparando el JSON
			Gson gson = new Gson();
			String json = gson.toJson(assistanceClasses);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json);
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en el servidor");
		}
	}
}