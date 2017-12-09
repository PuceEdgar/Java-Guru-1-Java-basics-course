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

        if (trSet.size() == 1) {
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




        if (trSet.size() == 2) {
            System.out.println("TEST 3 = OK!");
        } else {
            System.out.println("TEST 3 = FAILED!");
        }

        System.out.println(trSet.toString());

    }

    public void test4() {

        TransactionSet trSet = new TransactionSet();
        Transaction tr1 = new Transaction("PAREX", "HANSA", 99.99);
        Transaction tr2 = new Transaction("DNB", "PAREX", 99.99);
        Transaction tr3 = new Transaction("DNB", "PAREX", 98.99);

        trSet.addTransaction(tr1);
        trSet.addTransaction(tr2);
        trSet.addTransaction(tr3);


        if (trSet.size() == 3) {
            System.out.println("TEST 4 = OK!");
        } else {
            System.out.println("TEST 4 = FAILED!");
        }

        System.out.println("Transaction set size: " + trSet.size());

    }

    public void test5() {

        TransactionSet trSet = new TransactionSet();
        Transaction tr1 = new Transaction("PAREX", "HANSA", 99.99);
        Transaction tr2 = new Transaction("DNB", "PAREX", 99.99);
        Transaction tr3 = new Transaction("DNB", "PAREX", 9.99);

        trSet.addTransaction(tr1);
        trSet.addTransaction(tr2);
        trSet.addTransaction(tr3);



        if (trSet.remove(tr3) && trSet.size() == 2) {
            System.out.println("TEST 5 = OK!");
        } else {
            System.out.println("TEST 5 = FAILED!");
        }



    }

    public void test6() {

        TransactionSet trSet = new TransactionSet();
        Transaction tr1 = new Transaction("PAREX", "HANSA", 99.99);
        Transaction tr2 = new Transaction("DNB", "PAREX", 99.99);
        Transaction tr3 = new Transaction("DNB", "PAREX", 9.99);

        trSet.addTransaction(tr1);
        trSet.addTransaction(tr2);
        trSet.addTransaction(tr3);

        trSet.clear();

        if (trSet.size() == 0) {
            System.out.println("TEST 6 = OK!");
        } else {
            System.out.println("TEST 6 = FAILED!");
        }

    }

    public void test7() {

        TransactionSet trSet = new TransactionSet();
        Transaction tr1 = new Transaction("PAREX", "HANSA", 99.99);
        Transaction tr2 = new Transaction("DNB", "PAREX", 99.99);


        trSet.addTransaction(tr1);
        trSet.addTransaction(tr2);


        if (!trSet.isEmpty()) {
            System.out.println("TEST 7 = OK!");
        } else {
            System.out.println("TEST 7 = FAILED!");
        }

    }


    public static void main(String[] args) {

        TransactionTest test = new TransactionTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();

    }
}
