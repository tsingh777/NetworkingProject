package netwokringProject;

import java.io.File;
import java.io.IOException;

public class startRemotePeers {
	public static void main(String[] args){
		
	}


	public static void startPeer(File peerInfo){
		String workingDir = System.getProperty("user.dir"); 
		String hostname = "";
		String peerProcessName = "";
		String peerProcessArguments = ""; 
		try {
			Runtime.getRuntime().exec("ssh " + hostname + " cd " + workingDir + " ; " + 
					peerProcessName + " " + peerProcessArguments );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void writeLog(){
		//[Time]: Peer [peer_ID 1] makes a connection to Peer [peer_ID 2]. 

	}
	public static void readFile(){
		
		
	}
}
