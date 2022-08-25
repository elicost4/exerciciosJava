import javax.swing.JOptionPane;

public class Nota {
    
    static double media = 0;
    
    public static void main(String[]args) {

        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Bem vindo: " + nome, "", JOptionPane.INFORMATION_MESSAGE);
        char simOuNao;
        String yesOrNot = JOptionPane.showInputDialog(null, "Vamos começar? [s/n]", "",JOptionPane.QUESTION_MESSAGE);
        simOuNao = yesOrNot.charAt(0);
        
        if (simOuNao != 's' && simOuNao != 'S') {
            JOptionPane.showMessageDialog(null, "Tchau" + nome, "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            getBimestre();
            getNota();
        }
    }
    
    public static void getBimestre() {

        double nota1B = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com a nota 1º Bimestre:", "Apenas notas de 0-10",JOptionPane.INFORMATION_MESSAGE));
        double nota2B = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com a nota 2º Bimestre:", "Apenas notas de 0-10",JOptionPane.INFORMATION_MESSAGE));
        double nota3B = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com a nota 3º Bimestre:", "Apenas notas de 0-10",JOptionPane.INFORMATION_MESSAGE));
        double nota4B = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com a nota 4º Bimestre:", "Apenas notas de 0-10",JOptionPane.INFORMATION_MESSAGE));

        media = (nota1B + nota2B + nota3B + nota4B) / 4;
        JOptionPane.showMessageDialog(null, "Media Final: " + media, "", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public static void getNota() {
        
        if (media > 6 && media <= 10) {
          JOptionPane.showMessageDialog(null, "Aprovado com média: " + media, "", JOptionPane.INFORMATION_MESSAGE);
            
        } else if (media >= 5 && media <= 6) {
            JOptionPane.showMessageDialog(null, "Recuperação com média: " + media, "", JOptionPane.INFORMATION_MESSAGE);
            
        }else if (media >= 0 && media < 5) {
            JOptionPane.showMessageDialog(null, "Reprovado com média: " + media, "", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(null, "Média fora do range [0-10], tente novamente", "", JOptionPane.ERROR_MESSAGE);
        }
    }
}
