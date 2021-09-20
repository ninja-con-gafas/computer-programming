package datatypes;
public class LinkedList
{
	
}

class Node
{
	private Object data;
	private Node node=null;
	public Node(Object data, Node node)
	{
		this.setData(data);
		this.setNode(node);
	}
	public Node getNode()
	{
		return this.node;
	}
	public Object getDate()
	{
		return this.data;
	}
	public void setNode(Node node)
	{
		this.node=node;
	}
	public void setData(Object data)
	{
		this.data=data;
	}
}
