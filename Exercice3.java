
//  Saisir une date (jj-mm-aaaa) puis determiner si la date est valide ou pas 
//      1- pas de classe de java 
//      2- Faire avec les classes Java 

// pas de classe de java
public class Main {
   public static boolean check(String date)
   {
      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
      format.setLenient(false);
      try
      {
          Date d = format.parse(date); 
          System.out.println(date+" est une date valide");
      }
      catch (ParseException e)
      {
          System.out.println(date+" est une date invalide");
          return false;
      }
      return true;
   }
   
  
}

// Faire avec les classes Java
import java.text.*;
import java.util.*;

public class Main {
   public static boolean check(String date)
   {
      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
      format.setLenient(false);
      try
      {
          Date d = format.parse(date); 
          System.out.println(date+" est une date valide");
      }
      catch (ParseException e)
      {
          System.out.println(date+" est une date invalide");
          return false;
      }
      return true;
   }
   
}