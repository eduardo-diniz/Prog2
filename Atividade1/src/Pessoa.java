
public class Pessoa {

private String nome;

private int idade;

public void setNome(String novoNome){

 nome = novoNome;
 
}

public String getNome () {
 
 return nome;
 
}

public void fazerAniversario() {
 
 idade = idade + 1;
}

public int getIdade() {
 
 return idade;
}

public void setIdade(int novaIdade) {
 
 idade = novaIdade;
 
}


public static void main(String[] args) {
 
 Pessoa p1 = new Pessoa();
 
 p1.setNome("Eduardo");
 p1.setIdade(10);
 p1.fazerAniversario();
 p1.fazerAniversario();
 p1.fazerAniversario();
 System.out.println(p1.getNome() + " " + p1.getIdade());
 
}
}