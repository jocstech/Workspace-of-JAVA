
import java.io.*;
import java.util.Scanner;

public class Node {
	private String name; // node name
	private double lat ; // latitude coordinate
	private double lon ; // longitude coordinate
	
	// constructors
	public Node ()
	{
		this.name = null;
		this.lat = 0;
		this.lon = 0;
	}
	public Node ( String name , double lata , double lona )
	{
		this.name = name;
		this.lat = lata;
		this.lon = lona;
	}
	
	// setters
	public void setName ( String name )
	{
		this.name = name;
	
	}
	public void setLat ( double lat )
	{
		this.lat = lat;
	}
	public void setLon ( double lon )
	{
		this.lon= lon;
	}
	// getters
	public String getName ()
	{
		return name;
	}
	public double getLat ()
	{
		return lat;
	}
	public double getLon ()
	{
		return lon;
	}
	
	public void userEdit () throws IOException
	{
		/*System.out.println("Enter city to eidt <0 to quit>: ");*/
		Scanner scan = new Scanner(System.in);
		System.out.print("   Name: ");
		setName(scan.nextLine());
		this.lat = Pro3_shiming2.getDouble("   Latitude: ", -90,90);
		this.lon = Pro3_shiming2.getDouble("   Longitude: ", -180,180);
	}
	
	// get user info and edit node
	public void print ()
	{
		System.out.print(name);
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("<");
		System.out.print(this.lat);//FYL
		System.out.print(",");
		System.out.print(this.lon);//FYL
		System.out.print(">");
		System.out.print("\n");
		
		
		
	
	}// print node info as a table row
	public static double distance ( Node i , Node j ) // calc distance btwn two nodes
	 
	{ 
	   double d1 = i.lat;
	   double d2 = i.lon;
	   double d3 = j.lat;
	   double d4 = j.lon;
	   double d5 = Math.toRadians(d1);
	   double d6 = Math.toRadians(d3);
	   double difference_in_lat = Math.toRadians(d1-d3);
	   double difference_in_lon = Math.toRadians(d2-d4);
	   double a = Math.pow(Math.sin(difference_in_lat/2.0), 2.0)+Math.cos(d6)*Math.cos(d5)*Math.pow(Math.sin(difference_in_lon)/2.0,2.0);
	   double b = 2.0*Math.atan2(Math.sqrt(a), Math.sqrt(1.0-a));
	   return b*6371.0;
	   
	  
	}
	
}
	
	



