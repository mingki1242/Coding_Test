import javax.xml.transform.stream.StreamSource;
import java.util.*;
public class Find_String {
    public int solution(String str , char t)
    {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(int i  = 0 ; i<str.length();i++)
        {
            if(str.charAt(i) == t)
            {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] argv)
    {
        Find_String T = new Find_String();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(T.solution(str , c));
    }

}
