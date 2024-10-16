import org.junit.Test;

import static org.junit.Assert.*;

public class FragmentTest
{
    
    @Test
    public void getId()
    {
        Fragment fragment = new Fragment(222);
        assertEquals(222, fragment.getId());
    }
}