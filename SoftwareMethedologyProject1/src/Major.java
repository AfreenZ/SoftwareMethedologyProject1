package groupPackage;

public enum Major {
    CS("SAS","01:198"),
    MATH("SAS","01:640"),
    EE("SOE","14:332"),
    ITI("SC&I","04:547"),
    BAIT("RBS","33:136");


    private final String school;
    private final String courseID;



    Major(String school, String courseID){
        this.school = school;
        this.courseID = courseID;

    }

    public String getSchool(){
        return this.school;
    }

    public String getCourseID(){
        return this.courseID;
    }

}