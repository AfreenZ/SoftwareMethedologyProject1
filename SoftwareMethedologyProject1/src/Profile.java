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
     Overrides compareTo. We compare by last name, first name, and date of birth.
     */

    @Override
    public int compareTo(Profile o) {
        Profile other = (Profile) o;
        int answer = 1;

        //.compareTo method of string class NOT RECURSIVE
        //int compareLastNames = this.lname.compareTo(other.getLastName());
        //System.out.println(compareLastNames);

        if (this.lname.compareTo(other.getLastName()) < 0){
            answer = -1;
            return -1;
        }
        else if (this.lname.compareTo(other.getLastName())> 0){
            answer = 1;
            return 1;
        }
        else if(this.lname.compareTo(other.getLastName()) == 0){
            int compareFirstNames = this.fname.compareTo(other.getFirstName());
            System.out.println(compareFirstNames);

            if(compareFirstNames < 0){
                return -1;
            }
            else if(compareFirstNames > 0){
                return 1;
            }
            else{
                return 0;
            }
        }

        return 0;

        /**
         if (compareDOB == 1){
         answer = 1;
         return 1;
         }
         */

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