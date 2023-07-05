package pe.edu.vallegrande.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.edu.vallegrande.app.model.Teacher;
import pe.edu.vallegrande.app.service.CrudTeacherService;

@WebServlet("/TeacherListar")
public class AssistanceEducationalStaffController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private CrudTeacherService service = new CrudTeacherService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<Teacher> teacherList = getAll();

			// Preparando el JSON
			Gson gson = new Gson();
			String json = gson.toJson(teacherList);

			// Estableciendo la respuesta como JSON
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json);
		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("Error al obtener la lista de docentes: " + e.getMessage());
		}
	}

	private List<Teacher> getAll() {
		CrudTeacherService crudTeacherService = new CrudTeacherService();
		List<Teacher> listaTeacher = crudTeacherService.getAll();
		// Realizar las acciones necesarias con la lista teacherList
		return listaTeacher;
	}
}
