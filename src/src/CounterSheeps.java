public class CounterSheeps {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        final int n = arrayOfSheeps.length;
        for(int i = 0; i < n; i++) {
            if(arrayOfSheeps[i] == null) {continue;}
            if(arrayOfSheeps[i] == true) { counter++; }
        }
        return counter;
    }
    public static void main(String[] args) {

    }
}
