package logicalPrograms;

public class DuplicateOccurence {

	public static void main(String[] args) {
		int arr[]= {1,5,1,6,4,1,5};
		int[] cou=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&& arr[i]!=-1) {
					arr[j]=-1;
					count++;
				}
			}
			cou[i]=count;
		}
		for(int i=0;i<cou.length;i++) {
			if(arr[i]!=-1)
				System.out.println("Element "+arr[i]+" is occured "+cou[i]+" times");
		}
	}

}
