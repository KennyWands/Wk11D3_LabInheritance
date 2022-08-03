import org.junit.Before;
import org.junit.Test;

import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void beforeEach(){
        developer = new Developer("Kenny", "ni2",200.00);

    }

    @Test
    public void getName(){
        assertEquals("Kenny", developer.getName());
    }
    @Test
    public void  getNI(){
        assertEquals("ni2", developer.getNI());
    }
    @Test
    public void getSalary(){
        assertEquals(200.00, developer.getSalary(), 0.01);
    }
//    @Test
//    public void getDept(){
//        assertEquals("CodeStuff", developer.getDeptName());

//    }
    @Test
    public void raiseSalary (){
        developer.raiseSalary(10);
        assertEquals(210, developer.getSalary(), 0.01);
    }

    @Test
    public void raiseSalaryLessThanZero (){
        developer.raiseSalary(-10);
        assertEquals(200, developer.getSalary(), 0.01);
    }

    @Test
    public void cantEnterNullForName(){
        developer.setName(null);
        assertEquals("Kenny", developer.getName());
    }

    @Test
    public void payBonus(){

        assertEquals(2.00, developer.payBonus(), 0.01);
    }
}
