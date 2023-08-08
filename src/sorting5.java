import java.util.*;

public class sorting5 {
    public char solution(int [] arr)
    {
        int init;
        char answer = 'U';
        for(int i = 0 ;i<arr.length;i++)
        {
            init = arr[i];
            for(int j = i+1 ; j<arr.length;j++)
            {
                if(init == arr[j]) return 'D';
            }
        }

        return answer;
    }

    public static void main (String [] argv)
    {
        sorting5 s5 = new sorting5();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i = 0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(s5.solution(arr));
    }

}
