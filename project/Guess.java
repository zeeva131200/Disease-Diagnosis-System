/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.Random;
import java.util.Scanner;

public class Guess{
 Random r = new Random();
 Scanner sc = new Scanner(System.in); 
 int computer;
 int user;
 String exit;

    public Guess() {

    }

public void Random() {
 int count=0;
 
this.computer = r.nextInt(1001);
    System.out.println("Guess the number from 0-1000");
    this.user=sc.nextInt();

    if (user == computer){
         System.out.println("It's a Correct Guess");
         System.out.println("Congratulations! You have won a voucher.");
         System.out.println("Your voucher code is DISCOUNT5");
         count++;
         if(count==3) {
           System.out.println("I'm sorry. You have no more vouchers to redeem:(");
         }
        }
    else 
        System.out.println("It's a Wrong Guess");
         
    
    System.out.println("exit=yes/no");
    this.exit = sc.next(); 
    
 while(!exit.equalsIgnoreCase("yes")) {
    this.computer = r.nextInt(1001);
    System.out.println("Guess the number from 0-1000");
    this.user=sc.nextInt();

    if (user == computer){
         System.out.println("It's a Correct Guess");
         System.out.println("Congratulations! You have won a voucher.");
         System.out.println("Your voucher code is DISCOUNT5");
         count++;
         if(count==5) {
           System.out.println("I'm sorry. You have no more vouchers to redeem:(");
         }
        }
    else 
        System.out.println("It's a Wrong Guess");
         
    
    System.out.println("exit=yes/no");
    this.exit = sc.next(); 
        }
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }


}