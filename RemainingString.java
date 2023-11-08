/*
Link: https://practice.geeksforgeeks.org/problems/remaining-string3515/1?page=5&category=Strings&sortBy=submissions
Ques: Remaining String
Given a string S without spaces, a character ch, and an integer count, the task is to
find the string after the specified character has occurred count number of times.

Example 1:
Input:  S = "Thisisdemostring", ch = 'i', 
count = 3
Output: ng
Explanation: Substring of S after the 3rd
occurrence of 'i' is "ng"
*/

String printString(String str, char ch, int count) {
        // code here
        if(count==0)
          return str;
        int cnt=0;
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                cnt++;
            }
            if(cnt==count){
              if(i==str.length()-1){
                  return "Empty string";
              }else{
              return str.substring(i+1);
              }
            }
        }
        return "Empty string";
    }
