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
    //this should compare last names
    @Override
    //compare April March (this) and Jane Doe (other)
    public int compareTo(Profile o) {
        Profile other = (Profile) o;
        if (equals(other)) {
            return 0;
        }
        //.compareTo method of string class NOT RECURSIVE
        int compareLastNames = this.getLastName().compareTo(other.getLastName());
        if (compareLastNames == -1){
            return -1;
        }
        if (compareLastNames == 1){
            return 1;
        }
        if (compareLastNames == 0) {
            int compareFirstNames = this.getFirstName().compareTo(other.getFirstName());
            if (compareFirstNames == -1){
                return -1;
            }
            if (compareFirstNames == 1){
                return 1;
            }
            if (compareFirstNames == 0) {
                int compareDOB = this.getDOB().compareTo(other.getDOB());
                if (compareDOB == -1){
                    return -1;
                }
                if (compareDOB == 1){
                    return 1;
                }
            }
        }
        return compareLastNames;
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

    public static void main(String[] args){
        Date date1 = new Date("7/11/2002");
        Date date2 = new Date("9/13/2002");
        Profile profile1 = new Profile("Afreen","Doe",date1);
        Profile profile2 = new Profile("Hima","Doe",date2);
        System.out.println(profile1.toString());
        System.out.println(profile2.toString());
        int x = profile1.compareTo(profile2);
        System.out.println(x);
        Profile[] arr = new Profile[2];
        if(x < 0){arr[0] = profile1; arr[1]= profile2;}else{arr[0] = profile2; arr[1]= profile1;}
        for(int i = 0; i < 2; i++){
            System.out.println(arr[i]);
        }

    }
}
