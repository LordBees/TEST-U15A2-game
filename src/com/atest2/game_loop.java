package com.atest2;

/**
 * Created by 10740071 on 02/05/2017.
 */
public class game_loop {
    private boolean running = true;
    private String chs;
    private IO_handler ioh = new IO_handler();
    private roomhandler H_rooms = new roomhandler();


    public void run(){
        pre();
        looperx();
        post();
    }

    public void pre(){
        ioh.printwelcome();
    }
    public void looperx(){
        while (this.running){
            chs = "NULL";
            chs = ioh.get_input("|>");
            System.out.println("::"+chs+"::");
            //
            switch (chs.toUpperCase()){
                case "WALK":
                    ioh.outprint("where?");
                    ioh.outprintline("available options are:");
                    String [] roomx = H_rooms.get_directions();
                    ioh.printarraylines(roomx);
                    if (roomx.equals("No doors can be seen.You are Trapped!")){

                }
                else{
                    chs  = ioh.get_input("\n||>");
                    if (chs.toUpperCase().equals("NORTH") && (true)) {
                        ioh.outprintline("northbound");
                    }
                }
                break;


                case "LOOK":
                    ioh.outprintline("you look around the room:");
                    ioh.printarraylines(this.H_rooms.get_roomdescription());
                    ioh.outprintline("---");
                    break;

                case "Q":
                    this.running = false;
                    break;

                case "?":
                    ioh.printhelp();
                    //ioh.printhelpcommand("NULL");
                    break;

                case "HELP":
                    ioh.printhelp();
                    break;

                case "COMMANDS":
                    ioh.printcommands();
                    break;

                case "DBG":
                    ioh.outprintline("debug mode");
                    System.out.println(H_rooms.GRID());
                    chs = "NULL";
                    chs = ioh.get_input("|x>");
                    System.out.println("::"+chs+"::");
                    //
                    switch (chs.toUpperCase()){
                        case "CHRM":
                            ioh.outprintline("0to1");
                            H_rooms.changeroom(1);
                    }

                case"NULL":
                    ioh.outprintline("Null value!");
                    //ioh.outprintline("invalid input");
                    break;

                default:
                    //ioh.outprintline("invalid input.");
                    ioh.outprintline("-----------------");
                    break;
            }
        }
    }

    public void post(){
        ioh.outprintline("quitting game...");
    }
}
