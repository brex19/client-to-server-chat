package application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost", 8080);
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		DataInputStream dis =new DataInputStream(s.getInputStream());
		String str1="",str2="";
		 while(true) {
			Scanner sc=new Scanner(System.in);
			if(sc.equals("exit")) 
				break;
			str1 =sc.next();
			dos.writeUTF(str1);
			System.out.println("server:"+dis.readUTF());
		 }
		 System.out.println("client is out");
			
		
		

	}

}
