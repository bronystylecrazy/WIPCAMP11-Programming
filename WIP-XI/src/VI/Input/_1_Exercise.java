/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;

public class _1_Exercise{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dad;
        int mom;
        System.out.print("Enter dad : ");

        dad = sc.nextInt();
        System.out.print("Enter mom : ");

        mom = sc.nextInt();
        
        System.out.println("sum of dad and mom : " + (dad + mom));
    }
}
