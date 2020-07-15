import java.util.Arrays;

public class slidingWindow {
	
	public static void main(String[] args) {
		int nums[] = {2, 19, 7, 18};// {-1} {2} {-2} {-6}
		int target=9;
        Arrays.sort(nums);
        int rightIndex=nums.length-1;
        int leftIndex = 0;
        while(leftIndex<rightIndex){
            
            if(nums[leftIndex] + nums[rightIndex] == target){
            	 System.out.println( leftIndex+","+rightIndex );
            	 return;
            }else if(nums[leftIndex] + nums[rightIndex] > target){
                rightIndex--;
                
            }else{
                leftIndex++;
            }
            
        }
        
        



        System.out.println("{0,0}");
	}

}
