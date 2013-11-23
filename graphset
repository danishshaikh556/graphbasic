import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class graphset {
	
	public graphset()
	{
		nodemap=new HashMap<String,Node>();
		nodeset=new ArrayList<Node>();
		arcs=new ArrayList<Arc>();
		
	}
	
	
	//Inserting a node into the graph
	public void addNode(String name,double xcor,double ycor)
	{
		
		if(nodemap.containsKey(name) )
				{
			      System.out.println("Node already exists");
				}
		else
		{
			Node newnode =new Node();
			newnode.nodename=name;
			newnode.nodex=xcor;
			newnode.nodey=ycor;
			nodemap.put(name, newnode);
			nodeset.add(newnode);
		}
	}
	
	//Inserting Arcs for given nodes
	public void addArc(String end1,String end2,double distance)
	{
			//Wrapper class for addin arcs
			addAnArc(end1,end2,distance);
			addAnArc(end2,end1,distance);
		}
	
	//Wraper implementation of adding arcs
	public void addAnArc(String end1,String end2,double distance)
	{
		Node n1=nodemap.get(end1);
		Node n2=nodemap.get(end2);
		
		Arc arc=new Arc();
		arc.start=n1;
		arc.finish=n2;
		arc.cost=distance;
		
		n1.arcset.add(arc);  //Adding the arc to the node array
		arcs.add(arc);       //adding the arc to the the graph array
	}

	public void printNodes()
	{
		Iterator<Node> itr=nodeset.iterator();
		
		while(itr.hasNext())
		{
			Node printnode=itr.next();
			System.out.println("Name of Node::"+ printnode.nodename + "Node xcordinate::" + printnode.nodex + "Node ycordinate::" + printnode.nodey);
		}
	}
		
	public void printArcs()
	{
		Iterator<Arc> itr=arcs.iterator();
		
		while(itr.hasNext())
		{
		   Arc printarc =itr.next();
			System.out.println("Statrt Node::"+ printarc.start.nodename + "Finish Node::" + printarc.finish.nodename + "Arc distance::" + printarc.cost);
		}
	}
		
	public ArrayList<Node> nodeset;
	public ArrayList<Arc> arcs;
	public HashMap<String,Node> nodemap=null;
	
}
