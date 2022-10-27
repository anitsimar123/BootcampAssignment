import java.io.*;

public class ICICI extends Bank {


        public ICICI( long accNumber, double balance) {
            this.ifsc = "ICICI0000099";
            this.bankName = "ICICI";
            this.rateOfInterest = 3.5;
            this.balance = balance;
            this.accNumber = accNumber;
            this.t=accType.SAVINGS;

        }

        @Override
        public void saveToFile(String s) {
            try{
                File file=new File("files/"+bankName+".txt");
                if(!file.exists()){
                    file.createNewFile();
                }
                BufferedWriter b=new BufferedWriter(new FileWriter(file,true));
                b.write(s);
                b.newLine();
                b.close();
            } catch (IOException e) {
                System.out.println("Error Occured");
            }

        }

        @Override
        public void readFile() {
            System.out.println("\nICICI BANK LOGS: ");
            try (BufferedReader b = new BufferedReader(new FileReader("files/" + bankName + ".txt"))) {
                String line;
                while ((line = b.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not Found");
            } catch (IOException e) {
                System.out.println("Error Occurred");
            }
        }
}
