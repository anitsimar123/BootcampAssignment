package Q3;

public class ImplementTable extends Thread{
    Table table;
    int number;

    ImplementTable(Table table,int number){
        this.table = table;
        this.number=number;
    }
    @Override
    public void run() {
      table.table(number);
      table.counting();
    }
}
