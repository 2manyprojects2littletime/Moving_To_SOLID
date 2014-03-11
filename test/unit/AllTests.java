package unit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import unit.models.AccountTest;
import unit.views.HomepageTest;

@RunWith(Suite.class)
@SuiteClasses({
	AccountTest.class,
	HomepageTest.class
})
public class AllTests {

}
