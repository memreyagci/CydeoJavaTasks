package day33_Statics;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public int id, batchNumber, groupNumber;
    public char grade;

    static String schoolName = "Cydeo", programmingLanguage = "Java";

    public CydeoStudent(String name, char gender, int age, int id, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public void printSchoolName() {
        System.out.println(schoolName);
    }

    public void printProgLanguage() {
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}


/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */