package NetworkingProject.src.networkingProject;

import java.io.IOException;
import java.net.*;

public class Peer  {
	
	public peerInfo peerInfo;
	public SocketConnection connection;
	public ServerConnection server;
	
	public Logger log;
//	private boolean isChokingMe;
//	private boolean amInterested;
//	private boolean isChokedbyMe;
//	private boolean isInterested;
	
	public Peer(){
		peerInfo= null;
		//connection = null;
		log= null;
		server= null;
//		isChokingMe = false;
//		amInterested =false;
//		isChokedbyMe = false;
//		isInterested= false;
		
	}

	public Peer(peerInfo peerInfo, SocketConnection connect, boolean isChokingMe, boolean amInterested,  boolean isChokedbyMe,  boolean isInterested) {
		this.peerInfo = peerInfo;
		//this.connection = connect;
		this.log = new Logger(peerInfo.getId());
//		this.isChokingMe= isChokingMe;
//		this.amInterested= amInterested;
//		this.isChokedbyMe= isChokedbyMe;
//		this.isInterested = isInterested;
		
	}
	
//	public void startServer(final Peer Client){
//		Thread t1= new Thread(new Runnable(){
//			public void run(){
//				try {
//					serverSocket = new ServerSocket(peerInfo.getlPort());
//					Client.connection.socket= serverSocket.accept();	
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
//		
//	}

	public Peer(peerInfo peerInfo2) {
		// TODO Auto-generated constructor stub
		this.peerInfo = peerInfo2;
		this.log= new Logger(peerInfo2.getId());
		this.server = new ServerConnection(peerInfo2.lPort);
		//this.connection = new SocketConnection();
		//this.server.serverSocket= new ServerSocket(peerInfo2.getlPort());
	

	}
	public Peer(peerInfo peerInfo2, ReadPeerInfo allPeers) {
		// TODO Auto-generated constructor stub
		this.peerInfo = peerInfo2;
		this.log= new Logger(peerInfo2.getId());
		this.server = new ServerConnection(peerInfo2.lPort);
		this.connection = new SocketConnection(allPeers, this.log, this.peerInfo);
		//this.server.serverSocket= new ServerSocket(peerInfo2.getlPort());
	

	}

	/**
	 * @return the peerInfo
	 */
	public peerInfo getPeerInfo() {
		return peerInfo;
	}

	/**
	 * @return the isChokingMe
	 */
//	public boolean isChokingMe() {
//		return isChokingMe;
//	}
//
//	/**
//	 * @return the amInterested
//	 */
//	public boolean isAmInterested() {
//		return amInterested;
//	}
//
//	/**
//	 * @return the isChokedbyMe
//	 */
//	public boolean isChokedbyMe() {
//		return isChokedbyMe;
//	}
//
//	/**
//	 * @return the isInterested
//	 */
//	public boolean isInterested() {
//		return isInterested;
//	}
//
//	/**
//	 * @param isChokingMe the isChokingMe to set
//	 */
//	public void setChokingMe(boolean isChokingMe) {
//		this.isChokingMe = isChokingMe;
//	}
//
//	/**
//	 * @param amInterested the amInterested to set
//	 */
//	public void setAmInterested(boolean amInterested) {
//		this.amInterested = amInterested;
//	}
//
//	/**
//	 * @param isChokedbyMe the isChokedbyMe to set
//	 */
//	public void setChokedbyMe(boolean isChokedbyMe) {
//		this.isChokedbyMe = isChokedbyMe;
//	}
//
//	/**
//	 * @param isInterested the isInterested to set
//	 */
//	public void setInterested(boolean isInterested) {
//		this.isInterested = isInterested;
//	}



	
	
	

//	//public peerInfo peerInfo;
//	public final Logger log;
//	//public Socket socket;
//	//public ServerSocket serverSocket;
//
//
//	public Peer(){
//		//peerInfo= new peerInfo();
//		//log = new Logger(peerInfo.getId());
//		//socket= new Socket();
//		
//	}
//	
//	public Peer(int id, String address, int port, int hasFile){
//		//peerInfo= new peerInfo(id, address, port, hasFile);
//		log = new Logger(id);
//		
////		try {
////			this.socket= new Socket(hostname, port);
////		} catch (UnknownHostException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	}
//	
//	
//	public Logger getLog() {
//		return log;
//	}

	
	
	

	
}
