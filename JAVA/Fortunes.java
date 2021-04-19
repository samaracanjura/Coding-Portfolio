import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class Fortunes
{
   static String[] fortunes={"The fortune you seek is in another cookie.","A closed mouth gathers no feet.","A closed mouth gathers no feet.","A closed mouth gathers no feet.","A conclusion is simply the place where you got tired of thinking.",
                             "A cynic is only a frustrated optimist.","A foolish man listens to his heart. A wise man listens to cookies.","You will die alone and poorly dressed.",
                              "A fanatic is one who can't change his mind, and won't change the subject.","If you look back, you�ll soon be going that way.","You will live long enough to open many fortune cookies.",
                              "An alien of some sort will be appearing to you shortly.","Do not mistake temptation for opportunity.","Flattery will go far tonight.",
                              "He who laughs at himself never runs out of things to laugh at.","He who laughs last is laughing at you.","He who throws dirt is losing ground.",
                              "Some men dream of fortunes, others dream of cookies.","The greatest danger could be your stupidity.","We don�t know the future, but here�s a cookie.",
                              "The world may be your oyster, but it doesn't mean you'll get its pearl.","You will be hungry again in one hour.","The road to riches is paved with homework.","You can always find happiness at work on Friday.",
                               "Actions speak louder than fortune cookies.","Because of your melodic nature, the moonlight never misses an appointment.","Don�t behave with cold manners.",
                                "Don�t forget you are always on our minds.","Fortune not found? Abort, Retry, Ignore.","Help! I am being held prisoner in a fortune cookie factory.","It�s about time I got out of that cookie.",
                                "Never forget a friend. Especially if he owes you."};
                                
   static Random randomGen;
   static Scanner keyboard;
   static String inputLine;
   static boolean done;
   
   public static void main(String[] args)   
    {
      keyboard = new Scanner(System.in);
       
      initialization();       // call initialization method (once at start)
      while (!done)
      {
         mainLoop();          // call mainLoop (until done = true)
      }
      finish(); 
   }
   
   public static  void initialization()    {    
     
      inputLine="";
       
      System.out.println("Enter \"0\" to Exit, or anything else for your fortune: ");
   }
   

   
   public static void mainLoop()    {
      inputLine = keyboard.nextLine();
      if(inputLine.equals("0"))
      {
         done = true;
      }
      else
      {
         printFortune();
         System.out.print("Another?");
      }
   }
   
   public static void printFortune()   {   
      Random rand = new Random(); 

      int r = rand.nextInt(fortunes.length);
      System.out.println(fortunes[r]);
   }
   
   public static void finish()
   {
      System.out.println("Thanks for playing along.");
   }
}
