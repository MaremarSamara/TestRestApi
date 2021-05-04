package TestClasses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testPost.class, TestReqRes.class, TestRestClientHandler.class, testUpdate.class })
public class AllTests {

}
