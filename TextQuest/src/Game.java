/**
 * Created by student on 10.12.2015.
 */

import java.util.Scanner;

public class Game {

    private Person player;

    private Scanner scan;

    public Game() {
        player = new Person();
        scan = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println(player+"\n--------------------------------------");

        firstLevel();
    }

    private int firstLevel() {
        System.out.println("Hello Dear Player!");
        System.out.println("Today we will start new game.");
        System.out.println("You are little child and would became adult. But you should study at school.");
        System.out.println("First challenge for you is school choosing.");
        System.out.println("You have 3 variants:");
        System.out.println("1) Harvard");
        System.out.println("2) Technical school");
        System.out.println("3) Standard School");

        boolean isAcceptable = false;
        int userChoose = -1;
        while (!isAcceptable) {
            System.out.print("Input your choose: ");
            userChoose = scan.nextInt();

            switch (userChoose) {
                case 1:
                    if (player.getLuck()>=80) {
                        isAcceptable = true;
                    } else {
                        System.out.println("You are not so lucky for Harvard");
                    }
                    break;
                case 2:
                    if (player.getIntelligent()>=60) {
                        isAcceptable = true;
                    } else {
                        System.out.println("You are stupid for this school...");
                    }
                    break;
                case 3:
                    isAcceptable = true;
            }
        }

        player.setSchool(userChoose);

        System.out.println("Our congratulations!!! You have chosen school!");

        return 0;
    }
}
