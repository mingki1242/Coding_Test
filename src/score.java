import java.util.*;
public class score {
    public int solution(int num, int[] arr)
    {
        int answer = 0;
        int score = 0;
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                score++;
            }
            else if(arr[i] == 0)
            {
                score = 0;
            }
            answer += score;
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        score sr = new score();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i = 0 ;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(sr.solution(num , arr));

    }
}
