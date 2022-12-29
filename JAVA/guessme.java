import java.util.Scanner;

public class guessme
{
    Scanner sc=new Scanner(System.in);
    double r;
    int rand;
    public void rand()
    {
        r= Math.random()*99;
        rand=(int)r;
    }
    public void game()
    {
        System.out.println("Lets Begin!!!");
        int turns=7,guess;
        rand();
        while (turns>=1)
        {
            System.out.println("Turns Left - "+turns);
            System.out.println("Enter your Guess");
            guess= sc.nextInt();
            if(rand==guess)
            {
                System.out.print("\u000C");
                System.out.println("\n");
                System.out.println("********************************************************************************");
                System.out.println("Congrats!!! you have guessed it");
                System.out.println("Winner Winner Chicken Dinner");
                System.out.println("********************************************************************************");
                break;
            }
            else if(guess<rand)
            {
                System.out.println("OOPS!! Too Low");
                System.out.println("Try guessing a little bit higher.....\n\n");
            }
            else if (guess>rand)
            {
                System.out.println("OOPS!! Too High");
                System.out.println("Try guessing a little bit lower.....\n\n");
            }
            turns--;
        }
        if(turns==0)
        {
            System.out.print("\u000C");
            System.out.println("********************************************************************************");
            System.out.println("OOPS you Lost!!!!!!!");
            System.out.println("Better Luck next time......");
            System.out.println("********************************************************************************");
        }
        System.out.println("\n\nEnter 'y' to Play again or press any other key to stop");
        sc.nextLine();
        char c=sc.nextLine().charAt(0);
        if(c=='y'||c=='Y')
        {
            System.out.print("\u000C");
            game();
        }
    }
    public void begin()
    {
        System.out.println("Enter 'y' to start");
        char c=sc.nextLine().charAt(0);
        if(c=='y'||c=='Y')
        {
            System.out.print("\u000C");
            game();
        }
        else
        {
            System.out.print("\u000C");
            System.out.println("Invalid try again!!!");
            begin();
        }
    }
    public static void main(String[] args)
    {
        guessme ob= new guessme();
        System.out.println("********************************************************************************");
        System.out.println("                              Guess the Number                                  ");
        System.out.println("                     Guess the number between 1 and 100 to win                  ");
        System.out.println("********************************************************************************");
        System.out.println("                                                     Code By - SUBIR KUMAR PATRO");
        System.out.println("How to Play:-");
        System.out.println("1. Computer generates a random number");
        System.out.println("2. Guess the number to win");
        System.out.println("3. You will be given 7 turns");
        ob.begin();
        System.out.print("\u000C");
        System.out.println("********************************************************************************");
        System.out.println("\n                       Thank You for Playing                                \n");
        System.out.println("********************************************************************************");
    }
}
