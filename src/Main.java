//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student mike = new Student("Mike", "IT", "being a good employee", 23, 2.7f);
        String mikeInformation = mike.toString();
        System.out.println(mikeInformation);
        System.out.println(mike.getName() + "'s current dream is " +mike.getDream());
        mike.setDream("to be a good man and husband");
        System.out.println(mike.getName() + "'s new dream is " +mike.getDream());
        System.out.println(mike.introduce());
        System.out.println(mike.greet());
        System.out.println(mike.study("Math", 120));
        System.out.println(mike.doSports("Chest exercises program", 100));


    }
}