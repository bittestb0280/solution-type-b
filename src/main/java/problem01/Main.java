package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		
		int max=0;
		
		int n1=0;
		int n2=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				if(i!=j && max < arr[i]*arr[j])
				{
				
					max = arr[i]*arr[j];
					n1 = arr[i];
					n2 = arr[j];
					
				}
			}

		}
		System.out.println("["+n1+", "+n2+"]");
			
	}
}
