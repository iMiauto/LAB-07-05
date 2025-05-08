import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String argv[]) throws Exception {
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket( "DESKTOP-T5P10TL", 7489);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        System.out.print("Ingrese el primer número: ");
        String num1 = inFromUser.readLine();
        System.out.print("Ingrese el segundo número: ");
        String num2 = inFromUser.readLine();

        outToServer.writeBytes(num1 + " " + num2 + '\n'); // Enviar ambos números

        String modifiedSentence = inFromServer.readLine(); // Recibir la respuesta del servidor
        System.out.println("FROM SERVER: " + modifiedSentence);

        clientSocket.close();
    }
}

// hola mundo