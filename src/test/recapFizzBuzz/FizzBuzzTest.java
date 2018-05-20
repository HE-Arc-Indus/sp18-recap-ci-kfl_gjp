import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static sun.nio.cs.Surrogate.is;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

   @Test
  public void testListSize(){
     //Arrange
     FizzBuzz fb = new FizzBuzz();
     List<String> expected = Arrays.asList(null,null,null);
     int a = expected.size();
     //Act
     List<String> actual = fb.generateList(3);
     //Assert
     assertEquals("",actual.size(),expected.size());
   }

   @Test
  public void testReplace3ByFuzz(){
     //Arrange
     FizzBuzz fb = new FizzBuzz();
     List<String> expected = Arrays.asList("1","2","3");
     //Act


     //Assert

   }

}
