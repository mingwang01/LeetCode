package sync.casdemo;

/**
 * @author 18497
 */
public interface Account {
            Integer query();

            void acquire(Integer i);
}
