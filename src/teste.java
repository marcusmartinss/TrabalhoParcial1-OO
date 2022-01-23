import java.io.FileWriter;

public class teste {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("dados.bin");
			
			String tema = "Audi";
			
			for ( int i = 0; i < tema.length() ; i++ ) {
				fw.write("_ ");
				
			}
			fw.close();
			System.out.println("Feito!");
			
		} catch(Exception ex) {
			System.out.println("Erro!");
		}

	}

}
