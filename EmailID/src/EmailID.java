import java.util.*;
public class EmailID
{
	public static void main(String args[])
	{
		String s,search;
		int n;
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of emali'ds can be entered :");
		n=sc.nextInt();
		System.out.println("Enter the email I'ds :");
		for(int i=1;i<=n;i++)
		{
			s=sc.next();
			a.add(s);
		}
		System.out.println(a);
		System.out.println("Enter the email Id that have to be searched");
		search=sc.next();
		if(a.contains(search))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}
