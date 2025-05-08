import java.io.*;
import java.net.*;
//Benjamín Pizarro Chaves
//Javier Contreras López
//Karilyn Cortés Espinoza
//Roberth Ponce Juárez
class TCPServer {

    public static void main(String argv[]) throws Exception {
        ServerSocket welcomeSocket = new ServerSocket(7489);
        System.out.println("Servidor iniciado. Esperando conexiones...");

        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            System.out.println("Cliente conectado.");

            BufferedReader inFromClient = new BufferedReader(
                new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(
                connectionSocket.getOutputStream());

            String clientSentence = inFromClient.readLine(); 
            String[] numeros = clientSentence.split(" ");

            int num1 = Integer.parseInt(numeros[0]);
            int num2 = Integer.parseInt(numeros[1]);
            int suma = num1 + num2;

            outToClient.writeBytes("Resultado: " + suma + "\n");

            connectionSocket.close(); 
        }
    }
}


