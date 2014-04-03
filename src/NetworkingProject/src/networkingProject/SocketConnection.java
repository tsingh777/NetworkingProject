package NetworkingProject.src.networkingProject;

import java.io.*;
import java.net.*;
import java.util.*;

public class SocketConnection extends Thread {
	Socket socket;
	InputStream input; //what is sent to a server
	OutputStream out =null;// what it reads from a server
	
	
	public SocketConnection(ReadPeerInfo info, Logger log, peerInfo thisPeer){
		Set<Integer> keys= info.peers.keySet();
		for(Integer i: keys){
			SocketConnection connection = new SocketConnection(info.peers.get(i).hostname, info.peers.get(i).lPort);
			log.makeConnection(thisPeer.id, info.peers.get(i).id);
			connection.start();
		}
	}
	
	public SocketConnection(String host, int port){
		try {
			socket= new Socket(host,port);
			input = socket.getInputStream();
			out = socket.getOutputStream();
			System.out.print(out);
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
	public void run(){
		//get all the peers that I need to connect to and connect to them.
		try {
			this.out.write(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void connectToAPeer(peerInfo peer){
		
		
	}
}
