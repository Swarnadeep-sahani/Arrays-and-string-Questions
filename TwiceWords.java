/*
Given a list of N words. Count the number of words that appear exactly twice in the list.

Example 1:

Input:
N = 3
list = {Geeks, For, Geeks}
Output: 1
Explanation: 'Geeks' is the only word that 
appears twice. 
  */

import java.util.HashMap;

public class twiceWord {
    public static int countWords(String list[], int n)
    {
        // code here 
        HashMap<String,Integer> map = new HashMap<>();
        for(String val : list){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }
        int count = 0;
        for(String key : map.keySet()){
            if(map.get(key) == 2){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String arr[]={"geeks","for","geeks"};
        System.out.println(countWords(arr, 3));
    }
}
