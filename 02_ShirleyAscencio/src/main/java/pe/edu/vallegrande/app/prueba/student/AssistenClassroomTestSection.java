package pe.edu.vallegrande.app.prueba.student;

import pe.edu.vallegrande.app.model.AssistanceClassroom;
import pe.edu.vallegrande.app.service.AssistanceClassroomService;

public class AssistenClassroomTestSection {
	 public static void main(String[] args) {
	        try {
	            AssistanceClassroomService assistanceService = new AssistanceClassroomService();
	            String assistanceSection = "B"; // 
	            AssistanceClassroom assistance = assistanceService.getForSection(assistanceSection);
	            if (assistance != null) {
	                System.out.println("Sección encontrado:");
	                System.out.println(assistance);
	            } else {
	                System.out.println("No se encontró la sección " + assistanceSection);
	            }
	        } catch (Exception e) {
	            System.err.println("Error al consultar por sección: " + e.getMessage());
	        }
	    }

}
