package lesson11.homework.hashVariation;

public class TransactionTest {


    public void test1() {
        TransactionSet trSet = new TransactionSet();
        Transaction tr1 = new Transaction("PAREX", "HANSA", 99.99);
        Transaction tr2 = new Transaction("HANSA", "HANSA", 99.99);

        trSet.addTransaction(tr1);
        trSet.addTransaction(tr2);

        int fromParex = trSet.getFromParex().size();
        int fromHansa = trSet.getFromHansa().size();

        if (fromParex == 1 && fromHansa == 1) {
            System.out.println("TEST 1 = OK!");
        } else {
            System.out.println("TEST 1 = FAILED!");
        }

    }

    public void test2() {
        TransactionSet trSet = new TransactionSet();
        Transaction tr1 = new Transaction("PAREX", "HANSA", 99.99);

        trSet.addTransaction(tr1);

        if (trSet.getFromParex().size() == 1) {
            System.out.println("TEST 2 = OK!");
        } else {
            System.out.println("TEST 2 = FAILED!");
        }

    }

    public void test3() {

        TransactionSet trSet = new TransactionSet();
        Transaction tr1 = new Transaction("PAREX", "HANSA", 99.99);
        Transaction tr2 = new Transaction("DNB", "PAREX", 99.99);
        Transaction tr3 = new Transaction("DNB", "PAREX", 99.99);

        trSet.addTransaction(tr1);
        trSet.addTransaction(tr2);
        trSet.addTransaction(tr3);

        int fromParex = trSet.getFromParex().size();
        int fromOther = trSet.getFromOther().size();

        if (fromParex == 1 && fromOther == 1) {
            System.out.println("TEST 3 = OK!");
        } else {
            System.out.println("TEST 3 = FAILED!");
        }

        System.out.println(trSet.toString());

    }


    public static void main(String[] args) {

        TransactionTest test = new TransactionTest();
        test.test1();
        test.test2();
        test.test3();



    }
}
