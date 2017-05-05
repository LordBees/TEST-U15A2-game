package com.atest2;

/**
 * Created by 10740071 on 02/05/2017.
 */
public class roomhandler {
    //attributes for managing room
    private int roomid = 0;
    //attribute for storing classes in array(s)

    //rooms roomsingame [] = new rooms [2];
    rooms roomsingame [] = {new rooms(),new room01()};
    //rooms currentroom = new rooms();//initialise defaults


    ///SETUP AND MANGING METHODS
    roomhandler(){
        //initialised the rooms into memory
        //roomsingame.a
    }
    private void I_roomchange(int new_roomid) {//changes room (internal method)}
        this.roomid = new_roomid;
    }

    public void changeroom(int RID) {//changes room data
        this.I_roomchange(RID);
    }

/*
    private void I_roomchange(rooms newroom){//changes room (internal method)
        this.currentroom = newroom;
    }

    public void changeroom(int RID){//changes room data
        switch (RID){
            case 0:
                I_roomchange(new rooms());
                break;
            case 1:
                I_roomchange(new room01());
                break;
        }
    }
*/





    //room methods
    public String [] get_directions(){//getsprinted directiopns
        //return currentroom.getpaths();
        return roomsingame[this.roomid].getpaths();
    }

    public int [] get_directions_int(){//getsprinted directiopns
        //return currentroom.getpathsint();
        return roomsingame[this.roomid].getpathsint();
    }

    public String [] get_roomdescription(){//gets room description block
        //return currentroom.getdesc();
        return roomsingame[this.roomid].getdesc();
    }
    public int GRID(){//gets room id
       // return  currentroom.getRID();
        return roomsingame[this.roomid].getRID();
    }
}
