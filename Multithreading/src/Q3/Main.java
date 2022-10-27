package Q3;

public class Main extends Thread{

    public static void main(String[] args) {

        Table t = new Table();

       ImplementTable implementTable1 = new ImplementTable(t,3);
       ImplementTable implementTable2 = new ImplementTable(t,5);

       implementTable1.start();
       implementTable2.start();

    }
}
