package pe.edu.vallegrande.app.model;

import javax.xml.crypto.Data;

public class AssistenceStudent {

	private int id;
	private int student_id;
	private Data input;
	private String section;
	private String grade_section;
	private int states;
	private int Observation;
	
	public AssistenceStudent() {
		// TODO Auto-generated constructor stub
	}

	public AssistenceStudent(int id, int student_id, Data input, String section, String grade_section, int states,
			int observation) {
		super();
		this.id = id;
		this.student_id = student_id;
		this.input = input;
		this.section = section;
		this.grade_section = grade_section;
		this.states = states;
		Observation = observation;
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
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	/**
	 * @return the input
	 */
	public Data getInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(Data input) {
		this.input = input;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * @return the grade_section
	 */
	public String getGrade_section() {
		return grade_section;
	}

	/**
	 * @param grade_section the grade_section to set
	 */
	public void setGrade_section(String grade_section) {
		this.grade_section = grade_section;
	}

	/**
	 * @return the states
	 */
	public int getStates() {
		return states;
	}

	/**
	 * @param states the states to set
	 */
	public void setStates(int states) {
		this.states = states;
	}

	/**
	 * @return the observation
	 */
	public int getObservation() {
		return Observation;
	}

	/**
	 * @param observation the observation to set
	 */
	public void setObservation(int observation) {
		Observation = observation;
	}

	@Override
	public String toString() {
		return "AssistenceStudent [id=" + id + ", student_id=" + student_id + ", input=" + input + ", section="
				+ section + ", grade_section=" + grade_section + ", states=" + states + ", Observation=" + Observation
				+ "]";
	}
	
}

