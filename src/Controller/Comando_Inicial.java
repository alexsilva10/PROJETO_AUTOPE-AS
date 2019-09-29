
package Controller;

import View.TelaPrincipal;


public class Comando_Inicial { 
        TelaPrincipal Principal;

    public static void main(String args[]) {
        new Comando_Inicial().executar();
    }

    public void executar() {
        Principal = new TelaPrincipal();
    }
}
