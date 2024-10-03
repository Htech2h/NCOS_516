import javax.swing.JOptionPane;

public class Input {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null," Enter number");
        JOptionPane.showMessageDialog(null, (input)+4 );
    }
}
