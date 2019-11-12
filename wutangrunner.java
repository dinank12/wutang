
import javax.swing.*;//gui import, Jframe
import java.awt.event.*;//action listener button
import java.awt.Font;//Jlabel
import java.awt.Color;//Jlabel
public class wutangrunner //class wutang
{
  public static void main(String[]args) //runner class 
  {
    
    
   JFrame frame = new JFrame("THECRAZYSUPERCOOLNAMEGENERATOR!");//Frame constructor
   frame.setSize(1292,995);// frame resize
   frame.setResizable(false);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// frame close to close JDK and not kill pc
   
   JLabel na= new JLabel("Enter yo First AND Last name fool");//JLabel prompt String in constructor
   na.setForeground(new Color(77, 121, 160));//setting label color to blue as background found with rgb picket.
   na.setFont(new Font("Sitka Banner", Font.BOLD, 35)); //Font label for level selected and type
   na.setBounds(350,152,505,100);// set label coation and size


   
   ImageIcon icon = new ImageIcon("D:\\Users\\Dinank\\Downloads\\images\\wutag.jfif");// image icon constructor string path img

   JTextField enter = new JTextField();//Textfield constructor
   enter.setBounds(592,227,250,40);//text field location and size
   enter.setVisible(true);//default is false

   
   JButton wu = new JButton("enter tha wu");//j button constructor String button label 
   wu.setVisible(true);  //button is false default
   wu.setBounds(432,227,150,100); //bounds and size setter
   frame.setVisible(true);//false default
   
 //adding components onto frame, whichevers added first shows up on top
   frame.add(wu);//button add
   frame.add(enter);//text field add
   frame.add(na);//label add
   JLabel ew = new JLabel(icon);//image constructor pleaced icon in label
   ew.setBounds(0, 0, 1280,960);//label at origin size 1280 , 960
   frame.add(ew);//add label onto frame
   wutang wuu = new wutang();// wutang setter
   //wuu.toString();
  
   wu.addActionListener(new ActionListener() { //action listener added on button "wu" 
    //inside class 
    public void actionPerformed(ActionEvent e) { //performs action of ActionEvent x when clicked
     //occurs when button is pressed
     String Storename = enter.getText(); // getter String from enter contructor textfield 
    String fname = wuu.checkReal(Storename);// getter String from wuu constructor checkReal class
    
     JOptionPane.showMessageDialog(null, "Your name is " + fname);//show message dialog  after action aligned rightward default
    } 
  } );//end of (new action listener _____) statement
  }
} 