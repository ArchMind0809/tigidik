package finality;

import java.util.*;

public class Dispatcher {

	  public static void main(String[] args) {
	    List<Integer> marks = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // fast way to initialize all marks of all
	                                        // students
	    List<Student> students = new ArrayList<>(Arrays.asList(new Student("name1", marks), 
	        new Student("name2", marks), new Student("name3", marks), 
	        new Student("name4", marks), new Student("name5", marks)));

	    final Group group = new Group(students);
	    
//	    System.out.println(group);
	    group.addStudent(new Student("Alla", marks));
//	    System.out.println(group);
	    List<Integer> temp = group.getStudents().get(3).getMarks();
	    temp.set(0, 5);
	    List<Student> tempStud = group.getStudents();
	    tempStud.add(new Student("Lucy", marks));
	    System.out.println(group);
	    Student tempStudent = group.getStudents().get(5);
	    tempStudent.setName("Mary");
	    System.out.println(group);
	    /////////////////////////////////////////////
	    group.endOfStudying();  // !!!!!!!!!!!!!!!!!!!!
	    students = Collections.unmodifiableList(students);  // ????
	    
//	    group.addStudent(new Student("Maksim", marks));
//	    System.out.println(group);
//	    students.add(new Student("Maksim", marks));
//	    System.out.println(group);
//	      group = new Group(students);

	/*
	        System.out.println("Before modifying:\n" + group);

	        group.endOfStudying();

	        students.add(new Student("NEW", marks));                          //Won't modify group.students

	        //UnsupportedOperationException:
//	        group.getStudents().add(new Student("NEW1", marks));
//	        group.getStudents().set(0, new Student("NEW2", marks));
//	        group.getStudents().get(0).getMarks().add(100);
//	        group.getStudents().get(0).getMarks().set(0, 100);

	        System.out.println("After modifying:\n" + group);     */                  //The same as the previous output
	  }
	}

	class Student {

	  private String name;
	  private List<Integer> marks;
	  private boolean trainingIsCompleted;

	  public Student(String name, List<Integer> marks) {
	    this.name = name;
	    this.marks = marks;
	  }

	  public void saveResults() {
	    marks = Collections.unmodifiableList(marks);
	    this.trainingIsCompleted = true;
	  }

	  @Override
	  public String toString() {
	    return "Student{" + "name='" + name + '\'' + ", marks=" + marks + "}\n";
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    if (!trainingIsCompleted) {
	      this.name = name;
	    } else {
	      System.out.println("Обучение завершенно , вы не можете добавить студента в группу.");
	    }
	    
	  }
	  
	  public List<Integer> getMarks() {
	    return marks;
	  }
	}

	class Group {

	  private List<Student> students;
	  private boolean trainingIsCompleted;

	  public Group(List<Student> students) {
	    this.students = new ArrayList<>(students);
	  }

	  public void addStudent(Student student) {
	    if (!trainingIsCompleted) {
	      students.add(student);
	    } else {
	      System.out.println("Обучение завершенно , вы не можете добавить студента в группу.");
	    }
	  }

	  public void endOfStudying() {
	    trainingIsCompleted = true;
	    this.students = Collections.unmodifiableList(students);
	    for (Student s : students) {
	      s.saveResults();      
	    }
	  }

	  public List<Student> getStudents() {
	    return new ArrayList<>(students);
	  }

	  @Override
	  public String toString() {
	    return "Group{" + students + '}';
	  }
	}
	