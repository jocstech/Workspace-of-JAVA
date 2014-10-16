package algorithm_studies;

public class Method 
{
	 private int[]res;
	
	 Method(int[] indata)
	{
		res=null;
		res=indata;
		//method case 
	}
	 
	 public int[] BubbleSort( )
	 {
		 int[]num = this.res;
	      int j;
	      boolean flag = true;   // set flag to true to begin first pass
	      int temp;   //holding variable

	      while ( flag )
	      {
	             flag= false;    //set flag to false awaiting a possible swap
	             for( j=0;  j < num.length -1;  j++ )
	             {
	                    if ( num[ j ] < num[j+1] )   // change to > for ascending sort
	                    {
	                            temp = num[ j ];                //swap elements
	                            num[ j ] = num[ j+1 ];
	                            num[ j+1 ] = temp;
	                           flag = true;              //shows a swap occurred  
	                   } 
	             } 
	       } 
	 return res;
	 } 
}
