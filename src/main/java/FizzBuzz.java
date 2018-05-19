import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public FizzBuzz(){  }

  public List<String> generateList(int length){
    List<String> fbList = new ArrayList<>();
    for(int i =0;i<length+1; i++){
      fbList.add(String.valueOf(i));
    }
    return  fbList;
  }
}
