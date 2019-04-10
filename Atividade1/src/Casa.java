public class Casa {
//atributos
	private Porta porta1;
	private Porta porta2;
	private Porta porta3;
	private static String corCasa;
	private int abertas;
	
	//construtor
		public Casa() {
			
			
			
			this.pint ("Rosa");
			
			Porta porta1 = new Porta();
			porta1.pinta("Branca");
			porta1.setDimensaoX(3);
			porta1.setDimensaoY(4);
			porta1.setDimensaoZ(5);
			porta1.abre();
			
			Porta porta2 = new Porta();
			porta2.pinta("Preto");
			porta2.setDimensaoX(3);
			porta2.setDimensaoY(4);
			porta2.setDimensaoZ(5);
			porta2.abre();
			
			Porta porta3 = new Porta();
			porta3.pinta("Preto");
			porta3.setDimensaoX(3);
			porta3.setDimensaoY(4);
			porta3.setDimensaoZ(5);
			porta3.fecha();
			
			this.porta1 = porta1;
			this.porta2 = porta2;
			this.porta3 = porta3;
			
		}
	
	
	public String getCor(){
		
		return corCasa;
		
	}
	
	public void pint (String corNova) {
		
		corCasa = corNova;
		
	}
	
	
	public int quantasPortasEstaoAbertas() {
		
		
		
		if (porta2.estaAberta()) 
		{
			
			abertas++;
			
		}
		
		if (porta3.estaAberta()) 
		
		{
			
			abertas++;

		
		}

		if (this.porta1.estaAberta() == true) 
		{
	
			abertas++;
	

		}
		
		return abertas;

	}
		public static void main(String[] args){
			
			Casa minhaCasa = new Casa();
			
			minhaCasa.quantasPortasEstaoAbertas();
			
			System.out.println(" A casa tem  " + " " +  minhaCasa.abertas + " " + " portas abertas " );
		}
		
}
	
		
