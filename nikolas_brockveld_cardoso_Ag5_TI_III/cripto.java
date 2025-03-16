import javax.swing.JOptionPane;

public class Cripto {
    public static void main(String[] args) {

        //Caixa de dialogo
        String mensagem = JOptionPane.showInputDialog("Entre com uma string:");
        char[] caracteres = mensagem.toCharArray();
        String mensagem = "";
        
        // Percorrer cada caractere da mensagem
        for (int i = 0; i < caracteres.length; i++) {
            int codigoASCII = (int) caracteres[i];
        
            // Somar 10 ao código
            int codigoCriptografado = codigoASCII + 10;
            char caractere = (char) codigoCriptografado;
            
            mensagem += caractere;
        }
        
        JOptionPane.showMessageDialog(null, "Saida da string criptografada: " + mensagem);
    }
}
