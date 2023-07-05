package pe.edu.vallegrande.app.model;

public class AssistanceClassroom {

	private Integer id;
	private Integer student_id;
	private String grade;
	private String section;
	private String shifts;
	private Integer matter_id;
	private Integer teacher_id;
	
	
	public AssistanceClassroom(Integer id, Integer student_id, String grade, String section, String shifts, Integer matter_id,
			int teacher_id) {
		super();
		this.id = id;
		this.student_id = student_id;
		this.grade = grade;
		this.section = section;
		this.shifts = shifts;
		this.matter_id = matter_id;
		this.teacher_id = teacher_id;
	}


	public AssistanceClassroom() {
		// TODO Auto-generated constructor stub
	}


	


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the student_id
	 */
	public Integer getStudent_id() {
		return student_id;
	}


	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}


	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}


	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
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
	 * @return the shifts
	 */
	public String getShifts() {
		return shifts;
	}


	/**
	 * @param shifts the shifts to set
	 */
	public void setShifts(String shifts) {
		this.shifts = shifts;
	}


	/**
	 * @return the matter_id
	 */
	public Integer getMatter_id() {
		return matter_id;
	}


	/**
	 * @param matter_id the matter_id to set
	 */
	public void setMatter_id(Integer matter_id) {
		this.matter_id = matter_id;
	}


	/**
	 * @return the teacher_id
	 */
	public Integer getTeacher_id() {
		return teacher_id;
	}


	/**
	 * @param teacher_id the teacher_id to set
	 */
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}



	@Override
	public String toString() {
		return "AssistanceClass [id=" + id + ", student_id=" + student_id + ", grade=" + grade + ", section=" + section
				+ ", shifts=" + shifts + ", matter_id=" + matter_id + ", teacher_id=" + teacher_id +"]";
	}
	
	
}
