
import java.util.Scanner;

public class Array_Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int i=0 ; 
		int j=a.length-1 ;
		
		while(i<=j)
		{
			int temp = a[i] ;
			a[i] = a[j];
			a[j] = temp ;
			
			i++ ;
			j-- ;
		}
	
		System.out.println("After reversing the array : ");
		for(int p=0 ; p<a.length ; p++)
		{
			System.out.print(a[p] + " ");
		}
	}

}
