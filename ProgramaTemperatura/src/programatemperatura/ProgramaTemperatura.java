/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programatemperatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ProgramaTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String c= "s",Nombre,Parentesco;
        int op, Edad;
        Scanner Leer= new Scanner(System.in);
        List<Personas> lista=new ArrayList<>();
        Vector<Float> Tempersona = new Vector<>();
        Vector<Integer> vecDueno = new Vector<>();
        Temperatura grados = new Temperatura();
        while (c.equals("s")||c.equals("s"))
                {
                    System.out.println(" Menu de Opciones: ");
                    System.out.println("1...Agregar Personas");
                    System.out.println("2...Mostrar Personas");
                    System.out.println("4...Ingresar Temperatura");
                    System.out.println("3...Salir del Programa");
                    op=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite La Opcion a Usar"));
                    switch (op){
                        case 1:
                            //System.out.println("Entro");
                            int cop=0;
                            Nombre=JOptionPane.showInputDialog(null,"Digite El Nombre");
                            Parentesco=JOptionPane.showInputDialog(null,"Digite El parentesco");
                            Edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite La Edad"));
                            /*Crear una Pila para cada Integrante.
                            Crear clase?o pila?
                            Stack Temperaturarxpersona=new Stack();??
                            List<Temp> lista1=new ArrayList<>();*/
                            lista.add(new Personas(Nombre,Parentesco,Edad));
                            System.out.println("Se Creo la Persona");
                            Stack nuevaPila=new Stack();
                            cop++;
                            
                            break;
                        case 2:
                            int co=0;
                             if(lista.size() < 1)
                        System.out.println("No hay personas registradas");
                    else{
                            for (Personas e :lista  ){
                                co++;
                                System.out.println("Persona Registrada #"+co);
                                System.out.println(e.MostrarResultados());
                                System.out.println(" ");
                            }
                             }
                            break;
                        case 3:
                            c="n";
                            break;
                        case 4:
                            if(lista.size() < 1)
                        System.out.println("No hay personas registradas");
                    else{
                                for(int i=0;i<lista.size();i++){
                        System.out.println((i+1)+". "+lista.get(i).Nombre);
                    }
                     int numper = Integer.parseInt(JOptionPane.showInputDialog(" Seleccione el numero de la persona: "));
                     vecDueno.add(numper);
                     Tempersona.add(grados.ingresoTemp());
                            }
                            break;
                        case 5:
                            if(lista.size() < 1)
                        System.out.println("No hay personas registradas");
                    else{
                                
                            }
                            break;    
                    }
                    
                }

    }
    
}
