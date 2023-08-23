package com.example.desafios;

public class Parentese {

    public boolean testParent() {
        boolean x = false;
        String s = "[)]";

        if (s.charAt(0) == '('){
            if (s.charAt(s.length()-1) == ')'){
                x= true;
            } else {x = false;}
        }

        if (s.charAt(0) == '['){
            if (s.charAt(s.length()-1) == ']'){
                x= true;
            } else {x = false;}
        }

        if (s.charAt(0) == '{'){
            if (s.charAt(s.length()-1) == '}'){
                x= true;
            } else {x = false;}
        }

        return x;
        
    }

    public static void main(String[] args) {
        Parentese um = new Parentese();
        System.out.println(um.testParent());
    }
}
