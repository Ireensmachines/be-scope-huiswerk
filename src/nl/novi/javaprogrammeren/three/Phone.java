package nl.novi.javaprogrammeren.three;

public class Phone {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInternationalPhoneNumber() {
        String phoneNumber1 = "+31" + phoneNumber;

        return phoneNumber1;
    }
}
