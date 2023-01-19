import java.util.*;

public class delete_same {
    public String solution (String str){
        String answer = "";

        for(int i = 0 ; i<str.length();i++)
        {
            if(i == str.indexOf(str.charAt(i)))
            {
                answer+= str.charAt(i);
            }

        }
        return answer;
    }
    public static void main (String[] argv)
    {
        delete_same dt = new delete_same();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(dt.solution(str));
    }
}
