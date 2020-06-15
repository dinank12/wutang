import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class wutangrunner 
{
  public static void main(String[]args)
  {
   JFrame frame = new JFrame("THECRAZYSUPERCOOLNAMEGENERATOR!");
   frame.setSize(1566,881);
    
   ImageIcon icon = new ImageIcon("H:\\wutag.jfif");
   JLabel se = new JLabel(icon);
   se.setBounds(0, 0, 1566, 881);
   se.setVisible(true);

   JTextField enter = new JTextField();
   enter.setBounds(300,300,150,40);
   enter.setVisible(true);

   JButton wu = new JButton("enter tha wu");
   wu.setVisible(true);  
   wu.setBounds(150,300,150,100);
  
   frame.setLayout(null);
   frame.setVisible(true);
   frame.add(wu);
   frame.add(enter);  
   frame.add(se);
  }
}