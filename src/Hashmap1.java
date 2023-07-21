import java.util.*;

public class Hashmap1 {
    public char solution(String arr , int num)
    {
        char answer = ' ';
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char x : arr.toCharArray())
        {
            map.put(x,map.getOrDefault(x,0)+1);
            //map.containsKey('F'); //키가 존재하느냐?
            //map.remove('A'); // 키를 삭제한다 리턴값은 A의 밸류
        }
        for(char x : map.keySet())
        {
            if(map.get(x)>max)
            {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        Hashmap1 hc = new Hashmap1();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String arr = sc.next();
        System.out.print(hc.solution(arr,num));
    }


}
