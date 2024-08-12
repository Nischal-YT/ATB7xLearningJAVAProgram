package August.ex_04082024_Constructor;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode; // Instance

    // Default Constructor
    BankAccount(){
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

    // Parameterised Constructor - 3 Argument
    BankAccount(String bName,int bal, String bCode){
        this.bankName = bName;
        this.balance = bal;
        this.bankCode = bCode;
    }
    // Parameterised Constructor - 2 Argument
    BankAccount(String bName,int bal){
        this.bankName = bName;
        this.balance = bal;

    }
    // Parameterised Constructor - 1 Argument
    BankAccount(String bName){
        this.bankName = bName;
    }


    void printDetails(){
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }
}
