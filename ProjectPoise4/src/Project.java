public class Project {

    //ATTRIBUTES OF THE POISED PROJECT
    // in JAVA all the variables and attributes started off with a smaller case letter , and the second names start off with a Capital letter, its like this in all cases.
    int projectNumber;
    String projectName;
    String buildingType;
    String physicalAddress;
    int erfNumber;
    double totalFee;
    double datePay;
    String dueDate;
    String type;
    //object of PoisePerson classprivate String type;
    private String name;
    private String surname;
    private String telephone;
    private String email;
    private String address;

    public Project(int projectNumber, String projectName, String buildingType, String physicalAddress, int erfNumber, double totalFee, double datePay, String dueDate, String type, String name, String surname, String telephone, String email, String address) {
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.physicalAddress = physicalAddress;
        this.erfNumber = erfNumber;
        this.totalFee = totalFee;
        this.datePay = datePay;
        this.dueDate = dueDate;
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    //Getters
    public int getProjectNumber() {
        return projectNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public int getErfNumber() {
        return erfNumber;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public double getDatePay() {
        return datePay;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    //SETTERS

    public static void setProjectNumber(int projectNumber) {
        projectNumber = projectNumber;
    }

    public static void setProjectName(String projectName) {
        projectName = projectName;
    }

    public static void setBuildingType(String buildingType) {
        buildingType = buildingType;
    }

    public static void setPhysicalAddress(String physicalAddress) {
        physicalAddress = physicalAddress;
    }

    public static void setErfNumber(int erfNumber) {
        erfNumber = erfNumber;
    }

    public static void setTotalFee(double totalFee) {
        totalFee = totalFee;
    }

    public static void setDatePay(double datePay) {
        datePay = datePay;
    }

    public static void setDueDate(String dueDate) {
        dueDate = dueDate;
    }

    public static void setType(String type) {
        type = type;
    }

    public static void setName(String name) {
        name = name;
    }

    public static void setSurname(String surname) {
        surname = surname;
    }

    public static void setTelephone(String telephone) {
        telephone = telephone;
    }

    public static void setEmail(String email) {
        email = email;
    }

    public static void setAddress(String address) {
        address = address;
    }

    public String toString() {
        String output;
        output = "\n\n####PROJECT DETAILS###";
        output += "\nProject Number: " + projectNumber;
        output += "\nBuilding Type: " + buildingType;
        output += "\nName of the project: " + projectName;
        output += "\nPhysical Address of the Project site: " + physicalAddress;
        output += "\nErf Number: " + erfNumber;
        output += "\nWhat is the total fee of the project? ; " + totalFee;
        output += "\nThe total amount paid to date: " + datePay;
        output += "\nDeadline for the project: " + dueDate;
        output += "\n\n================================\n";
        output += "###Persons details###\n";
        output += "\nWhat type person are we dealing with: " + type;
        output += "\nPersons name: " + name;
        output += "\nPersons surname: " + surname;
        output += "\nTelephone: " + telephone;
        output += "\nE-mail: " + email;
        output += "\nPhysical Address: " + address;
        output += "\n==============\n";
        return output;
    }

    public String toFile() {
        return this.projectNumber + ", "+ this.projectName + ", "+ this.buildingType + ", "+ this.physicalAddress + ", "+ this.erfNumber + ", "+
        this.totalFee + ", "+ this.datePay + ", "+ this.dueDate + ", "+ this.type + ", "+ this.name + ", "+ this.surname + ", "+ this.telephone + ", "+
        this.email + ", "+ this.address ;
    }
       }

