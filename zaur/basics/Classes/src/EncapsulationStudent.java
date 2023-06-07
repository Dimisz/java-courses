public class EncapsulationStudent {
    private StringBuilder name;
    private int year;
    private int grade;
    private static int count = 0;

    public EncapsulationStudent(String name, int year, int grade){
        setName(name);
        setYear(year);
        setGrade(grade);
        count++;
    }

    public void showInfo(){
        System.out.println("Student name:\t" + this.name);
        System.out.println("Year:\t" + this.year);
        System.out.println("Average grade:\t" + this.grade);
        System.out.println("Total students' count: " + count);
        System.out.println("==============================\n");
    }
    public void setName(String name){
        if(name.length() >= 3){
            this.name = new StringBuilder(name);
        }
        else {
            System.out.println("Name should be at least 3 characters long. Setting N/A...");
            this.name = new StringBuilder("N/A");
        }
    }

    public void setYear(int year){
        if(year > 1 && year < 5){
            this.year = year;
        }
        else {
            System.out.println("Year should be within the range from 1 to 4, Setting 1...");
            this.year = 1;
        }
    }

    public void setGrade(int grade){
        if(grade > 1 && grade < 11){
            this.grade = grade;
        }
        else {
            System.out.println("Grade should be within the range from 1 to 10, Setting 1...");
            this.grade = 1;
        }
    }





}
