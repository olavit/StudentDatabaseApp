package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();

        String file = "C:\\Users\\User\\StudentDatabaseApp\\src\\bankaccountapp\\file.csv";
        /*Checking chAcc1 = new Checking("Tom Nilson", "324567987", 1500);
        Saving saveAcc1 = new Saving("Jim Ball", "987654321", 2500);

        saveAcc1.compoud();

        saveAcc1.showInfo();
        System.out.println("*******************");
        chAcc1.showInfo();*/

        //saveAcc1.deposit(5000);
        //saveAcc1.withdraw(500);
        //saveAcc1.transfer("Gomel", 1500);
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {
            //System.out.println("New Account");
            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSn + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Saving")) {
                //System.out.println("OPEN A SAVING ACCOUNT");
                accounts.add(new Saving(name, sSn, initDeposit));
            }
            else if (accountType.equals("Checking"))
                //System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checking(name, sSn, initDeposit));
        }
            for (Account acc : accounts) {
                System.out.println("\n*******************");
            acc.showInfo();
            }
    }
}
