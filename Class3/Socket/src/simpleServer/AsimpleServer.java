
package simpleServer;

import java.net.*;
import java.io.*;
public class AsimpleServer {
  public static void main(String args[]) throws Exception {
    ServerSocket s = new ServerSocket(1234);
    Socket s1=s.accept(); 
    OutputStream s1out = s1.getOutputStream();
    DataOutputStream dos = new DataOutputStream (s1out);
    dos.writeUTF("Hi there");
    dos.close();
    s1out.close();
    s1.close();
  }
}