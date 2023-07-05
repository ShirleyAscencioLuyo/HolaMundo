package pe.edu.vallegrande.app.prueba.student;

import pe.edu.vallegrande.app.model.AssistanceClassroom;
import pe.edu.vallegrande.app.service.AssistanceClassroomService;

public class AssistenClassroomDetailTestID {
	 public static void main(String[] args) {
	        try {
	            AssistanceClassroomService assistService = new AssistanceClassroomService();
	            int assiteId = 12; // ID del profesor que deseas consultar
	            AssistanceClassroom assist = assistService.getAssistanceClassById(assiteId);
	            if (assist != null) {
	                System.out.println("Asistencia encontrada:");
	                System.out.println(assist);
	            } else {
	                System.out.println("No se encontró la asistencia con ID " + assiteId);
	            }
	        } catch (Exception e) {
	            System.err.println("Error al consultar el asistencia: " + e.getMessage());
	        }
	    }

}
