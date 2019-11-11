
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
     wutang wuu = new wutang();
     String real = wuu.checkReal(Storename);
     
      //System.out.println(Storename.indexOf(' '))
     }
       JOptionPane.showMessageDialog(null, "Your name is " + real);
     }
   });

  }
}
