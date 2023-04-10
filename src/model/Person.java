package model; 

public class Person {

	private String name;
	private String id;
	private int aye;

	public Person(String name, String id, int aye) {
		this.name = name;
		this.id = id;
		this.aye = aye;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setAye(int aye) {
		this.aye = aye;
	}

	public int getAye() {
		return aye;
	}

}
