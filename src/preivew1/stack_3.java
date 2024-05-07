import java.util.*;

public class stack_3 {
    public int solution(int [][] board , int [] move , int move_size , int board_size)
    {
        int answer = 0;
        int check_num = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ;i<move_size;i++)
        {
            check_num = move[i];
            for(int j = 0 ; j<board_size ; j++)
            {
                if(board[j][check_num-1] == 0) continue;
                else
                {
                    stack.push(board[j][check_num-1]);
                    board[j][check_num-1] = 0;
                    if(stack.size() >= 2)
                    {
                        int num1 = stack.pop();
                        int num2 = stack.pop();
                        if (num1 == num2) answer=answer+2;
                        else {
                            stack.push(num2);
                            stack.push(num1);
                            break;
                        }
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main (String [] argv)
    {
        stack_3 s3 = new stack_3();
        Scanner sc = new Scanner(System.in);

        int board_size = sc.nextInt();
        int [][] board = new int[board_size][board_size];
        for(int i = 0 ; i<board_size;i++)
        {
            for(int j=0;j<board_size;j++)
            {
                board[i][j] = sc.nextInt();
            }
        }

        int move_size = sc.nextInt();
        int[]move = new int[move_size];
        for(int i = 0 ; i<move_size ;i++)
        {
            move[i] = sc.nextInt();
        }

        System.out.println(s3.solution(board , move , move_size , board_size));
    }
}
