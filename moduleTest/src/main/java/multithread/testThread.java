package multithread;

import org.testng.annotations.Test;

public class testThread {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test01(){
        System.out.println("1");
        System.out.printf("Thread id : %s%n",Thread.currentThread().getId());
    }
}
