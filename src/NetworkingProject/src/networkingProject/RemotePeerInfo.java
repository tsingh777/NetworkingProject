package NetworkingProject.src.networkingProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

/*
 *                     CEN5501C Project2
 * This is the program starting remote processes.
 * This program was only tested on CISE SunOS environment.
 * If you use another environment, for example, linux environment in CISE 
 * or other environments not in CISE, it is not guaranteed to work properly.
 * It is your responsibility to adapt this program to your running environment.
 */

public class RemotePeerInfo {
	public String peerId;
	public String peerAddress;
	public String peerPort;
	public String hasFile;
	
	/*public int NumberOfPreferredNeighbors;
	public int UnchokingInterval;
	public int OptimisticUnchokingInterval;
	public String FileName;
	public int FileSize;
	public int PieceSize; 
	public int NumOfPieces;
	public Vector<String> commonInfoVector;*/
	
	public RemotePeerInfo(String pId, String pAddress, String pPort, String hasFile) {
		peerId = pId;
		peerAddress = pAddress;
		peerPort = pPort;
		this.hasFile = hasFile;
		//this.readCommon();
		
	}
	
	
	/*public void readCommon(){
		String st;
		commonInfoVector = new Vector<String>();
		try {
			
			BufferedReader in = new BufferedReader(new FileReader("Common.cfg"));//This file is stored in the project directory 
			while((st = in.readLine()) != null) {
				
				 String[] tokens = st.split("\\s+");
				 
//		    	 System.out.println("tokens begin ----");
//			     for (int x=0; x<tokens.length; x++) {
//			         System.out.println(tokens[x]);
//			     }
//		         System.out.println("tokens end ----");
		    //     System.out.println(tokens[1]);
		         commonInfoVector.addElement(tokens[1]);
			    
			}
			in.close();
			NumberOfPreferredNeighbors= Integer.parseInt(commonInfoVector.get(0));
			UnchokingInterval = Integer.parseInt(commonInfoVector.get(1));
			OptimisticUnchokingInterval= Integer.parseInt(commonInfoVector.get(2));
			FileName = commonInfoVector.get(3);
			FileSize = Integer.parseInt(commonInfoVector.get(4));
			PieceSize = Integer.parseInt(commonInfoVector.get(5));
			NumOfPieces= (int) Math.ceil((double)FileSize/PieceSize);
		}
		catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}*/
	/*public String toString(){
		String s = "peerID: "+peerId + "\npeerAddress: " + peerAddress + "\npeerPort" + peerPort + "\nNumberOfPreferredNeighbors: " + NumberOfPreferredNeighbors;
		s= s + "\nUnchokingInterval:" + UnchokingInterval + "\nOptimisticUnchokingInterval" + OptimisticUnchokingInterval + "\nFilename:";
		s= s + FileName + "\nFileSize: " + FileSize + "\nPieceSize " + PieceSize + "\nNumberOfPieces" + NumOfPieces;  
	
		return s;
	}*/
}
