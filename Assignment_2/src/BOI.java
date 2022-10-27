import java.io.*;

public class BOI extends Bank{
    public BOI( long accNumber, double balance) {
        this.ifsc = "BOI0000039";
        this.bankName = "BOI";
        this.rateOfInterest = 3.25;
        this.balance = balance;
        this.accNumber = accNumber;
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
            System.out.println("Error Occurred");
        }

    }

    @Override
    public void readFile() {
        System.out.println("\nBOI BANK LOGS: ");
        try(BufferedReader b=new BufferedReader(new FileReader( "files/"+bankName+".txt"))){
            String line;
            while((line=b.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
        catch (IOException e) {
            System.out.println("Error Occurred");
        }
    }

}