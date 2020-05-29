import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException{
		
		//criando servidor e disponibilizando porta
		ServerSocket servidor = new ServerSocket(456);
		System.out.println("Porta 456 aberta1");
		
		//criando conexão para cliente
		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
		
		//ler todas as informações enviadas pelo cliente
		Scanner s = new Scanner(cliente.getInputStream());
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }

        s.close();
		//finalizar servidor
        servidor.close();
		//finalizar cliente
        cliente.close();
	}

}
