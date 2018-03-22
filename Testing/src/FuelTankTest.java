/**
 * Tests for class FuelTank.
 * 
 * All tests in the folder "test" are executed 
 * when the "Test" action is invoked.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Before;

public class FuelTankTest {
	FuelTank tank = null;
    
	@Before
	public void setUp() throws Exception {
		tank = new FuelTank(40.0, 0.0);
	}
	
    @Test
    public void testGetTankLevel() {
        assertEquals(0.0, tank.getTankLevel(), 0);
    }
    
    @Test
    public void testGetTankMax() {
        assertEquals(40.0, tank.getTankMax(), 0);
    }
    
    @Test
    public void testIsEmpty() {
        assertTrue(tank.isEmpty());
    }
    
    @Test
    public void testHalfFullTank() {
        tank.fill(20.0);
        assertEquals(tank.getTankMax()/2, tank.getTankLevel(), 0);
    }
 
 }