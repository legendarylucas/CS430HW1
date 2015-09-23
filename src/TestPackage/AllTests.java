package TestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AntEatMoveTest.class, BatEatMoveTest.class, EmptyStamachTest.class, FlyEatMoveTest.class,
		TigerEatMoveTest.class, ToStringTest.class })
public class AllTests {

}
