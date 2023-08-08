import java.util.*;
public class sorting2 {
    public int [] solution (int size , int [] arr)
    {

        for(int i = 0 ;i<arr.length - 1;i++)
        {
            for(int j = 0 ; j<arr.length-i-1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

        }
        return arr;
    }
    public static void main (String []argv)
    {
        sorting2 s2 = new sorting2();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int x : s2.solution(size , arr))
        {
            System.out.print(x + " ");
        }


    }
}
