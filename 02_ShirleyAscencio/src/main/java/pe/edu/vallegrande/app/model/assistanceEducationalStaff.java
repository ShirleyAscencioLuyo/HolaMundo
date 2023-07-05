package pe.edu.vallegrande.app.model;


public class assistanceEducationalStaff {

	private Integer id;
	private Integer teacherId;
	private String states;
	private String shifts;
	private String input;
	private String output;
	private String observaciones;

		public assistanceEducationalStaff() {

		}
		
		public assistanceEducationalStaff(Integer id, Integer teacherId, String states, String shifts, String input,
				String output, String observaciones) {
			super();
			this.id = id;
			this.teacherId = teacherId;
			this.states = states;
			this.shifts = shifts;
			this.input = input;
			this.output = output;
			this.observaciones = observaciones;
		}
		public Integer getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public Integer getTeacherId() {
			return teacherId;
		}
		
		public void setTeacherIde(Integer teacherId) {
			this.teacherId = teacherId;
		}
		public String getStates() {
			return states;
		}

		public void setStates(String states) {
			this.states = states;
		}
		
		public String getShifts() {
			return shifts;
		}

		public void setShifts(String shifts) {
			this.shifts = shifts;
		}
		
		public String getInput() {
			return input;
		}

		public void setInput(String input) {
			this.input = input;
		}
		
		public String getOutput() {
			return output;
		}

		public void setOutput(String output) {
			this.output = output;
		}
		
		public String getObservaciones() {
			return observaciones;
		}

		public void setObservaciones(String observaciones) {
			this.observaciones = observaciones;
		}
		
		public String toString() {
			return "assistanceEducationalStaff [id=" + id + ", teacherId=" + teacherId + ", shifts=" + shifts
					+ ", input=" + input + ", output=" + output + ", observaciones=" + observaciones + "]";
		}
		
}