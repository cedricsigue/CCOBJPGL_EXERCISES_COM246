import java.util.Scanner;
import java.io.File;
import java.io.FileReader;


public class App {
public static void main(String[] args) throws Exception {
        /*  System.out.println("Enter username:");
        Scanner scan = new Scanner(System.in);
        String username_for_input = scan.nextLine();

        System.out.println("Enter password:");
        String password_for_input = scan.nextLine();

        File myfile = new File("account.txt");

        if (myfile.exists()) {
            System.out.println("File Exists");
        }

        Boolean accountexists = false;
        Scanner fileScanner = new Scanner(myfile);
        while (fileScanner.hasNextLine()){
            String filedata = fileScanner.nextLine();
            System.out.println(filedata);
            String username = filedata.split(",")[0];
            String password = filedata.split(",")[1];

            if (username_for_input.equals(username) && password_for_input.equals(password)) {
                accountexists = true;
                break;
            }  
        }
        
        if (accountexists){
            System.out.println("success" );
        }
        else{
            System.out.println("no success");
        }   */

        DataScientist dataScientist1 = new DataScientist("John", null, null);

        System.out.println("He is " + dataScientist1.name);
        System.out.println("His work is a" + dataScientist1.getWork());
        System.out.println("He earns only " + dataScientist1.getSalary());

        Researcher researcher1 = new Researcher ("John",null,null);

        System.out.println("She is " + researcher1.name);
        System.out.println("Her work is a " + researcher1.getWork());
        System.out.println("She earns only " + researcher1.getSalary());

    }
}
