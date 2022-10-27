import java.time.LocalDateTime;

public abstract class Bank{

    protected String ifsc, bankName;
    protected double rateOfInterest, balance;
    protected long accNumber;
    protected enum accType {SAVINGS,CURRENT}
    protected accType t;
    public void getDetails() {
        System.out.println(bankName);
        System.out.println("IFSC CODE: "+ifsc);
        System.out.println("INTEREST RATE: "+rateOfInterest);
    }

    public void printDetails() {
        System.out.println(bankName);
        System.out.println("IFSC CODE: "+ifsc);
        System.out.println("INTEREST RATE: "+rateOfInterest);
        System.out.println("ACCOUNT NUMBER: "+accNumber);
        System.out.println("BALANCE: "+balance);
        System.out.println("TYPE: "+t);

    }

    public void deposit(double amt){
        String status="Unsuccessful", reason="Insufficient Funds";
        LocalDateTime time1=LocalDateTime.now();
        balance=balance+amt;
        status="Successful";
        reason=null;
        saveTransaction(amt,status,reason,time1.toString());
    }

    public void withdraw(double amt) throws InsufficientBalanceException {
        String status="Unsuccessful", reason="Insufficient Funds";
        LocalDateTime time1=LocalDateTime.now();
        amt=-amt;
        try{
            if(amt*-1>balance){
                throw new InsufficientBalanceException();
            }
            else{
                balance=balance+amt;
                status="Successful";
                reason=null;
            }
        }  finally{
            saveTransaction(amt,status,reason,time1.toString());
        }
    }
    //time of transaction,account number,amount withdrawn,
// amount before deduction, amount after deduction,transaction status (can also be enum), failure reason if any)
    public void saveTransaction(double amt, String status, String reason, String time){
        StringBuilder s1=new StringBuilder();
        s1.append(time).append("    ").append(accNumber).append("    ");
        if(status.compareTo("Unsuccessful")==0){
            amt=amt*(-1);
            s1.append(amt).append("    ").append(balance).append("    ").append(balance).append("    ").append(status).append("    ").append(reason);
        }
        else if(amt>0){//deposit
            s1.append(amt).append("    ").append(balance-amt).append("    ").append(balance).append("    ").append(status);
        }
        else{//withdraw
            amt=amt*(-1);
            s1.append(amt).append("    ").append(balance+amt).append("    ").append(balance).append("    ").append(status);
        }
        //write to file
        saveToFile(s1.toString());

    }
    public abstract void saveToFile(String s);
    public abstract void readFile();

}


