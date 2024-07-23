import java.util.*;
public class question17
{
    public static void main (String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@     COUNSELING UNIT SATRIA COLLEGE     @");
        System.out.println("@    Hours Spent On Revision In A Day    @");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("");
        
        int numStudent;
        double sumHour=0, average, dataExist=0, hours=3;
        char code;
        
        System.out.print("The number of students? ");
        numStudent=read.nextInt();
        System.out.println("");
        
        String studentID []= new String [numStudent];
        double revHour [] = new double [numStudent];
        // input data into array
        for (int counter=0; counter<numStudent; counter++)
        {
            System.out.print("Enter Student ID: ");
            studentID [counter]=read.next();
            System.out.print("Number of hours spend on revision: ");
            revHour [counter]=read.nextDouble();
            sumHour=sumHour + revHour[counter];
            System.out.println("");
        }
        
        average=sumHour/numStudent;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("");
        System.out.println("The total hour spent on revision : "+ sumHour+" hours");
        System.out.println("The average hour spent on revision : "+ average+" hours");
        System.out.println("");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("");
        System.out.println("To get a list of students spent less than 3 hours, enter code L, or code E if otherwise.");
        
        System.out.print("Enter code: ");
     //   code = read.next().charAt(0);
        
        for ( code = read.next().charAt(0)  ;code!= 'L'|| code !='E';  code = read.next().charAt(0))
        {
            if (code=='L')
            {
                System.out.println("STUDENT ID\t\tRevision Hours");
                for (int counter=0; counter<numStudent; counter++)
                {
                    if ((revHour[counter])<(hours))
                    {
                        System.out.println(studentID[counter]+"\t\t\t\t\t\t"+revHour[counter]);
                        dataExist=dataExist+1;
                    }
                }
            }
            else 
                if (code=='E')
                {
                    System.out.println("STUDENT ID\t\tRevision Hours");
                    for (int counter=0; counter<numStudent; counter++)
                    {
                        if ((revHour[counter]) >= (hours))
                        {
                            System.out.println(studentID[counter]+"\t\t\t\t\t\t"+revHour[counter]);
                            dataExist=dataExist+1;
                        }
                    }
                }
                else 
                 {
                  System.out.println("invalid input");
                  System.out.print("Enter code: ");
                  // code=read.next().charAt(0);
                 }
            
        }//repetition
        
    }
}