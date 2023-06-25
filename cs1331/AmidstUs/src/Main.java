public class Main {
    public static void main(String[] args) {
        BlueAstronaut ba1 = new BlueAstronaut("Bob", 20, 6, 30);
        BlueAstronaut ba2 = new BlueAstronaut("Heath", 30, 3, 21);
        BlueAstronaut ba3 = new BlueAstronaut("Albert", 44, 2, 0);
        BlueAstronaut ba4 = new BlueAstronaut("Angel", 0, 1, 0);
        RedAstronaut ra1 = new RedAstronaut("Liam", 19, "experienced");
        RedAstronaut ra2 = new RedAstronaut("Suspicious Person", 100, "expert");

        ra1.sabotage(ba1);
//        System.out.println(ba1.getSusLevel());
//        System.out.println(ba1.isFrozen());

//        System.out.println(ra2);
//        System.out.println(ra1);
        ra1.freeze(ra2);
//        System.out.println(ra1);
//        System.out.println(ra2);


//        System.out.println(ba3);
        ra1.freeze(ba3);
//        System.out.println(ra1);
//        System.out.println(ba3.isFrozen());
        ba3.emergencyMeeting();
        ra2.emergencyMeeting();
        System.out.println(ra2.isFrozen());
        ba1.emergencyMeeting();
        System.out.println(ra2.isFrozen());
        ba2.completeTask();
        System.out.println(ba2.getNumTasks());
        ba2.completeTask();
        System.out.println(ba2.getNumTasks());
        System.out.println(ba2.getSusLevel());

        ba2.completeTask();
//
        ra1.freeze(ba4);
        System.out.println(ba4.isFrozen());
        System.out.println(ra1.getSusLevel());
        System.out.println(ba1.getSusLevel());
        ra1.sabotage(ba1);
        System.out.println(ba1.getSusLevel());
        ra1.sabotage(ba1);
        System.out.println(ba1.getSusLevel());
        ra1.freeze(ba1);
        System.out.println(ba1.isFrozen());
        //emergency fix
//        ba4.emergencyMeeting();
//        System.out.println(ra1.isFrozen());

        System.out.println(ba2.getSusLevel());
        ra2.sabotage(ba2);
        System.out.println(ba2.getSusLevel());
        ra2.sabotage(ba2);
        System.out.println(ba2.getSusLevel());
        ra2.sabotage(ba2);
        System.out.println(ba2.getSusLevel());
        ra2.sabotage(ba2);
        System.out.println(ba2.getSusLevel());
        ra2.sabotage(ba2);
        System.out.println(ba2.getSusLevel());
        System.out.println(ra2.getSusLevel());
        System.out.println(ra2.isFrozen());
        ra1.freeze(ba2);
        System.out.println(ba2.isFrozen());
    }
}