import java.util.*;

public class Backjoon {
    public char solution(String str)
    {
        int index = 0;
        int max = 0;
        char max_tmp = ' ';
        char answer = ' ';
        HashMap<Character,Integer> hashmap = new HashMap<>();
        str = str.toUpperCase();
        char[] arr = str.toCharArray();

        for(char x : arr)
        {
            hashmap.put(x, hashmap.getOrDefault(x,0)+1);
        }

        for(char x : hashmap.keySet())
        {
            int count = hashmap.get(x);
            if(count > max)
            {
                max = count;
                max_tmp = x;
            }
            else if(count == max)
            {
                answer = '?';
            }

        }

        /*for(char x : hashmap.keySet())
        {
            if(hashmap.size() == 1) return Character.toUpperCase(x);
            else if(x == max_tmp) continue;
            else if(hashmap.get(max_tmp) == hashmap.get(x))
            {
                answer = '?';
            }
            else
            {
                answer = max_tmp;
            }
        }*/
        return answer;
    }
    public static void main (String [] argv)
    {
        Backjoon Bj = new Backjoon();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Bj.solution(str));

    }
}
