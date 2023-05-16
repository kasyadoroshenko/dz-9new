public class Main {
    public static void main(String[] args) {

        Man man = new Man("John","Doe", 70, "Yes");
        Woman woman = new Woman("Jane","Poe", 25, "Yes");

        System.out.println("Cтворити екземпляри классів ");


        man.printPersone();
        woman.printPersone();

        System.out.println("Виявлення пенсійного віку для різних классів ");

        woman.isRetired(25);
        man.isRetired(70);

        System.out.println("Змінити прізвище для класу чоловік ");

        man.setLastName("Snow");
        man.printPersone();

        System.out.println("Змінити прізвище для класу жінка при одруженні ");

        woman.registerPartnership("Show");

        System.out.println("Змінювати прізвище для класу вумен в залежності від умови Yes/No ");

        woman.deregisterPartnership("Stone");


    }
}