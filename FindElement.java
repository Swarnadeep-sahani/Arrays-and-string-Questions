/*
 * FIND AN ELEMENT IN A ROTATED SORTED ARRAY:

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
 */
class FindElement {
    //  static int BSearch(int arr[],int start,int end,int key)
    //  {
    //     int mid=start+(end-start)/2;
    //     if(arr[mid]>key)
    //     {
    //         end=mid-1;
    //     }
    //     else if(arr[mid]>key)
    //     {
    //         start=mid+1;
    //     }
    //     else
    //     {
    //         return mid;
    //     }
    //     return -1;
    //  }
    //  static int findMin(int arr[],int n){
    //     int start=0;
    //     int end=n-1;
    //     if(arr[start]<=arr[end]){
    //         return 0;
    //     }
    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         int next=(mid+1)%n;
    //         int prev=(mid-1+n)%n;
    //         if((arr[mid]<arr[next]) &&(arr[mid]<arr[prev])){
    //             return mid;
    //         }
    //         else if(arr[start]<=arr[mid] && arr[mid]<=arr[end]){
    //             end=mid-1;
    //         }
    //         else{
    //             if(arr[start]<=arr[mid]){
    //             start=mid+1;
    //             }
    //             else if(arr[mid]<=arr[end]){
    //             end=mid-1;
    //         }
    //         }
    //     }
    //     return 0;
    // }
    //  static int minElement(int arr[],int n,int key)
    //  {
    //     int mid=findMin(arr, n);
    //     int ans1=BSearch(arr, 0, mid-1, key);
    //     int ans2=BSearch(arr, mid, n-1, key);
    //     if(ans1!=-1)
    //        return ans1;
    //         else
    //           return ans2;
    //  }
    //  public static void main(String[] args) {
    //     int arr[]={ 3, 4,5, 1 , 2};
    //     System.out.println(minElement(arr, 5, 5));
    //  }
    public static int search(int[] nums, int target) {
        int arrayStartIndex = findRotation(nums);
        int index= binarySearch(nums, arrayStartIndex,nums.length-1,target);
        int index2 = binarySearch(nums, 0,arrayStartIndex-1,target);
        return index==-1?index2:index;
    }
    
    public static int findRotation(int [] arr){
        int N = arr.length;
        int start = 0,end = N-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int prev = (mid - 1 + N)%N;
            int next = (mid + 1)%N;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
                return mid;
            else if(arr[mid]>=arr[0])
                start = mid+1;
            else 
                end = mid-1;
        }
        return 0;
    }
    
    public static int binarySearch(int [] arr,int start , int end,int target){
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]>=target)
                end = mid-1;
            else
                start = mid + 1;
        }
        return -1;
    }
     public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
     }
}

