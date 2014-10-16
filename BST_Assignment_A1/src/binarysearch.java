import java.util.Comparator;

/*
 * @Function Binary Search
 * @Author Yulong Fang
 * @#ID 100471536  
 */

public class binarysearch 
{
	
	Comparable<String> comp;
	
	boolean contains(Comparable<String> comm,BinaryNode leaf)
	{
		if(!leaf)
			return false;
		if
		
		
		return true;
	}
	
  
	public static void main(String []args)
	{
		
	}
}

class BinaryNode
{
	String key;
	BinaryNode leftChild;
	BinaryNode rightChild;
	
	BinaryNode()
	{
		
	}
}

class BinaryNodeComparator implements Comparator<BinaryNode>
{
	public int compare(BinaryNode o1, BinaryNode o2) 
	{
		if(o1.key == o2.key)
		{
		return 1;
		}else
		return 0;
	}	
}
