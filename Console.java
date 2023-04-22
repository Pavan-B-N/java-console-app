//file-baes moduels
// import CMD.FileCRUD;
import CMD.Path;
//core modules
import java.util.Scanner;
public class Console {
    public static void main(String[] args) {
        System.out.println("\t\t\tconsole app...\n\n");
        Scanner scan=new Scanner(System.in);
        String filename=null;
        String operation=null;
        while(true){
            System.out.print(Path.getFormatedPath());
            String[] input=scan.nextLine().split(" ");
            operation=input[0];
            if(input.length==2){
                filename=input[1]; 
            }
            if(operation.equals("cd")){
                Path.updatePath(filename);
            }
            if(operation.equals("ls")){
                Path.ListDirectoryFiles();
            }
            if(operation.equals("exit")){
                System.out.println("\n\t\t\tExited");
                break;
            }
        }
        scan.close();
       
    }
}
