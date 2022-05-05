package sync.casdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 18497
 */
public class AccountTest {

    public static void main(String[] args) {
        test(new AccountCas(10000));
    }
    static void test (Account account){
        List<Thread> ts = new ArrayList<Thread>();

        for (Thread t:ts){
            t.start();
        }
        for (Thread t:ts){

        }
        System.out.println(account.query());
    }
}
