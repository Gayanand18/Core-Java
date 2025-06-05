class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
            
}

class SavingsAccount extends Account
{
    public SavingsAccount(String accno, String name, String address, String phno, String dob) {
        super(accno, name, address, phno, dob);
    }
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String accno, String name, String address, String phno, String dob) {
        super(accno, name, address, phno, dob);
    }
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class ChallengeAccountCustomer {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", "John Doe", "123 Elm St", "1234567890", "01-01-1990");
        sa.deposit(1000);
        System.out.println("Savings Account Balance: " + sa.getBalance());
        
        LoanAccount la = new LoanAccount("LA456", "Jane Smith", "456 Oak St", "0987654321", "02-02-1992");
        la.payEMI(200);
        System.out.println("Loan Account Balance after EMI: " + la.getBalance());
        la.repay(800);
        System.out.println("Loan Account Balance after repayment: " + la.getBalance());
    }
}
