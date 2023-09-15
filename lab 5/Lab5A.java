import java.util.Scanner;
public class Lab5A
{
    public static  void main(String[]args)
    {
        String answer, answer2;
        Scanner in = new Scanner(System.in);
        System.out.println("Do you have a driving permit");
        answer = in.nextLine();
        if(answer.equals("Y") || answer.equals("y"))
        {
            System.out.println("Do you have a commercial driving license");
            answer2 = in.nextLine();

            if(answer2.equals("Y") || answer2.equals("y"))
            {
                System.out.println("Congratulations! You can purchase a vehicle, let’s start talking options!");
            }
            else
            {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        }
        else
        {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle! ");
        }

    }
}