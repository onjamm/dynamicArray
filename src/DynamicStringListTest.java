import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;



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

    @Test
    public void testAdd(){
        list.add("apple");
        String actual = list.get(0);
        assertEquals("test", actual);
    }

    @Test
    public void testRemove(){
        list.add("milo");
        list.add("screams");
        list.add("at");
        list.add("the");
        list.add("birds");
        String removed = list.remove(3);
        assertEquals("the", removed);
        assertEquals(4,list.size());


    }


}
