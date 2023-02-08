package groupPackage;

import java.util.Arrays;

public class Roster {
    private Student[] roster;
    private int size;

    public void finalRoster() {
        roster = new Student[4];
        size = 0;
    }

    private int find(Student student) {
        int rosterSize = this.size;
        for (int i = 0; i < rosterSize; i++) {
            if (roster[i].equals(student)) {
                return i;
            }
        }

        return -1;
    } //search the given student in roster

    private void grow() {
        Student[] newRoster = new Student[roster.length + 4];
        for (int i = 0; i < roster.length; i++) {
            newRoster[i] = roster[i];
        }
        roster = newRoster;
    } //increase the array capacity by 4

    public boolean add(Student student) {
        for (int i = 0; i < this.roster.length; i++) {
            if (roster[i] == null) {
                roster[i] = student;
                size++;
            }
        }
        this.grow();
        roster[roster.length - 4] = student;
        this.size++;
        return true;
    } //add student to end of array

    public boolean remove(Student student) {
        int index = find(student);
        if (index < 0) {
            return false;
        }
        for (int i = index; i < this.size; i++) {
            roster[i] = roster[i + 1];
        }
        roster[this.size] = null;
        this.size--;
        return true;
    }//maintain the order after remove

    public boolean contains(Student student) {
        for (int i = 0; i < this.roster.length; i++) {
            if (roster[i].equals(student)) {
                return true;
            }
        }
        return false;
    } //if the student is in roster

    public void sort() {
        //sort by last name
        int n = roster.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                int compare = this.roster[j].compareTo(this.roster[i]);
                if (compare > 1) {
                    i = j;
                }
            }
            String str1 = roster[i].toString();
            String str2 = roster[i++].toString();
        }
    }

    public void print() {
        for (int i = 0; i < roster.length; i++) {
            int ptr = i;
            for (int j = i + 1; j < roster.length; j++) {
                int checkProfile = roster[j].getProfile().compareTo(roster[i].getProfile());
                if (checkProfile < 0) {
                    ptr = j;
                }
            }
            if (i != ptr) {
                Student temp = roster[i];
                roster[i] = roster[ptr];
                roster[ptr] = temp;
            }
        }
        for (int k = 0; k < roster.length; k++) {
            System.out.println(roster[k]);
        }
    }

    //print roster sorted by profiles
    public void printBySchoolMajor() {
        for (int i = 0; i < roster.length; i++) {
            int ptr = i;
            for (int j = i + 1; j < roster.length; j++) {
                int checkMajor = roster[j].getMajor().compareTo(roster[i].getMajor());
                if (checkMajor < 0) {
                    ptr = j;
                }
            }
            if (i != ptr) {
                Student temp = roster[i];
                roster[i] = roster[ptr];
                roster[ptr] = temp;
            }
        }
        for (int k = 0; k < roster.length; k++) {
            System.out.println(roster[k]);
        }
    } //print roster sorted by school major


    public void printByStanding() {
        for (int i = 0; i < roster.length; i++) {
            int ptr = i;
            for (int j = i + 1; j < roster.length; j++) {
                int checkStanding = roster[j].getCreditCompleted();
                if (roster[j].getCreditCompleted() < roster[ptr].getCreditCompleted()) {
                    ptr = j;
                }
            }
            if (i != ptr) {
                Student temp = roster[i];
                roster[i] = roster[ptr];
                roster[ptr] = temp;
            }
        }
        // use to test out if this will sort the students
        for (int k = 0; k < roster.length; k++) {
            System.out.println(roster[k]);
        }
    } //print roster sorted by standing

    public static void main(String[] args) {
        /**String[] testCases = {""};

         for (int i = 0; i < testCases.length; i++) {
         Date testCase = new Date(testCases[i]);

         if (testCase.isValid()) {
         System.out.println("Test Case #" + String.valueOf(i + 1) + ": " + testCases[i] + " " + "Passed");
         } else {
         System.out.println("Test Case #" + String.valueOf(i + 1) + ": " + testCases[i] + " " + "Failed");
         }
         }*/


    }
