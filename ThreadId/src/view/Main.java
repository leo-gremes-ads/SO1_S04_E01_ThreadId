package view;

import controller.*;

public class Main
{
    public static void main(String[] args)
    {
        ThreadId[] t = new ThreadId[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new ThreadId();
            t[i].start();
        }
    }    
}
