/*
    Find the Rotation Count in Rotated Sorted array
    Consider an array of distinct numbers sorted in increasing order. The array has been rotated (clockwise) k number of times. Given such an array, find the value of k.

    Examples:

    Input : arr[] = {15, 18, 2, 3, 6, 12}
    Output: 2
    Explanation : Initial array must be {2, 3,
    6, 12, 15, 18}. We get the given array after 
    rotating the initial array twice.

    Input : arr[] = {7, 9, 11, 12, 5}
    Output: 4

    Input: arr[] = {7, 9, 11, 12, 15};
    Output: 0
 */
class RotationArr {
        static int findKrotation(int arr[],int n){
            int start=0;
            int end=n-1;
            if(arr[start]<=arr[end]){
                return 0;
            }
            while(start<=end){
                int mid=start+(end-start)/2;
                int next=(mid+1)%n;
                int prev=(mid-1+n)%n;
                if((arr[mid]<arr[next]) &&(arr[mid]<arr[prev])){
                    return mid;
                }
                else if(arr[start]<=arr[mid] && arr[mid]<=arr[end]){
                    end=mid-1;
                }
                else{
                    if(arr[start]<=arr[mid]){
                    start=mid+1;
                    }
                    else if(arr[mid]<=arr[end]){
                    end=mid-1;
                }
                }
            }
            return 0;
        }
        public static void main(String[] args) {
            int arr[]={5, 1, 2, 3, 4};
            System.out.println(findKrotation(arr, 5));
        }
}
