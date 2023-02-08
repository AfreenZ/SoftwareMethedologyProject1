package groupPackage;

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
    public Profile getProfile(){
        return this.profile;
    }

    /**
     * returns String first name
     */
    public String getMajor(){
        return this.getMajor();
    }

    /**
     returns Date dob
     */
    public int getCreditCompleted(){
        return this.getCreditCompleted();
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

        Student other = (Student) o;
        if (equals(other)){
            return 0;
        }
        int compareSchool = this.getMajor().compareTo(other.getMajor());
        if (compareSchool == -1){
            return -1;
        }
        if (compareSchool == 1){
            return 1;
        }
        if (compareSchool == 0){
            return 0;
        }
        return compareSchool;
        /**int compareProfile = this.getProfile().compareTo(other.getProfile());
         if (compareProfile == -1){
         return -1;
         }
         if (compareProfile == 1){
         return 1;
         }
         if (compareProfile == 0) {
         //once you get to this point all profiles are ordered alphabetically
         //now we order by school
         return 0;
         }
         return compareProfile;*/
    }


    public static void main(String[] args){
        //create a profile
        //assign a major
        //create credits completed
        //put into studen

        String[] testCases = {"-1/31/2023","9/2/2022","13/31/2003","3/32/2003","2/29/2003","3/1/2002","7/11/2002"};

        for ( int i = 0; i < testCases.length; i++){
            Date testCase = new Date(testCases[i]);

            if (testCase.isValid()){
                System.out.println("Test Case #" + String.valueOf(i+1)  + ": " + testCases[i] + " " + "Passed");
            } else {
                System.out.println("Test Case #" + String.valueOf(i+1)  + ": " + testCases[i] + " " + "Failed");
            }
        }

    }

}
