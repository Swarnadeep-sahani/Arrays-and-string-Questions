import java.util.ArrayList;
import java.util.*;

public class CommonElement {
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
    
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for (int i : A) {
        //     if(map.containsKey(i)){
        //         map.put(i,map.get(i)+1);
        //     }
        //     else{
        //         map.put(i,1);
        //     }
        // }
        // for (int i : B) {
        //     if(map.containsKey(i)){
        //         map.put(i,map.get(i)+1);
        //     }
        //     else{
        //         map.put(i,1);
        //     }
        // }
        // for (int i : C) {
        //     if(map.containsKey(i)){
        //         map.put(i,map.get(i)+1);
        //     }
        //     else{
        //         map.put(i,1);
        //     }
        // }
        // for (int i : map.keySet()) {
        //     if(map.get(i)==3)
        //       ans.add(i);
        // } 
        //   return ans;  
        TreeSet<Integer> hs =new TreeSet<>();
          TreeSet<Integer> hs1 =new TreeSet<>();
           TreeSet<Integer> hs2 =new TreeSet<>();

        for(int a:A)
        hs.add(a);
        for(int b:B)
        {
        if(hs.contains(b))
        hs1.add(b);
        }
        hs.clear();
      
         for(int c:C)
        hs.add(c);
        
         for(int f:hs)
        {
        if(hs1.contains(f))
        hs2.add(f);
        }
         ArrayList<Integer> ans =new ArrayList<>(hs2);
         return ans;
    }
    public static void main(String[] args) {
       int A[] = {1, 5, 10, 20, 40, 80};
       int B[]={6, 7, 20, 80, 100};
       int C[]={3, 4, 15, 20, 30, 70, 80, 120};
       System.out.println(commonElements(A, B, C, 6, 5, 8));

    }
}
