import java.util.Arrays;
import java.util.List;
public class StreamPipelineBasics{
  public static void main (String[] args) {
    
List<String> fruits = Arrays.asList("Apple", "Apricot", "Bannana");
fruits.stream()
      .filter((String f) -> f.startsWith("A"))
      .forEach(System.out::println);
    
  }
}