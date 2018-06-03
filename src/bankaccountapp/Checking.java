package bankaccountapp;

public class Checking extends Account {
    //List specific poperties to the checking account
    private int debetCardNumber;
    private int debetCardPIN;

    //Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        /*System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        System.out.println("NEW CHECKING ACCOUNT");*/
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }

    private void setDebitCard() {
        debetCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debetCardPIN = (int) (Math.random() * Math.pow(10, 4));
        System.out.println("CARD: " + this.debetCardNumber);
        System.out.println("PIN: " + this.debetCardPIN);
    }

    //List specific methods to the checking account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your chicking account feauters: " +
                    "\nDebit card number: " + debetCardNumber +
                    "\nDebit cad PIN: " + debetCardPIN
                    );
    }
}
