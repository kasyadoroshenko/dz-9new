public class Man extends Person {

    public Man(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public boolean isRetired(int age){
        if (age > 65){
            System.out.println("Recieves an old-age pension: " + getFirstName());
            return true;
        }
        System.out.println("Doesn't recieve an old-age pension: " + getFirstName());
        return false;
    }

    public void printPersone(){
        super.printPersone();
    }

}
