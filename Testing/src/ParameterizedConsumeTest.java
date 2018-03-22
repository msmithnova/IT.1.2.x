import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedConsumeTest {

	FuelTank tank = null;
	
	private int param;
	private int result;
	
	@Parameters
	public static Collection<Object[]> consumeNumbers() {
		 Object[][] numbers = new Object[][] {{10,20},{15,35},{20,30},{35,45}};
	     return Arrays.asList(numbers);
	}
	
	public ParameterizedConsumeTest(int param, int result) {
	     this.param = param;
	     this.result = result;
	}
	
	@Before
	public void setUp() throws Exception {
		tank = new FuelTank(60,50);
	}
	
	@Test
	public void testConsume() {
		tank.consume(this.param);
		assertEquals(this.result, tank.getTankLevel(), 0);
	}

}
