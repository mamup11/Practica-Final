/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkgfinal;

/**
 *
 * @author ploks
 */
public class Nodo {
    
    private String dato;
    private Nodo izq, der;

    public Nodo(String dato, Nodo izq, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    } 

}
