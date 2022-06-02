import java.util.Formatter;
public class FileWritter {

    ProjectList projectlist = ProjectList.getOnlyInstance();

    public FileWritter() {
    }

    public void updateProjectList() {
        try {
            Formatter outFile = new Formatter("ProjectFile");
            outFile.format(this.projectlist.toFile());
            outFile.close();
            System.out.println("\nThe file was succefully updated.");
        } catch (Exception var2) {
            System.out.println("The project was failed to add to the text file.");
        }

    }

    public void finalizeReport(String name, String data) {
        try {
            Formatter outFile = new Formatter(name);
            outFile.format(data);
            outFile.close();
            System.out.println("The project was successfully finalize");
        } catch (Exception i) {
            System.out.println("Failed to finalize the project");
        }

    }

    public void generateReceipt(String reportName, String data1) {
        try {
            Formatter outFile1 = new Formatter();
            outFile1.format(data1);
            outFile1.close();
            System.out.println("\nThe receipt was successfully generated");
        } catch (Exception var4) {
            System.out.println("Failed to generate the receipt");
        }

    }
}
