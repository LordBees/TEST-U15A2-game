package com.atest2;

/**
 * Created by 10740071 on 02/05/2017.
 */
public class rooms {
    protected int RID=0;//RID;//RID = 0;
    protected String[] paths = {"No doors can be seen.You are Trapped!"};
    protected String[] desc = {"tis is the default room!","there is nothing here []{}[]"};
    protected  int [] paths_go = {0,0,0,0};
    //private item_g  ;
    rooms(){
        //this.RID = 0;
    }

    public String[] getpaths(){//gets room paths string
        return this.paths;
    }
    public String[] getdesc(){//gets description of room
        return this.desc;
    }
    public int[] getpathsint(){//gets int values to see if you can walk there
        return this.paths_go;
    }

    public int getRID(){//gets room id
        return this.RID;
    }

}
