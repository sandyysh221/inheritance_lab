import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin dbadmin;

    @Before
    public void before() {
        dbadmin = new DatabaseAdmin("Jerry", "AB1234C", 50000);
    }

    @Test
    public void hasName() {
        assertEquals("Jerry", dbadmin.getName());
    }

    @Test
    public void hasNiNo() {
        assertEquals("AB1234C", dbadmin.getNINo());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, dbadmin.getSalary());
    }

    @Test
    public void testRaiseSalary() {
        assertEquals(60000, dbadmin.raiseSalary(10000));
    }

    @Test
    public void testPayBonus() {
        assertEquals(500, dbadmin.payBonus());
    }
}
