import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

abstract class PKGameModel extends GameModel{
   private char [] iB = new char [9];
   private ImageIcon [] icons = new ImageIcon[1];
   private char P1 = 'X';
   private char P2 = 'O';
   private double turns = 0;
   
   
   
   PKGameModel(){
   
   icons[0] = new ImageIcon("X.jpg");
   icons[1] = new ImageIcon("O.jpg");
   } //PKGameModel
   
/*      void takeTurn(int i, int currentPlayer){
         if (currentPlayer == 1){
            iB[i] = 'X';
            }
         else{
            iB[i] = 'O';
            }
     }//takeTurn
   
   int getPlayer(double turns){
   int currentPlayer = 0;
      if (turns % 2 == 0){
         currentPlayer = 1; }
      else{
         currentPlayer = 2; }
         
      return(currentPlayer);
      } //getPlayer
      
      
   /////////////////////////// stuff from gamemodel 
   String reportWinner(){
   return("");
   }
   
   void display(){
   }
   
   int getRows(){
   int rows = 3;
   return(rows);
   }
   
   int getCols(){
   int cols = 3;
   return(cols);
   }
   
          
   
   boolean gameOverStatus(){
    boolean reset = true;
    return(reset);
   }
      
   ImageIcon get(int currentPlayer){
      if (currentPlayer == 1){
         return(icons[0]);
         }
      else{
         return(icons[1]);
         }
   } //get Icon
   
   
   int gameStatus(double turns){
      boolean gameOver = false;
      int winStatus = 0;
      //winStatus 3 = O Won, 2 = X Won, status 1 = tie, status 0 = in progress
      int i=0;
      if (gameOver = false){
         if (iB [0] == 'X' && iB [4] == 'X' && iB[8] == 'X'){
            winStatus = 2; }
         if (iB [1] == 'X' && iB [4] == 'X' && iB[7] == 'X'){
            winStatus = 2; }
         if (iB [2] == 'X' && iB [4] == 'X' && iB[6] == 'X'){
            winStatus = 2; }
         if (iB [0] == 'X' && iB [3] == 'X' && iB[6] == 'X'){
            winStatus = 2; }
         if (iB [2] == 'X' && iB [5] == 'X' && iB[8] == 'X'){
            winStatus = 2; }
         //check for O
         if (iB [0] == 'O' && iB [4] == 'O' && iB[8] == 'O'){
            winStatus = 3; }
         if (iB [1] == 'O' && iB [4] == 'O' && iB[7] == 'O'){
            winStatus = 3; }
         if (iB [2] == 'O' && iB [4] == 'O' && iB[6] == 'O'){
            winStatus = 3; }
         if (iB [0] == 'O' && iB [3] == 'O' && iB[6] == 'O'){
            winStatus = 3; }
         if (iB [2] == 'O' && iB [5] == 'O' && iB[8] == 'O'){
            winStatus = 3; }
         else if (turns>9){
            winStatus = 0;
            }
         } //while loop
       return(winStatus);
      } //gameStatus
     */
      
 } //gameModel