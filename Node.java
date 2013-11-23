import java.util.ArrayList;


public class Node {
	
	public Node()
	{
		arcset=new ArrayList<Arc>();
	}
    public void printData()
    {
    	System.out.println(nodename);
    }
	public ArrayList<Arc> arcset;
	public String nodename;
    public double nodex,nodey;
}
