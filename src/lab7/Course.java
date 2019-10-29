package lab7;

public class Course {
    private String name;
    private int credits, capacity, seatsTaken;
    private Student[] roster;

    public Course(String names, int credits, int capacity) {
        this.name=names;
        this.credits=credits;
        this.capacity=capacity;
        this.seatsTaken=0;
        this.roster = new Student[capacity];
    }

    public String getName() {
        return name;
    }

    public int getCredits() { return credits; }

    public int getCapacity() { return capacity; }

    public int getSeatsRemaining() {
        return capacity-seatsTaken;
    }

    /**
     * enrolls students to the class
     * @param s the student
     * @return true if the student now is in the class
     */
    public boolean addStudent(Student s) {

        if(capacity > seatsTaken){
            for(int i=0; i<seatsTaken; ++i){
                if(roster[i].equals(s)){
                    return false;
                }
            }
            roster[seatsTaken]=s;
            this.seatsTaken=seatsTaken+1;
            return true;
        }
        return false;
    }

    /**
     * checks if they're in the class then returns it
     * @return prints out the names of students in the class
     */
    public String generateRoster() {
        String students = "";
        for(int i=0; i<seatsTaken; ++i){
            students = students + roster[i].getFullName();
        }
        return students;

    }

    /**
     * states the gpa of all the enrolled students
     * @return the average gpa of all students
     */
    public double calculateAverageGPA() {
        double gpa = 0;
        for(int i=0; i<seatsTaken; i++){
            gpa = gpa + roster[i].calculateGradePointAverage();
        }
        return gpa/(double)seatsTaken;
    }

    /**
     *
     * @return the name of the class and the number of credits
     */
    public String toString(){
        return name + " " + credits;
    }

}

