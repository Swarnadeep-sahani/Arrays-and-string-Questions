   /*  Second most repeated string in a sequence */

import java.util.HashMap;


public class secondMost {
    static String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer>map=new HashMap<>();
        for (int i = 0; i < N;i++) {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
            int max=0;
            String str="";
            for(String key : map.keySet()){
                if(map.get(key)> max){
                    max=map.get(key);
                    str=key;
                }
            }
            map.remove(str);
            max=0;
            str="";
            for(String key : map.keySet()){
                if(map.get(key)> max){
                    max=map.get(key);
                    str=key;
                }
            }
            return str;
    }
    public static void main(String[] args) {
        String str[]={"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        System.out.println(secFrequent(str, 6));
    }
}
