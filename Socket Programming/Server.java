import java.util.Scanner;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            System.out.println("Watting for client...");
            Socket socket = serverSocket.accept();

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            String message;
            while (!(message = dataInputStream.readUTF()).equals("bye")) {
                System.out.println("Client : " + message);
                System.out.print("You : ");
                message = sc.nextLine();
                dataOutputStream.writeUTF(message);
            }
            sc.close();
			socket.close();
			
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
