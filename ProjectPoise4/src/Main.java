import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        DataReader reader = new DataReader();
        reader.readFile();
        FileWritter filewriter = new FileWritter();
        ProjectList projectList = ProjectList.getOnlyInstance();
        /*
       --------------------------------##### CODE IS EXECUTED HERE #########-----------------------------------------------
         */
        Scanner input2 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        int projectNumber = 0;
        int totalFee = 0;
        int datePay = 0;
        while (true) {
            try {

                System.out.print("What is the NUMBER of this project?: ");
                projectNumber = num2.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error, You have entered invalid input, Please try again.");
            }
        }
        System.out.print("What is the NAME of this Project? : ");
        String projectName = input2.nextLine();

        System.out.println("What type of building is being designed ? \n 1.House\n2.Apartment block\n3.Store ");
        String buildingType = input2.nextLine();


        if (!(buildingType.equalsIgnoreCase("House")) ||
                !(buildingType.equalsIgnoreCase("Apartment Block")) ||
                !(buildingType.equalsIgnoreCase("Store"))) {
            System.out.print("Try again.");
            buildingType = input2.nextLine();
        }

        System.out.println("What is the Physical address of the site/ project you're working on?: ");
        String physicalAddress = input2.nextLine();

        System.out.println("What is the ERF number?: ");
        int erfNumber = num2.nextInt();
        String dueDate = "";
        while (true) {

            try {
                System.out.println("The total amount paid to date: ");
                datePay = num2.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error, You have entered invalid input, Please try again.");
            }
        }

        System.out.println("what is Deadline for the project?: ");
        dueDate = input2.nextLine();

        while (true) {
            try {

                System.out.println("The total fee being charged for the project?; ");
                totalFee = num2.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error, You have entered invalid input, Please try again.");
            }
        }


        System.out.println("What type of person are we working with?\n 1.Architect\n2.Building contractor");
        String type = input2.nextLine();

        if ((!type.equalsIgnoreCase("Architect")) || (!type.equalsIgnoreCase("Building contractor"))) {
            System.out.println("Lets Go!! ");
        }
        System.out.print("Name and surname of the person:");
        System.out.print("Name: ");
        String name = input2.nextLine();
        System.out.print("Surname: ");
        String surname = input2.nextLine();

        System.out.println("Telephone: ");
        String telephone = input2.nextLine();
        System.out.println("Email Address: ");
        String email = input2.nextLine();

        System.out.println("Physical Address: ");
        String address = input2.nextLine();

        Project poise = new Project(projectNumber, projectName, buildingType, physicalAddress, erfNumber,
                totalFee, datePay, dueDate, type, name, surname, telephone, email, address);
        System.out.println(poise);




        //METHODS THAT ARE CALLED


        System.out.println("Would you like to do :\n" +
                "1.Add a new project.\n" +
                "2.Edit a Project.\n" +
                "3.View Projects\n"+
                " 4.Exit ");

        Scanner sn = new Scanner(System.in);
        int choose = sn.nextInt();


        switch(choose){

            case 1 :
        getUserInput();

            case 2:
                updateProject();

            case 3:
               projectList.DisplayProject();

                case 4:
                break;



        }
    }

    /*
    -----------------------------------------####### METHODS #####-----------------------------
    These methods can be used again and again.
    1.A method to get String input, because there are questions were are going to have to ask again and again
    2..A mthod to get integer input
    3.A method to get Double input
    4.A method to get information from the user , this method is going to contain three methods for String,integer and Double methods
    5.A method to add a  new Project class
    6.A method to edit/update existing projects
     */
    public static int numbers(String message) {
        Scanner num = new Scanner(System.in);
        do {
            try {
                System.out.println(message);
                return num.nextInt();

            } catch (Exception e) {
                System.out.println("Invalid input , enter a number");
            }

        } while (true) ;
    }
    //The parameter Message is the String you are going to use to prompt the user to enter something.
    //The static keyword is used to call the function to the main menu and to any other method within the method
    public static String input(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    private static double DoubleNum(String message) {
        while(true) {
            try {
                System.out.println(message);
                Scanner input = new Scanner(System.in);
                double num = input.nextDouble();
                if (num > 0.0D) {
                    return num;
                }

                System.out.println("Your number must be greater than 0");
            } catch (Exception e) {
                System.out.println("Error, You have entered invalid input, Please try again.");
            }
        }
    }
    //This is a method thats is going to be used to get the building type the user wants to use.
    public static String buildingtype(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        String building = input.nextLine();
        System.out.println(building);


        while(!(building.equalsIgnoreCase("House")) ||
                !(building.equalsIgnoreCase("Apartment Block")) ||
                !(building.equalsIgnoreCase("Store"))) {
            System.out.println("Incorrect input try again.");
            building = input.nextLine();

        }
        return building;
    }

    public static String person(String message){
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();

        while(!(type.equalsIgnoreCase("Architect")) || (!type.equalsIgnoreCase("Building contractor") ||(!type.equalsIgnoreCase("Customer")))) {
            System.out.println("Incorrect input try again ");
            type = input.nextLine();
        }
        return type;
    }


    public static  Project getUserInput(){
        //The information stored in Methods (numerbers and input)is stored in the variables , then being inserted into the project class
        //Each method is used to prompt a user to reply.
        int projectNumber = numbers("What number would you like your Project to be?. ");
        String projectName = input("What is the name of the Project?.");
        String buildingType = buildingtype("What is the Building type of this Project.\n " +
                "It is either :\n" +
                "1.House\n"+
                "2.Apartment Block\n"+
                "3.Store\n");
        int erfNumber = numbers("Enter ERF number for the project.");
        String physicalAddress = input("What is the physical Address of the project?");
        String dueDate = input("Enter due date(Deadline) of the project.");
        int totalFee = numbers("What is the total fee being charged for the project.");
        int datePay = numbers("What is the amount payed to date?");


        System.out.println("\n-----# Person Details #-------\n");
        String personType = person("\n"+"What type of person are we working with?\\n" +"1.Architect"+"\n"+"2.Building contractor"+"\n"+"3.Customer");
        String name = input("Name of the person");
        String surname = input("Surname of the person.");
        String Telephone = input("Telephone:");
        String email = input("Email Address:");
        String address = input("Physical addrss of the person");

        //THIS METHOD TYPE NEEDS A RETURN TYPE , IE. YOU NEED TO RETURN SOMETHING , IN THIS CASE WE ARE RETURNING A NEW PROJECT
        //THIS METHOD IS USED TO CREATE AND ADD A NEW PROJECT.
        return new Project(projectNumber, projectName, buildingType, physicalAddress, erfNumber,
                totalFee, datePay, dueDate, personType, name, surname, Telephone, email, address);

    }

    public  static int yesno(int num2){
        String decide = input("Are you sure you want to delete this project");
        switch(decide){

            case "no":
                break;

            case "yes":
                System.out.println("Deleting project........");
                return num2;




        }
        return num2;
    }

    public static void updateProject() {
        //All the project are going to be listed into the object projectList
        ProjectList projectList = ProjectList.getOnlyInstance();
       Project updatedProject;

        int projectNumber = numbers("Select the number of the project you want to update.");
        // naming the name of the ProjectList.java object , then calling the method within that class.
        projectList.DisplayProject();
        //Calling the specified project from the arrayList in the class ProkectList.java
        updatedProject = projectList.getProject(projectNumber);

        int choice = numbers( "\"Select the option below by entering a number:\n" +
                "                        \"1.Change project Number\n" +
                "                        \"2.change NAME of the project\n" +
                "                        \"3.Change building type of the project\n" +
                "                        \"4.Change physical address of the project \n" +
                "                        \"5.Change ERF number of the project\n" +
                "                        \"6.Change total amount paid to date\n" +
                "                        \"7.Change deadline of the project\n" +
                "                        \"8.Total fee of the project\n" +

                "                        \"  9. Change the type of person you are working with \n" +
                "                        \"10. Change the name of the person."+
                "                        \"11. Change surname of the person.\n"+
                "                        \"12.Change the physical Address of the person\n" +
                "                        \13.Change the email of the person\n"+
                "                        \" 14.Change Telephone Number\n"+
                "                        \" 15.Delete Project.\n"+
                "                        \"16.EXIT.");
        switch (choice) {
            case 1:

                int choice2 = numbers("Please enter the new number of the project.");
                Project.setProjectNumber(choice2);
                updatedProject.setProjectNumber(choice2);
                System.out.println(updatedProject);

                System.out.println("Your new project name is " + choice2);

            case 2:
                String p2name =  input("Please enter the new NAME of the project.");
                Project.setProjectName(p2name);
                updatedProject.setProjectName(p2name);
                System.out.println("your new project name is " + p2name);
                System.out.println();

            case 3:
                String b2type = buildingtype("\"What type of building is being designed ? \\n 1.House\\n2.Apartment block\\n3.Store \".");
                Project.setBuildingType(b2type);
                updatedProject.setBuildingType(b2type);
                System.out.println("Your new Building type is " + b2type);
                System.out.println(updatedProject);


            case 4:
                String physicalAddress2 = input("Enter the new Physical address details here.");
                Project.setPhysicalAddress(physicalAddress2);
                updatedProject.setPhysicalAddress(physicalAddress2);

            case 5 :
                int ErfNumber2 = numbers("Enter new ERF Number");
                Project.setErfNumber(ErfNumber2);
                updatedProject.setErfNumber(ErfNumber2);
                System.out.println(updatedProject);

            case 6:
                double DatePay2 = DoubleNum("Enter the new current total amount payed.\n" + "Amount payed to Date.");
                Project.setDatePay(DatePay2);
                updatedProject.setTotalFee(DatePay2);
                System.out.println(updatedProject);

            case 7 :
                String deadline2 = input("Enter the new DEADLINE of the project");
                Project.setDueDate(deadline2);
                updatedProject.setDueDate(deadline2);

            case 8:
                double totalAmount2 = DoubleNum("Enter the new TOTAL AMOUNT of the project.");
                Project.setTotalFee(totalAmount2);
                updatedProject.setTotalFee(totalAmount2);
                System.out.println(updatedProject);

            case 9 :
                String personType = person("\n"+"Change the type of person are we working with?\\n 1.Architect\\n2.Building contractor\"");
                Project.setType(personType);
                updatedProject.setType(personType);
                System.out.println(updatedProject);

            case 10:
                String name2 = input("Change the name of the person.");
                Project.setName(name2);
                updatedProject.setName(name2);
                System.out.println(updatedProject);

            case 11:
                String surname2 = input("Enter the surname of the person");
                updatedProject.setSurname(surname2);
                System.out.println(updatedProject);

                case 12:
                    String physicalAdd2 = input("Enter new phyisical address of the person");
                    Project.setPhysicalAddress(physicalAdd2);
                    updatedProject.setPhysicalAddress(physicalAdd2);
                    System.out.println(updatedProject);


            case 13:
                String email2 = input("Change TELEPHONE number");
                Project.setEmail(email2);
                updatedProject.setEmail(email2);
                System.out.println(updatedProject);

                case 14:
                String Telephone2 = input("Change TELEPHONE number");
                Project.setTelephone(Telephone2);
                updatedProject.setTelephone(Telephone2);
                System.out.println(updatedProject);



            case 15:
                projectList.DisplayProject();
                int deleteNumber = numbers("Enter the number of the project you want to delete ");
                projectList.deleteProject(yesno(deleteNumber));



            case 16 : break;



        }
    }}
