import java.util.Scanner;

public class Sub_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine() ;
		
		String res = " ";
		for(int i=0 ; i<str.length() ; i++)
		{
			for(int j=i ; j<str.length() ; j++)
			{
				for(int k=i ; k<=j ; k++)
				{
					System.out.print(str.charAt(k) + " ");
				}
				System.out.println();
			}
		}
	}

}
