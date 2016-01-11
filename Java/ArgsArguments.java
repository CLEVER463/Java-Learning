public class ArgsArguments{
	public static void main(String[] args){
		if(args[0].equals("-h")) System.out.println("Hello,");
		if(args[0].equals("-g")) System.out.println("GoodBye,");		
		for(int i=1;i<args.length;i++)
			System.out.print(args[i]);
		System.out.println("!");
	}
}