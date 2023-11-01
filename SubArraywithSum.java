/*
Ques : Subarray with given sum

Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S
and return the left and right index(1-based indexing) of that subarray.
In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Example :

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
*/


class SubArraywithSum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
                int curSum = 0;
        int left = 0;
        int right = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        if(s==0){
          ans.add(-1);
          return ans;
        }
        while (right <= n) {
            if (curSum == s) {
                ans.add(left + 1);
                ans.add(right);
                break;
            } else if (curSum < s) {
                if (right < n) {
                    curSum += arr[right];
                    right++;
                } else {
                    break;
                }
            } else {
                curSum -= arr[left];
                left++;
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
          
        return ans;
    }
}
