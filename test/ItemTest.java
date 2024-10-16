import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest
{
    
    
    @Test
    public void getId()
    {
        Item item = new Item(114514, "Something");
        assertEquals(114514, item.getId());
    }
    
    @Test
    public void getName()
    {
        Item item = new Item(114514, "Something");
        assertEquals("Something", item.getName());
    }
}