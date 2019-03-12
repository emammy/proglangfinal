import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  


abstract class GameModel{

   abstract void takeTurn(int i, int currentPlayer);           
   abstract boolean gameOverStatus();
   abstract ImageIcon get(int currentPlayer);  
   abstract int getRows();
   abstract int getCols(); 
   abstract void display();      
  
   
}// class