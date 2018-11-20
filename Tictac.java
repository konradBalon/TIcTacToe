import java.util.Scanner;

public class Tictac {
    static String choice = "null";
    static String tab[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    Scanner scanner = new Scanner(System.in);


    public Tictac(String[][] tab) {
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tictac tictac = new Tictac(tab);
while(true) {
    tictac.run();
    tictac.markX(choice);


}
    }

    public void run() {


        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++)
                System.out.print(tab[i][j] + "  ");
            System.out.println();
        }
        System.out.println("Które pole chcesz zaznaczyć?");
        choice = scanner.next();
    }


    public void markX(String num) {
        int number = Integer.parseInt(num);

        if (number > 0 && number < 4) {
            tab[0][number - 1] = "X";
        }
        else if(number>3&&number<7){
            tab[1][number-4]= "X";
        }
        else if(number>6&&number<10){
            tab[2][number-7]="X";
        }

    }

    public void prettyPrint() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++)
                System.out.print(tab[i][j] + "  ");
            System.out.println();

        }
    }

}