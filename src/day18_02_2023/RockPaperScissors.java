package day18_02_2023;

public class RockPaperScissors {
    private User user;
    private Computer comp;
  int  userScore;
  int  compScore;
 int   CountOfGames;
    public void StartGame (){
        System.out.println(("Гра почалася"));
        Move userMove = user.getMove();
        Move compMove = comp.getMove();
        System.out.println(userMove);
        System.out.println(compMove);
        int compareMoves = userMove.compareMove(compMove);
       switch (compareMoves){
           case 1 :
               System.out.println("Ви перемогли");
               userScore ++;
               break;
           case -1 :
               System.out.println("Комп'ютер переміг");
               compScore ++;
               break;
           case 0 :
               System.out.println("Нічия");
               break;
       }
       CountOfGames ++;
       if(user.playAgain()){
           StartGame();
       }
       else{
           printGameStats();
       }
    }
    private void printGameStats() {
        int wins = userScore;
        int losses = compScore;
        int ties = CountOfGames - userScore - compScore;
        double percentageWon = (wins + ((double) ties) / 2) / CountOfGames;

// Вивід лінії
        System.out.print("+");
        printDashes(68);
        System.out.println("+");

// Вивід заголовків таблиці
        System.out.printf("| %6s | %6s | %6s | %12s | %14s |\n",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");

// Вивід лінії
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

// Вивід значень
        System.out.printf("| %6d | %6d | %6d | %12d | %13.2f%% |\n",
                wins, losses, ties, CountOfGames, percentageWon * 100);

// Вивід лінії
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }
    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }

    public static void main(String[] args) {
RockPaperScissors RPS = new RockPaperScissors();
RPS.StartGame();
    }
    public RockPaperScissors (){
user = new User();
comp = new Computer();
userScore = 0;
        compScore = 0;
        CountOfGames = 0;
    }
}