class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class Test{
    public static void main(String[] args) {
        try {
            withdraw(500, 300);                    // line 1
        } catch (InsufficientFundsException e) {
            System.out.println("Caught: " + e);    // line 2
        }
    }
    static void withdraw(int balance, int amount) throws InsufficientFundsException {
        if (amount > balance) {                    // line 3
            throw new InsufficientFundsException("Not enough balance"); // line 4
        }
        System.out.println("Withdrawal successful");
    }
}
