import java.lang.annotation.Target;
import java.util.*;
public class second_searching {
    public int solution(int Target_Number , int [] Arr) {
        int answer = 0;
        Arrays.sort(Arr);
        // 순차 검색
        /*for (int i = 0; i < Arr.length; i++) {
            if (Target_Number != Arr[i]) {
                answer++;
            } else if (Target_Number == Arr[i]) {
                answer++;
                break;
            }
        }*/
        // 이분검색
        int lt = 0;
        int rt = Arr.length-1;
        while(lt <= rt)
        {
            int mid = (lt + rt) /2;
            if(Arr[mid] == Target_Number)
            {
                answer = mid +1;
                break;
            }
            else if(Target_Number < Arr[mid])
            {
                rt = mid-1;
            }
            else
            {
                lt = mid+1;
            }
        }
        return answer;
    }


    public static void main (String [] argv)
    {
        second_searching ss = new second_searching();
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int Target_Number = sc.nextInt();
        int [] Arr = new int[Size];
        for(int i = 0 ; i <Size ; i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println(ss.solution(Target_Number , Arr));
    }
}
