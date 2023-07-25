import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stack8 {
    class people{
        int id;
        int priority;
        public people (int id , int priority)
        {
            this.id = id;
            this.priority = priority;
        }

    }
    public int Solution(int people , int index , int [] arr)
    {
        int answer = 1;
        Queue<people> q = new LinkedList<>();
        for(int i = 0 ; i<arr.length;i++)
        {
            q.offer(new people(i,arr[i]));
        }

        while(!q.isEmpty())
        {
            people tmp = q.poll();
            for(people per : q)
            {
                if(per.priority > tmp.priority)
                {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null)
            {
                if(tmp.id == index) return answer;
                else answer++;
            }
        }
        return answer;
    }

    public static void main (String [] argv)
    {
        stack8 s8 = new stack8();
        Scanner sc = new Scanner(System.in);
        int people_count = sc.nextInt();
        int index = sc.nextInt();
        int [] arr = new int[people_count];
        for(int i = 0; i <people_count ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(s8.Solution(people_count,index,arr));
    }
}
