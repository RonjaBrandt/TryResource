import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter(new FileWriter("out.txt"));){
            pw.println("hej");
        } catch (IOException e) {
            e.printStackTrace();
        }
     //garanterat closed
    }
}
