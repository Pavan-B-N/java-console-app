package CMD;
import java.io.File;
// import java.util.Arrays;
public class Path {
    static  private String root="C:/Users/LOKESH";
    static private String formatedRoot=root + "> ";

    public static String getPath(){
        return root;
    }
    public static String getFormatedPath(){
        return formatedRoot;
    }
    public static void updatePath(String path){
        if(path.equals("../") || path.equals("..")){
            String[] paths=root.split("/");
            root="C:";
            for(int i=1;i<(paths.length-1);i++){
                root=root+"/"+paths[i];
            }
            formatedRoot=root+"> ";
        }
        else if(isValidatedPath(path)){
            root=root+"/"+path;
            formatedRoot=root+"> ";
        }else{
            System.out.println("Invalid Path");
        }
        
    }
    static boolean isValidatedPath(String path){
        String p=root+"/"+path;
        File file=new File(p);
        if(file.isDirectory()){
            return true;
        }else{
            return false;
        }
    }

    public static void ListDirectoryFiles(){
        File file=new File(root);
        if(file.isDirectory()){
            File listOfFiles[]=file.listFiles();
            System.out.println(listOfFiles);
            for(File f:listOfFiles){
                System.out.println(f.getName());
            }
        }else{
            System.out.println("No Files Found");
        }
    }
}
