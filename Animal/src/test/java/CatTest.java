import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat gato;

    @Before
    public void setUp() throws Exception {
        gato = new Cat();
    }

    @Test
    public void testTestToString() {
        gato.display();
        String esperado = gato.toString();
        String obtenido = "This is a Cat";
        assertEquals(obtenido,esperado);
    }
}