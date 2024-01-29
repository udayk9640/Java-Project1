
public class RemoveDuplicate {

	public int  main(int[] nums) {
		// TODO Auto-generated method stub
		int j = 1;
		
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
		
}
