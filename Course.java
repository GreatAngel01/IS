import java.util.*;

public class Course {

	Collection<Lecturer> teaches;
	public string name;
	public int id;
	public float hours;
	
	public void MyInfo(){
	System.out.println("Часы "+ hours + " id "+ id +" Название " + name + " Количество преподавателей "+ teaches.size());
	}

}
