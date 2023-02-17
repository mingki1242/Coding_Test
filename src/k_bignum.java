import java.util.*;

public class k_bignum {
    public int solution(int size , int num ,int [] arr)
    {
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //내림차순 정렬
        int cnt = 0;
        int answer = -1;
        for(int i = 0 ;i<size;i++)
        {
            for(int j =i+1;j<size;j++)
            {
                for(int l = j+1;l<size;l++)
                {
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        for(int x : Tset)
        {
            cnt++;
            if(cnt==num) return x;
        }
        return answer;
    }

    public static void main (String [] argv)
    {
        k_bignum kb = new k_bignum();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0 ; i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(kb.solution(size,num,arr));

    }
}
