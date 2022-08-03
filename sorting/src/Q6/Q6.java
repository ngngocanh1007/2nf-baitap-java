package Q6;
import  java.util.Arrays;

public class Q6 {
	public static void sort(int[] nums)
	  {
	  for(int a = 0;a<nums.length-1;a++){
	  int smallest =  Integer.MAX_VALUE;
	  int smallestAt =  a+1;
	  for(int check =  a; check<nums.length;check++){
	  if(nums[check]<smallest){
	  smallestAt  = check;
	  smallest  = nums[check];
	  }
	  }
	  int temp =  nums[a];
	  nums[a]  = nums[smallestAt];
	  nums[smallestAt]  = temp;
	  }
	  }
	  // Method to test above
	  public static void main(String args[])
	  {
	  Q6 ob = new Q6();
	  int nums[] = {7, -5, 3, 2, 1, 0, 45};
	  System.out.println("Original  Array:");
	  System.out.println(Arrays.toString(nums));
	  ob.sort(nums);
	  System.out.println("Sorted  Array:");
	  System.out.println(Arrays.toString(nums));
	  }        

}
