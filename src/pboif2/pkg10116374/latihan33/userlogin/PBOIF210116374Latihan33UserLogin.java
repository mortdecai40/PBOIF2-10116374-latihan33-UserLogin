package pboif2.pkg10116374.latihan33.userlogin;
import java.util.Scanner;
/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan lagin pada user
 *
 */
public class PBOIF210116374Latihan33UserLogin {

private static String usName, passWord;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        
        System.out.print("Masukkan Username = ");
        usName = scanner.next();
        
        System.out.print("Masukkan Password = ");
        passWord = scanner.next();
        
        user.pengecekkanLogin(usName, passWord);
    }   
}
