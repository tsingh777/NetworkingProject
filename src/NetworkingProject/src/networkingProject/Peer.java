package NetworkingProject.src.networkingProject;

import java.io.IOException;
import java.net.*;

public class Peer  {
	public final int id;
	public final String hostname;
	public final int liseningPort;
	public boolean hasFile;
	public final Logger log;
	//public Socket socket;
	//public ServerSocket serverSocket;


	public Peer(){
		id= 0;
		log= new Logger(id);
		hostname="";
		liseningPort= 0;
		hasFile = false;
		//socket= new Socket();
		
	}
	
	public Peer(int id, String address, int port, int hasFile){
		this.id= id;
		this.hostname = address;
		this.liseningPort = port;
		log = new Logger(id);
		if(hasFile == 1){
			this.hasFile= true;
		}
		else{
			this.hasFile= false;
		}
//		try {
//			this.socket= new Socket(hostname, port);
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public int getId() {
		return id;
	}
	public String getAddress() {
		return hostname;
	}
	public int getPort() {
		return liseningPort;
	}
	public Logger getLog() {
		return log;
	}

	
	
	@Override
	public String toString() {
		return "Peer [id=" + id + ", hostname=" + hostname + ", liseningPort="
				+ liseningPort + ", hasFile=" + hasFile + "]";
	}

	
}
