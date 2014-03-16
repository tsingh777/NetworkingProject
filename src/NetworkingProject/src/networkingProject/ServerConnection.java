package NetworkingProject.src.networkingProject;

import java.io.*;
import java.net.*;

public class ServerConnection extends Thread {
	public ServerSocket serverSocket;
	public OutputStream outputStream;
	public InputStream inputStream;

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(serverSocket != null){
			try {
				while(true){
					System.out.print("accept");
					Socket socket = serverSocket.accept();
					this.outputStream= socket.getOutputStream();
					this.inputStream = socket.getInputStream();
					PrintWriter out= new PrintWriter(outputStream, true);
					out.println("hello");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					serverSocket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}


	public ServerConnection(int port, SocketConnection client){
		try {
			this.serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Socket socket = serverSocket.accept();
			this.outputStream = socket.getOutputStream();
			this.inputStream = socket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}





	public ServerConnection(int lPort) {
		// TODO Auto-generated constructor stub
		try {
			this.serverSocket = new ServerSocket(lPort);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * @return the serverSocket
	 */
	public ServerSocket getServerSocket() {
		return serverSocket;
	}



	/**
	 * @return the outputStream
	 */
	public OutputStream getOutputStream() {
		return outputStream;
	}




	/**
	 * @return the inputStream
	 */
	public InputStream getInputStream() {
		return inputStream;
	}






}
