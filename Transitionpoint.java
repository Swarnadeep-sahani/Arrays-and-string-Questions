/* 
 Link : https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1
 Ques : Find Transition Point
        Given a sorted array containing only 0s and 1s, find the transition point, i.e., the first index where 1 was observed, and before that, only 0 was observed.
        
        Example 1:
        
        Input:
        N = 5
        arr[] = {0,0,0,1,1}
        Output: 3
        Explanation: index 3 is the transition 
        point where 1 begins.
*/

    int transitionPoint(int arr[], int n) {
            // code here
            int left=0;
            int right=n-1;
            int ans=-1;
            while(left<=right)
            {
                int mid=(left+right)/2;
                if(arr[mid]==1)
                {
                    ans=mid;
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            return ans;
        }
