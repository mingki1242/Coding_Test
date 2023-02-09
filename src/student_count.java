import java.util.*;
public class student_count {
    public int solution(int num , int []arr)
    {
        int answer = 1;
        int bignum = arr[0];
        for(int i = 0 ; i<num;i++)
        {
            if(bignum < arr[i])
            {
                bignum = arr[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        student_count ans = new student_count();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int student[] = new int[num];
        for(int i = 0 ; i< num ; i++)
        {
            student[i] = sc.nextInt();
        }
        System.out.println(ans.solution(num,student));
    }
}
