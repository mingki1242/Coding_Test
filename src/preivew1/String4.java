import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class String4 {
    public ArrayList<String> solution (String [] arr)
    {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : arr)
        {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main (String [] argv)
    {
        String4 s4 = new String4();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String [] strlist = new String[num];
        for(int i = 0 ; i<num ;i++)
        {
            strlist[i] = sc.next();
        }
        for(String A : s4.solution(strlist))
        {
            System.out.println(A);
        }
    }
}
