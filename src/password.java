import java.util.*;
public class password {
    public String solution(int num , String password)
    {
        String answer = "";
        for(int i = 0 ; i<num;i++)
        {
            String tmp = password.substring(0,7).replace('#','1').replace('*','0');
            int n = Integer.parseInt(tmp,2);
            answer+=(char)n;

            password = password.substring(7);
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        password pass = new password();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String password = sc.next();
        System.out.println(pass.solution(num,password));
    }
}
