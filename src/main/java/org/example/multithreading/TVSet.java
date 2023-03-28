package org.example.multithreading;

public class TVSet {
    private  static  volatile  TVSet tvSetInstance = null;

    private TVSet(){
        System.out.println("Tv set instantiated");
    }
    public static TVSet getTvSetInstance(){
        if(tvSetInstance == null){
            synchronized (TVSet.class){ // optimize
                if(tvSetInstance == null){ // double checking
                    tvSetInstance = new TVSet();
                }
            }
        }

        // return
        return  tvSetInstance;
    }
}
