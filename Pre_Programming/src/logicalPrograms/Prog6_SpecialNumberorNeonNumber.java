package logicalPrograms;

public class Prog6_SpecialNumberorNeonNumber {

	public static void main(String[] args) {
		int n=10;
		
		int sq=n*n;
		
		int sum=0;
		int prod=1;
		int add=0;
		
		while(sq>0)
		{
			int rem;
			rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		
		if(n==sum)
			
			System.out.println(n+" Is a Neon Number");
		else
			System.out.println(n+" Is not a Neon Number");
	}

}
