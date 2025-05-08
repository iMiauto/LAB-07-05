// cambios

import java.io.*;
import java.net.*;

public class Cliente {// se crea la clase cliente 
    public static void main(String argv[]) throws Exception {// inicio del main
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket( "DESKTOP-SLNVM6A", 7489);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
// el cliente escribe los numeros que va a guardar en variables para despues enviarlos al servidor 
        System.out.print("Ingrese el primer número: ");
        String num1 = inFromUser.readLine();// se guarda el primer numero 
        System.out.print("Ingrese el segundo número: ");
        String num2 = inFromUser.readLine();// se guarda el segundo numero

        outToServer.writeBytes(num1 + " " + num2 + '\n'); // se envian los nuemro al servidor en bytes

        String modifiedSentence = inFromServer.readLine(); // Recibir la respuesta del servidor
        System.out.println("FROM SERVER: " + modifiedSentence);

        clientSocket.close();
        //Cambio
    }// fin del main
}// fin de la clase

// hola mundo
// ba<<<<<<< HEAD
=======



>>>>>>> a86c5895609959ae2c89ef5c16ee206b002d215e
