
package game;

import java.util.Scanner;

public class Hangman {
    public void showmenu()
    {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("------Menu------");
        System.out.println("1. Play");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
        System.out.println("\ncChoose the option: ");
        option = sc.nextInt();
        
    }
    public static void main(String[] args) {
        Hangman hg = new Hangman();
        hg.showmenu();
    }
    
}
