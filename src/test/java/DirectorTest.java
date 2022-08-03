import org.junit.Before;
import org.junit.Test;
import staff.Management.Director;

import static org.junit.Assert.assertEquals;


public class DirectorTest {
 Director director;
    @Before
    public void beforeEach(){
        director = new Director("Erik", "ni1", 1000.00, "CodeStuff", 1000);
    }

    @Test
    public void getBudget(){
        assertEquals(1000, director.getBudget(), 0.01);
    }

    @Test
    public void payBonus(){

        assertEquals(20.00, director.payBonus(), 0.01);
    }
}
