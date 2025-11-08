import javax.swing.JOptionPane;

public class Soma {
    public static void main(String[] args) {

        int num01, num02, total;
        String aux;

        aux = JOptionPane.showInputDialog("Digite o primeiro número: ");
        num01 = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("Digite o segundo número: ");
        num02 = Integer.parseInt(aux);

        total = num01 + num02;

        JOptionPane.showMessageDialog(null, "A soma é: " + total);
    }
}
