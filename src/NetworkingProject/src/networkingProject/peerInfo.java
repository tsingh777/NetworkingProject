package NetworkingProject.src.networkingProject;


public class peerInfo {
	
	public int id;
	public String hostname;
	public int lPort;
	public boolean hasFile;
	
	public peerInfo(int id, String hostname, int lPort, boolean hasFile) {
		this.id = id;
		this.hostname = hostname;
		this.lPort = lPort;
		this.hasFile = hasFile;
	}
	public peerInfo(){
		id=0;
		hostname= "";
		lPort= 0;
		hasFile= false;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}
	/**
	 * @param hostname the hostname to set
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	/**
	 * @return the lPort
	 */
	public int getlPort() {
		return lPort;
	}
	/**
	 * @param lPort the lPort to set
	 */
	public void setlPort(int lPort) {
		this.lPort = lPort;
	}
	/**
	 * @return the hasFile
	 */
	public boolean getHasFile() {
		return hasFile;
	}
	/**
	 * @param hasFile the hasFile to set
	 */
	public void setHasFile(boolean hasFile) {
		this.hasFile = hasFile;
	}
	public void setHasFile(int hasFile){
		if(hasFile == 1){
			this.hasFile = true;
		}
		else{
			this.hasFile = false;
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "peerInfo [id=" + id + ", "
				+ (hostname != null ? "hostname=" + hostname + ", " : "")
				+ "lPort=" + lPort + ", hasFile=" + hasFile + "]";
	}
	
	
	
	
	/*class Peer{
		public Peer(int id, String hostname, int listeningPort, int hasFile) {
			this.id = id;
			this.hostname = hostname;
			this.listeningPort = listeningPort;
			if(hasFile == 1){
				this.hasFile= true;
			}
			else{
				this.hasFile= false;
			}
		}
		public int id;
		public String hostname;
		public int listeningPort;
		public Boolean hasFile;
		
	}
	public Vector<Peer> peers;
	
	public peerInfo(int id, String hostname, int listeningPort, int hasFile) {
		Peer aPeer= new Peer(id, hostname, listeningPort, hasFile);

		peers = new Vector<Peer>();
		peers.add(aPeer);
	}

	public peerInfo() {
		peers=  new Vector<Peer>();;
	}

	public  void readPeerInfo() throws IOException{
		String st;
		BufferedReader in = new BufferedReader(new FileReader("PeerInfo.cfg"));
		if((st = in.readLine()) != null) {
			
			 String[] tokens = st.split("\\s+");
	//    	 System.out.println("tokens begin ----");
	//	     for (int x=0; x<tokens.length; x++) {
	//	         System.out.println(tokens[x]);
	//	     }
	//         System.out.println("tokens end ----");
			
		}
	}
	*/
}
