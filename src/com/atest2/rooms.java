package com.atest2;

/**
 * Created by 10740071 on 02/05/2017.
 */
public class rooms {
    protected int RID=0;//RID;//RID = 0;
    protected String[] paths = {"No doors can be seen.You are Trapped!"};
    protected String[] desc = {"tis is the default room!","there is nothing here []{}[]"};
    //private item_g  ;
    rooms(){
        //this.RID = 0;
    }

    public String[] getpaths(){
        return this.paths;
    }
    public String[] getdesc(){
        return this.desc;
    }
    public int getRID(){
        return this.RID;
    }

}
