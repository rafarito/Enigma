package enigma;

public class Rotor {
    private static final String rotor1 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
    private static final String rotor2 = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
    private static final String rotor3 = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
    private static final String rotor4 = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
    private static final String rotor5 = "VZBRGITYUPSDNHLXAWMJQOFECK";
    private static final String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // o processo inverso dos rotores deve ser bem pensado

    private int pos[] = new int[3];

    public char rotor(int type, char press, int order){
        switch(type){
            case 1:
                if(alfabeto.indexOf(press) + pos[order - 1] < 26){
                    press =  rotor1.charAt(alfabeto.indexOf(press) + pos[order - 1]);
                }else{
                    press =  rotor1.charAt((alfabeto.indexOf(press) + pos[order - 1]) - 26); //verifique essa logica *rigor*
                }
            break;
            case 2:
                press =  rotor2.charAt(alfabeto.indexOf(press));
            break;
            case 3:
                press =  rotor3.charAt(alfabeto.indexOf(press));
            break;
            case 4:
                press =  rotor4.charAt(alfabeto.indexOf(press));
            break;
            case 5:
                press =  rotor5.charAt(alfabeto.indexOf(press));
            break;
        }
        return press;
    }

}
