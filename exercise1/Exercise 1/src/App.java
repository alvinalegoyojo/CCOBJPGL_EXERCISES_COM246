import java.io.File;
import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter your username: ");

        Scanner loginScanner = new Scanner(System.in);

        String username_from_input = loginScanner.nextLine();

        System.out.println("Enter your password: ");

        String password_from_input = loginScanner.nextLine();
 
        User me = new User(username_from_input, password_from_input);

        File myfile = new File("accounts.txt");

        try ( // if (myfile.exists()) {
        //     System.out.println("File exists");
        // }
                Scanner fileScanner = new Scanner(myfile)) {
            boolean accchecker = false;
            
            while (fileScanner.hasNextLine()) {
                String filedata = fileScanner.nextLine();
                String username_from_file = filedata.split(",")[0];
                String password_from_file = filedata.split(",")[1];
                
                if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {
                    accchecker = true;
                    System.out.println("Login Successful, Hello" + me.getUsername());
                    break;
                }
            }
            
            if (!accchecker) {
                System.out.println("Login Failed. Account doesn't exists");
            }
        }
    }
}