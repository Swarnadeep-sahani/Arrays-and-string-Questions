public class Main
{
/*
 * Maximum sum of i*arr[i] among all rotations of a given array
Input: arr[] = {8, 3, 1, 2}
Output: 29
Explanation: Lets look at all the rotations,
{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17
*/
    static int maxSum(int arr[],int n)
    {
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<n;i++)
        {
            int cur_sum=0;
            for(int j=0;j<n;j++)
            {
                int index=(i+j)%n;
                cur_sum+=j*arr[index];
            }
            ans=Math.max(ans,cur_sum);
        }
        return ans;
    }
	public static void main(String[] args) {
	    int arr[]={8,3,1,2};
		System.out.println(maxSum(arr,4));
	}
}
