/*
Simple exercise in java.
Created 2019-09-19
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class Uppgift26{ 
   public static void main(String[] args) {

	   char c1;
	   char c2;
	   char c3;
	   c1 = Character.toLowerCase('\u04E9');
	   c2 = Character.toUpperCase(c1);
	   // c1 = '\u04E9';
	   JOptionPane.showMessageDialog(null, c1);
	   JOptionPane.showMessageDialog(null, c2);

   }
}