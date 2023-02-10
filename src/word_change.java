import java.util.*;
public class word_change
{
    public ArrayList<String> solution(String [] str , int num)
    {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str)
        {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main (String[] argv)
    {
        word_change wc = new word_change();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String [] str = new String[num];
        for(int i = 0 ; i<num;i++)
        {
            str[i] = sc.next();
        }
        for(String x : wc.solution(str,num))
        {
            System.out.println(x);
        }

    }
}
