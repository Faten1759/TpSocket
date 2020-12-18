import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        // Listen to a specific port

        ServerSocket s = new ServerSocket(port);
        System.out.println("Waiting for connection");
        Socket socClient = s.accept(); // Accept a client socket
        System.out.println("Connection established");

        // Initialize in / out

        BufferedReader inServer = new BufferedReader(new InputStreamReader(socClient.getInputStream()));
        PrintWriter outServer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socClient.getOutputStream())), true);

        // Read message sent by the client
        String str = inServer.readLine();
       int nombre=0;
       try{
       nombre=Integer.prseInt(str);
       }catch(Exception e);{
       System.out.println("ce n'est pas un entier");
       }
       for(int i=2;i<nombre;i++){
       if(Premier(i))
       System.out.println(i);
       }

        // Close in / out
        inServer.close();
outServer.close();

        // Close client socket
        socClient.close();
    }
    static boolean Premier(int n)
    {
    boolean res;
    res=true;
    int i=2;
    while(i<=n/2 && res=true){
    if(n%2==0)
        res=false;
        i++;
        }
        return(res);
        }
        
}
