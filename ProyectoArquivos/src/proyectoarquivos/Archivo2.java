package proyectoarquivos;

import java.io.File;
import java.io.IOException;

public class Archivo2 {

    Archivo archivoMetodos = new Archivo();

    /**
     * metodo del ejercicio 1 para crear un directorio y confirmarlo
     *
     * @param myDirectory la ruta que pasamos por parametro
     */
    public void createDirectory(File myDirectory) {

        //se crea el directorio
        if (myDirectory.mkdir()) {

            //lo confirmamos
            
            if (archivoMetodos.isADirectory(myDirectory)) {

                System.out.println("Directorio creado y confirmado con éxito");
            } else {
                System.out.println("El archivo no es un directorio");
            }

        } else {
            System.out.println("No se pudo crear el directorio");
        }

    }

    /**
     * metodo del ejercicio 2 para crear el archivo en la ruta especificada
     *
     * @param myFile nombre del archivo que le vamos a pasar por parametro
     */
    public void createFile(File myFile) {

        try {
            //lo creamos y verificamos que es un archivo
            if (myFile.createNewFile()) {

                if (archivoMetodos.isAFile(myFile)) {

                    System.out.println("Archivo creado con exito y confirmado");
                } else {
                    System.out.println("No es un archivo");
                }
            }
        } catch (IOException e) {
            System.out.println("Vaya, se ha producido un error a la hora de crear el archivo");
            e.printStackTrace();
        }

    }

    /**
     * metodo del ejercicio 3 para crear un directorio con un fichero dentro de
     * el
     *
     * @param directory directorio a crear
     * @param file2 archivo dentro del directorio
     */
    public void createDirectoryAndFile(File directory, File file2) {

        String path = "/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir";
        File file = new File(path);

        //verificamos que existe para crearlo
        if (file.exists() && file.isDirectory()) {

            if (directory.mkdir()) {

                System.out.println("subdirectorio creado con exito");

                try {
                    if (file2.createNewFile()) {

                        System.out.println("fichero creado en el subdirectorio con exito");

                    } else {
                        System.out.println("Fichero creado anteriormente");
                    }
                } catch (IOException e) {
                    System.out.println("No se pudo crear el fichero");
                    e.printStackTrace();
                }

            } else {
                System.out.println("Directorio creado anteriormente");
            }
        }

    }

    /**
     * Metodo del ejercicio 4 para leer los archivos y ficheros de un directorio
     *
     * @param readFile la ruta del archivo que le pasemos
     */
    public void readFiles(File readFile) {

        //verificamos que existe antes de leerlos
        if (readFile.exists() && readFile.isDirectory()) {

            File[] arrayFile = readFile.listFiles();

            for (File file : arrayFile) {

                System.out.println("Nombre de los archivos: " + file.getName());
            }
        } else {
            System.out.println("Este directorio no existe");
        }
    }

    /**
     * Metodo del ejercicio 5 para saber si un archuvo se puede leer, escribir y
     * la cantidad que bytes
     *
     * @param infoFile
     */
    public void infoFirstFile(File infoFile) {

        //comprobamos que existe y comprobamos si se puede leeer, escribir y el numero de bytes
        if (infoFile.exists() && infoFile.isFile()) {

            if (infoFile.canWrite()) {

                System.out.println("Se puede escribir en el fichero");
            } else {
                System.out.println("No se puede escribir en el");
            }

            if (infoFile.canRead()) {

                System.out.println("Se puede leer el fichero");
            } else {
                System.out.println("No se puede leer el fichero");
            }

            long lengthFile = infoFile.length();
            System.out.println("La cantidad de bytes del archivo es de: " + lengthFile + " bytes");

        }

    }

    /**
     * Metodo del ejercicio 6 en el que cambiam os un archivo a solo lectura
     *
     * @param readFile el archivo que le pasamos por parametro
     */
    public void setOnlyReadFile(File readFile) {

        //comprobamos que existe y lo cambiamos a solo lectura
        if (readFile.exists() && readFile.isFile()) {
            if (readFile.setReadOnly()) {
                System.out.println("El archivo es de solo lectura");
            } else {
                System.out.println("No se pudo establecer el archivo como solo lectura. Verifica los permisos.");
            }
        } else {
            System.out.println("No se encontró el archivo o no es un archivo regular.");
        }

    }
    
    /**
     * Metodo del ejercicio 6 en el que cambiamos el archivo para que se pueda escribir
     *
     * @param writeFile el archivo que le pasamos por parametro
     */
    public void setWriteFile(File writeFile) {

        //comprobamos que existe y lo cambiamos a solo lectura
        if (writeFile.exists() && writeFile.isFile()) {
            if (writeFile.setWritable(true)) {
                System.out.println("El archivoahora vuelve a ser de escritura");
            } else {
                System.out.println("No se pudo establecer el archivo para escribir. Verifica los permisos.");
            }
        } else {
            System.out.println("No se encontró el archivo o no es un archivo regular.");
        }

    }
    
    /**
     * Metodo del ejercicio 8 para borrar un archivo
     * @param deleteFile el archivo que le pasamos por parametro
     */
    public void deleteFile(File deleteFile){
        
        //comprobamos que existe y lo borramos
        if(deleteFile.exists() && deleteFile.isFile()){
            
            
            if(deleteFile.delete()){
                System.out.println("Archivo borrado con éxito");
            }
            else{
                System.out.println("No se puede borrar el archivo");
            }
        }
        else{
            System.out.println("No se puede borrar el archivo, ya fue borrado previamente o no existe");
        }
        
    }
    
    /**
     * Metodo para borrar los directorios y archivos creados anteriormente
     * @param pathDirectory la ruta del directorio
     */
    public void deleteAll(File pathDirectory){
        
        //Este metodo me ayudo un poco chatgpt ya que no se emplear bien la recursividad
        if(pathDirectory.exists() && pathDirectory.isDirectory()){
              File[] archivos = pathDirectory.listFiles();

        // Verificamos que no sea null (por si hay problemas de permisos)
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    deleteAll(archivo);
                }
                if (archivo.delete()) {
                    System.out.println("Archivo o directorio borrado: " + archivo.getAbsolutePath());
                } else {
                    System.out.println("No se pudo borrar: " + archivo.getAbsolutePath());
                }
            }
        }
        }
      
    }
    
    /**
     * Metodo para obtener la información de los directorios creados anteriormente
     * @param pathDirectory ruta del directorio del cual queremos saber informacion 
     */
    public void infoDirectory(File pathDirectory){
        
        //Verificamos que existe y llamamos al metodo
        if(pathDirectory.exists() && pathDirectory.isDirectory()){
            
            archivoMetodos.recur(pathDirectory);
        }
        else{
            System.out.println("No existe el directorio");
        }
    }
    
}

