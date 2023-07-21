import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap3 {
    public ArrayList<Integer> solution(int size , int num , int[] arr)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt = 0;
        int rt = num-1;
        HashMap<Integer,Integer> HM = new HashMap<>();
        for(int i = 0 ;i<rt;i++)
        {
            HM.put(arr[i],HM.getOrDefault(arr[i],0)+1);
        }
        for(rt = num-1;rt<size;rt++)
        {
            HM.put(arr[rt],HM.getOrDefault(arr[rt],0)+1);
            answer.add(HM.size());
            HM.put(arr[lt],HM.get(arr[lt])-1);
            if(HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }


    public static void main (String [] argv)
    {
        Hashmap3 sm = new Hashmap3();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0 ; i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int x : sm.solution(size,num,arr))
        {
            System.out.print(x + " ");
        }

    }
}
