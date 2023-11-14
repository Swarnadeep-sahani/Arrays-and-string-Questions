/*
    Ques: Find first and last occurance of given key element in a sorted array.
    Ques: count the key element in sorted array in logn time.
 */

public class FirstAndlastOcc {
       static int [] FirstLast(int arr[],int key){
            int result[]=new int[2];
            result[0]=FindFirst(arr, key);
            result[1]=findLast(arr,key);
            return result;
       }
       static int FindFirst(int arr[],int key){
            int start=0;
            int end=arr.length-1;
            int index=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==key){
                    index=mid;
                    end=mid-1;
                }else if(arr[mid]<key){
                    start=mid+1;
                }else{
                    end=mid-1;
                } 
            }
            return index;
       }
       static int findLast(int arr[],int key){
            int start=0;
            int end=arr.length-1;
            int index=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==key){
                    index=mid;
                    start=mid+1;
                }else if(arr[mid]<key){
                    start=mid+1;
                }else{
                    end=mid-1;
                } 
            }
            return index;
       }
       static int CountKey(int arr[],int key)
       {
            int start=FindFirst(arr, key);
            int end=findLast(arr, key);
            return (end-start+1);
       }
       public static void main(String[] args) {
            int arr[]={2,4,10,10,10,18,20};
            int ans[]=FirstLast(arr, 10);
            System.out.println(ans[0]+" "+ans[1]);
            System.out.println(CountKey(arr, 10));
       }
}
