
package entradasysalidas;
import javax.swing.JOptionPane;

public class TestFrame {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingresa algo:");
        JOptionPane.showMessageDialog(null, "Lo que ingresaste es: " + input);
    }
}