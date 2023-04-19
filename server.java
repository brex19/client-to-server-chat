package application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class newserver {

	public static void main(String[] args) throws IOException {
		ArrayList<thread> threadlist=new ArrayList<>();
		int client =0;
		ExecutorService pool=Executors.newFixedThreadPool(2);
		// TODO Auto-generated method stub
		 ServerSocket ss=new ServerSocket(8080);
		 
		  System.out.println("server is waiting for client connection.....");
		  while(true) {
		    Socket s=ss.accept();
		    client+=1;
		    System.out.println(" server is connected to client "+client);
			Thread tr=new Thread();
			thread tr1=new thread(s);
			threadlist.add(tr1);
			pool.execute(tr1);
		
		
	
		  }
		  
		

	}

}
