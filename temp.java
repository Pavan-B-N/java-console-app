import java.util.Arrays;

public class temp{
    public static void main(String[] args) {
        enum e{java,js,python};
        System.out.println(Arrays.toString(e.values()));
        System.out.println(e.valueOf("java"));
    }
}
