import javax.swing.JOptionPane;

public class Nota {
    
    static double media = 0;
    
    public static void main(String[]args) {

        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Bem vindo: " + nome, "", JOptionPane.INFORMATION_MESSAGE);
        char simOuNao;
        String yesOrNot = JOptionPane.showInputDialog("Vamos come�ar? [s/n]");
        simOuNao = yesOrNot.charAt(0);
        
        if (simOuNao != 's' && simOuNao != 'S') {
            JOptionPane.showMessageDialog(null, "Tchau" + nome, "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            getBimestre();
            getNota();
        }
    }
    
    public static void getBimestre() {

        double nota1B = Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota 1� Bimestre:"));
        double nota2B = Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota 2� Bimestre:"));
        double nota3B = Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota 3� Bimestre:"));
        double nota4B = Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota 4� Bimestre:"));

        media = (nota1B + nota2B + nota3B + nota4B) / 4;
        JOptionPane.showMessageDialog(null, "Media Final: " + media, "", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public static void getNota() {
        
        if (media >= 7 && media <= 10) {
          JOptionPane.showMessageDialog(null, "Aprovado com m�dia: " + media, "", JOptionPane.INFORMATION_MESSAGE);
            
        } else if (media >= 5 && media <= 6) {
            JOptionPane.showMessageDialog(null, "Recupera��o com m�dia: " + media, "", JOptionPane.INFORMATION_MESSAGE);
            
        }else {
            JOptionPane.showMessageDialog(null, "Reprovado com m�dia: " + media, "", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
