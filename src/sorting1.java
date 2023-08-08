import java.util.*;
public class sorting1 {
    public ArrayList<Integer> solution (int [] arr)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0 ;i<arr.length;i++)
        {
            int idx = i;
            for(int j = i+1 ; j<arr.length;j++)
            {
                if(arr[idx] > arr[j])
                {
                    int tmp = arr[idx];
                    arr[idx] = arr[j];
                    arr[j] = tmp;
                }
            }
            answer.add(arr[idx]);
        }
        return answer;
    }
    public static void main (String []argv)
    {
        sorting1 s1 = new sorting1();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int x : s1.solution(arr))
        {
            System.out.print(x + " ");
        }


    }
}
