import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions.*;


public class DynamicStringListTest {
    private DynamicStringList list;
    @BeforeEach
    public void setUp() {
        list = new DynamicStringList();
    }
    
    @Test
    void testGet(){
        //Arrange
        list.add("word");

        //Act
        String actual = list.get(0);

        //Assert
        assertEquals("word", actual);

    }

    @Test 
    public void testSet(){
        list.add("I");
        list.add("despise");
        list.add("loud");
        list.add("cats");
        list.set(1,"love");

        assertEquals("love", list.get(1));
    }


}
