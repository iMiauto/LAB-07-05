import java.io.*;  
import java.net.*;  
 
class TCPServer {  
 
  public static void main(String argv[]) throws Exception  
    {  
      int  a;  
      int  b;  
 
      ServerSocket welcomeSocket = new ServerSocket(6789);  
   
      while(true) {  
   
            Socket connectionSocket = welcomeSocket.accept();  
 
           BufferedReader inFromClient =  
              new BufferedReader(new 
              InputStreamReader(connectionSocket.getInputStream())); 

              
clientSentence = inFromClient.readLine();  
capitalizedSentence = clientSentence.toUpperCase() + '\n';  
outToClient.writeBytes(capitalizedSentence); 
      }
    }
}
