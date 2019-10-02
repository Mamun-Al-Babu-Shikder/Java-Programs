import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            Socket socket = new Socket("127.0.0.1", 6666);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            dataOutputStream.writeUTF("Hi...");
            System.out.println("You : Hi...");
            
            String message;
            while (!(message = dataInputStream.readUTF()).equals("bye")) {
                System.out.println("Server : " + message);
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
