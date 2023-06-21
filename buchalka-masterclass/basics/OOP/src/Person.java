public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }

    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        else if(this.firstName.isEmpty()){
            return this.lastName;
        }
        else if(this.lastName.isEmpty()){
            return this.firstName;
        }
        else {
            return this.firstName + " " + this.lastName;
        }
    }
    // setters
    public void setFirstName(String firstName){
//        if(firstName.trim() != ""){
            this.firstName = firstName;
//        }
//        else {
//            System.out.println("Cannot set to an empty string");
//        }
    }

    public void setLastName(String lastName){
//        if(lastName.trim() != ""){
            this.lastName = lastName;
//        }
//        else {
//            System.out.println("Cannot set to an empty string");
//        }
    }

    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }

    // getters
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }


    public int getAge(){
        return this.age;
    }
}
