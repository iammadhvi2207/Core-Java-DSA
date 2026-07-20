// Important : 
// Only Use when you need to find an element that occurs more than N.length / 2 time 


public class Formula{
    public static void main(String args[])
    {
        int [] nums = {1,2,3,5,5,5,5};
        


        // Formula
        int count =0, candidate =0;
        for(int num=0;num < nums.length;num++)
        {
            if(count == 0)
                candidate = nums[num];

            if(nums[num]== candidate)
                count++;
            else
                count--;

            // count += (nums[num]==candidate)? 1 : -1;

        }

        System.out.println("Majority Element : "+ candidate);
    }
    
}
