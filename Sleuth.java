import java.util.Scanner;

public class Sleuth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char last = 'k';
        for (int i = n.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(n.charAt(i))) {
                last = n.charAt(i);
                break;
            }
        }
        last = Character.toLowerCase(last);


        if (last == 'a' || last == 'e' || last == 'i' || last == 'u' || last == 'y' || last == 'o')
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}