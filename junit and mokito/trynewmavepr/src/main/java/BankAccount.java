public class BankAccount {

    public Integer withdraw(Integer withdraw) throws InsufficientFundsException {
        Integer balance = 5000;
        if (withdraw > 5000) {
            throw new InsufficientFundsException("insufficient balance");
        } else {
            System.out.println(balance = balance - withdraw);
        }

        return balance;
    }

}
    class InsufficientFundsException extends Exception{
        public InsufficientFundsException(String message){

            super(message);
        }

}
