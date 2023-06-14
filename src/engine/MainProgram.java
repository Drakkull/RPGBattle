package engine;

import Player.Character;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your character name:  ");
        String name = sc.nextLine();

        System.out.print("Enter your character age:  ");
        int age= sc.nextInt();

        if( age == 24){
            System.out.println("Danadis!!!");
        }
        else{
            System.out.println("Foi por pouco...");
        }

        System.out.print("Enter your character race:  ");
        String race = sc.nextLine();


        System.out.println("Welcome   "  + name  +  "!!" + "You look so young to die, since you have ony " +   age   + "  to die!");
    }
}
