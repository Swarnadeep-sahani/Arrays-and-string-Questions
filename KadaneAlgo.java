/*  Kadane's Algorithm

Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

Example :
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
*/

public class kadaneAlgo {
    static long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long meh=Integer.MIN_VALUE;
        long msf=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            meh=meh+arr[i];
            if(meh<arr[i]){
                meh=arr[i];
            }   
            if(msf<meh){
                 msf=meh; 
            }  
        }
        return msf;
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        System.out.println(maxSubarraySum(arr,4 ));
    }
}

