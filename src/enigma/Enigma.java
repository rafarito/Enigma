package enigma;
import javax.swing.JOptionPane;

public class Enigma {

    public static void main(String[] args) {
        Rotor eng = new Rotor();
        int tam, i;
        String cript = "";
        String frase = JOptionPane.showInputDialog(null, "letra", "letra",1);
        tam = frase.length();
        frase = frase.toUpperCase();
        for(i = 0;i < tam;i++){
            cript += eng.rotor(1, frase.charAt(i),1); //verifique essa logica
        }
        System.out.println(cript);
    }
    
}
