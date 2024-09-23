package proyectoarquivos;

import java.io.File;
import java.io.IOException;

public class Archivo {

    /**
     * Metodo para comprobar si un directorio es o no es valido ejercicio1
     *
     * @return true o false
     */
    public boolean isADirectory(File file1) {

        boolean marca = false;

        //comprobamos si es un directorio
        if (file1.isDirectory()) {
            System.out.println("Este es un directorio");
            marca = true;
        } else {
            System.out.println("No es un directorio");
        }

        //nos devuelve si es o no directorio
        return marca;
    }

    /*
    * Metodo del ejercicio 2 para saber si un archivo es o no es archivo
    * @param el objeto de tipo File
    * return un booleano que nos dará true o false
     */
    public boolean isAFile(File myFile) {

        boolean marca = false;

        //comprobamos si es un archivo
        if (myFile.isFile()) {

            System.out.println("Este es un fichero");
            marca = true;
        } else {
            System.out.println("No es un archivo");
        }

        // nos devuelve true o false si es o no archivo
        return marca;
    }

    /**
     * Metodo del ejercicio 3 para crear un directorio
     *
     * @param directory que se pasa por parametro
     * @return true si se creó o false si no se creó
     */
    public boolean createDirectory(File directory) {

        boolean marca = false;

        // comprobamos si se creó el directorio
        if (directory.mkdir()) {
            System.out.println("Sen ha creado un directorio con exito");
            marca = true;
        } else {
            System.out.println("No se ha creado el directorio");

        }
        return marca;
    }

    /**
     * metodo del ejercicio 4 para crear un fichero en un directorio existente
     *
     * @param newFile fichero que vamos a pasarle por parametro
     * @return true si lo ha creado o false si no lo ha creado
     */
    public boolean createEmptyFile(File newFile) {

        boolean marca = false;

        try {

            //comprobamos si se creó el fichero
            if (newFile.createNewFile()) {

                System.out.println("El fichero se ha creado con éxito");
                marca = true;
            } else {
                System.out.println("El fichero no se ha creado");

            }
        } catch (IOException e) {
            System.out.println("No se pudo crear el fichero");
            e.printStackTrace();
        }

        return marca;
    }

    /**
     * Metodo del ejercicio 5 para saber si se puede escribir y leer en un
     * fichero
     *
     * @param newFile el archivo pasado por parametro
     */
    public void accessMode(File newFile) {

        //comprobamos si se puede leer
        if (newFile.canRead()) {
            System.out.println("Se puede leer el fichero");
        } else {
            System.out.println("No Se puede leer el fichero");
        }

        //comprobamos si se puede escribir
        if (newFile.canWrite()) {

            System.out.println("Se puede escribir en el fichero");

        } else {
            System.out.println("No se puede escribir en el fichero");

        }
    }

    /**
     * Metodo del ejercicio 6 para saber la cantidad de bytes de un archivo
     *
     * @param newFile el archivo pasado por parametro
     */
    public void calculateLength(File newFile) {

        //comprobamos si existe y si es un archivo
        if (newFile.exists() && newFile.isFile()) {

            long numBytes = newFile.length();

            System.out.println("El numero de bytes del archivo es de: " + numBytes);
        } else {
            System.out.println("No se encontró el archivo");

        }

    }

    /**
     * Metodo del ejercicio 7 para convertir un archivo a solo lectura
     *
     * @param readFile el archivo que le vamos a pasar por parametro
     */
    public boolean mRead(File readFile) {
        // Comprobamos si existe el archivo y es un archivo regular
        if (readFile.exists() && readFile.isFile()) {

            // Intentamos cambiarlo a solo lectura
            if (readFile.setReadOnly()) {
                System.out.println("El archivo es de solo lectura");
                return true;
            } else {
                System.out.println("No se pudo establecer el archivo como solo lectura. Verifica los permisos.");
                return false;
            }
        } else {
            System.out.println("No se encontró el archivo o no es un archivo regular.");
            return false;
        }
    }

    /**
     * metodo del ejercicio 8 para hacer que se pueda escribir en un archivo
     *
     * @param writeFile objeto de tipo File que le pasamos por parametro
     * @return true o false si se escribio o no
     */
    public boolean mWrite(File writeFile) {

        // Comprobamos si existe el archivo y es un archivo regular
        if (writeFile.exists() && writeFile.isFile()) {

            // Intentamos cambiarlo a poder escribir en el
            if (writeFile.setWritable(true)) {
                System.out.println("Se puede escribir en el archivo");
                return true;
            } else {
                System.out.println("No se pudo establecer el archivo para escribir en el.");
                return false;
            }
        } else {
            System.out.println("No se encontró el archivo.");
            return false;
        }
    }

    /**
     * metodo del ejercicio 9 para borrar un fichero
     *
     * @param myFile el fichero que queremos borrar
     */
    public void deleteFile(File myFile) {

        //comprobamos que existe y lo borramos
        if (myFile.exists() && myFile.isFile()) {

            if (myFile.delete()) {

                System.out.println("Fichero borrado con éxito");
            }

        } else {
            System.out.println("Fichero borrado previamente o no existe");
        }

    }

    /**
     * metodo del ejercicio 10 para borrar directorio
     *
     * @param myDirectory la ruta que le vamos a pasar por parametro
     */
    public void deleteDirectory(File myDirectory) {

        //comprobamos que existe y lo borramos
        if (myDirectory.exists() && myDirectory.isDirectory()) {

            if (myDirectory.delete()) {

                System.out.println("Directorio borrado con éxito");
            }
        } else {
            System.out.println("Directorio borrado previamente o inexistente");
        }

    }

    /**
     * metodo del ejercicio 11 para mostrar archivos y directorios de una ruta
     * dada
     *
     * @param myFile el objeto que le vamos a pasar por parametro
     */
    public void mContent(File myFile) {

        //comprobamos si existe y lo recorremos con un array
        if (myFile.exists() && myFile.isDirectory()) {

            File arrayFile[] = myFile.listFiles();

            for (File allFile : arrayFile) {

                System.out.println(allFile.getName());
            }
        } else {
            System.out.println("No se encuentra el directorio");
        }

    }

    /**
     * metodo del ejercicio 12 para mostrar archivos y directorios de una ruta
     * dada
     *
     * @param myFile el objeto que le vamos a pasar por parametro
     */
    public void recur(File myFile) {
        if (myFile.isDirectory()) {
            
            File[] listaArchivos = myFile.listFiles();

            if (listaArchivos != null) {
                for (File archivo : listaArchivos) {
                    if (archivo.isDirectory()) {
                        System.out.println(archivo.getName() + " (Directorio)");
                        recur(archivo);
                    } else {
                        System.out.println(archivo.getName() + " (Archivo)");
                    }
                }
            } else {
                System.out.println("No se puede acceder al directorio: " + myFile.getAbsolutePath());
            }
        } else {
            System.out.println(myFile.getAbsolutePath() + " no es un directorio.");
        }
    }

}
