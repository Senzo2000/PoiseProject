import java.util.*;
import java.io.*;

public class DataReader {
    //This is a method used to get scanner input and prompt the user for integer answers only

    public void readFile(){
        try{
            File file = new File("ProjectFile.txt");
            Scanner ins = new Scanner(file);

            while(ins.hasNext()){
                String line = ins.nextLine();
                String projectList[]  = line.split(", ");

                String ProjectNumber = projectList[0];

                String projectName = projectList[2];
                String buildingType = projectList[1];
                String physicalAddress = projectList[3];
                String erfNumber = projectList[4];
                String totalFee = projectList[5];
                String datePay = projectList[6];
                String dueDate = projectList[7];
                String type = projectList[8];
                String name = projectList[9];
                String surname = projectList[10];
                String Telephone = projectList[11];
                String email = projectList[12];


                //Project projectDetails = new Project();
                //Project personDetails = new Project();

            }

        }catch(Exception e){
            System.out.println("Failed to read data from the file.");
        }
    }





    }


