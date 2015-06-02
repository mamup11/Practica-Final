/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkgfinal;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author mateo
 */
public class Arbol {
    private Nodo raiz;
    int c=0;
    
    public Arbol()
    {
        this.raiz = new Nodo("",null,null);
    }
    
    public boolean agregar(int n,ArrayList <String> T) {
        try{
            boolean t= true;
            this.raiz.setDer(null);
            this.raiz.setIzq(null);
            int i=0;
            int L=0;
            c=n;
            while(t){
                if(n==Math.pow(2, i)){
                    L=i;
                    t=false;
                }
                else if(n>Math.pow(2, i) && n<Math.pow(2, i+1)){
                    L=i+1;
                    t=false; 
                }
                i++;
            }
            this.raiz.setDato("");
            insertar(this.raiz,L,T);
            //borrar(this.raiz);
            return true;
        }catch (Exception e) {
            return false;            
        }
    }
    
    //private void borrar(Nodo r){
    //    if(r==null){
    //    }
    //}

    public void insertar(Nodo nodo, int L,ArrayList <String> T) {
        int p = 0;
        if(p==L){
            if(c==0){
                nodo=null;                
            }else{
                c--;
                nodo.setDato(T.get(c));
            }           
        }else{
            Nodo w= new Nodo("",null,null);
            Nodo r= new Nodo("",null,null);
            nodo.setIzq(w);
            nodo.setDer(r);
            insertar(nodo.getIzq(),L-1,T);
            insertar(nodo.getDer(),L-1,T);
        }
    }
    public Nodo getRaiz() {
        return this.raiz;
    }
    
    public void setRaiz(Nodo r) {
        this.raiz = r;
    }
    
    public JPanel getDibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
