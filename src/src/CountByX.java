import java.util.ArrayList;

public class CountByX {
    public static int[] countBy(int x, int n) {
        int[] array = new int[n];
        int counter = 0;
        int i = 1;
        while(counter < n) {
            array[counter] = i * x;
            i++;
            counter++;
        }
        return array;
    }
    public static void main(String[] args) { System.out.println(countBy(1, 10)); }
}
