package com.driver;

public class Main {

    public static void main(String args[]){
        Product p=new Product();
        System.out.println(p.product(5,10));
        System.out.println(p.product(5,10,1));
        System.out.println(p.product(5.0,10.0));
    }
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double a, double b) {
            return a*b;
        }
    }
}