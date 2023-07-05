package pe.edu.vallegrande.app.prueba.student;

import java.util.List;
import java.util.Map;

import pe.edu.vallegrande.app.service.AssistanceClassroomDetailService;

public class AssistenClassroomDetailGetAll {
	public static void main(String[] args) {
        try {
            AssistanceClassroomDetailService assistService = new AssistanceClassroomDetailService();
            List<Map<String, String>> lista = assistService.getAllAssistanceClassesDetail();
            if (!lista.isEmpty()) {
                System.out.println("Aula detalle:");
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