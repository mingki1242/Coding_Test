import java.util.*;
public class between_distance {
    public int[] solution(String str , char c)
    {
        int distance = 1000;
        int[] answer = new int[str.length()];
        char [] arr = str.toCharArray();
        for(int i = 0 ;i<str.length();i++)
        {
            if(str.charAt(i) == c)
            {
                distance = 0;
                answer[i] = distance;
            }
            else {
                distance++;
                answer[i] = distance;
            }
        }
        for(int i = str.length()-1 ; i>=0 ; i--)
        {
            if(str.charAt(i) == c)
            {
                distance = 0;
                answer[i] = distance;
            }
            else {
                distance++;
                if(distance < answer[i])
                {
                    answer[i] = distance;
                }
            }
        }

        /*for(int i = str.length()-1 ;i>=0 ;i--)
        {
            distance = 0;
            for(int j = str.length()-1 ; j>=0;j--)
            {
                if(arr[j] != c)
                {
                    distance++;
                }
                else if(arr[j] == c){
                    if(distance < answer[i])
                    {
                        answer[i] = distance;
                    }
                    answer[i] = distance;
                }
            }


        }*/
        return answer;
    }
    public static void main (String [] argv)
    {
        between_distance bt = new between_distance();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        char c = sc.next().charAt(0);
        for(int x : bt.solution(str,c))
        {
            System.out.print(x + " ");
        }
    }
}
