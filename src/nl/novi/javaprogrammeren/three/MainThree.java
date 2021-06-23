package nl.novi.javaprogrammeren.three;

public class MainThree {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setPhoneNumber("612345678");
       // phone.getInternationalPhoneNumber();
        String internationalNumber = phone.getInternationalPhoneNumber();
        System.out.println(internationalNumber);
    }
}
