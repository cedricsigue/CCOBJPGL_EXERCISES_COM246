import java.util.Scanner;
import java.io.File;
import java.io.FileReader;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter username:");
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

            if (username_for_input == username && password_for_input == username) {
                accountexists = true;
                break;
            }
        
            if (accountexists){
                System.out.println("success");
            }
            else{
                System.out.println("no success");
            }
        }
        
        
    }
}
