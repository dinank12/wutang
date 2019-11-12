//rip russel homes

public class wutang //wutang class 
{
  //instance values
  
  public static String[] First= { "Childish", "CriTikal", "Clown", "Mad", "skinny pimp","Valid", "MASTA", "HasH Slinging", "Based"
,"Tuff", "Snatch" , "Pimp", "Idiot", "Tha Ripper", "Annoyin’","Foolish", "Violent", "BLESSEDUP"}; // Array instance variable
    public static String[]Last = { " Stain"," Fiend" , " Foos"," Gambino"," Tha Ting"," 69"," Glizzy"," Slasher" , " Gatrachos", " Narcissist",
      " Jesus", " Tha Head", " Tha Fornicator", " Capstar" ,"Pupil", "-E", "Desperado", "RainmaKer"};// Array instance variable
    public int a1;// int instance variable
    public int b1;// int instance variable
    public String Storename; //String instance variable
    
  public String checkReal(String Storename) //public method checkReal retusn string
    {
      String a = Storename.substring(0,Storename.indexOf(' '));//splits up name using space
           a1 = a.length();//lenght of first
          //Split into first and last names for length
         String fname;// fname initialization
          String b = Storename.substring(Storename.indexOf(' ')+1);//last namespace to end
           b1 = b.length(); //length of last
           wutang wee = new wutang();//class constructor wee
      String checkreal = "Donald Glover";//Donald glover constant
          if ( Storename.equals(checkreal)){//if statement checks name Donald Glover
            return fname = "Childish Gambino";//returns special case name
          }else {   //not donald glover?, use get name class
            fname = wee.getName(a1, b1); //gets name getter from getName method in wutang class
            
            return fname;//returns name
    //System.out.println(a1);
       
          }
    }       
public String getName(int a1, int b1)//getName method retunr string
{

  //System.out.println("enter first");
  //int a = a1;
  //System.out.println("enter last");
  //int b = b1; no need to create new variables as a1 and b1 are already defined
  
      int length = a1 * 4/3; // length of first * constants
      int lengthb = b1 * 6/4; //length of second * constants
      while (length > 13)// cannot have more than 13 letters in first
      {
        length = length * 3/4;// decreases by 25% until it fits parms <12
      }
      while (lengthb > 21)// cannot have more than 21 letters in last name
      {
        length = length * 5/6; //decreases 17% until < 21
      }
      //int alength = Last.length; <-Checking array length
       //System.out.print(a.length());<-check print
      String fname = First[ length ] + Last[ lengthb];//String fname created from array
        return fname;//return fname
}
public String toString() //string to string method
{ 
    return getName(a1, b1) + checkReal(Storename) ; //Prints fname plus f name
} 
}
