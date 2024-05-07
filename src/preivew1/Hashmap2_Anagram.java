import java.util.*;

public class Hashmap2_Anagram {
    public String solution(String arr1 , String arr2)
    {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x :arr1.toCharArray())
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x : arr2.toCharArray())
        {
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x,map.getOrDefault(x,0)-1);
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        Hashmap2_Anagram ag = new Hashmap2_Anagram();
        Scanner sc = new Scanner(System.in);
        String arr1 = sc.nextLine();
        String arr2 = sc.nextLine();
        System.out.print(ag.solution(arr1,arr2));

    }


}
