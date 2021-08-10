package multithread;

import org.testng.annotations.Test;

public class testonXML {
    @Test
    public void test01(){
        System.out.println("1");
        System.out.printf("Thread id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test02(){
        System.out.println("1");
        System.out.printf("Thread id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test03(){
        System.out.println("1");
        System.out.printf("Thread id : %s%n",Thread.currentThread().getId());
    }
}
