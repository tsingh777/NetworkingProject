package NetworkingProject.src.networkingProject;

import java.io.*;
import java.net.*;

public class SocketConnection {
	Socket socket;
	
	public SocketConnection(String host, int port){
		try {
			socket= new Socket("Taranjits-MacBook-Pro.local",port);
			BufferedReader input =
		            new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.print(input.readLine());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		BufferedReader br = null; 
//		try {
//			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		PrintWriter out; 
//		try {
//			 out = new PrintWriter(socket.getOutputStream(), true);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			if(br!= null)
//				System.out.print(br.readLine());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
