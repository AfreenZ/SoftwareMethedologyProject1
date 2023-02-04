package groupPackage;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Student implements Comparable <Student>{
    private Profile profile;
    private Major major;
    private int creditCompleted;

    /**Student Constructor made with user input*/
    public Student(Profile profile, Major major, int creditCompleted){
        this.profile = profile;
        this.major = major;
        this.creditCompleted = creditCompleted;
    }

    /**
     Compares two students. Will first check if the types are the same. Will then check if the profiles are the same.
     */

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student compareStudent = (Student)obj; //Typecasting obj to Student type
            if(compareStudent.profile.equals(this.profile)){ //if profiles are both the same
                return true;
            }
        }
        return false;
    }

    /**
     Provides the string representing the Students in the form First Name, Last Name, DOB, Major, and Credits Completed
     Example:
     Hima Nukala 07/11/2002 ECE 14
     */

    @Override
    public String toString(){
        return this.profile.getFirstName()+" "+this.profile.getLastName()+" "+this.profile.getDOB().toString()+" "+this.major+" "+this.creditCompleted;
    }


    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

