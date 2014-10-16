// Problem from now:
// When I enter cities��� name , lat and lon, they cannot be stored, so my node list will be like: Hello World! :)
// NODE LIST
// No.               Name        Coordinates
// -----------------------------------------
//   1                  null                <0.0,0.0>
//   2                  null                <0.0,0.0>

// Pro3s.jar is the solution program provided by prof.
// --------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.Scanner;

public class Pro3_shiming2 
{
//    public static BufferedReader  cin = new BufferedReader (new InputStreamReader (System.in));
    public static Scanner cin = new Scanner(System.in);
	static Graph G = new Graph();

	



public static void displayMenu()
{
	System.out.println("   JAVA TRAVELING SALESMAN PROBLEM V1 ");
	System.out.println("G - Create graph");
	System.out.println("E - Edit cities");
	System.out.println("A - Edit arcs");
	System.out.println("D - Display graph info");
	System.out.println("R - Reset graph");
	System.out.println("P - Enter salesman's path");
	System.out.println("Q - Quit\n");
	System.out.println("Enter choice: ");

}//Display the menu.

public static boolean createGraph(Graph G) throws IOException 

{   
		int number = getInteger("\nEnter number of cities (0 to quit): ", 0 , Integer.MAX_VALUE);
		G.setN(number);
		G.init(number);
		
		if (number == 0)
			
		{
			System.out.print("\n\n");
			return false;
			}
		else
		{
			for ( int j = 0; j < number; j++)
			{
				
					System.out.println("\nCity " + (j+1) + ":");
					Node a = new Node();
					a.userEdit();
					
					//G.setN(number);
					//G.init(number);
					G.addNode(a);

			}
			
		}
		return true;
		
		
		
	
	
		

	
	
}//Get the graph details from the user.

public static void editCities(Graph G) throws IOException
{
	G.printNodes();
	int number = getInteger("Enter city to edit (0 to quit):",0, G.getN());
	if (number != 0)
	{
		Node a = new Node();
		a.userEdit();
		G.getNode(number-1).setName(a.getName());
		G.getNode(number-1).setLat(a.getLat());
		G.getNode(number-1).setLon(a.getLon());
		
		System.out.println();
	}
	
	
}
//Allow the user to edit city information inside the graph.
public static void addArcs(Graph G)
{
	int UB = G.getN();
	System.out.println("");
	
	int i,j;
	do 
	{
		i = getInteger("Enter first city index (0 to quit): ", 0 , UB);
		if (i == 0)
		{
			System.out.println("");
			return ;
		}
		j = getInteger("Enter second city index (0 to quit): ", 0 , UB);
		if (j==0)
		{
			System.out.println("");
			return;
		}
		if (i == j)
		{
			System.out.println("\nERROR: A city cannot be linked to itself\n");
			
		}
		else
		{
			boolean check = G.existsArc(i-1, j-1);
			if (!check)
			{
				System.out.println("\nERROR: Arc already exists!\n");
			}
				else
					System.out.println("\nArc" + i + "-" + j + " added!\n");
		}
				
		  
	}while (i !=0 && j!=0);
	
	System.out.print("\n\n");
	


}//Allow the user to add arcs to the graph.

public static void removeArc(Graph G)
{
	
	int UB = G.getM();
	int i ;
	
	System.out.println();
	do 
	{
	i = getInteger("Enter arc to remove (o to quit): ", 0 , UB);
	
	if ( i == 0)
	{
		System.out.println();
		break;
	}
	System.out.println();
	G.removeArc(i-1);
	System.out.println("Arc " + i + " removed!\n");


	} while (i!=0);	
	
	}//Allow the user to remove arcs from the graph.


public static void tryPath(Graph G)
{
	
	int i = G.getN() + 1 ;
	int [] Array = new int [i+1];
	int j=0;
	System.out.println();
	G.printNodes();
	System.out.println ("Enter the " + (i+1) + "cities in the route in order:");
	
     while ( j < (i+1) )
     {
    	 String a = "City" + (j+1) +":" ;
    	 Array [j] =( getInteger (a , 1 , i) - 1);
    	 j++;
    	 
     }
     if (!G.checkPath(Array))
    	 return ;
     double d = G.pathCost(Array);
     System.out.format("\nThe total distance traveled is %.2f km.\n\n", d);
}
//Get a path from the user, check its feasibility, and then print its cost.
public static int getInteger(String prompt, int LB, int UB)
{
	int choice = -1;
	boolean j;
	do
	{
		j = true;
		System.out.print(prompt);
try {
	choice=cin.nextInt();
}
catch( NumberFormatException e)
{
	System.out.println("ERROR: Input must be an integer in [<" + LB + ">, <" + UB + ">]!");
	//System.out.println("\nEnter choice: ");
	j=false;
	}

if (j==true&&choice>UB||choice<LB)
{
	System.out.println("ERROR: Input must be an integer in [<" + LB + ">, <" + UB + ">]!");

j=false;
	}
	}
while(!j);

return choice;
	
}
//Get an integer in the range [LB, UB] from the user. Prompt the user repeatedly until a valid value is
//entered.
public static double getDouble(String prompt, double LB, double UB)
{
	boolean i;
	double number=-1;
	do
	{
		i=false;
		System.out.print(prompt);
	try
	{
		number=Double.parseDouble(cin.next());
		
	}
	catch(NumberFormatException e)
	{
		System.out.println("ERROR: Input must be a real number in [<" + LB + ">, <" + UB + ">]!");
		//System.out.println("\nEnter choice: ");
		i=true;
	}
	
	
	
	if (i==false && number<LB|| number>UB)
	{
		System.out.println("ERROR: Input must be a real number in [<" + LB + ">, <" + UB + ">]!");
	//System.out.println("\nEnter choice: ");
	i=true;}
		
	}while(i);
	return number;
	
}//Get a real number in the range [LB, UB] from the user. Prompt the user repeatedly until a valid value
//is entered.

/*public static String getChar() throws IOException
{
	String a;
	System.out.print(a);
	a = null;
	
	
		a = Pro3_shiming2.cin.readLine();
	
	
	return a;
	
}*/

public static void main(String[] args)throws IOException, NumberFormatException
{	String choice;
boolean check = false ;

	do
	{

	
	displayMenu();
	choice = cin.next() ;
	if (choice.equals("G") || choice.equals("g"))
	{
		
		check = createGraph(G);
		System.out.println("\nNow add arcs:\n"); 
		
		G.printNodes();
		addArcs(G);
	}
	
	else if (choice.equals("C")||choice.equals("c"))
	{
		if (!check)
		{
			System.out.println("\nERROR: No graph has been loaded!");
		}
		else
		{
		
		G.printNodes();
			editCities(G);
		}
		
	}
	else if (choice.equals("A")||choice.equals("a"))
	{
		if (!check)
		{
			System.out.println("\nERROR: No graph has been loaded!");
		}
		else
		{
			String a;
		do{
		
			G.printArcs();
			System.out.println("EDIT ARCS");
			System.out.println("A - Add arc");
			System.out.println("R - Remove arc");
			System.out.println("Q - Quit\n");
			System.out.println("Enter choice: ");
		    a = cin.next();
            if (a.equals("A"))
            	addArcs(G);
            else if (a.equals("R"))
            removeArc(G);
            
			
		}while(!(a.equals("Q")||choice.equals("q")));
	}
	}
	else if (choice.equals("D")||choice.equals("d"))
		G.print();
	else if (choice.equals("R")||choice.equals("r"))
		G.reset();
	else if (choice.equals("P")||choice.equals("p"))
		tryPath(G);
	else
		System.out.println("ERROR: Invalid menu choice!\n");

}while (!(choice.equals("Q")||choice.equals("q")));
System.out.println("Ciao!");
}
}
