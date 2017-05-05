package com.atest2;

/**
 * Created by 10740071 on 02/05/2017.
 */
public class room01 extends rooms {
    room01(){
        this.RID = 1;
        this.desc = new String [] {"im room 1", "rom1"};
        this.paths = new String [] {"NORTH"};
        this.paths_go = new int []{1,0,0,0};
    }
}
