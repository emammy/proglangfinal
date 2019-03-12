import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class PKGUI extends JFrame implements ActionListener{

   private final int WINDOW_WIDTH = 800;
   private final int WINDOW_HEIGHT = 800;
   private PKGameModel playGame;
   private JButton [] panels = new JButton[4];
   private String filler = "        ";
   private JLabel intro;
   private JLabel results;
   double turns = 0;

public PKGUI (){
   
   setTitle("P.K.");
   setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   
   Border customBorder = new LineBorder(Color.BLACK, 3);
   
   JLabel intro = new JLabel("                                       Let's play Tic Tac Toe.");
   intro.setFont(new Font ("Arial Narrow",Font.PLAIN,24));
   
   add(intro,BorderLayout.NORTH);
   add(new JLabel (filler), BorderLayout.EAST);
   add(new JLabel (filler), BorderLayout.WEST);
   
   } //GUI

) //public class