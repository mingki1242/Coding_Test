import java.util.*;
public class check_recycling {
    public String solution(String str)
    {
        String answer = "YES";
        str = str.toUpperCase();
        char [] c = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt)
        {
            if(Character.isAlphabetic(c[lt]) && Character.isAlphabetic(c[rt]) && c[lt] == c[rt])
            {
                lt++;
                rt--;
            }
            else if(!Character.isAlphabetic(c[lt]))
            {
                lt++;
            }
            else if(!Character.isAlphabetic(c[rt]))
            {
                rt--;
            }
            else return "NO";


        }
        return answer;
    }
    public static void main (String [] argv)
    {
        check_recycling cr = new check_recycling();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(cr.solution(str));
    }
}
