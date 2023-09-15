package Logins;

import java.io.*;
import javax.swing.JOptionPane;

public class PreguntasRandom {

    static RandomAccessFile flujo;
    private static int numeroRegistros;
    static int tamañoRegistro = 1000;

    public static void crearFilePreguntas(java.io.File archivo) throws IOException {
        if (archivo.exists() && !archivo.isFile()) {
            throw new IOException(archivo.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(archivo, "rw");
        numeroRegistros = (int) Math.ceil(
                (double) flujo.length() / (double) tamañoRegistro);
    }

    public static void cerrar() throws IOException {
        flujo.close();
    }

    public static boolean setPregunta(int i, Preguntas pregunta) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            if(pregunta.getTamaño() > tamañoRegistro) {
                System.out.println("\nTamaño de registro excedido.");
            } else {
                flujo.seek(i*tamañoRegistro);
                flujo.writeUTF(pregunta.getUnidad());
                flujo.writeUTF(pregunta.getTema());
                flujo.writeUTF(pregunta.getSubTema());
                flujo.writeUTF(pregunta.getNum());
                flujo.writeUTF(pregunta.getPregunta());
                flujo.writeUTF(pregunta.getRes1());
                flujo.writeUTF(pregunta.getRes2());
                flujo.writeUTF(pregunta.getRes3());
                flujo.writeUTF(pregunta.getRes());
                return true;
            }
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
        }
        return false;
    }

    //private static int buscarRegistroInactivo() throws IOException {
    //    String nombre;
    //    for(int i=0; i<getNumeroRegistros(); i++) 
    //    {
    //        flujo.seek(i * tamañoRegistro);
    //        if(!getPersona(i).isActivo()) 
     //           return i;
      //  }
    //    return -1;        
   // }
    
    //public static boolean eliminarPersona(String aEliminar) throws IOException {
    //    int pos = buscarRegistro(aEliminar);
   ////     if(pos == -1) return false;
    //    Preguntas preguntaEliminada = getPregunta(pos);
  //      preguntaEliminada.setActivo(false);
   //     setPregunta(pos, preguntaEliminada);
   //     return true;
  //  }
    
    //public static void compactarArchivo(java.io.File archivo1) throws IOException {
    //    crearFilePreguntas(archivo1); // Abrimos el flujo.
      //  Preguntas[] listado = new Preguntas[numeroRegistros];
        //for(int i=0; i<numeroRegistros; ++i)
          //  listado[i] = getPregunta(i);
        //cerrar(); // Cerramos el flujo.
        //archivo.delete(); // Borramos el archivo.

        //File tempo = new File("temporal.dat");
      //  crearFileAlumno(tempo); // Como no existe se crea.
      //  for(Persona p : listado)
     //       if(p.isActivo())
     //           añadirPersona(p);
    //    cerrar();
        
    //    tempo.renameTo(archivo); // Renombramos.
  //  }
    
   public static void añadirPregunta(Preguntas pregunta) throws IOException {
    
        if(setPregunta(numeroRegistros, pregunta)) 
            numeroRegistros++;        
    }

    public static int getNumeroRegistros() {
              
        return numeroRegistros;
    }

    public static Preguntas getPregunta(int i) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            flujo.seek(i * tamañoRegistro);
           
                 
            return new Preguntas(flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF());
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
    }
    public static void mostrar() throws IOException{//aqui se lee todo el archivo esto si funciona
        String Unidad,SubTema,tema,num,Pregunta,Res1,Res2,Res3,Res;
        for(int i=0; i<getNumeroRegistros(); i++){
            flujo.seek(i*tamañoRegistro);
            tema=flujo.readUTF();
            SubTema=flujo.readUTF();
            num=flujo.readUTF();
            Unidad=flujo.readUTF();
            Pregunta=flujo.readUTF();
            Res1=flujo.readUTF();
            Res2=flujo.readUTF();    
            Res3=flujo.readUTF();
            Res=flujo.readUTF();
           JOptionPane.showMessageDialog(null,"Pregunta Agregada");
            //JOptionPane.showMessageDialog(null,":Unidad "+Unidad+"tema"+tema+ "Num pre: "+num+" Pregunta "+Pregunta+"\n Respuesta1 "+Res1+" Respuesta2 "+Res2+" Respuesta3 "+Res3+"\n Respuesta "+Res);
        }
    }
    public static void Pregunta() throws IOException{
    String Unidad,SubTema,tema,num,Pregunta,Res1,Res2,Res3,Res;
     int numero;
            numero = (int) (Math.random() * 2) ;
          flujo.seek(numero*tamañoRegistro);
          Unidad=flujo.readUTF();
          tema=flujo.readUTF();
          SubTema=flujo.readUTF();
           num=flujo.readUTF();
            Pregunta=flujo.readUTF();
            Res1=flujo.readUTF();
            Res2=flujo.readUTF();    
            Res3=flujo.readUTF();
            Res=flujo.readUTF();
    

    }

   public static int buscarRegistro(String buscado) throws IOException {
      String p;
       if (buscado == null) {                           
           return -1;
        }else{
       for(int i=0; i<getNumeroRegistros(); i++) {
           flujo.seek(i * tamañoRegistro);
            p = getPregunta(i).getNum();
            if(p.equals(buscado)) {
                return i;
           }
       }
       }
        return -1;
    }
    
}