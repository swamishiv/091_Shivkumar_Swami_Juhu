
import java.util.*;

class Sorting
{
	public void insertionSort(int a1[], int n)
	{
		for(int i=1; i<n; i++)
		{
			int temp=a1[i];
			for(int j=i-1; j>=0&& a1[j]>temp;j--)
			{
				a1[j+1]=a1[j];
				display(a1,n);
				a1[j]=temp;
			}
		}
	}
	
	public void display(int a1[], int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}


   public static void main (String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   
	   Sorting list = new Sorting();
	   
	   int n = sc.nextInt();
	   
	   int a1[] = new int[n]; 
	   
	   for(int i=0; i<n ;i++)
	   {
		   a1[i]=sc.nextInt();
	   }
	   
	   
	   System.out.println("The output is ");
	   
	   list.insertionSort(a1,n);
	   list.display(a1,n);
	   
	   
   }

}