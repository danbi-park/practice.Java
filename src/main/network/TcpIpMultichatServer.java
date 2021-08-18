package network;

import java.net.*;
import java.io.*;
import java.util.*;

public class TcpIpMultichatServer {
   HashMap clients;

   TcpIpMultichatServer() {
      clients = new HashMap();
      Collections.synchronizedMap(clients);
   }

   public void start() {
      ServerSocket serverSocket = null;
      Socket socket = null;

      try {
         serverSocket = new ServerSocket(7777);
         System.out.println("Server started...");

         while(true) {
            socket = serverSocket.accept();
            System.out.println("Connected from ["+socket.getInetAddress() + ":"+socket.getPort()+"]");
            ServerReceiver thread = new ServerReceiver(socket);
            thread.start();
         }
      } catch(Exception e) {
         e.printStackTrace();
      }
   } // start()

   void sendToAll(String msg) {
      Iterator it = clients.keySet().iterator();

      while(it.hasNext()) {
         try {
            DataOutputStream out = (DataOutputStream)clients.get(it.next());
            out.writeUTF(msg);
         } catch(IOException e){}
      } // while
   } // sendToAll

   public static void main(String args[]) {
      new TcpIpMultichatServer().start();
   }

   class ServerReceiver extends Thread {
      Socket socket;
      DataInputStream in;
      DataOutputStream out;

      ServerReceiver(Socket socket) {
         this.socket = socket;
         try {
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
         } catch(IOException e) {}
      }

      public void run() {
         String name = "";
         try {
            name = in.readUTF();
            sendToAll("#"+name+" Entered");

            clients.put(name, out);
            System.out.println("Now Number of Connector is " + clients.size());
            while(in!=null) {
               sendToAll(in.readUTF());
            }
         } catch(IOException e) {
            // ignore
         } finally {
            sendToAll("#"+name+"is disconnected");
            clients.remove(name);
            System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"is terminated");
            System.out.println("Now Number of Connector is " + clients.size());
         } // try
      } // run
   } // ReceiverThread
} // class