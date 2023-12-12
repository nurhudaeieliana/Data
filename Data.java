import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Buffered1
{
   String name;
   String id;
   String num;
   int age;
   
   Buffered1(String name, String id, String num, int age)
   {
      this.name = name;
      this.id = id;
      this.num = num;
      this.age = age;
   }
   public void displayData()
   {
      System.out.println("Your Name: " + this.name);
      System.out.println("Your Id : " + this.id);
      System.out.println("Your number phone: " + this.num);
      System.out.println("Your age : " + this.age);
   }

}

public class Data
{
   public static void main(String[] args)throws IOException{
      BufferedReader stan = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your name: ");
      String name = stan.readLine();
      System.out.println("Enter your Id: ");
      String id = stan.readLine();
      System.out.println("Enter your number phone: ");
      String num = stan.readLine();
      System.out.println("Enter your age[Don't be shy guys just a number]: ");
      int age = Integer.parseInt(stan.readLine());
      System.out.println("Thank for your kindness, See you again.");
      System.out.println();
      Buffered1 you = new Buffered1(name, id, num, age);
      you.displayData();
   }
}