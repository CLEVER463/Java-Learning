import java.io.*;
public class StandardIO{
		public static void main(String[] args){
		char c = ' ';
		try{
			c = (char) System.in.read();
		}catch(IOException e){};
		System.out.printf("%c",c);
	}
}