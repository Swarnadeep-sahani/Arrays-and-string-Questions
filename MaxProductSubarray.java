/*
Link: https://leetcode.com/problems/maximum-product-subarray/description/
Ques : Maximum Product subarray
      Given an integer array nums, find a 
      subarray that has the largest product, and return the product.

Example : 
  Input: nums = [2,3,-2,4]
  Output: 6
  Explanation: [2,3] has the largest product 6.

*/
public int maxProduct(int[] arr) {
        int maxProduct = arr[0];
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = maxEndingHere;
            maxEndingHere = Math.max(arr[i], Math.max(maxEndingHere * arr[i], minEndingHere * arr[i]));
            minEndingHere = Math.min(arr[i], Math.min(temp * arr[i], minEndingHere * arr[i]));
            maxProduct = Math.max(maxProduct, maxEndingHere);
        }
        return maxProduct;
    }
