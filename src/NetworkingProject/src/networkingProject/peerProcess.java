package NetworkingProject.src.networkingProject;

import java.io.IOException;
import java.io.*;

public class peerProcess {
	public static void main(String[] args){
		int peerID= Integer.parseInt(args[0]);
		ReadCommon commonConfig= new ReadCommon(); // read the common.cfg
		commonConfig.readCommon();
		ReadPeerInfo peersFromFile = null;
		try {
			peersFromFile= new ReadPeerInfo(); 	//read the peerinfo.cfg and now have the list of peers in peersFromFile
//			System.out.println(commonConfig.toString());
//			for(Object obj : peersFromFile.peers.values()){
//				System.out.println(obj.toString());
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Peer peer1= new Peer(peersFromFile.peers.get(peerID));
		//peer1.server.start();
		
		//Peer peer2= new Peer(peersFromFile.peers.get(peerID + 1));
//		try {
//			peer1.connection.socket.connect(peer2.server.serverSocket.getLocalSocketAddress());
//			BufferedReader in =new BufferedReader(new InputStreamReader(peer1.connection.socket.getInputStream()));
//			OutputStream out = peer1.connection.socket.getOutputStream();
//			System.out.print(in.readLine());
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
}
