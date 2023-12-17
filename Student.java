import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student{
    int rollno;
    int age;
    String name;
    String course;

    public Student(int rollno,int age,String name,String course){
        this.rollno=rollno;
        this.age=age;
        this.name=name;
        this.course=course;
    }
    public void checkage()throws Exception{

        if(age<18 || age>24){
            throw new AgenotWithinRange("Age is not within range");
        }
        else{
            System.out.println("Age is valid");
        }
        
    }
    public void checkname()throws Exception{
    Pattern special= Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
  Pattern number = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
  Matcher matcher = special.matcher(name);
  Matcher matcherNumber = number.matcher(name);
  
  boolean constainsSymbols = matcher.find();
  boolean containsNumber = matcherNumber.find();

  if(constainsSymbols){
   throw new NameNotValid("Name contain special character");
  }
  else if(containsNumber){
   throw new NameNotValid("Name contains number");
  }
  else{
   System.out.println("Valid name");
  }
    }
}
