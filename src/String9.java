import java.util.*;

public class String9 {
    public int solution(String str)
    {
        int answer = 0;
        char [] c = str.toCharArray();
        String num = "";
        int index = 0;
        for(char x : c)
        {
            if(Character.isAlphabetic(c[index]))
            {
                index++;
            }
            else if(c[index] >=48 || c[index]<=57)
            {
                num += c[index];
                index++;
            }
        }
        answer = Integer.parseInt(num);
        return answer;
    }
    public static void main (String[] argv)
    {
        String9 nn = new String9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(nn.solution(str));

    }
}
