
package practica.pkgfinal;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author ploks
 */
public class SimuladorArbolBinario {

    Arbol arbol = new Arbol(null,"",null);
    private ArrayList<String> T = new ArrayList<String>();   

    public SimuladorArbolBinario() {
    }
int g=0;
    public boolean insertar(String dato) {      
            T.add(dato);
            if(g==0){
                arbol.n=dato;
                g++;
            }else{
                arbol.setDer(dato);
            }
            return true;        
    }

    public String borrar(String dato) {
        int i = 0;
        int x = 0;
        while (i < T.size()) {
            if(T.get(i).equals(dato)){
                T.remove(i);
                x++;
            }            
            i++;
        }
        if(x!=0){
            return ("Se elimino satisfactoriamente todos los "+dato+" encontrados");
        }else{
            return ("No se encontro: "+dato);
        }
    }
    
    public String darHojas() {
        int i = 0;
        String r = "Hojas del Arbol"+"\n";
        while (i < T.size()) {
            r += "\t" + T.get(i)+ "\n";
            i++;
        }
        return (r);
    }
    
    public JPanel getDibujo() {
        return this.arbol.getDibujo();
    }
}
