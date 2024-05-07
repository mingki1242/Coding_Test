import java.util.*;
public class sorting3 {
    public int [] solution (int size , int [] arr)
    {
        for(int i = 1 ;i<arr.length;i++)
        {
            int j;
            int tmp = arr[i];
            for(j= i-1 ; j>=0 ; j--)
            {
                if(arr[j] > tmp)
                {
                    arr[j+1] = arr[j];
                }
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
    public static void main (String []argv)
    {
        sorting3 s3 = new sorting3();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int x : s3.solution(size , arr))
        {
            System.out.print(x + " ");
        }
    }
}
