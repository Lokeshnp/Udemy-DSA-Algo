package hashtable.LeetCode4;

import java.util.*;


public class Main {

   public static List<List<String>> groupAnagrams(String[] strings){
       HashMap<String, List<String>> anagramGroup = new HashMap<>();
       for(String s: strings){
           char[] chars = s.toCharArray();
           Arrays.sort(chars);
           String canonical = new String(chars);
           if(anagramGroup.containsKey(canonical)){
               anagramGroup.get(canonical).add(s);
           }else{
               List<String> group = new ArrayList<>();
               group.add(s);
               anagramGroup.put(canonical,group);
           }
       }
       return new ArrayList<>(anagramGroup.values());
   }



    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

}