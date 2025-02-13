
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    private List<Person> list;
    
    public Employees(){
        this.list = new ArrayList<>();
    }
    
    public void add (Person personToAdd){
        this.list.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        this.list.addAll(peopleToAdd);
    }
    
    public void print(){
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                System.out.println(person);
            }
        }

    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
