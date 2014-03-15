package NetworkingProject.src.networkingProject;

import java.io.*;
import java.text.*;
import java.util.*;


public class Logger {
	
	private PrintWriter log;
	final DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
	
	public Logger(int peerID){
		try {
			log = new PrintWriter("log_peer_" +peerID+".log");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void makeConnection(int peerID1, int peerID2){
		//[Time]: Peer [peer_ID 1] makes a connection to Peer [peer_ID 2].
		Date date = new Date();
		try{
			log.println(dateFormat.format(date) +": Peer " + peerID1 + " makes a connection to Peer " + peerID2);
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void isConnected(int peerID1, int peerID2){
		//[Time]: Peer [peer_ID 1] is connected from Peer [peer_ID 2].
		Date date = new Date ();
		try{
			log.println(dateFormat.format(date) +": Peer " + peerID1 + " is connected from Peer " + peerID2);
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void preferredNeighbors(int peerID, ArrayList<Integer> neighbors){
		//[Time]: Peer [peer_ID] has the preferred neighbors [preferred neighbor ID list].
		Date date = new Date();
		try{
			log.print(dateFormat.format(date) +": Peer " + peerID + " has the preferred neighbors ");
			for(Integer peer : neighbors){
				if(peer != neighbors.get(neighbors.size() -1)){
					log.print(peer + ", ");
				}
				else{
					log.print(peer);
				}
			}
			log.print("\n");
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void hasOCneighbor(int peerID1, int peerID2){
		//[Time]: Peer [peer_ID] has the optimistically-unchoked neighbor [optimistically unchoked neighbor ID].
		
		Date date = new Date ();
		try{
			log.println(dateFormat.format(date) +": Peer " + peerID1 + " has the optimistically-unchocked neighbor " + peerID2);
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void isUnchoked(int peerID1, int peerID2){
		//[Time]: Peer [peer_ID 1] is unchoked by [peer_ID 2].
		Date date = new Date ();
		try{
			log.println(dateFormat.format(date) +": Peer " + peerID1 + " is unchocked by " + peerID2);
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void isChoked(int peerID1, int peerID2){
		//[Time]: Peer [peer_ID 1] is choked by [peer_ID 2].
		Date date = new Date ();
		try{
			log.println(dateFormat.format(date) +": Peer " + peerID1 + " is chocked by " + peerID2);
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void receivingHave(int peerID1, int peerID2, int pieceIndex){
		//[Time]: Peer [peer_ID 1] received a have message from [peer_ID 2] for the piece [piece index].
		Date date = new Date ();
		try{
			log.println(dateFormat.format(date) +": Peer " + peerID1 + " received a \'have\' message from " + peerID2 + "for the piece " + pieceIndex);
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void receivingNotInterested(int peerID1, int peerID2){
		//[Time]: Peer [peer_ID 1] received a not interested message from [peer_ID 2].		
		Date date = new Date ();
		try{
			log.println(dateFormat.format(date) +": Peer " + peerID1 + " received a \'not interested\' message from " + peerID2);
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void downloading(int peerID1, int peerID2, int pieceIndex, int numOfPieces){
		//[Time]: Peer [peer_ID 1] has downloaded the piece [piece index] from [peer_ID 2]. Now the number of pieces it has is [number of pieces].		
		Date date = new Date ();
		try{
			log.println(dateFormat.format(date) +": Peer " + peerID1 + " has downloaded the piece "+ pieceIndex+ " from " + peerID2 + ".\nNow the number of pieces it has is " + numOfPieces);
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void downloadComplete(int peerID){
		Date date = new Date ();
		try{
			log.println(dateFormat.format(date) +": Peer " + peerID + " has downloaded the complete file." );
			log.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
