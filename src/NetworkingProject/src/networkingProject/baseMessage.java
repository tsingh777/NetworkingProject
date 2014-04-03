package NetworkingProject.src.networkingProject;

public class baseMessage {
	//Converts a 4-byte message to an integer
	public int byteArrayToInt(byte[] bytes, int off) {
		int i = 0;
		for(int x = 0; x < 4; x++)
			i = (i << 8) | (bytes[x+off] & 0xFF);
		return i;
	}

	//Converts an integer to a 4-byte message
	public static byte[] intTo4ByteArray(int i) {
		byte[] b = new byte[4];
		long n = i;
		b[0] = (byte) ((n >> 24) & 0xFF);
		b[1] = (byte) ((n >> 16) & 0xFF);
		b[2] = (byte) ((n >> 8) & 0xFF);
		b[3] = (byte) (n & 0xFF);
		return b;
	}

	//converts a single byte message to an integer
	public int byteToInt(byte b) {
		
		return (int) b ;
	}

	//converts a single int message to an integer
	public byte intToByte(int i) {
		return (byte) i;
	}
}
