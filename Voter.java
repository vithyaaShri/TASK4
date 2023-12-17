public class Voter {
    int voterID;
    String name;
    int age;

    public Voter(int voterID,String name,int age)throws AgeNotValid{
        this.voterID=voterID;
        this.name=name;
        this.age=age;
        if(age<18){
            throw new AgeNotValid("Age is less than 18");
        }
    }
}
