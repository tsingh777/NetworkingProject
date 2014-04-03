package NetworkingProject.src.networkingProject;

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
		
		Peer peer= new Peer(peersFromFile.peers.get(peerID), peersFromFile);
		peer.server.start();
	
		peer.connection.start();
		
		try {
			peer.server.join();
			peer.connection.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
