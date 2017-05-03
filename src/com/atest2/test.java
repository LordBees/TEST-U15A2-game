package com.atest2;

/**
 * Created by 10740071 on 02/05/2017.
 */
public class test {
    String [] testa = {"test"};
    test(){
        doprint(this.testa);
    }
    public void doprint(String [] arrayx){
        for (int x=0;x<arrayx.length;x++){
            System.out.println(arrayx[x]);
        }

    }
}
