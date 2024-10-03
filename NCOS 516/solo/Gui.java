package solo;

import javax.swing.*;

public class Gui {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("the name");
        JOptionPane.showMessageDialog(null, name);
    }
}
