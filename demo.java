import java.io.File;
import java.util.Arrays;;
class demo{
    public static void main(String[] args) {
        File file=new File("CMD");
        File arr[]=file.listFiles();  
        System.out.println(Arrays.toString(arr));

        System.out.println(demo.contains(arr, "Path.java"));
    }
    public static boolean contains(File[] arr,String data){
        File search=new File("CMD\\"+data);
        for(File ele:arr){
            if(ele.equals(search)){
                return true;
            }
        }
        return false;
    }
}