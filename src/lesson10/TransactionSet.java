package lesson11.homework.hashVariation;

import java.util.ArrayList;
import java.util.List;


public class TransactionSet {

    private List<Transaction> fromHansa = new ArrayList<>();
    private List<Transaction> fromParex = new ArrayList<>();
    private List<Transaction> fromOther = new ArrayList<>();



    public void addTransaction(Transaction transaction) {
        switch (transaction.getFrom()) {
            case "HANSA":
                if (!hansaExists(transaction)) {
                    fromHansa.add(transaction);
                }
                break;
            case "PAREX":
                if (!parexExists(transaction)) {
                    fromParex.add(transaction);
                }
                break;

            default:
                if (!otherExists(transaction)) {
                    fromOther.add(transaction);
                }
                break;
        }
    }


    public boolean hansaExists(Transaction transaction) {
        for (int i = 0; i < fromHansa.size(); i++) {
            Transaction fromList = fromHansa.get(i);
            if (transaction.equals(fromList)) {
                return true;
            }
        }

        return false;
    }

    public boolean parexExists(Transaction transaction) {
        for (int i = 0; i < fromParex.size(); i++) {
            Transaction fromList = fromParex.get(i);
            if (transaction.equals(fromList)) {
                return true;
            }
        }

        return false;
    }

    public boolean otherExists(Transaction transaction) {
        for (int i = 0; i < fromOther.size(); i++) {
            Transaction fromList = fromOther.get(i);
            if (transaction.equals(fromList)) {
                return true;
            }
        }

        return false;
    }

    public List<Transaction> getFromHansa() {
        return fromHansa;
    }


    public List<Transaction> getFromParex() {
        return fromParex;
    }


    public List<Transaction> getFromOther() {
        return fromOther;
    }

    @Override
    public String toString() {
        return "TransactionSet{\n" +
                "fromHansa=" + fromHansa + "\n" +
                "fromParex=" + fromParex + "\n" +
                "fromOther=" + fromOther + "\n" +
                '}';
    }
}
