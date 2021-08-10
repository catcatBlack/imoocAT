package configTest;

import org.testng.annotations.Test;

public class login {
    @Test(expectedExceptions = RuntimeException.class)
    public void test(){
        System.out.println("login");
        throw new RuntimeException();
    }
}
