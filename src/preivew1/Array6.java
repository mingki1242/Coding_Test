import java.util.*;
public class Array6 {
    public int solution(int arr[] , int num)
    {
        int answer = 0;
        int lt = 0;
        int rt = 0;
        int cnt = 0;
        for(rt = 0; rt<arr.length;rt++)
        {
            if(arr[rt] == 0) cnt++;
            while(cnt > num)
            {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer , rt-lt+1);
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        Array6 mac = new Array6();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();
        int arr[] = new int [size];
        for(int i = 0 ; i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(mac.solution(arr,num));
    }
}
