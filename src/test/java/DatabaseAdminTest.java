import org.junit.Before;
import org.junit.Test;
import staff.techstaff.databaseAdmin;


import static org.junit.Assert.assertEquals;

    public class DatabaseAdminTest {

        staff.techstaff.databaseAdmin databaseAdmin;

        @Before
        public void beforeEach(){
            databaseAdmin = new databaseAdmin("Erik", "ni1",100.00);

        }

        @Test
        public void getName(){
            assertEquals("Erik",databaseAdmin.getName());
        }
        @Test
        public void  getNI(){
            assertEquals("ni1", databaseAdmin.getNI());
        }
        @Test
        public void getSalary(){
            assertEquals(100.00, databaseAdmin.getSalary(), 0.01);
        }
//        @Test
//        public void getDept(){
//            assertEquals("CodeStuff", databaseAdmin.getDeptName());

//        }
        @Test
        public void raiseSalary (){
           databaseAdmin.raiseSalary(10);
            assertEquals(110, databaseAdmin.getSalary(), 0.01);
        }
        @Test
        public void payBonus(){

            assertEquals(1.00, databaseAdmin.payBonus(), 0.01);
        }
    }

