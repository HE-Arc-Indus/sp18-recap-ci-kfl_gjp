import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public FizzBuzz(){  }

  public List<String> generateList(int length){
    List<String> fbList = new ArrayList<>();
    for(int i =1;i<length + 1; i++){
      fbList.add(String.valueOf(i));
    }
    return  fbList;
  }

  private String transformNumberToString(int n){
    String s = String.valueOf(n);
    if(n % 3 == 0){
      return "Fizz";
    }
    return s;
  }
}
