import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ItemTest
{
    Item item;
    
    @Before
    public void setUp()
    {
        item = new Item();
        item.setId(114514);
        item.setName("Something");
    }
    
    @Test
    public void getId()
    {
        assertEquals(114514, item.getId());
    }
    
    @Test
    public void getName()
    {
        assertEquals("Something", item.getName());
    }
    
    @Test
    public void setId()
    {
        item.setId(1919810);
        assertEquals(1919810, item.getId());
    }
    
    @Test
    public void setName()
    {
        item.setName("Anything");
        assertEquals("Anything", item.getName());
    }
}