package pe.edu.vallegrande.app.model;

public class AssistanceClassroomDetail {

	
	private Integer id;
	private String states;
	private Integer assitance_classroom_id;
	
	public AssistanceClassroomDetail() {
		// TODO Auto-generated constructor stub
	}

	
	public AssistanceClassroomDetail(Integer id, String states, Integer assitance_classroom_id) {
		super();
		this.id = id;
		this.states = states;
		this.assitance_classroom_id = assitance_classroom_id;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the states
	 */
	public String getStates() {
		return states;
	}


	/**
	 * @param states the states to set
	 */
	public void setStates(String states) {
		this.states = states;
	}


	/**
	 * @return the assitance_classroom_id
	 */
	public int getAssitance_classroom_id() {
		return assitance_classroom_id;
	}


	/**
	 * @param assitance_classroom_id the assitance_classroom_id to set
	 */
	public void setAssitance_classroom_id(Integer assitance_classroom_id) {
		this.assitance_classroom_id = assitance_classroom_id;
	}


	
	
	@Override
	public String toString() {
		return "AssistanceClassroomDetail [id=" + id + ", states=" + states + ", assitance_classroom_id="
				+ assitance_classroom_id + "]";
	}
	
	
}
