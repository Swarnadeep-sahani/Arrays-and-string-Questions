/* Ques. :  Leaders in an array
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array
is leader if it is greater than or equal to all the elements to its right side. The rightmost element
is always a leader. 

Example :

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
*/  

static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(arr[n-1]);
        int max = arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
