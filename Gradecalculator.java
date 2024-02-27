//**********2..STUDENT GRADE CALCULATOR**********

import java.util.Scanner;

public class Gradecalculator{
    int E,H,M,S,MH,SS;
    long total;
    long Avg;
    Scanner sc = new Scanner(System.in);
    public void Subject(){
        System.out.println("............RESPECTIVE SUBJECT............. ");
        System.out.println("1.English\n2.Hindi\n3.Marathi\n4.Science\n5.Math\n6.Social Science\n\n");
    }
    public void MarksObtained(){
        System.out.print("Enter English Obtained Marks...:      ");
        E = sc.nextInt();
        System.out.print("Enter Hindi Obtained Marks...:        ");
        H = sc.nextInt();
        System.out.print("Enter Marathi Obtained Marks...:      ");
        M = sc.nextInt();
        System.out.print("Enter Science  Obtained Marks...:     ");
        S = sc.nextInt();
        System.out.print("Enter Math Obtained Marks...:         ");
        MH = sc.nextInt();
        System.out.print("Enter Social Science Obtained Marks...:");
        SS = sc.nextInt();
    }
    public void MarksDisplay(){
        System.out.println("\n\n............RESPECTIVE SUBJECT Marks Obtained.............\n");
        System.out.println("English        : "+E);
        System.out.println("Hindi          : "+H);
        System.out.println("Marathi        : "+M);
        System.out.println("Science        : "+S);
        System.out.println("Math           : "+MH);
        System.out.println("Social Science : "+SS);
    }
    public void TotalMarks(){
        total = E+H+M+S+MH+SS;
        System.out.println("\n\nTotal Marks Obtained out of 600 : "+total);
    }
    public void AveragePercentage(){
        Avg = (total/6);
        System.out.println("\n\nAverage ' % ' Obtained out of 100% : "+Avg+"%");
    }
    public void Grade(){
        if(Avg>80 && Avg<100)
            System.out.println("Grade 'A'");
        else if(Avg>60 && Avg<80)
            System.out.println("Grade 'B'");
        else if(Avg>40 && Avg<60)
            System.out.println("Grade 'C'");
        else
            System.out.println("Grade Try Next Time");
    }
    public void Display(){
        TotalMarks();
        AveragePercentage();
        System.out.println();
        Grade();
    }
    public static void main(String args[]){
        Gradecalculator obj = new Gradecalculator();
        System.out.println("**********..STUDENT GRADE CALCULATOR..**********");
        obj.Subject();
        obj.MarksObtained();
        obj.MarksDisplay();
        obj.Display();
    }
}