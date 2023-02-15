import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Scanner;

public class continuout_anagram {
    public int solution(String arr , String str)
    {
        int lt = 0;

        int rt = str.length()-1;
        int answer= 0;
        HashMap<Character,Integer> am = new HashMap<>();
        HashMap<Character,Integer> bm = new HashMap<>();
        for(char x : str.toCharArray())
        {
            am.put(x,am.getOrDefault(x,0)+1);
        }
        for(int i = 0 ; i<rt;i++)
        {
            bm.put(arr.charAt(i),bm.getOrDefault(arr.charAt(i),0)+1);
        }
        for(rt = str.length()-1 ; rt<arr.length();rt++)
        {
            bm.put(arr.charAt(rt),bm.getOrDefault(arr.charAt(rt),0)+1);
            if(bm.equals(am)) answer++;
            bm.put(arr.charAt(lt),bm.get(arr.charAt(lt))-1);
            if(bm.get(arr.charAt(lt))==0) bm.remove(arr.charAt(lt));
            lt++;
        }
        return answer;
    }


    public static void main (String [] argv)
    {
        continuout_anagram ca = new continuout_anagram();

        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        String str = sc.nextLine();

        System.out.print(ca.solution(arr,str));
    }
}
