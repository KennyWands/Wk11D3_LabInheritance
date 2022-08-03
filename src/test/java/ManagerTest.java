import org.junit.Before;
import org.junit.Test;
import staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void beforeEach(){
    manager = new Manager("Erik", "ni1",100.00, "CodeStuff");

    }

    @Test
    public void getName(){
        assertEquals("Erik", manager.getName());
    }
    @Test
    public void  getNI(){
        assertEquals("ni1", manager.getNI());
    }
    @Test
    public void getSalary(){
    assertEquals(100.00, manager.getSalary(), 0.01);
    }
    @Test
    public void getDept(){
        assertEquals("CodeStuff", manager.getDeptName());

    }
    @Test
    public void raiseSalary (){
        manager.raiseSalary(10);
        assertEquals(110, manager.getSalary(), 0.01);
    }
    @Test
    public void payBonus(){

        assertEquals(1.00, manager.payBonus(), 0.01);
    }
}
