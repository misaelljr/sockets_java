import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread extends Thread{

	Socket cliente;

	public ServerThread(Socket clien) {
		cliente = clien;

	}

	public void run() {

		try {
			
			System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
			PrintStream saida = new PrintStream(cliente.getOutputStream());

			Scanner s = new Scanner(cliente.getInputStream());

			while (s.hasNextLine()) {
				String r = s.nextLine();
				System.out.println(r);
				saida.println("Recebido: " + r);
			}
			
			System.out.println("Fim da conexão com " + cliente.getInetAddress().getHostAddress());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}



}
