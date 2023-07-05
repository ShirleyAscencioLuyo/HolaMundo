package pe.edu.vallegrande.app.service;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pe.edu.vallegrande.app.db.AccesoDB;
import pe.edu.vallegrande.app.model.Teacher;
import pe.edu.vallegrande.app.service.spec.CrudServiceSpec;

public class assistanceEducationalStaffService implements CrudServiceSpec<Teacher> {

	  private Connection connection;
	  private PreparedStatement statement;
	    
	@Override
	public List<Teacher> getAll() {
		    // Llamar al método getAll() de TeacherService
		CrudTeacherService crudTeacherService = new CrudTeacherService();
		    List<Teacher> listaTeacher = crudTeacherService.getAll();

		    // Realizar las acciones necesarias con la lista teacherList

		    return listaTeacher;
		}
	
	@Override
	public Teacher getForId(Integer id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Teacher> get(Teacher bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Teacher bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Teacher bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void active(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
