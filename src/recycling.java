import java.util.*;
public class recycling {
    public String solution(String str)
    {
        String answer="YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i = 0 ; i<len/2;i++)
        {
            if(str.charAt(i) == str.charAt(len-i-1)) return "NO";
            return answer;
        }
        /*String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp))
        {
            answer = "YES";
        }
        else {
            answer = "NO";
        }*/
        return answer;
    }
    public static void main (String [] argv)
    {
        recycling rc = new recycling();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(rc.solution(str));
    }
}
