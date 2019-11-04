/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobicicletas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
public class AccesoFichero {
private static String ruta="C:\\LUIS\\BICICLETAS\\";
private static String fichero_csv="accidentes.csv";
private static String fichero_html="accidentes.html";

    static ArrayList<Accidente> devolverAccidentes() {
       ArrayList<Accidente> lista_accidentes=new ArrayList<>();
    try {
        FileReader fr=new FileReader(ruta+fichero_csv);
        BufferedReader br=new BufferedReader(fr);
        String linea=br.readLine();//Est aprimera línea no contiene datos, solo los nombres de los campos
        linea=br.readLine();
        while(linea!=null)
        {
            linea=linea.replace(";;;", ";-;-;");
            linea=linea.replace(";;", ";-;");
            
            String[] datos=linea.split(";");
            
            if (datos.length>=13)
            {
                        String fecha=datos[1];
                        String hora=datos[2];
                        String distrito=datos[5];
                        String tipo_accidente=datos[6];
                        String tipo_persona=datos[9];
                        String rango_edad=datos[10]; 
                        String sexo=datos[11];
                        //(String fecha, String hora, String distrito, String tipo_accidente, String tipo_persona, String rango_edad, String sexo) {
                        
                        Accidente a=new Accidente(fecha, hora,distrito,  tipo_accidente, tipo_persona, rango_edad, sexo);
                        lista_accidentes.add(a);
            }
            else
            {
                System.out.println("Problema en la linea: "+linea);
            }
            linea=br.readLine();
        }
        
        
            }   
             catch (FileNotFoundException ex) {
                Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (IOException ex) {
                Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        return lista_accidentes;
    }
    public static void grabarTabla(String html_tabla)
    {
    try {
        FileWriter fw=new FileWriter(ruta+fichero_html);
        fw.write(html_tabla);
        fw.close();
    } catch (IOException ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
}
