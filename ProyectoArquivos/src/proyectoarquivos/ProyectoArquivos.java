package proyectoarquivos;

import java.io.File;

public class ProyectoArquivos {

    public static void main(String[] args) {

        Archivo archivo1 = new Archivo();
        Archivo2 archivo2 = new Archivo2();
        File myFile;

        //metodo del ejercicio 1
        archivo1.isADirectory(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos"));

        //metodo del ejercicio 2
        archivo1.isAFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/ProyectoArquivos/manifest.mf"));

        //metodo del ejercicio 3
        archivo1.createDirectory(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/DirectorioPrueba"));

        //metodo del ejercicio 4
        archivo1.createEmptyFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/DirectorioPrueba/archivoPrueba.txt"));

        //metodo del ejercicio5
        archivo1.accessMode(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/DirectorioPrueba/archivoPrueba.txt"));

        //metodo del ejercicio 6
        archivo1.calculateLength(myFile = new File("/home/dam/Descargas/arquivos"));

        //metodo del ejercicio 7
        archivo1.mRead(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/DirectorioPrueba/archivoPrueba.txt"));

        //metodo del ejercicio 8
        archivo1.mWrite(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/DirectorioPrueba/archivoPrueba.txt"));

        //metodo del ejercicio 9
        archivo1.deleteFile(myFile = new File("/home/dam/Descargas/archivoBorrar.txt"));

        //metodo del ejercicio 10
        archivo1.deleteDirectory(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/DirectorioBorrar"));

        //metodo del ejercicio 11
        archivo1.mContent(myFile = new File("/home/dam/Desktop/DAM2"));

        //metodo del ejercicio 12
        archivo1.recur(myFile = new File("/home/dam/Desktop/DAM2"));

        //----------------------------------------------------------X---------------------//
        //segunda parte de los ejercicios
        //metodo del ejercicio 1
        archivo2.createDirectory(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir"));

        //metodo del ejercicio 2
        archivo2.createFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir/Productos.txt"));

        //metodo del ejercicio 3
        archivo2.createDirectoryAndFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir/subdir"),
                myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir/subdir/Productos2.txt"));

        //metodo del ejercicio 4
        archivo2.readFiles(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir"));
        
        //metodo del ejercicio 5
        archivo2.infoFirstFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir/Productos.txt"));
        
        //metodo del ejercicio 6
        archivo2.setOnlyReadFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir/Productos.txt"));
        
        //metodo del ejercicio 7
        archivo2.setWriteFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir/Productos.txt"));
        
        //metodo del ejercicio 8
        archivo2.deleteFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir/Productos.txt"));
        
        //metodo del ejercicio 9
        archivo2.deleteAll(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir"));
        
        //metodo del ejercicio 10
        archivo2.infoDirectory(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/Arquivos/arquivosdir"));
        
        
        
        

    }

}
