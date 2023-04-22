package CMD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileCRUD {
    public void getFunctions(){
        System.out.println("File CRUD operations ... ");
    }
    public void creteFile(String fileName){
        File file=new File(fileName);
        try{
            if(file.createNewFile()){
                System.out.println("New File Created With Name "+fileName);
            }else{
                System.out.println("Error occured during file creation");
            }
        }catch(IOException e){
            System.out.println("Error occured during file creation");
            System.out.println(e);
        }
    }
    public static void readFile(String path) throws Exception{
        try{
            FileReader file=new FileReader(path);
            int i;    
            while((i=file.read())!=-1)    
                System.out.print((char)i);    
            file.close();    
      
        }catch(FileNotFoundException e){
            System.out.println("FileNot Found");
        }
        
    }
}
