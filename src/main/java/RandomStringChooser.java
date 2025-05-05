import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> words;

  public RandomStringChooser(String [] wordArray){
    words = new ArrayList <String>();
    for (String w: wordArray)
      words.add(w);
  }

  public String getNext(){
    if (word.size() == 0)
      return "NONE";
    int i = (int)(Math.random()*words.size());
    return words.remove(i);
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
