package ArrayPrograms;

public class Prog1 {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6};
		int ele=3;
		int ind=2;
		int[] res=new int[arr.length+1];
		int x=0;
		for(int i=0;i<res.length;i++) {
			if(i!=ind)
				res[i]=arr[x++];
			else
				res[i]=ele;
		}
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
	}

}
