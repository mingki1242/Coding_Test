import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class joker_6_6 {
    public ArrayList<Integer> solution(int [] arr)
    {
       /* ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        for(int i = 0 ;i<arr.length;i++)
        {
            if(i == arr.length-1) break;
            else if(arr[i] <= arr[i+1]) continue;
            else
            {
                if(arr[i] > arr[i+1] && count == 0)
                {
                    answer.add(i+1);
                    count++;
                }
                else if(arr[i] > arr[i+1] && count == 1)
                {
                    answer.add(i+2);
                }
            }
        }
        return answer;*/
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i]!=tmp[i]) answer.add(i+1);
        }
        return answer;

    }

    public static void main(String [] argv)
    {
        joker_6_6 j6 = new joker_6_6();
        Scanner sc = new Scanner(System.in);
        int Regist_Student_Num = sc.nextInt();
        int [] Student_Height = new int[Regist_Student_Num];

        for(int i = 0 ; i<Regist_Student_Num;i++)
        {
            Student_Height[i] = sc.nextInt();
        }

        for(int x : j6.solution(Student_Height))
        {
            System.out.print(x + " ");
        }
    }

}
