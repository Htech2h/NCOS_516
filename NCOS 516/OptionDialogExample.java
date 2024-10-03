import javax.swing.JOptionPane;

public class OptionDialogExample {
    public static void main(String[] args) {
        String[] options = {"Option 1", "Option 2", "Option 3"};
        int selectedOption = JOptionPane.showOptionDialog(null, "Choose an option:", "Option Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (selectedOption >= 0) {
            System.out.println("User selected: " + options[selectedOption]);
        } else {
            System.out.println("User cancelled the option dialog.");
        }
    }
}

