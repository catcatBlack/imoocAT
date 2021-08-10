package configTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suite {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("before test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("after test");
    }
}
