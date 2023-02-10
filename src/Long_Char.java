import java.util.*;

public class Long_Char{
    public String solution (String str)
    {
        String answer = "";
        int min = Integer.MIN_VALUE;
        String [] sol = str.split(" ");

        for(String x : sol)
        {
            if(x.length() > min)
            {
                min = x.length();
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String [] argv)
    {
        Long_Char LC = new Long_Char();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(LC.solution(str));

    }
}