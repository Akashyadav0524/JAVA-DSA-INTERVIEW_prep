package string;

public class performance {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a'+ i);
            System.out.print(" ");
            System.out.print(ch);
        }
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a'+ i);
            series = series+ch;
        }
        System.out.println(" ");
        System.out.println("\nIam not a charcter iam a whole word or string -- >"+series);
    }
}
