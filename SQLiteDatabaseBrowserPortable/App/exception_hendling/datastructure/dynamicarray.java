package SQLiteDatabaseBrowserPortable.App.exception_hendling.datastructure;

import java.util.Arrays;

public class dynamicarray<t> {

    Object[] data;

    int size;

    public dynamicarray(){

        size=0;
        data=new Object[1];

    }
    public int getsize(){

        return data.length;
    }
public t get(int index){

    return (t) data[index];
}
public void put(Object element){

    ensurecapacity(size+1);
    data[size++]=element;
}

public void ensurecapacity(int mincapacity) {

    int oldcapacity=getsize();
    if(mincapacity>oldcapacity){
        int newcapacity=oldcapacity*2;
        if(newcapacity<mincapacity)               // when user  delete any elements from data array
            newcapacity=mincapacity;
        data=Arrays.copyOf(data, newcapacity);

    }
}
    
}
