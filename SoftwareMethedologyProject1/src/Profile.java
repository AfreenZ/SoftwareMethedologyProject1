package groupPackage;

/**
 This class provides the profile of a student with data such as their last name, first name and date of birth.
 */
public class Profile implements Comparable<Profile>{
    private String lname;
    private String fname;
    private Date dob;

    /**
     Constructor for the Profile object. The last name, first name, and dob is given by the user
     */

    public Profile(String lname, String fname, Date dob){
        this.lname = lname;
        this.fname = fname;
        this.dob = dob;
    }

    /**
     Compares two profiles. Will first check if the types are the same. Will then check if the last name, first name
     and dob are the same.
     */

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Profile){
            Profile compareProfile = (Profile)obj; //Typecasting obj to Profile type
            if(compareProfile.lname.equals(this.lname) && compareProfile.fname.equals(this.fname) && compareProfile.dob.equals(this.dob)){
                return true;
            }
        }
        return false;
    }

    /**
     Provides the string representing the students profile in the form LastName FirstName DOB
     Example:
     Nukala Hima 07/11/2002
     */

    @Override
    public String toString(){
        return this.lname+" "+this.fname+" "+this.dob.toString();
    }

    /**
     Overrides compareTo
     */

    @Override
    public int compareTo(Profile o) {
        return 0;
    }
    /**
     * returns String last name
     */
    public String getLastName(){
        return this.lname;
    }

    /**
     * returns String first name
     */
    public String getFirstName(){
        return this.fname;
    }

    /**
     returns Date dob
     */
    public Date getDOB(){
        return this.dob;
    }


}
