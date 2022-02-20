package bullscows;

import java.util.Random;

public class Number {
    public static String nanoTime() {
        Random generate = new Random();
        StringBuilder numb = new StringBuilder("0123456789abcdefghijklmnopqrstuvwxyz");
        int index;
        int num = Main.possibleNumber;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Main.number; i++) {
            index = generate.nextInt(num);
            sb.append(numb.charAt(index));
            numb.deleteCharAt(index);
            num--;
        }
        return sb.toString();
        }
}
