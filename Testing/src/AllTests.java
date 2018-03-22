import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FuelTankTest.class, ParameterizedConsumeTest.class, ParameterizedFillTest.class })
public class AllTests {

}
