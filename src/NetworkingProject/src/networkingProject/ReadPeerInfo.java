package NetworkingProject.src.networkingProject;

import java.io.*;
import java.util.*;

public class ReadPeerInfo {
	
	public HashMap<Integer,peerInfo> peers;
	
	
	
	public ReadPeerInfo() throws IOException{
		peers = new HashMap<Integer, peerInfo>();
		
		String st;
		BufferedReader in = new BufferedReader(new FileReader("PeerInfo.cfg"));
		while((st = in.readLine()) != null) {
			 peerInfo temp = new peerInfo();
			 String[] tokens = st.split("\\s+");
//	    	 System.out.println("tokens begin ----");
//		     for (int x=0; x<tokens.length; x++) {
//		         System.out.println(tokens[x]);
//		     }
//	         System.out.println("tokens end ----");
			 temp.setId(Integer.parseInt(tokens[0]));
			 temp.setHostname(tokens[1]);
			 temp.setlPort(Integer.parseInt(tokens[2]));
			 temp.setHasFile(Integer.parseInt(tokens[3]));
			 
			 peers.put(Integer.parseInt(tokens[0]), temp);
			
		}
	}
	
	public peerInfo getPeerInfo(int peerID){
		if(peers.containsKey(peerID)){
			return peers.get(peerID);
		}
		else{
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReadPeerInfo [" + (peers != null ? "peers=" + peers : "") + "]";
	}
}
