//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /** Enumerated type that lists all types of accounts. */
    public enum BankAccountType {
        /**Checking account. */
        CHECKINGS,
        /**Savings account. */
        SAVINGS,
        /**Student account. */
        STUDENT,
        /**Workplace account. */
        WORKPLACE
    }

    /**Account number of the account. */
    private int accountNumber;

    /**Type of the account. */
    private BankAccountType accountType;

    /**Balance of the account. */
    private double accountBalance;

    /**Name of the owner of the account. */
    private String ownerName;

    /**Interest rate of the account. */
    private double interestRate;

    /**Cumulative interest earned on the account. */
    private double interestEarned;

    /**Total number of accounts made. */
    public static int numAccounts = 0;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
        numAccounts++;
    }

    /** Withdraws money from the account.
     *
     * @param amount the amount to withdraw from the account
     * @return boolean that indicates if transaction is successful
     */
    public boolean withdraw(final double amount) {
        if (amount > accountBalance) {
            return false;
        } else {
            accountBalance -= amount;
            return true;
        }
    }

    /** Deposits money in the account.
     *
     * @param amount the amount to deposit into the account
     * @return boolean that indicates if the transaction is successful
     */
    public boolean deposit(final double amount) {
        accountBalance += amount;
        return true;
    }


    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /** Returns the account number. */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /** Returns the account balance. */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /** Returns the name of the owner. */
    public String getOwnerName() {
        return this.ownerName;
    }

    /** Changes the name of the owner.
     *
     * @param newname name to change to
     */
    public void setOwnerName(final String newname) {
        this.ownerName = newname;
    }

    /** Returns the amount of interest earned. */
    public double getInterestEarned() {
        return this.interestEarned;
    }
}
