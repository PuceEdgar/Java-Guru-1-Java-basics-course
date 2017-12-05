    package lesson4.credit_card;

    public class CreditCard {

        private String cardNumber;
        private String pinCode;
        private double debitBalance;
        private double creditLimit;
        private double withdrawnCredit;

        public CreditCard(String cardNumber, String pinCode, double debitBalance, double creditLimit) {
            this.cardNumber = cardNumber;
            this.pinCode = pinCode;
            this.debitBalance = debitBalance;
            this.creditLimit = creditLimit;

        }

        public boolean topup(double amount, String pinCode) {
            if (this.pinCode.equals(pinCode) && amount > 0) {
                if (amount >= withdrawnCredit) {
                    debitBalance = debitBalance + (amount - withdrawnCredit);
                    withdrawnCredit = 0;
                } else if (amount < withdrawnCredit) {
                    withdrawnCredit = withdrawnCredit - amount;
                }
            }

            return false;
        }

        public boolean withdraw(double amount, String pinCode) {
            if (this.pinCode.equals(pinCode) && amount <= (debitBalance + (creditLimit - withdrawnCredit))) {
                if (amount <= debitBalance) {
                    debitBalance = debitBalance - amount;
                } else if (amount > debitBalance) {
                    withdrawnCredit = amount - (withdrawnCredit + debitBalance);
                    debitBalance = 0;
                }
            }

            return false;
        }

        public String toString() {
            return "Debit Balance: " + debitBalance + "\n"
                    + "Credit Limit: " + creditLimit + "\n"
                    + "Withdrawn Credit: " + withdrawnCredit;
        }

    }
