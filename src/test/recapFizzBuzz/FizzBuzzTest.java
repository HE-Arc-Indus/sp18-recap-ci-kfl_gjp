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
     //Act
     List<String> actual = fb.generateList(3);
     //Assert
     assertEquals("",actual.size(),expected.size());
   }

   @Test
  public void testReplace3ByFizz(){
     //Arrange
     FizzBuzz fb = new FizzBuzz();
     List<String> expected = Arrays.asList("1","2","Fizz");
     //Act
     List<String> actual = fb.generateList(3);
     //Assert
      assertEquals("Replace multiple of 3 by Fizz",actual,expected);
   }

   @Test
  public void testReplace5ByBuzz(){
     //Arrange
     FizzBuzz fb = new FizzBuzz();
     List<String>expected =Arrays.asList("1","2","Fizz","4","Buzz");
     //Act
     List<String> actual = fb.generateList(5);
     //Assert
     assertEquals("Replace multiple of 5 by Buzz",actual,expected);
   }

   @Test
  public void testReplace3and5ByFizzBuzz(){
     //Arrange
     FizzBuzz fb = new FizzBuzz();
     List<String>expected =Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
     //Act
     List<String> actual = fb.generateList(15);
     //Assert
     assertEquals("Replace multiple of 5 and 3 by FizzBuzz",actual,expected);
   }

}
