import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Hashmapclass{
    
    static HashMap<String,Integer> map=new HashMap<>();
    public static void addstudent(String name,int score){
        map.put(name,score);
    }

    public static void removeStudent(String name){
        Iterator<Map.Entry<String,Integer>> itr=map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,Integer> entry=itr.next();
            if(entry.getKey().equals(name)){
                itr.remove();
            }
        }
    }

    public static void displayStudent(){
        Iterator<Map.Entry<String,Integer>> itr=map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,Integer> entry=itr.next();
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }
    }
    public static void main(String[] args) {
        addstudent("john",450);
        addstudent("peter", 467);
        addstudent("vithyaa", 460);
        removeStudent("john");
        displayStudent();
    }

}