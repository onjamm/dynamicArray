import org.junit.Test;
import org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {
    
    @Test
    void testGet(){
        //Arrange
        DynamicStringList list = new DynamicStringList();
        list.add("word");

        //Act
        String actual = list.get(0);

        //Assert
        assertEquals("word", actual);

    }
}
