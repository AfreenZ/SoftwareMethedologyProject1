public class Roster {
    private Student[] roster;
    private int size;

    public finalRoster(){
        roster = new Student[4];
        size = 0;
    }
    private int find(Student student) {
        int rosterSize = this.size;
        for(int i =0; i < rosterSize; i++){
            if(this.student[i].equals(student)){
                return i;
            }
        }

        return -1;
    } //search the given student in roster
    private void grow() {
        Student[] newRoster = new Student[roster.length + 4];
        for(int i =0; i < roster.length; i++){
            newRoster[i] = roster[i];
        }
        roster = newRoster;
    } //increase the array capacity by 4
    public boolean add(Student student){
        for(int i = 0; i < this.roster.length; i++){
            if(roster[i] == null){
                roster[i] = student;
                size++;
                return;
            }
        }
        this.grow();
        roster[roster.length - 4] = student;
        this.size++;
    } //add student to end of array
    public boolean remove(Student student){
        int index = find(student);
        if(index < 0){
            return false;
        }
        for(int i = index; i < this.size; i++){
            roster[i]=roster[i+1];
        }
        roster[this.size] = null;
        this.size--;
        return true;
    }//maintain the order after remove
    public boolean contains(Student student){
        for(int i =0; i < this.roster.length; i++){
            if(this.student[i].equals(student)){
                return true;
            }
            else{
                return false;
            }
        }
    } //if the student is in roster
    public void print () {
        //check by last name, then first name, then DOB
        for(int i = 0; i < roster.length; i++){
            //check
            if(roster[i].student.getLastName ==  )
        }
    } //print roster sorted by profiles
    public void printBySchoolMajor() {} //print roster sorted by school major
    public void printByStanding() {} //print roster sorted by standing
}