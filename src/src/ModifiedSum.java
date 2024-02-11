public class ModifiedSum {
    public static int[] bubbleSort(int[] array) {
        final int n = array.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static int sum(int[] numbers) {
        int result = 0;
        if(numbers == null || numbers.length == 0) {
            return 0;
        }
        final int n = numbers.length;
        int[] sorted = bubbleSort(numbers);
        for(int i = 1; i < n - 1; i++) { result += sorted[i]; }
        return result;
    }
    public static void main(String[] args) {
        int[] num = new int[] {6, 2, 1, 8, 10};
        System.out.println(sum(num));
    }
}
