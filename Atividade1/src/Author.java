
public class Author {
	
	private String nome;
	private String email;
	private char genero;
	
	//construtor 
	public Author(String nome, String email, char genero) 
	{
		
		this.nome = nome;
		this.email = email;
		this.genero = genero;
		
	
		
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGenero() {
		return genero;
	}

	public String toString() {
		return "Author:" + nome + ", email=" + email + ", genero="
				+ genero + " ";
	}

	
	
	
	
}
