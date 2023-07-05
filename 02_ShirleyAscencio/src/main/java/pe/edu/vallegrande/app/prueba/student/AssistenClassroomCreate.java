package pe.edu.vallegrande.app.prueba.student;

import pe.edu.vallegrande.app.model.AssistanceClassroom;
import pe.edu.vallegrande.app.service.AssistanceClassroomService;

public class AssistenClassroomCreate {
	public static void main(String[] args) {
        try {
            // Crear objeto de estudiante
        	AssistanceClassroom sisten = new AssistanceClassroom();
            sisten.setStudent_id(1);
            sisten.setGrade("1");
            sisten.setSection("A");
            sisten.setShifts("T");
            sisten.setMatter_id(11);
            sisten.setTeacher_id(1);
            // Instanciar el servicio de estudiantes
            AssistanceClassroomService asitenciaService = new AssistanceClassroomService();

            // Insertar estudiante
            asitenciaService.insert(sisten);

            // Mostrar mensaje de éxito
            System.out.println("Registro insertado correctamente. ID: " + sisten.getId());
        } catch (Exception e) {
            System.err.println("No se pudo insertar el registro: " + e.getMessage());
        }
    }
}
