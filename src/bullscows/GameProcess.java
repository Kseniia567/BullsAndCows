package bullscows;

public class GameProcess {
    int cBulls;
    int cCows;
    int counter = 0;

    public static void game() {
        GameProcess game = new GameProcess();
        do {
            System.out.printf("%nTurn %d: %n", ++game.counter);
            game.cBulls = 0;
            game.cCows = 0;
            String code = Main.scanner.next();
            String[] newCode = code.split("");

            for (int i = 0; i < newCode.length; i++) {
                if (Main.secretCode.contains(newCode[i])) {
                    if (Main.secretCode.charAt(i) == code.charAt(i)) {
                        game.cBulls++;
                    } else {
                        game.cCows++;
                    }
                }
            }

            if (game.cBulls == 0 && game.cCows == 0) {
                System.out.print("Grade: None.");
            } else {
                String cows = game.cCows > 0 ? String.format("%d cow(s)", game.cCows) : "";
                String bulls = game.cBulls > 0 ? String.format("%d bull(s)", game.cBulls) : "";
                String and = "and";
                String result = game.cCows > 0 && game.cBulls > 0 ? String.format("%s %s %s", bulls, and, cows) : String.format("%s%s", bulls, cows);
                System.out.printf("Grade: %s. %n", result);

            }
        } while (game.cBulls < Main.number);
        System.out.println("Congratulations! You guessed the secret code.");
    }
}
