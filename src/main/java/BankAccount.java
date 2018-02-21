/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     *
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name name
     * @param accountCategory account type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        Bank.getNumberOfAccount();
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @return account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @return interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @return double
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     *
     * @return BankAccountType
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     *
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     *
     * @param a amount
     */
    public void withraw(final double a) {
        accountBalance = a;
    }
    /**
     * @param a amount
     */
    public void deposit(final double a) {
        accountBalance = a;
    }
    /**
     * @param name name
     */
    public void changeName(final String name) {
        ownerName = name;
    }
}