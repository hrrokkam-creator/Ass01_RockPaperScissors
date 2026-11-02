import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playerA;
        String playerB;
        String playAgain;

        do {

            do {
                System.out.print("Player A - Enter R, P, or S: ");
                playerA = in.nextLine().toUpperCase();

                if (!playerA.equals("R") && !playerA.equals("P")
                        && !playerA.equals("S")) {
                    System.out.println("Invalid move! Try again.");
                }

            } while (!playerA.equals("R") && !playerA.equals("P")
                    && !playerA.equals("S"));


            do {
                System.out.print("Player B - Enter R, P, or S: ");
                playerB = in.nextLine().toUpperCase();

                if (!playerB.equals("R") && !playerB.equals("P")
                        && !playerB.equals("S")) {
                    System.out.println("Invalid move! Try again.");
                }

            } while (!playerB.equals("R") && !playerB.equals("P")
                    && !playerB.equals("S"));


            if (playerA.equals(playerB)) {
                if (playerA.equals("R")) {
                    System.out.println("Rock vs Rock it's a Tie!");
                } else if (playerA.equals("P")) {
                    System.out.println("Paper vs Paper it's a Tie!");
                } else {
                    System.out.println("Scissors vs Scissors it's a Tie!");
                }
            }


            else if (playerA.equals("R") && playerB.equals("S")) {
                System.out.println("Rock breaks Scissors!");
                System.out.println("Player A wins!");
            } else if (playerA.equals("P") && playerB.equals("R")) {
                System.out.println("Paper covers Rock!");
                System.out.println("Player A wins!");
            } else if (playerA.equals("S") && playerB.equals("P")) {
                System.out.println("Scissors cuts Paper!");
                System.out.println("Player A wins!");
            }


            else if (playerB.equals("R") && playerA.equals("S")) {
                System.out.println("Rock breaks Scissors!");
                System.out.println("Player B wins!");
            } else if (playerB.equals("P") && playerA.equals("R")) {
                System.out.println("Paper covers Rock!");
                System.out.println("Player B wins!");
            } else if (playerB.equals("S") && playerA.equals("P")) {
                System.out.println("Scissors cuts Paper!");
                System.out.println("Player B wins!");
            }


            do {
                System.out.print("Play again? (Y/N): ");
                playAgain = in.nextLine().toUpperCase();

                if (!playAgain.equals("Y") && !playAgain.equals("N")) {
                    System.out.println("Invalid choice! Enter Y or N.");
                }

            } while (!playAgain.equals("Y") && !playAgain.equals("N"));

            System.out.println();

        } while (playAgain.equals("Y"));

        System.out.println("Thanks for playing!");

        in.close();
    }
}