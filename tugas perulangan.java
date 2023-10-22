import java.util.Scanner;

public class PalindromeElia {
    public static void main(String[] args) throws Exception {
        Scanner userinput =new Scanner(System.in);

        String kata;
        String kataPalindrome ="";
        int panjangKata;

        System.out.println("\t Menentukan Kata Palindrome kuy\n");

        System.out.print(" Masukin katanya bro : ");
        kata = userinput.nextLine();

        panjangKata = kata.length();

        for(int i = panjangKata - 1; i >= 0; i--){
            kataPalindrome = kataPalindrome + kata.charAt(i);
        }
        if (kata.equals(kataPalindrome)){
            System.out.println("\n kata " + kata + " Kalo Beginian Termasuk Palindrome bro " );

        }
        else{
            System.out.println("\n kata " + kata + " Kalo Ginian Mah Bukan Palindrome " );
            userinput.close();
            
        
        }

    }
}