import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorThread extends Thread{

	public static void main(String[] args) throws IOException {

		//criando servidor e disponibilizando porta
		ServerSocket servidor = new ServerSocket(9669);
		System.out.println("Porta 9669 aberta1");

		while (true) {

			//criando cliente e definindo IP e porta para se conectar com servidor
			Socket cliente = servidor.accept();
			Thread st = new ServerThread(cliente);
			st.start();

		}

	}

}
