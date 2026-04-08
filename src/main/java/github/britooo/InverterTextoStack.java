package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {
        Pilha pilha = new Pilha<>(input.length());

        for (int i = 0; i < input.length(); i++) {
            pilha.push(input.charAt(i));
        }

        String finalz = "";

        for (int i = 0; i < input.length(); i++) {
            finalz += pilha.pop();
        }

        return finalz;
    }
}
