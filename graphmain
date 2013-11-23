import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;




public class graphmain {

	public static void main(String[] args)
	{
		//Printing the available file types
		System.out.println("Which File to load ");
		System.out.println("a)Small.txt");
		System.out.println("b)Stanfor.txt");
		System.out.println("c)USA.txt");
		
		//Taking user input for the available filetypes
		Scanner in =new Scanner(System.in);
	     String filename=in.nextLine();
	     
	     g=new graphset();
	    /*
	     BufferedReader rd=null;
	     try {
			 rd=new BufferedReader(new FileReader("Small.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true)
		{
		String lineRead=null;
		try {
			lineRead = rd.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lineRead==null) break;
		
		StringTokenizer tok=new StringTokenizer(lineRead);
		if(tok.hasMoreTokens())
		{
		String name=tok.nextToken();
		System.out.println(name);
		double n1=Double.parseDouble(tok.nextToken());
		System.out.println(n1);
		double n2=Double.parseDouble(tok.nextToken());
		System.out.println(n2);
		g.addNode(name, n1, n2);
		}
		
		}
		*/
		
		//Opening file
	    openFile(filename);
	     
	     System.out.println("Loading all nodes");
	     g.printNodes();
	     System.out.println("Loading all arcs");
	     g.printArcs();	 
	         
	     
		
		 
		
		}
	
	public static void openFile(String filename) 
	{
		BufferedReader rd=null;
		try {
			rd=new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No File Exists");
		}
		
		//Reading form the opened file 
		while(true)
		{
		String lineRead = null ;
		try {
			lineRead = rd.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lineRead == null) break;
		
		if(lineRead.equals("NODES"))
		{
			while(!lineRead.equals("ARCS"))
			{
				try {
					lineRead=rd.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				///Declaring a String tokenizer
				StringTokenizer tok=new StringTokenizer(lineRead);
				
				String name=tok.nextToken();
				if(tok.hasMoreTokens())
				{
					
				double n1=Double.parseDouble(tok.nextToken());
				double n2=Double.parseDouble(tok.nextToken());
				System.out.println(name + ".."+ n1 + ".." + n2);
				g.addNode(name, n1, n2);
				}
			}
		}

			if(lineRead.equals("ARCS"))
			{
				while(true)
				{
					
					try {
						lineRead=rd.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(lineRead==null) break;
					
					///Declaring a String tokenizer
					StringTokenizer tok=new StringTokenizer(lineRead);
					if(tok.hasMoreTokens())
					{
					String start=tok.nextToken();
					String end=tok.nextToken();
					double n2=Double.parseDouble(tok.nextToken());
					System.out.println(start + ".."+ end + ".." + n2);
					
					g.addArc(start,end,n2);
					}
				}
				
			
			
		}
		}
			
		
		
	}
	
	
	
	private static graphset g;
	
}
