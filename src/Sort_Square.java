
import java.lang.reflect.Array;
import java.util.*;

public class Sort_Square {

class Point implements Comparable<Point> {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override // compareTo함수 재정의
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y; //x값이 같을 경우 y좌표를 비교하여 오름차순 정렬 일 경우 양수 리턴
        else return this.x - o.x; //아닐경우 x값을 비교하여 오름차순 정렬 일 경우 양수 리턴
    }
}

    public void main(String[] argv) {
        Sort_Square square = new Sort_Square();
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < Size; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        //Collections.sort() 또는 Arrays.sort()와 같은 정렬 메서드는 compareTo 메서드를 호출하여 객체 간의 비교를 수행하며, 이를 기반으로 정렬을 수행합니다
        Collections.sort(arr);
        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}


