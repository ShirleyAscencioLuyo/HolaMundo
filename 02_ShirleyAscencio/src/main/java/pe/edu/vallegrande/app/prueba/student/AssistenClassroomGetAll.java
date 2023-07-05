package pe.edu.vallegrande.app.prueba.student;

import java.util.List;
import java.util.Map;

import pe.edu.vallegrande.app.service.AssistanceClassroomService;

public class AssistenClassroomGetAll {
	public static void main(String[] args) {
        try {
            AssistanceClassroomService assistService = new AssistanceClassroomService();
            List<Map<String, String>> lista = assistService.getAllAssistanceClasses();
            if (!lista.isEmpty()) {
                System.out.println("Aula:");
                for (Map<String, String> assist : lista) {
                    System.out.println(assist);
                }
            } else {
                System.out.println("Aula.");
            }
        } catch (Exception e) {
            System.err.println("Error al obtener el aula: " + e.getMessage());
        }
    }
}