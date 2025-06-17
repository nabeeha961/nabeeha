   import java.util.*;

// Manages bill payments using Stack (LIFO)
  class BillPaymentManager {
    Stack<String> billPayments = new Stack<>();

    public void addBill(String billInfo) {
        billPayments.push(billInfo);
    }

    public void processBills() {
        System.out.println("=== Bill Payments (Processed using Stack) ===");
        while (!billPayments.isEmpty()) {
            System.out.println("Processing: " + billPayments.pop());
        }
    }
}

// Manages opening of new accounts using ArrayList
class AccountManager {
    List<String> newAccounts = new ArrayList<>();

    public void openAccount(String accountInfo) {
        newAccounts.add(accountInfo);
    }

    public void printAccounts() {
        System.out.println("\n=== New Accounts Opened ===");
            System.out.println("Opened: " + newAccounts);
        
    }
}

// Alerts loan defaulters using Queue (FIFO)
 class LoanDefaulterAlert {
     Queue<String> defaulters = new LinkedList<>();

    public void addDefaulter(String defaulterInfo) {
        defaulters.offer(defaulterInfo);
    }

    public void alertDefaulters() {
        System.out.println("\n=== Contacting Loan Defaulters (FIFO Queue) ===");
        while (!defaulters.isEmpty()) {
            System.out.println("Contacting: " + defaulters.poll());
        }
    }
}

// Main class to tie everything together
public class BankSystem {
    public static void main(String[] args) {
        // Bill Payments
        BillPaymentManager billManager = new BillPaymentManager();
        billManager.addBill("Bill from Account 1001 - Rs. 500");
        billManager.addBill("Bill from Account 1002 - Rs. 1000");
        billManager.addBill("Bill from Account 1003 - Rs. 750");
        billManager.processBills();

        // New Account Openings
        AccountManager accountManager = new AccountManager();
        accountManager.openAccount("Ali - Account 2001");
        accountManager.openAccount("Sara - Account 2002");
        accountManager.openAccount("Ahmed - Account 2003");
        accountManager.printAccounts();

        // Loan Defaulter Alerts
        LoanDefaulterAlert alertManager = new LoanDefaulterAlert();
        alertManager.addDefaulter("Loan Defaulter: Account 3001");
        alertManager.addDefaulter("Loan Defaulter: Account 3002");
        alertManager.addDefaulter("Loan Defaulter: Account 3003");
        alertManager.alertDefaulters();
    }
}

