package groupPackage;
import java.util.Scanner;

package groupPackage;
import java.util.Scanner;

public class RosterManager {
    Roster roster = new Roster(); //Creates a new roster

    public void run() {
        boolean running = true;
        System.out.println("Roster Manager Running");
        Scanner scanner = new Scanner(System.in);

        while (running == true) {
            String command = scanner.nextLine();
            String[] line = command.split("\\s+"); //splits the line into tokens
            //String operation_noSpace = line[0].replaceAll("\\s+", "");//gets rid of all space around command

            if(line[0].equals("A")){
                String fname = line[1];
                String lname = line[2];
                String dob = line[3];
                String major = line[4];
                String credits = line[5];
                addStudent(fname, lname, dob, major, credits);
            }

            else if(line[0].equals("R")){
                String fname = line[1];
                String lname = line[2];
                String dob = line[3];
                removeStudent(fname,lname,dob);
            }
            else if(line[0].equals("P")){

            }
            else if(line[0].equals("PS")) {
            }

            else if(line[0].equals("L")){

            }

            else if(line[0].equals("C")){

            }
            else if (line[0].equals("Q")) {
                running = false;
                scanner.close();
                System.out.println("Roster Manager Terminated");

            }
            else{
                System.out.println("Inavlid");

            }

        }

        //scanner.close();

        roster.print();
        Student[] woo = roster.getRoster();
        int length = roster.size();
        //System.out.println(length);
        for (int k = 0; k < length; k++) {
            System.out.println(woo[k]);
        }
        roster.print();
        for (int k = 0; k < length; k++) {
            System.out.println(woo[k]);
        }



    }

    //Helper method to add student

    private void addStudent(String fname, String lname, String dob, String major,String credits ){
        Date updatedDOB = new Date(dob);
        int intCredits = Integer.parseInt(credits);
        boolean addCheck = false; //Checks if succesfully added
        if (updatedDOB.isValid() == true ) {
            Profile profile = new Profile(lname, fname, updatedDOB);
            Major updatedMajor = Major.CS;
            Student student = new Student(profile,updatedMajor,intCredits);
            addCheck = roster.add(student);
        }
        else{
            System.out.println("DOB invalid: "+dob+"not a valid calender date!");
        }
        if(addCheck == false && updatedDOB.isValid() == true) {
            System.out.println(fname + " " + lname +" "+ dob+  " is already in the roster");
        }
        if(addCheck == true && updatedDOB.isValid() == true) {
            System.out.println(fname + " " + lname +" "+ dob+  " has been added in roster");
        }


    };




    // Helper method to removeStudent

    private void removeStudent(String fname, String lname, String dob){
        Date updatedDOB = new Date(dob);
        Profile profile = new Profile(lname, fname, updatedDOB);
        //if roster contains student, remove otherwise student does not exist
    }



}
