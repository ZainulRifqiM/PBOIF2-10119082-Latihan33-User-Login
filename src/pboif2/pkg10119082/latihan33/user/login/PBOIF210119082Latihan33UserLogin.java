/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan33.user.login;
import java.util.Scanner;
/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: User Login
 */
public class PBOIF210119082Latihan33UserLogin {
    private static String usName,passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        User user = new User();
        
        System.out.print("Masukkan Username : ");
        usName = keyboard.nextLine();
        System.out.print("Masukkan Password : ");
        passWord = keyboard.nextLine();
        
        user.pengecekanLogin(usName,passWord);
    }
    
}
