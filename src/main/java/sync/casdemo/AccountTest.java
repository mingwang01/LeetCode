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
        for (int i = 0; i < 500; i++) {
            ts.add(new Thread(() -> {
                account.acquire(20);
            }));
        }
        for (Thread t:ts){
            t.start();
        }
        for (Thread t:ts){
            t.join();
        }
        System.out.println(account.query());
    }
}
