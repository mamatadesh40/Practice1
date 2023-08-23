package logicalPrograms;

public class Prog4_FetchDigit {

	public static void main(String[] args) {
		int n=135;
		int sum=0;
		/*while(n>0)
		{ 
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
							
		}
		System.out.println(sum);*/
		
		
		for(int i=n;i>0;i=i/10)
		{
			int rem;
			rem=i%10;
			
			sum=sum+rem;
			
			
		}
		System.out.println(sum);
	}

}