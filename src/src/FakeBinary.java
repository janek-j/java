
public class FakeBinary {
    public static String fakeBin(String numberString) {
        String result = "";
        int i = 0;
        while(i < numberString.length()) {
            char c = numberString.charAt(i);
            int n = Character.getNumericValue(c);
            if(n >= 5) {
                result += '1';
            }
            if(n < 5){
                result += '0';
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) { System.out.println(fakeBin("12345")); }
}
