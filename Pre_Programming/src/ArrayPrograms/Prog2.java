package ArrayPrograms;
//remove an element from array at particular index
public class Prog2 {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6};
		
		int ind=2;
		int[] res=new int[arr.length-1];
		int x=0;
		for(int i=0;i<arr.length;i++) {
			if(i!=ind)
				res[x++]=arr[i];
			
		}
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");

	}

}
