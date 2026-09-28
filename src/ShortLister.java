import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class ShortLister {
    public static void main(String args[]) {
        JFileChooser chooser = new JFileChooser();

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            try {
                Scanner in = new Scanner(file);
                ShortWordFilter filter = new ShortWordFilter();

                System.out.println("Short Words:");

                while (in.hasNextLine()) {
                    String word = in.nextLine();
                    if (filter.accept(word)) {
                        System.out.println(word);
                    }
                }
                in.close();
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
