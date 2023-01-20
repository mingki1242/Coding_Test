import java.util.*;
public class rock_paper {
    public ArrayList<Character> solution (int num , int [][] arr)
    {
        ArrayList<Character> answer = new ArrayList<>();
        for(int i = 0 ; i<num ; i++)
        {
            if(arr[0][i] == arr[1][i])
            {
                 answer.add('D');
            }
            else if(arr[0][i] == 2 && arr[1][i]==1)
            {
                answer.add('A');
            }
            else if(arr[0][i] == 1 && arr[1][i]==3)
            {
                answer.add('A');
            }
            else if(arr[0][i] == 3 && arr[1][i] == 2)
            {
                answer.add('A');
            }
            else {
                answer.add('B');
            }

        }
        return answer;
    }

    public static void main (String [] argv)
    {
        rock_paper rp = new rock_paper();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] game = new int[2][num];
        for(int i = 0 ; i<num ; i++)
        {
            game[0][i] = sc.nextInt();
        }
        for(int i = 0 ; i<num ; i++)
        {
            game[1][i] = sc.nextInt();
        }

        for(char x : rp.solution(num , game))
        {
            System.out.println(x);
        }

    }
}
