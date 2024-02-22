public class SuspendedState implements AccountState {

    // activate or close

    @Override
    public void activate(Account account) {
        System.out.println("Account is activated!");
        account.setAccountState(new ActiveState());
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setAccountState(new ClosedState());
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw on a suspended account!");
        System.out.println(account);
    }

    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot withdraw on a suspended account!");
        System.out.println(account);
    }
}