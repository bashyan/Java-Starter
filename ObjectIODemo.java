import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

 class Person implements Serializable {
    
    private String firstName;
    private String lastName;
    private int age; 
    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //Overriding toString to be able to print out the object in a readable way
    //when it is later read from the file.
    public String toString() {
        
        StringBuffer buffer = new StringBuffer();
        buffer.append(firstName);
        buffer.append("\n");
        buffer.append(lastName);
        buffer.append("\n");
        buffer.append(age);
        buffer.append("\n");
        
        return buffer.toString();
    }
    
    
}


public class ObjectIODemo {
    public void writePersons(String filename) {
     
        ObjectOutputStream outputStream = null;
	Scanner sc=new Scanner(System.in);
        
        try {
            
            //Construct the LineNumberReader object
            outputStream = new ObjectOutputStream(new FileOutputStream(filename));
	    System.out.println("Enter Name");             
	    String name=sc.next();
	
	    System.out.println("Enter LastName");             
	    String lname=sc.next();

	    System.out.println("Enter Age");             
	    int age=sc.nextInt();

            Person person = new Person();
            person.setFirstName(name);
            person.setLastName(lname);
            person.setAge(age);
            
            outputStream.writeObject(person);
            
            outputStream.writeObject(person);
                        
        } catch (IOException ex) {
            ex.printStackTrace();
       
        }
    }
    
    public static void main(String[] args) {
        new ObjectIODemo().writePersons("d:/hadoopjava/person.txt");
    }
}

