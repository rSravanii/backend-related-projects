
/*A multiple interface problem
interface 1 = logger wants to login , interface 2 = authenticator  
this  both is used in one main class 
*/
import java.util.Scanner; //a scanner package for taking userinput--

interface Login { // 1st interface for email login page
    void logger();

}

interface authenticate { // 2nd interface for password setup and and verifing the password
    void authenticator();
}

class webServer implements Login, authenticate {// creating a class using multiple interfaces
    private String EmailID;
    private String PassWord;
    private Scanner sc = new Scanner(System.in);

    /*
     * public webServer (String email , String password) {//wanted to use but
     * realised that using scanner you can skip this constructor
     * this.EmailID = email;
     * this.PassWord = password;
     */
    @Override
    public void logger() { // email login page
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the email ID: ");
        String email = sc.nextLine();
        System.out.println("enter your age : ");
        int age = sc.nextInt();
        System.out.println(" enter next for your authentication verification ->> ");

    }

    @Override
    public void authenticator() { // password setup page
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter your secret password ");
        String password = sc.nextLine();
        System.out.println("confrim your password : ");
        String password2 = sc.nextLine();
        if (password.equals(password2)) {
            System.out.println("the password is saved");
            System.out.println("you can exit the screen now");
        } else {
            System.out.println("re enter the password ");
        }
    }

}

public class backendLoginMultipleInterface {// main class
    public static void main(String[] args) {
        webServer wb = new webServer(); // creating object for class and abstract methods
        boolean check = false;
        if (check) {// choosed to do any one abstract method
            wb.logger();
        } else {
            wb.authenticator();

        }
    }
}
