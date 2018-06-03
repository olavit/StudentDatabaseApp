package bankaccountapp;

public interface JRate {
    //write the method that retuns the base rate
    default double getBaseRate() {
        return 2.5;
    }
}
