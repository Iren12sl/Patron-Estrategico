import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog perro;

    @Before
    public void setUp() throws Exception {
         perro = new Dog();
    }

    @Test
    public void testTestToString() {
        perro.display();
        String esperado = perro.toString();
        String obtenido = "This is a Dog";
        assertEquals(obtenido,esperado);
    }
}