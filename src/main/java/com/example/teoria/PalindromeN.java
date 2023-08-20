package com.example.teoria;

public class PalindromeN {

    public boolean isPalindrome(int x){
        String emOrdem = String.valueOf(x);
        StringBuilder reverse = new StringBuilder(emOrdem).reverse();
        String inverso = reverse.toString();
        if (emOrdem.equals(inverso)){
            return true;
        } else return false;
        


    }
    
    public static void main(String[] args) {
        PalindromeN p = new PalindromeN();
        System.out.println(p.isPalindrome(123));
    }

}
