public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Michael", 17);
        Student student2 = new Student("Jane", 16);

        CollegeStudent collegeStudent1 = new CollegeStudent("David", 21);
        CollegeStudent collegeStudent2 = new CollegeStudent("Mary", 19);

        Employee emp1 = new Employee("Philip", 32);
        Employee emp2 = new Employee("Chris", 28);

        Team<CollegeStudent> uniTeam = new Team("Unilever");
        uniTeam.addNewParticipant(collegeStudent1);
        uniTeam.addNewParticipant(collegeStudent2);

        Team<Employee> employeeTeam = new Team("Power Plant");
        employeeTeam.addNewParticipant(emp1);
        employeeTeam.addNewParticipant(emp2);

        employeeTeam.playWith(uniTeam);

    }
}