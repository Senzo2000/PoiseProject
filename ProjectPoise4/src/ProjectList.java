import java.util.*;
public class ProjectList {

    ArrayList<Project> ProjectList = new ArrayList();

    private static ProjectList onlyInstance = null;

    public Project getProject(int projectNum) {
        return ProjectList.get(projectNum);

    }
    /*Method to get the projectName

    public Project getProjectName2 (String projectName){
        return ProjectList.get(projectName);

    }

     */

    public static ProjectList getOnlyInstance() {
        if (onlyInstance == null) {
            onlyInstance = new ProjectList();
        }

        return onlyInstance;
    }

    //This method is used to add a project
    public void addProject(Project project) {
        this.ProjectList.add(project);
    }

    //  METHOD USED TO GET PROJECT FROM ENTERING A NUMBER
    public void projectMenue() {
        System.out.println("Please select a project by entering a number below\n--------------------------------------------------\n");
        int projectNumber = 0;

        for (Iterator i = this.ProjectList.iterator(); i.hasNext(); ++projectNumber) {
            Project project = (Project) i.next();
            System.out.println(projectNumber + ". " + project.getProjectName() + " - " + project.getBuildingType() + " " + project.getPhysicalAddress() + " "
                    + project.getErfNumber() + " " + project.getTotalFee() + " " + project.getDueDate() + " " + project.getType() +
                    " " + project.getName() + " " + project.getSurname() +
                    " " + project.getTelephone() + " " + project.getEmail() + " " + project.getAddress());
        }
    }

    //This method is used to show the user a list of projects  which  they would like to change
    //METHOD TO SHOW PROJECT
    public void DisplayProject() {
        String displayProject = "";
        int projectNum = 0;
        //for every project object in projectList
        //print out the project name as well as the project number of the project\
        //This is a method to show the user which project they would like to change , update or edit.
        for (Project p : ProjectList) {
            System.out.println("Project number: " + projectNum + "\n" + p + "\n----------\n");
            projectNum++;
        }
    }


    //METHOD TO DELETE PROJECT
    public void deleteProject(int projectNum) {
        if (projectNum < this.ProjectList.size()) {
            this.ProjectList.remove(projectNum);
        }

    }

    public String toFile() {
        String outFile = "";

        Project project;
        for (Iterator i = this.ProjectList.iterator(); i.hasNext(); outFile = outFile + project.toFile() + "\n") {
            project = (Project) i.next();
        }

        return outFile;

    }


}
