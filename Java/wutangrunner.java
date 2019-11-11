
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
public class wutangrunner 
{
  public static void main(String[]args)
  {
    
    
   JFrame frame = new JFrame("THECRAZYSUPERCOOLNAMEGENERATOR!");
   frame.setSize(1292,995);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   JLabel na= new JLabel("Enter yo First AND Last name fool");
   
   na.setForeground(new Color(0, 128, 128));
   
   na.setFont(new Font("Sitka Banner", Font.BOLD, 35));
   na.setBounds(350,152,505,100);


   
   ImageIcon icon = new ImageIcon("D:\\Users\\Dinank\\Downloads\\images\\wutag.jfif");

   JTextField enter = new JTextField();
   enter.setBounds(592,227,250,40);
   enter.setVisible(true);

   
   JButton wu = new JButton("enter tha wu");
   wu.setVisible(true);  
   wu.setBounds(432,227,150,100);
   
   frame.setVisible(true);
   frame.add(wu);
   frame.add(enter);
   frame.add(na);
   JLabel ew = new JLabel(icon);
   ew.setBounds(0, 0, 1280,960);
   frame.add(ew);
   
   wu.addActionListener(new ActionListener() 
                          {  
     public void actionPerformed(ActionEvent e) {
      String Storename = enter.getText();
      //System.out.println(Storename.indexOf(' '));
      String a = Storename.substring(0,Storename.indexOf(' '));
      int a1 = a.length();
      //Split into first and last names for length
     String fname;
      String b = Storename.substring(Storename.indexOf(' ')+1);
      int b1 = b.length();
      String checkreal = "Donald Glover";
      if ( Storename.equals(checkreal)){
       fname = "Childish Gambino";
      }else {
      
       //System.out.println(a1);
      wutang wee = new wutang();
      fname = wee.getName(a1,b1); 
     
            
     }
       JOptionPane.showMessageDialog(null, "Your name is " + fname);
     }
   });

  }
}