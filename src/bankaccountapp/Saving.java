package bankaccountapp;

public class Saving extends Account {
    //List specific poperties to the saving account
    private int savetyDepositBoxID;
    private int savetyDepositBoxKey;

    //Constructor to initialize saving account properties

    public Saving(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        //System.out.println("NEW SAVING ACCOUNT");
        setSavetyDebozitBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSavetyDebozitBox() {
        savetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        savetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    //List specific methods to the saving account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your saveing account features " +
                "\nSavety account box ID: " + savetyDepositBoxID +
                "\nSavety account box key: " + savetyDepositBoxKey);
    }
}
