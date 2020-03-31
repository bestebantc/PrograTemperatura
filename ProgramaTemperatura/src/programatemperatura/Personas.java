/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programatemperatura;

public class Personas {
    public String Nombre;
    public String Parentesco;
    public int Edad;
    public Personas(String _Nombre,String _Parentesco,int _Edad ){
        this.Nombre=_Nombre;
        this.Parentesco=_Parentesco;
        this.Edad=_Edad;
    }
    public String MostrarResultados(){
    String Cadena1="El Nombre De la persona es "+Nombre+"; El Parentesco es "+Parentesco+"; Tiene una edad de "+Edad+" Años";
    return Cadena1;

}
}

