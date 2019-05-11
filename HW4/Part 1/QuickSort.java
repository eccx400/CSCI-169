import java.util.*;

public class Quicksort
{
	// A simple print function
	public void print(int input[])
	{
	    for ( int i = 0; i < 10; i++ )
	    {
	        System.out.println( input[i] + " ");
	    }
	}

	// The partition function
	public static int partition(int input[], int p, int r)
	{
	    int pivot = input[r];

	    while ( p < r )
	    {
	        while ( input[p] < pivot )
	            p++;

	        while ( input[r] > pivot )
	            r--;

	        if ( input[p] == input[r] )
	            p++;
	        else if ( p < r )
	        {
	            int tmp = input[p];
	            input[p] = input[r];
	            input[r] = tmp;
	        }
	    }
	    return r;
	}

	// The quicksort recursive function
	public static void quicksort(int input[], int p, int r)
	{
	    if ( p < r )
	    {
	        int j = partition(input, p, r);
	        quicksort(input, p, j-1);
	        quicksort(input, j+1, r);
	    }
	}

	public static void main(String args[])
	{
	    int input[] = {500, 700, 800, 100, 300, 200, 900, 400, 1000, 600};
	    for (int i = 0; i < input.length; i++)
	    	  System.out.println("Element at index " + i + 
	    	                                " : "+ input[i]);
	    quicksort(input, 0, 9);
	    System. out. println();
	    for (int j = 0; j < input.length; j++)
	    	  System.out.println("Element at index " + j + 
	    	                                " : "+ input[j]);
	}
}
