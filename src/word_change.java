import java.util.*;
public class word_change {
    public ArrayList<String> solution(String[] str , int n)
    {
        ArrayList<String> answer= new ArrayList<>();
        for(String x : str)
        {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main (String[] argv)
    {
        word_change wd = new word_change();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String [] str = new String[m];
        for(int i =0 ; i<m;i++)
        {
            str[i] = sc.next();
        }
        for(String x:wd.solution(str,m))
        {
            System.out.println(x);
        }
    }

}
