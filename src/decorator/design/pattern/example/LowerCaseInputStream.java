package decorator.design.pattern.example;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
	protected LowerCaseInputStream(InputStream inStream) {
		super(inStream);
	}

	public int read() throws IOException{
		int c=super.read();		
		return (c==-1?c:Character.toLowerCase((char)c));
	}

	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; ++i) {
			b[i] = (byte) Character.toUpperCase((char) b[i]);
		}
		return result;
	}
}
