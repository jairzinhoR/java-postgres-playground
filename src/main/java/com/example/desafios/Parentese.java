package com.example.desafios;

public class Parentese {

    public boolean testParent() {
        boolean x = true;
        String s = "[[]";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') { 
                if (s.charAt(i+1) == ')'){
                    x = true;
                    i++;
                }
            }
            else if (s.charAt(i) == '[') { 
                if (s.charAt(i+1) == ']'){
                    x = true;
                    i++;                    
                }
            }            
            else if (s.charAt(i) == '{') { 
                if (s.charAt(i+1) == '}'){
                    x = true;
                    i++;
                }
            }
            else {x = false;}
        }

        return x;

    }

    public static void main(String[] args) {
        Parentese um = new Parentese();
        System.out.println(um.testParent());
    }
}
