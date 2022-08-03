import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Toby", "JX4332A", 100000, "Sales");
    }

    @Test
    public void hasName() {
        assertEquals("Toby", manager.getName());
    }

    @Test
    public void hasNiNo() {
        assertEquals("JX4332A", manager.getNINo());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, manager.getSalary());
    }

    @Test
    public void testRaiseSalary() {
        assertEquals(101000, manager.raiseSalary(1000));
    }

    @Test
    public void testPayBonus() {
        assertEquals(1000, manager.payBonus());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Sales", manager.getDeptName());
    }
}
