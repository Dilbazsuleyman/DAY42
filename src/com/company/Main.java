package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class Car {
    private String name ;
    private int serialNumber;
    private  boolean fast ;
    private  boolean slow ;
    private  boolean sunroof ;
    private  String password ;

    public Car(String name){
        this.name=name;
    }
    public  String getPassword(){
        return password;
    }
  public void setPassword(String pass){
        if (pass.length()>2){
            password=pass ;
        }
  }
  public String getName(){
        return name ;
  }
  public void setName(String name){

  }
}