import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jarrod", "UB3245O", 80000);
    }

    @Test
    public void hasName() {
        assertEquals("Jarrod", developer.getName());
    }

    @Test
    public void hasNiNo() {
        assertEquals("UB3245O", developer.getNINo());
    }

    @Test
    public void hasSalary() {
        assertEquals(80000, developer.getSalary());
    }

    @Test
    public void testRaiseSalary() {
        assertEquals(90000, developer.raiseSalary(10000));
    }

    @Test
    public void testPayBonus() {
        assertEquals(800, developer.payBonus());
    }
}
