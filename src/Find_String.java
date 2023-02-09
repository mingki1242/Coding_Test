import java.util.*;
public class Find_String {
    public int solution(String str , char c)
    {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(int i = 0 ; i<str.length();i++)
        {
            if(str.charAt(i) == c)
            {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] argv)
    {
        Find_String FS = new Find_String();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(FS.solution(str,c));
    }

}