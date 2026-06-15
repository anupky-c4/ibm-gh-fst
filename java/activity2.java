package fst;

public class activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] arr= {10,77,10,54,-11,10};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==10) {
			sum+=arr[i];
			}
		}
		System.out.println("The sum of 10's in array :"+ sum);
	}

}
