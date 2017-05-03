package com.atest2;

/**
 * Created by 10740071 on 02/05/2017.
 */
public class roomhandler {
    rooms currentroom = new rooms();

    public String [] get_directions(){
        return currentroom.getpaths();
    }

    private void I_roomchange(rooms newroom){
        this.currentroom = newroom;
    }

    public void changeroom(int RID){
        switch (RID){
            case 0:
                I_roomchange(new rooms());
                break;
            case 1:
                I_roomchange(new room01());
                break;
        }
    }
    public String [] get_roomdescription(){
        return currentroom.getdesc();
    }
    public int GRID(){
        return  currentroom.getRID();
    }
}
