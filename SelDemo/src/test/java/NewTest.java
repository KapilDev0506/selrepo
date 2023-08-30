import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class NewTest
{
    @Test
    public void testAppConstructor() {
    	MyMaths app1 = new MyMaths();
    	MyMaths app2 = new MyMaths();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
    	MyMaths app = new MyMaths();
        assertEquals("Hello World!", app.getMessage());
    }
}
