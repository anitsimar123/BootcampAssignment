public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {

        Bank b1=new ICICI(2001,29380);
        Bank b2=new ICICI(2002,30340);
        b1.withdraw(500);
        b2.deposit(300);
        b2.withdraw(2500);
        b1.deposit(2000);
        b1.readFile();

        Bank b3=new BOI(3001,725600);
        Bank b4=new BOI(3002,12930.56);
        b3.withdraw(5000);
        b4.deposit(300);
        b3.withdraw(7500);
        b4.deposit(6400);
        b4.readFile();

        Bank b5=new SBI(4001,20000);
        Bank b6=new SBI(4002,920290);
        b5.withdraw(601.5);
        b6.deposit(210);
        b6.withdraw(550);
        b5.deposit(6000);
        b5.withdraw(26000);
        b5.readFile();
    }
}
