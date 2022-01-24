package turkcellHW;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private int DateOfBirth;
	private String nationalitId;
	public Customer() {
		super();
	}
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalitId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = dateOfBirth;
		this.nationalitId = nationalitId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalitId() {
		return nationalitId;
	}
	public void setNationalitId(String nationalitId) {
		this.nationalitId = nationalitId;
	}
	
}
