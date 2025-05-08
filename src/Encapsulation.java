import java.util.Scanner;

public class Encapsulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gm = sc.next();
        String pw = sc.next();
        Encaps e = new Encaps(gm,pw);
        String gmail= e.getGmail();
        String password = e.getPassword();
        if (gm.contains(gmail) && pw.contains(password)) {
            System.out.println("login successful");
        }else {
            System.out.println("invalid");
        }
    }
}
class Encaps{
    private  String gmail;
    private String password;
    Encaps(String gmail,String password){
        if(gmail.contains("@gmail.com")&& password.length()>=8){
            this.gmail = gmail;
            this.password=password;
        }else{
            System.out.println("please enter correct info");
        }
    }
    public String getGmail() {
        return gmail;
    }
    public String getPassword() {
        return password;
    }
}