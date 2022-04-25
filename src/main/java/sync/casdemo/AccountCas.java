package sync.casdemo;

import java.util.concurrent.atomic.AtomicInteger;

public class AccountCas implements Account{

    private AtomicInteger balance;

    public  AccountCas(int balance){
        this.balance = new AtomicInteger(balance);
    }



    @Override
    public Integer query() {
        return this.balance.get();
    }

    @Override
    public void acquire(Integer i) {
        while (true){
          int prev = balance.get();
          int next = prev -i;
          if (balance.compareAndSet(prev,next)){
              break;
          }
        }
    }
}
