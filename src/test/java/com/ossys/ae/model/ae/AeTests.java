package com.ossys.ae.model.ae;

import com.ossys.ae.model.ae.unit.UserUnitTest;
import com.ossys.ae.model.ae.unit.SystemUnitTest;
import com.ossys.ae.model.ae.integration.UserIntegrationTest;
import com.ossys.ae.model.ae.integration.SystemIntegrationTest;
import com.ossys.ae.model.ae.benchmark.UserBenchmarkTest;
import com.ossys.ae.model.ae.benchmark.SystemBenchmarkTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	UserUnitTest.class,
	SystemUnitTest.class,
//	UserIntegrationTest.class, // WARNING, Destructive Tests!
//	SystemIntegrationTest.class, // WARNING, Destructive Tests!
//	UserBenchmarkTest.class, // WARNING, Destructive Tests!
//	SystemBenchmarkTest.class // WARNING, Destructive Tests!
})
public class AeTests {

}