public class SentenceSmash {
    public static String smash(String... words) {
        String res = "";
        int countedWords = 0;
        if(words.length == 2) {
            res += words[0] + " " + words[1];
            return res;
        }
        while(countedWords < words.length) {
            if(countedWords == 0 || countedWords == words.length - 1) {
                res += words[countedWords];
            }
            else {
                res += " " + words[countedWords] + " ";
            }
            countedWords++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
