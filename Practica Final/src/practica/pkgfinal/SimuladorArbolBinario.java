
package practica.pkgfinal;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author ploks
 */
public class SimuladorArbolBinario {

    Arbol arbol = new Arbol();
    private ArrayList<String> T = new ArrayList<String>();  
    int n=0;

    public SimuladorArbolBinario() {
    }

    public boolean insertar(String dato) {      
            T.add(dato);
            n++;
            return arbol.agregar(n,T);       
    }

    public String borrar(String dato) {
        int i = 0;
        int x = 0;
        while (i < T.size()) {
            if(T.get(i).equals(dato)){
                T.remove(i);
                n--;
                x++;
            }            
            i++;
        }
        if(x!=0){
            arbol.agregar(n,T);
            return ("Se elimino satisfactoriamente todos los "+dato+" encontrados");
        }else{
            return ("No se encontro: "+dato);
        }
    }      
    
    public String darHojas() {
        int i = 0;
        String r = "Participantes del Torneo:"+"\n";
        while (i < T.size()) {
            r += "\t" + T.get(i)+ "\n";
            i++;
        }
        return (r);
    }
    
    public void win(String w){
        Nodo s=this.arbol.padre(this.arbol.getRaiz(), w);
        s.setDato(w);
    }
    
    public ArrayList<String> getT(){
        return T;
    }
    
    public String getWinner(){
        return arbol.getRaiz().getDato();
    }
    
    public int getN(){
        return n;
    }
    
    public JPanel getDibujo() {
        return this.arbol.getDibujo();
    }
}
