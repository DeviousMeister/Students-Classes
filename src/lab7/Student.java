package lab7;

public class Student{

    private int id, attCredit, passCredit, gpa;
    public double passGrade, failGrade, quality, balance;
    private String firstName, lastName;

    public Student(String firstName, String lastName, int id){
    this.firstName=firstName;
    this.lastName=lastName;
    this.id=id;
    }

    public String getFullName(){
        return (this.firstName + " " + this.lastName);
    }

    public int getId(){
        return id;
    }

    /**
     * submits their grades and credits
     * @param grade their grade
     * @param credits credit of class
     */
    public void submitGrade(double grade, int credits) {
        double updateVal = grade*credits;

        if (grade >= 1.7){
            passGrade += updateVal;
            passCredit += credits;
        }
        else{
            failGrade += updateVal;
        }
        attCredit+=credits;
    }

    public int getTotalAttemptedCredits(int attCredit){
        return getTotalAttemptedCredits(this.attCredit);
    }

    public int getTotalPassingCredit(int passCredit){
        return getTotalPassingCredit(this.passCredit);
    }

    /**
     *
     * @return finds a student's average gpa
     */
    public double calculateGradePointAverage(){
        return (failGrade+passGrade)/attCredit;
    }

    /**
     *
     * checks how many credits a student has
     * @return what class they're in
     */
    public String getClassStanding() {
        if (passCredit<30){
            return "First Year";
        }
        if(30<=passCredit && passCredit<60){
            return "Sophomore";
        }
        if(60<=passCredit && passCredit<90){
            return "Junior";
        }
        else{
            return "Senior";
        }
    }

    /**
     * sees if they meet a credit and gpa requirement
     * @return if their eligible or not for a sorority/fraternity
     */
    public boolean isEligibleForPhiBetaKappa(){
        if(98<=passCredit && calculateGradePointAverage()>=3.60){
            return true;
        }

        if(75<=passCredit && calculateGradePointAverage()>=3.80){
            return true;
        }
        else{
            return false;
        }
    }

    public double depositBearBucks(double amount){
        return this.balance=(balance+amount);
    }

    public double deductBearBucks(double amount){
        return this.balance=(balance-amount);
    }

    public double getBearBucksBalance(){
        return this.balance;
    }

    public double cashOutBearBucks(){
        this.balance -= 10;
        if(balance<=0){
            balance=0;
            return balance;
        }
        else{
            double withdraw = balance;
            balance=0;
            return withdraw;
        }
    }

    /**
     *
     * @param firstName student's first name
     * @param otherParent the other parent
     * @param isHyphenated decides if there's a hyphen in the last name
     * @param id student's id
     * @return the bear bucks balance and the new student
     */
    public Student createLegacy(String firstName, Student otherParent, boolean isHyphenated, int id) {
        Student c = new Student(firstName, lastName, id);
        if(isHyphenated){
            c.lastName=this.lastName+"-"+ otherParent.lastName;
        }
        else{
            c.lastName=this.lastName;
        }
        c.depositBearBucks(this.cashOutBearBucks() + otherParent.cashOutBearBucks());
        return c;


    }

    /**
     *
     * @return the full name of a student and their id
     */
    public String toString(){
        return firstName + " " + lastName + " " + id;
    }

}
