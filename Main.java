import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
   Pattern pattern = Pattern.compile("\\w+\\*.*\\d", Pattern.CASE_INSENSITIVE);
   Matcher matcher = pattern.matcher("ALANFE01*12730002");
    
    boolean matchFound = "*12730002".matches("\\w+\\*.*\\d");
    //boolean matchFound = matcher.find();


      //DIGIBEE JSON GENERATOR - MATCHES
      System.out.println("Match found: " + "ADSAADA*12730002".matches("\\w+\\*.*\\d")); //matcher.group());
      //DIGIBEE JSLT - FIND
      System.out.println("Match found: " + matcher.find()); //matcher.group());
   
  }
}