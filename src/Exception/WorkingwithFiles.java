package Exception;

import java.io.File;

public class WorkingwithFiles {
    public static void main(String[] args) {
        File file = new  File("a.txt");

        if(file.exists())
        {
            System.out.println("Yesy");
        }
    }
}
