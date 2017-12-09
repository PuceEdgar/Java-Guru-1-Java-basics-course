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
                if (!contains(transaction)) {
                    fromHansa.add(transaction);
                }
                break;
            case "PAREX":
                if (!contains(transaction)) {
                    fromParex.add(transaction);
                }
                break;

            default:
                if (!contains(transaction)) {
                    fromOther.add(transaction);
                }
                break;
        }
    }

    public boolean contains(Transaction transaction) {
        List<Transaction> fromList;
        switch (transaction.getFrom()) {
            case "HANSA":
                fromList = fromHansa;
                break;
            case "PAREX":
                fromList = fromParex;
                break;

            default:
                fromList = fromOther;
                break;
        }

        for (int i = 0; i < fromList.size(); i++) {
            Transaction fromBank = fromList.get(i);
            if (transaction.equals(fromBank)) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        int sum = fromHansa.size() + fromParex.size() + fromOther.size();
        return sum;
    }

    public boolean remove(Transaction transaction) {

        switch (transaction.getFrom()) {
            case "HANSA":
                if (contains(transaction)) {
                    fromHansa.remove(transaction);
                    return true;
                }
                break;


            case "PAREX":
                if (contains(transaction)) {
                    fromParex.remove(transaction);
                    return true;
                }
                break;

            default:
                if (contains(transaction)) {
                    fromOther.remove(transaction);
                    return true;
                }
                break;
        }

        return false;
    }

    public void clear() {
        fromOther.clear();
        fromParex.clear();
        fromHansa.clear();
    }

    public boolean isEmpty() {
        if (fromHansa.isEmpty() && fromParex.isEmpty() && fromOther.isEmpty()) {
            return true;
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
