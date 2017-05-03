package com.atest2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 10740071 on 02/05/2017.
 */
public class IO_handler {
    //String scannerin;
    private String [] welcomemsg = {"welcome to the game!","type help or ? for info","type q to quit"};
    private String [] helpmsg = {"to quit press q","to see a list of commands type commands","to display this box, type q or help"};
    //private Map helpcommands ;
    private HashMap<String,String> helpcommands = new HashMap();
    //Map helpcommands;
    IO_handler(){

        this.helpcommands.put("WALK","allows you to move to another room");
        this.helpcommands.put("LOOK","allows you to look around the room");
        this.helpcommands.put("NULL","Just a test..");
    }
    public String get_input(String promptdata){
        String scannerin;
        Scanner one = new Scanner(System.in);
        System.out.print(promptdata);
        scannerin = one.next();
        return scannerin;
    }
    public void outprint(String Txt_out){
        System.out.print("|"+Txt_out);
    }
    public void outprintline(String Txt_out){
        System.out.println("|"+Txt_out);
    }
    public void outprintraw(String Txt_out){
        System.out.println(Txt_out);
    }
    public void printarraylines(String [] arrayx){
        for (int x=0;x<arrayx.length;x++){
            //System.out.println(arrayx[x]);
            outprintline(arrayx[x]);
        }
    }
    public void printwelcome(){
        printarraylines(this.welcomemsg);
    }
    public void printhelp(){
        printarraylines(this.helpmsg);
    }
    public void printhelpcommand(String cname){
        //outprintline(helpcommands.get(cname));
        System.out.println(this.helpcommands.get(cname));
    }
    public void printcommands(){
        outprintline("available commands:");
        //printarraylines(this.helpcommands.entrySet());
        System.out.println(this.helpcommands.keySet());
    }

}
