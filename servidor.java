<<<<<<< HEAD
 
=======
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

            // ajajajja

      }
    }
}
>>>>>>> bf818f53037d1c2594cd495a84728df3e19fe89d
