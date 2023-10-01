package com.dio.design.pattern.singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    public void run() {

        /**
         * How you create a new instance of Singleton
         */

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance 2 ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player : " + playerOneTiles);

        System.out.println("Got Tiles");
    }
}
