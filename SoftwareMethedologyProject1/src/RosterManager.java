package groupPackage;
import java.util.Scanner;

public class RosterManager {
    public static final int add_length = 6;

    public static final int remove_length = 4;

    public static final int p_length = 1;

    public static final int ps_length = 1;

    public static final int pc_length = 1;

    public static final int l_length = 2;

    public static final int c_length = 2;

    public static final int q_length = 1;

    Roster roster = new Roster(); //Creates a new roster
    int counter = 0;


    public void run() {
        boolean running = true;
        System.out.println("Roster Manager Running");
        Scanner scanner = new Scanner(System.in);

        while (running == true) {
            String command = scanner.nextLine();
            String[] line = command.split("\\s+"); //splits the line into tokens
            String operation_noSpace = line[0].replaceAll("\\s+", "");//gets rid of all space around command

            if (operation_noSpace.equals("A") && line.length == add_length) {
                String fname = line[1];
                String lname = line[2];
                String dob = line[3];
                String major = line[4];
                String credits = line[5];
                addStudent(fname, lname, dob, major, credits);

            } else if (operation_noSpace.equals("R") && line.length == remove_length) {
                //remove from roster if they exist
                String fname = line[1];
                String lname = line[2];
                String dob = line[3];
                removeStudent(fname,lname,dob);

            } else if (operation_noSpace.equals("P") && line.length == p_length) {
                //display roster sorted by last name, first name, dob
            } else if (operation_noSpace.equals("PS") && line.length == ps_length) {
                //display roster sorted by standing
            } else if (operation_noSpace.equals("PC") && line.length == pc_length) {
                //display roster sorted by school and major
            } else if (operation_noSpace.equals("L") && line.length == l_length) {
                //lists all students sorted by last name, first name, dob
            } else if (operation_noSpace.equals("C") && line.length == c_length) {
                //change the students major
            } else if (operation_noSpace.equals("Q")) {
                scanner.close();
                running = false;
            }

        }

    }

    // ADD HELPER METHODS TO ADD AND PRINT OUT OR JUST DO IT WITHIN RUN


    private void addStudent(String fname, String lname, String dob, String major,String credits ){
        Date updatedDOB = new Date(dob);
        if (updatedDOB.isValid() == true ) {
            Profile profile = new Profile(lname, fname, updatedDOB);
            /**if(roster.contains(profile)==false) {
             for(Major majors:values()){
             if(majors.name().equalsIgnoreCase(major)){
             Student student = new Student(profile,majors.name(),credits);
             }
             }
             roster.add(student);
             System.out.println(fname + " " + lname +" "+ dob+  " has been added in roster");

             }
             else{
             System.out.println(fname + " " + lname +" "+ dob+  " is already in the roster");

             }
             */

        } else {
            System.out.println("DOB invalid:" + " " + dob + " is not a valid calender date");
        }

    };

    private void removeStudent(String fname, String lname, String dob){
        Date updatedDOB = new Date(dob);
        Profile profile = new Profile(lname, fname, updatedDOB);
        //if roster contains student, remove otherwise student does not exist
    }



}

