import java.util.Scanner;
public class Compi {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string of moves made by Chefina:");
        String chefinaMoves = scanner.nextLine();

        int n = chefinaMoves.length();
        int[] count = new int[3]; // Count of Rock, Paper, Scissors

        for (int i = 0; i < n; i++) {
            char move = chefinaMoves.charAt(i);
            if (move == 'R') {
                count[0]++;
            } else if (move == 'P') {
                count[1]++;
            } else {
                count[2]++;
            }
        }

        int movesToWin = (n / 2) + 1;
        int winCount = 0;

        // Initialize the result string
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char move = chefinaMoves.charAt(i);
            char chefMove = ' ';

            if (move == 'R' && count[2] >= movesToWin) {
                chefMove = 'S';
                winCount++;
            } else if (move == 'P' && count[0] >= movesToWin) {
                chefMove = 'R';
                winCount++;
            } else if (move == 'S' && count[1] >= movesToWin) {
                chefMove = 'P';
                winCount++;
            }

            result.append(chefMove);

            if (chefMove != ' ') {
                // Decrease the count of the move played by Chefina
                count[moveIndex(chefMove)]--;
            }

            if (winCount >= movesToWin) {
                break;
            }
        }

        System.out.println("The lexicographically smallest sequence of moves for Chef to win: " + result.toString());

        scanner.close();
    }

    private static int moveIndex(char move) {
        if (move == 'R') {
            return 0;
        } else if (move == 'P') {
            return 1;
        } else {
            return 2;
        }
    }
}

