public class DoubleChar {
    public static String doubleChar(String s) {
        String result = "";
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            result += c;
            result += c;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(doubleChar("1234"));
    }
}
