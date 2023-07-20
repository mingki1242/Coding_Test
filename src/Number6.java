import java.util.*;
public class Number6 {
    public boolean isPrime(int num){
         if(num == 1) return false;
         for(int i = 2;i<num;i++)
         {
             if(num%i==0) return false;

         }
         return true;
    }
    public ArrayList<Integer> solution(int num , int[]arr)
    {
        ArrayList<Integer> answer = new ArrayList<>();

        //배열속 원소를 거꾸로 만들기
        for(int i = 0 ;i<num;i++)
        {
            int tmp = arr[i];
            int res = 0;
            while(tmp>0)
            {
                int t = tmp%10;
                res=res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }
    public static void main(String [] argv)
    {
        Number6 rs = new Number6();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i = 0 ; i<num ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int x : rs.solution(num,arr))
        {
            System.out.print(x + " ");
        }

    }
}
