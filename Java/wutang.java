//rip russel homes
public class wutang
{
  //instance values
  
  public static String[] First= { "Childish", "CriTikal", "Clown", "Mad", "skinny pimp","Valid", "MASTA", "HasH Slinging", "Based"
,"Tuff", "Snatch" , "Pimp", "Idiot", "Tha Ripper", "Annoyin�","Foolish", "Violent", "BLESSEDUP"};
    public static String[]Last = { " Stain"," Fiend" , " Foos"," Gambino"," Tha Ting"," 69"," Glizzy"," Slasher" , " Gatrachos", " Narcissist",
      " Jesus", " Tha Head", " Tha Fornicator", " Capstar" ,"Pupil", "-E", "Desperado", "RainmaKer"};
    
public String getName(int a1, int b1)
{

  //System.out.println("enter first");
  //int a = a1;
  //System.out.println("enter last");
  //int b = b1; no need to create new variables as a1 and b1 are already defined
  
      int length = a1 * 4/3;
      int lengthb = b1 * 6/4;
      while (length > 13)
      {
        length = length * 3/4;
      }
      while (lengthb > 21)
      {
        length = length * 5/6;
      }
      //int alength = Last.length; <-Checking array lenght
       //System.out.print(a.length());<-check print
      String fname = First[ length ] + Last[ lengthb];
        return fname;
}
public  String checkReal(String Storename)
{
  String a = Storename.substring(0,Storename.indexOf(' '));
      int a1 = a.length();
      //Split into first and last names for length
     String fname;
      String b = Storename.substring(Storename.indexOf(' ')+1);
      int b1 = b.length(); 
  String checkreal = "Donald Glover";
      if ( Storename.equals(checkreal)){
        return fname = "Childish Gambino";
      }else {   
        getName name = new getName(a1, b1);
        return fname = name;
//System.out.println(a1);
   
      }
            
} 
}
