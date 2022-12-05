package compoundinterest;

import java.util.*;

public class CompoundEncapSystem {

    private double principal, rate, time, compoundinterest;
    private int number;

    void setPrincipal (double principal){
        this.principal = principal;
    }
    void setRate (double rate){
        this.rate = rate;
    }
    void setTime (double time){
        this.time = time;
    }
    void setCompound (double compoundinterest){
        this.compoundinterest = compoundinterest;
    }
    void setNumber (int number){
        this.number = number;
    }

    double getPrincipal() {
        return principal;
    }
    double getRate() {
        return rate;
    }
    double getTime(){
        return time;
    }
    double getCompound(){
        return compoundinterest;
    }
    int getNumber(){
        return number;
    }
    
    public void userInput(){
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter principal: ");
        setPrincipal(scan.nextDouble());
        System.out.println("Enter rate: ");
        setRate(scan.nextDouble());
        System.out.println("Enter time: ");
        setTime(scan.nextDouble());
        System.out.println("Enter number of time compounded: ");
        setNumber(scan.nextInt());

        details();
    }

    public void details(){

        setCompound(principal * Math.pow(1+rate/100, time * number) - principal);
        
        System.out.println("Principal: " + getPrincipal());
        System.out.println("Rate: " + getRate());
        System.out.println("Time: " + getTime());
        System.out.println("Number of time compounded: " + getTime());
        System.out.println("Compound Interest: " + getCompound());

    }
    
}
