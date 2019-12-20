/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1parte3;

/**
 *
 * @author Yashin
 */
public class Computador {
    protected String procesador;
    protected String memoriaRAM;
    protected String tipoDD; //discoduro
    protected int capacidadDD;
    protected String marcaMotherboard;
    protected boolean tarjetaVideo;
    protected String marcaTv; //tarjeta video
    protected boolean lectorCD;
    protected String sistemaOperativo;

    //CONSTRUCTORES
    public Computador(){}
    
    public Computador(String nombre){
        this.procesador = nombre; 
    }
    public Computador (String nombre, String RAM){
        this.procesador = nombre;
        this.memoriaRAM= RAM;
    }
    public Computador (String nombre, String RAM, String DD){
        this.procesador = nombre;
        this.memoriaRAM= RAM;
        this.tipoDD = DD;
    }
    public Computador (String nombre, String RAM, String DD, int capacidad){
        this.procesador = nombre;
        this.memoriaRAM= RAM;
        this.tipoDD = DD;
        this.capacidadDD = capacidad;
    }
    public Computador (String nombre, String RAM, String DD, int capacidad, String tarjeta){
        this.procesador = nombre;
        this.memoriaRAM= RAM;
        this.tipoDD = DD;
        this.capacidadDD = capacidad;
        this.marcaMotherboard = tarjeta;
    }
    
    //*************************************************
    //ACCESO A LAS VARIABLES PROTEGIDAS DE LA CLASE
    
    //************************************
    public void setProcesador(String nombre) {
        this.procesador=nombre;
    }

    public String getProcesador() {
        return this.procesador;
    }

    //************************************
    public void setRAM(String RAM) {
       this.memoriaRAM=RAM;
    }

    public String getRAM() {
        return this.memoriaRAM;
    }

    //************************************
    public void setDD(String DD) {
        this.tipoDD=DD;
    }

    public String getDD() {
       return this.tipoDD;
    }
    
    //************************************
    public void setCapacidad (int Capacidad ){
        this.capacidadDD=Capacidad ;
    }
    
    public int getCapacidad(){
        return this.capacidadDD;
    }
    
    //************************************
    public void SetMarca (String Marca){
        this.marcaMotherboard=Marca;
    }
    
    public String getMarca(){
        return this.marcaMotherboard;
    }
    
    //************************************
    public void Settarjeta (boolean respuesta){
        this.tarjetaVideo=respuesta;
    }
    
    public boolean getTarjeta(){
        return this.tarjetaVideo;
    }
    //************************************
    public void SetMarcaTV (String Marca){
        this.marcaTv=Marca;
    }
    
    public String getMarcaTV(){
        return this.marcaTv;
    }
    
    //************************************
    public void SetLector (boolean respuesta){
        this.lectorCD=respuesta;
    }
    
    public boolean getLector(){
        return this.lectorCD;
    }
    
    //************************************
    public void SetOperativo (String SO){
        this.sistemaOperativo=SO;
    }
    
    public String getOperativo(){
        return this.sistemaOperativo;
    }
}
