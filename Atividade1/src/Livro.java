import java.util.Scanner;


public class Livro {

private String nome;
private Author autor;
private double preco;
private int quantEstoque;


//construtor
public Livro(String nome, Author autor, double preco, int quantEstoque){
	
	this.nome = nome;
	this.autor = autor;
	this.preco = preco;
	this.quantEstoque = quantEstoque;
	
	
}


public double getPreco() {
	return preco;
}


public void setPreco(double preco) {
	this.preco = preco;
}


public int getQuantEstoque() {
	return quantEstoque;
}


public void setQuantEstoque(int quantEstoque) {
	this.quantEstoque = quantEstoque;
}


public String getNome() {
	return nome;
}


public Author getAutor() {
	return autor;
}


public String toString() {
	return "Livro: " + nome + " " + autor + ", preco=" + preco
			+ ", quantEstoque=" + quantEstoque + "]";
}
	

public static void main (String [] args){

	
	Scanner scan = new Scanner(System.in);
	Author autor1 = new Author("Eduardo", "Eduardogomes42hotmail.com", 'M');
	Author autor2 = new Author ("Natalia", "nataliafradique@gmail.com" , 'F');

	
	String nome;
	int quantEstoque;
	double preco;
	
	
	System.out.println("Digite o nome do livro: ");
	nome = scan.nextLine();
	System.out.println("Digite o preço ");
	preco = scan.nextDouble();
	System.out.println("Digite a quantidade em estoque");
	quantEstoque = scan.nextInt();
	
	
	Livro livro1 = new Livro(nome, autor1, preco, quantEstoque);{
		
		
		
	}
	
	System.out.println("Digite o nome do livro 2: ");
	nome = scan.nextLine();
	nome = scan.nextLine();
	System.out.println("Digite o preço ");
	preco = scan.nextDouble();
	System.out.println("Digite a quantidade em estoque");
	quantEstoque = scan.nextInt();
	
	
	Livro livro2 = new Livro(nome, autor2, preco, quantEstoque);{
		
		
		
	}
	
System.out.println(livro1);	
	
System.out.println(livro2);	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
}
}
