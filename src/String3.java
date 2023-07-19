import java.util.*;

public class String3 {
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
        String3 LC = new String3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(LC.solution(str));

    }


}