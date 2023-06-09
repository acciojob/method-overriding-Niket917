package com.driver;

public class Main {
  public static class A{
      public String meth(){
          return "Invoking method from class A";
      }
  }

  public static class B extends A{
      public String meth(){
          return "Method is overridden in Extendend class B";
      }
  }

    public static void main(String[] args) {
        A objA = new A();
        System.out.println(objA.meth()); // Task 3

        B objB = new B();
        System.out.println(objB.meth()); // Task 5
    }
}