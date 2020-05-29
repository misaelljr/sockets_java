import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//criando cliente e definindo IP e porta para se conectar com servidor
		Socket cliente = new Socket("127.0.0.1", 9669);
		System.out.println("O cliente se conectou ao servidor!");
		
		//ler dados do cliente
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		//lendo linha por linha
		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();
		//Finaliza cliente
		cliente.close();

	}

}
