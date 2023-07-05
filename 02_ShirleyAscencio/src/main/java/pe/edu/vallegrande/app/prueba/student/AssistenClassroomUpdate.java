package pe.edu.vallegrande.app.prueba.student;

import pe.edu.vallegrande.app.model.AssistanceClassroom;
import pe.edu.vallegrande.app.service.AssistanceClassroomService;

public class AssistenClassroomUpdate {

	public static void main(String[] args) {
        try {
            // Crear objeto de estudiante
            AssistanceClassroom assist = new AssistanceClassroom();
            assist.setId(16);
            assist.setStudent_id(5); // ID del estudiante a actualizar
            assist.setGrade("2");
            assist.setSection("B");
            assist.setShifts("M");
            assist.setMatter_id(1);
            assist.setTeacher_id(2);
            
            // Instanciar el servicio de estudiantes
            AssistanceClassroomService assistService = new AssistanceClassroomService();

            // Actualizar estudiante
            assistService.update(assist);

            // Mostrar mensaje de éxito
            System.out.println("Asistencia actualizada correctamente.");
        } catch (Exception e) {
            System.err.println("No se pudo actualizar la asistencia: " + e.getMessage());
        }
    }
	
}
