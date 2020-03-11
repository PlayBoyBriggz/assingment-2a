import java.util.Random;

import java.util.Scanner;



/***************************

* Created by: christian Briglio.

* This program generates a mok game of rock paper sissors  

* Created on: March 11th, 2020

****************************/

  

public class Rock {

  /*******

  *Rock paper scissors.

  ****/



  public static void main(String[] args) {

    int input;

    int b = 1;

    Scanner christian = new Scanner(System.in);

    Random rnd = new Random();

    System.out.println("Rock Paper Scissors, by christian!");

    System.out.println("Select 1, 2, 3, for Rock, Paper, Scissors");





    while (b != 0) {

      int rock = 1; 

      int paper = 2; 

      int scissors = 3;

      input = christian.nextInt();

      int randomNumber = rnd.nextInt(3 - 1 + 1) + 1;



      if (randomNumber == rock) {

        if (input == rock) {

          System.out.println("Rock vs. Rock, ITS A TIE!");

        }    else if (input == paper) {

          System.out.println("Rock vs. Paper! You win!");

        }    else if (input == scissors) {

          System.out.println("Rock vs. Scissors! You lose!");

          

        } else if (randomNumber == paper) {

          if (input == paper) {

            System.out.println("Paper vs. Rock! You lose!");

          }   else if (input == scissors) {

            System.out.println("Paper vs. Scissors! You win!");

          }   else if (input == paper) {

            System.out.println("Paper vs. Paper! Its a tie!");

            

          } else if (randomNumber == scissors) {

            if (input == scissors) {

              System.out.println("Scissors vs. Rock! You win!");

            }   else if (input == scissors) {

              System.out.println("Scissors vs. Scissors, ITS A TIE!");

            }   else if (input == paper) {

              System.out.println("Scissors vs Paper! You lose!");

            }

          }

        }

        





      }



    }

  }

}