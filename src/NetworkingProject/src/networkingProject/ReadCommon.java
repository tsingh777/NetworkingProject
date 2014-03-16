package NetworkingProject.src.networkingProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class ReadCommon {
	

	public int NumberOfPreferredNeighbors;
	public int UnchokingInterval;
	public int OptimisticUnchokingInterval;
	public String FileName;
	public int FileSize;
	public int PieceSize; 
	public int NumOfPieces;
	public static Vector<String> commonInfoVector;
	
	public ReadCommon(int numberOfPreferredNeighbors, int unchokingInterval,
			int optimisticUnchokingInterval, String fileName, int fileSize,
			int pieceSize, int numOfPieces) {
		NumberOfPreferredNeighbors = numberOfPreferredNeighbors;
		UnchokingInterval = unchokingInterval;
		OptimisticUnchokingInterval = optimisticUnchokingInterval;
		FileName = fileName;
		FileSize = fileSize;
		PieceSize = pieceSize;
		NumOfPieces = numOfPieces;
	}
	
	public ReadCommon() {
		// TODO Auto-generated constructor stub
		NumberOfPreferredNeighbors = 0;
		UnchokingInterval = 0;
		OptimisticUnchokingInterval = 0;
		FileName = "";
		FileSize = 0;
		PieceSize = 0;
		NumOfPieces = 0;
	}

	public void readCommon(){
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
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReadCommon [NumberOfPreferredNeighbors="
				+ NumberOfPreferredNeighbors + ", UnchokingInterval="
				+ UnchokingInterval + ", OptimisticUnchokingInterval="
				+ OptimisticUnchokingInterval + ", "
				+ (FileName != null ? "FileName=" + FileName + ", " : "")
				+ "FileSize=" + FileSize + ", PieceSize=" + PieceSize
				+ ", NumOfPieces=" + NumOfPieces + "]";
	}

}
