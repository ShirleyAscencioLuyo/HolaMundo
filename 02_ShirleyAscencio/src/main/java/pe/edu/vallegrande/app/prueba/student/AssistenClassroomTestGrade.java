package pe.edu.vallegrande.app.prueba.student;

import pe.edu.vallegrande.app.model.AssistanceClassroom;
import pe.edu.vallegrande.app.service.AssistanceClassroomService;

public class AssistenClassroomTestGrade {
	 public static void main(String[] args) {
	        try {
	            AssistanceClassroomService assistanceService = new AssistanceClassroomService();
	            String assistanceGrade = "2"; // 
	            AssistanceClassroom assistance = assistanceService.getForGrade(assistanceGrade);
	            if (assistance != null) {
	                System.out.println("Grado encontrado:");
	                System.out.println(assistance);
	            } else {
	                System.out.println("No se encontró el Grado " + assistanceGrade);
	            }
	        } catch (Exception e) {
	            System.err.println("Error al consultar por grado: " + e.getMessage());
	        }
	    }

}
