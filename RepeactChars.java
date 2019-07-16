import java.util.*;
public class RepeactChars
{
   public static void main(String[] args)
   {
      System.out.println(repeatChars("easy!!"));
      System.out.println(repeatChars("abc"));
      System.out.println(repeatChars("apple"));
      System.out.println(repeatChars("Homework"));
      System.out.println(repeatChars("Spring"));
      System.out.println(repeatChars("Integer"));
      
   }
   public static String repeatChars(String x)
   {
      //TODO complete this method as required in the homework instructions
      String a = "";
      for(int i = 0; i < x.length(); i++)
      {
         String temp = String.valueOf(x.charAt(i));
         if(temp.matches("[^UEOAIueoai]"))
         {
            a+= temp;
         }
         a+= temp;
         a+= temp;
      }
      
     
      return a;
   }
}