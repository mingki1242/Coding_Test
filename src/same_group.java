import java.lang.reflect.Array;
import java.util.*;

public class same_group {
    public ArrayList<Integer> solution(int [] arr1 , int [] arr2)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(p1 <arr1.length && p2<arr2.length)
        {
            if(arr1[p1] == arr2[p2])
            {
                answer.add(arr1[p1++]);
                p2++;
            }
            else if(arr1[p1] < arr2[p2]) p1++;
            else p2++;
        }
        return answer;
    }
    public static void main (String [] argv)
    {
        same_group sg = new same_group();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int [] arr1 = new int[num1];
        for(int i = 0 ; i<num1; i++)
        {
            arr1[i] = sc.nextInt();
        }
        int num2 = sc.nextInt();
        int [] arr2 = new int[num2];
        for(int i = 0 ; i <num2; i++)
        {
            arr2[i] = sc.nextInt();
        }

        for(int x : sg.solution(arr1 , arr2))
        {
            System.out.print(x + " ");
        }
    }
}
