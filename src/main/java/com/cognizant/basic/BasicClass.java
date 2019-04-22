package com.cognizant.basic;

public class BasicClass {

    int multiplier = 2;

    public static void main(String[] args) {
        BasicClass bc = new BasicClass();
        System.out.println(bc.sayHello("Smith"));
        System.out.println(bc.sayHello(""));
    }

    public int multiplyBy2(int a){
        return a * multiplier;
    }

    public String capitalizeEachWord(String paramS) {
        String[] separate = paramS.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < separate.length; i++) {
            sb.append(separate[i].substring(0, 1).toUpperCase() + separate[i].substring(1));
            if(i != separate.length-1){
                sb.append(" ");
            }
            System.out.println();
        }
        return sb.toString();
    }

    public String sayHello(String name) {
        if(name == null || name.equals("")) {
            return "Hello, World!";
        } else {
            return "Hello, " + name;
        }

    }
}
