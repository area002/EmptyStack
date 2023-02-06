/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emptystack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author pc
 */
public class Principal {
    
    public static void main(String[] args) throws Exception {
        String ruta = "C:/Proyectos/EmptyStack/src/emptystack/Lexer.flex";
        String ruta2 = "C:/Proyectos/EmptyStack/src/emptystack/LexerCup.flex";
        String [] rutaS= {"-parser" , "Sintax","C:/Proyectos/EmptyStack/src/emptystack/Sintax.cup"};
//        generarLexers(ruta, ruta2, rutaS);
    }
    public static void generarLexers(String ruta,String ruta2, String [] rutaS ) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta);
        JFlex.Main.generate(archivo);
         archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
       Path rutaSym = Paths.get("C:/Proyectos/EmptyStack/src/emptystack/src/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Proyectos/EmptyStack/sym.java"), 
                Paths.get("C:/Proyectos/EmptyStack/src/emptystack/src/sym.java")
        );
        Path rutaSin = Paths.get("C:/Proyectos/EmptyStack/src/emptystack/src/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Proyectos/EmptyStack/Syntax.java"), 
                Paths.get("C:/Proyectos/EmptyStack/src/emptystack/src/Sintax.java")
        );
        
    }
    
    
}
