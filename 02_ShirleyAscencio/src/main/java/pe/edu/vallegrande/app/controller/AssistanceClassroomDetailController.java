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

import pe.edu.vallegrande.app.model.AssistanceClassroomDetail;
import pe.edu.vallegrande.app.service.AssistanceClassroomDetailService;

@WebServlet({ "/AssistanceDetailProcesar","/AssistanceDetailBuscar" })
public class AssistanceClassroomDetailController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private AssistanceClassroomDetailService service = new AssistanceClassroomDetailService();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/AssistanceDetailProcesar":
			procesar(request, response);
			break;
		case "/AssistanceDetailBuscar":
			buscar1(request, response);
			break;
		}
	}

	private void procesar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Datos
		String accion = request.getParameter("accion");

		AssistanceClassroomDetail assistanceClass = new AssistanceClassroomDetail();

		if (request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
			assistanceClass.setId(Integer.parseInt(request.getParameter("id")));
		}

		assistanceClass.setStates(request.getParameter("states"));
		assistanceClass.setAssitance_classroom_id(Integer.parseInt(request.getParameter("grade")));
		switch (accion) {
		case "nuevo":
			service.create(assistanceClass);
			break;
		case "editar":
			service.update(assistanceClass);
			break;
		}
		response.getWriter().println("AssistanceClassDetail procesado con éxito");
	}

	private void buscar1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<Map<String, String>> assistanceClasses = service.getAllAssistanceClassesDetail();
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