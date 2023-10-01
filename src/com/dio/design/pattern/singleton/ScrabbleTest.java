package com.dio.design.pattern.singleton;

import java.util.LinkedList;

public class ScrabbleTest {

    public static void main(String[] args) {

        /**
         * // How you create a new instance of Singleton
         */

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player 1: " + playerOneTiles);

        System.out.println(newInstance.getLetterList());

        /**
         * Try to make another instance of Singleton
         * This doesn't work because the constructor is private
         * Singleton instanceTwo = new Singleton();
         * Try getting a new instance using getInstance
         */

        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("Instance 2 ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);

        System.out.println("Player 2: " + playerOneTiles);
    }
}
