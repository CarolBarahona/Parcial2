package Modelo;
import mercadogestion.Lista;
import org.json.JSONArray;
 import supabase.Supabase;
/**
 *
 * @author barah
 */
public class Metodos {
    static Supabase Tabla;
    public static void conexion (){
        Tabla = new Supabase("https://pjhvcxnmakrrzbehrcqg.supabase.co/","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InBqaHZjeG5tYWtycnpiZWhyY3FnIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjM4MzkyMTQsImV4cCI6MjAzOTQxNTIxNH0.mA4pgut8OabEs1mfwDorUQDnnMt0RSyZx9fSAXJnozs");
    }
    
    
   public static JSONArray ObtenerInf(String tipo, String nombre, String cantidad){
         
      conexion();
      Lista lista1 []= new Lista[1];
      lista1 [0]= new Lista (tipo, nombre, cantidad);
       JSONArray Carac =new JSONArray (lista1);
       System.out.println(Carac.toString());
       Tabla.from("Menu_comida").insert(Carac);
      return Carac; 
    } 
}
