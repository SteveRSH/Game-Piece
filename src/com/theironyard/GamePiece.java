package com.theironyard;

import java.util.Random;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;


//In the constructor set the position variables to zero and frozen to false.
    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;

//Add get methods only for the "position" and "frozen" variables (IntelliJ can generate these for you)

}

    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }
    public boolean isFrozen() {
        return frozen;
    }

 // Add get and set methods for the other variables (IntelliJ can generate these for you)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//Add movement to the game piece
//Add a move() method (returns void) that takes a new x and y position. Set the instance variables to the parameters.

    public void move() {





        if (this.frozen == false) {

            Random X = new Random();
            this.positionX = X.nextInt();
            Random Y = new Random();
            this.positionY = Y.nextInt();

//            this.positionX = x;
//            this.positionY = y;
        } else {
            System.out.println("FREEEZZZZZ");
        }

    }
    //Add a freeze() method (returns void) and set frozen to true
    public void freeze () {
        this.frozen = true;}

    //Add a unfreeze() method (returns void) and set frozen to false

    public void unfreeze() {
        this.frozen = false;}


}


//NOTE TO SELF
// Random x = new Random (); type of object variable name = new constructor
// x.nextInt()

//public void move(){
//if(this.frozen == false {
//Random X = new Random();
//this.position x = x.nextInt();
//Random Y = new Random();
//this.position y = y.nextInt();



//modeling a game piece as a Java class.
// The object will have state (instance variables) and behavior (instance methods).
// You will write some simple tests to verify some of the behavior.

// Model a game piece:
// In the src directory create a GamePiece Java class
//Add the following required instance variables

//int positionX ********DONE

//int positionY  ********DONE

//boolean frozen  ********DONE

//Add a couple String instance variables (e.g. name, color)  ********DONE

//Add an empty constructor (no parameters). (IntelliJ can generate these for you)**** DONE

//In the constructor set the position variables to zero and frozen to false. ***DONE

//Add get methods only for the "position" and "frozen" variables (IntelliJ can generate these for you)**** DONE

//Add get and set methods for the other variables (IntelliJ can generate these for you)**** DONE

//Add some behavior to the game piece:

//Add a move() method (returns void) that takes a new x and y position. Set the instance variables to the parameters. DONE

//Add a freeze() method (returns void) and set frozen to true  DONE

//Add a unfreeze() method (returns void) and set frozen to false  DONE

//Change move() so that that when frozen the piece does not move

//Test the freeze, unfreeze and move methods in the public static void main(String[] args) method of Main.java.

//Create a GamePiece object.
//Only call the methods on the object, do not access the instance variables directly.
//Verify that if the game piece is not frozen then the call to freeze sets the frozen variable to true.
//Verify that if the game piece is frozen then the call to unfreeze sets the frozen variable to false.
//Verify that if the game piece is not frozen then the call to move results in the new position.
// Verify that if the game piece is frozen then the call to move does not change the position.
