package secao10;

public class Quarto {
	
	private final String name;
	
	private final String email;
	
	public Quarto(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return name + ", "+ email;
	}
}
