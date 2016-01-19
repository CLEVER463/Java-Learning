import java.lang.Object;
public class StrBuffer{
	//Same as StringBuilder
	public static void main(String[] args){
		StringBuffer str = new StringBuffer("abcdefg");
                System.out.println(str);
                str.append("12345");
                System.out.println(" append "+str);
                str.insert(0, "!@#");
                System.out.println(" insert "+str);
                str.reverse();
                System.out.println(" reverse "+str);
                str.replace(5, 12, "*******");
                System.out.println(" replace "+str);
                str.delete(5, 12);
                System.out.println(" delete "+str);
	}
}