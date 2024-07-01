import java.util.Scanner;

public class NumberGuessGame {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean ans= true;
        int score = 0;
        int chance = 10;
        System.out.println("Hello Friend, Welcome in number guessing game. ");
        System.out.println("For playing game rules are as follows:- ");
        System.out.println("1.You have only "+chance+" chance to guess a number.");
        System.out.println("2.Guess number will be in range between 1 to 100.");
        while(ans){
            int rand = getRandomNumber(1,100);
            boolean correct = false;
            for(int i=0;i<chance;i++){
                System.out.print("Chance "+(i+1)+" Enter your Guess :- ");
                int value = sc.nextInt();
                if(value == rand){
                    correct= true;
                    score++;
                    System.out.println(" YOU WON IT ");
                    break;
                }
                else if(value>rand){
                    System.out.println("Number is to High");
                }
                else{
                    System.out.println("Nuber is to Low");
                }

            }
            if(correct == false){
                System.out.println("Sorry dear friend. You lost your all chances. The correct number is = "+rand);
                System.out.println("Better Luck Next Time");
            }
            System.out.println("Do you want to play Again(Enter y if your answer is yes and enter n if your answer is no)");
            char a= sc.next().charAt(0);
            if(a == 'y'){
                ans= true;
            }
            else{
                ans = false;
            }
            System.out.println("Thank you for playing. Hope you enjoyed it");
            System.out.println("Here is your Final Score = "+score);
            
        }
    }
    public static int getRandomNumber(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}

