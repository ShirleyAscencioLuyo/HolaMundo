package pe.edu.vallegrande.app.model;

public class Matter {

	private int id;
	private String names;
	
	public Matter() {
		// TODO Auto-generated constructor stub
	}

	public Matter(int id, String names) {
		super();
		this.id = id;
		this.names = names;
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
	 * @return the names
	 */
	public String getNames() {
		return names;
	}

	/**
	 * @param names the names to set
	 */
	public void setNames(String names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Matter [id=" + id + ", names=" + names + "]";
	}
		
	
}
