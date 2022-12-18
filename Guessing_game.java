import java.util.Scanner;

class Guessing_Game {
    public static void game2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to play this game?[YES/NO] --> ");
        String choise = sc.nextLine();
        int score = Integer.MAX_VALUE;
        while(choise.equals("yes")){
            final int a = (int)(99*Math.random() + 1);
            int n = 101;
            int steps = 1;
            System.out.print("Guess a number btw 1 & 100 --> ");
            n = sc.nextInt();
            while(n != a){
                if(n>a){
                    System.out.println("Your number is greater than the actual");

                    steps++;
//                    System.out.print("Do  you want to continue? [Y/N] --> ");
//                    choise = sc.nextLine();
                    System.out.print("Guess again --> ");
                    n = sc.nextInt();
                }
                if(n<a){
                    steps++;
                    System.out.println("Your number is smaller than the actual");
                    System.out.print("Guess again --> ");
                    n = sc.nextInt();
                }
                if(n==a) {
                    System.out.println("Congo for guessing the number correct");
                    System.out.println("number of guesses = "+steps);
                    if(steps <score) {
                        score = steps;
                    }
                    System.out.println("Your highest score is "+score);
                    break;
                }
            }


            System.out.print("Do you want to play again? [YES/NO] -->");
//            choise = sc.nextLine(); // Here nextLine method is not working why??
            choise = sc.next();
//            System.out.print(choise);
            if(choise.equalsIgnoreCase("no")){
                break;
            }

        }
    }

   public static void main(String[] args) {
       game2();
    }
}