class Solution {

    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        int target = 5;
        

        System.out.println(twoSum(arr,target));
    }

    
    public static int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i<nums.length ; i++){
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    int arr[] = {i,j};
                    return arr;
                }

            }
        }
        return null;
    }
    
}