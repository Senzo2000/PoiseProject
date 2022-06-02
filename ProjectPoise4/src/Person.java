public class Person {

    private String surname;
    private String name;
    private String contactNumber;
    private String emailAddress;
    private String physicalAddress;

    public Person(String surname, String name, String contactNumber, String emailAddress, String physicalAddress) {
        this.surname = surname;
        this.name = name;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.emailAddress;
    }

    public String getPhysicalAddress() {
        return this.physicalAddress;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmailAddress(String email) {
        this.emailAddress = email;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String toString() {
        return "Surname: " + this.surname + "\nName: " + this.name + "\nContact Number: " + this.contactNumber + "\nEmail Address: " + this.emailAddress + "\nPysical Address: " + this.physicalAddress;
    }

    public String toFile() {
        return this.surname + ", " + this.name + ", " + this.contactNumber + ", " + this.emailAddress + ", " + this.physicalAddress;
    }
}


