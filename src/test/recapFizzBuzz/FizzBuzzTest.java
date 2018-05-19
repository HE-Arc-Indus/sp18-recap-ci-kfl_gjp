import static org.junit.Assert.assertThat;
import static sun.nio.cs.Surrogate.is;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FizzBuzzTest {

   @Test
  public void testListSize(){
     //Arrange
     FizzBuzz fb = new FizzBuzz();
     List<String> expected = Arrays.asList("1", "2", "3");
     //Act
     List<String> actual;
     //Assert
     assertThat(actual.size(), is(expected.size()));
   }
}
