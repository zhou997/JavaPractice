package com.base;

public class BreakLabelTest {
    public static void main(String[] args) {
        for(int i = 0; i < 99; i++){
            a:for( int j = 0; j < 99; j++){
                for( int k = 0; k< 99; k++){
                    System.out.println(i+" "+j+" "+k);
                    if(k == 50){
                        break a;
                    }
                }
            }
            System.out.println("executing：a");
        }
    }

}
