/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emptystack;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;


public class IDE extends javax.swing.JFrame {
    NumeroLinea numerolinea;
    Directorio dir;

    
    public IDE() {
        initComponents();
        inicializar();
    }
    
   
    
     
     
    private void inicializar(){
        dir =new Directorio();
        //Titulo de la aplicacion
        setTitle("Compilador Yoel Nunez 2-17-0171");
        String[] options = new String []{"Guardar y continuar"," Descargar"};
        
        //Visualiar el numerode lineas en el Jpane
        numerolinea =new NumeroLinea(jtpCode);
        jScrollPane1.setRowHeaderView(numerolinea);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnIdentifiers = new javax.swing.JButton();
        btnCompilar = new javax.swing.JButton();
        btnReserved = new javax.swing.JButton();
        btnTokens = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaCompile = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1390, 690));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/Icon/icons8_save_48px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/pressed/icons8_save_48px_p.png"))); // NOI18N
        btnGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/On Layer/icons8_save_48px_on.png"))); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/Icon/icons8_opened_folder_48px.png"))); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/pressed/icons8_opened_folder_48px_P.png"))); // NOI18N
        btnAbrir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/On Layer/icons8_opened_folder_48px_ON.png"))); // NOI18N
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/Icon/icons8_code_file_48px.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("Nuevo Documento");
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/pressed/icons8_code_file_48px_p.png"))); // NOI18N
        btnNuevo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/On Layer/icons8_code_file_48px_on.png"))); // NOI18N
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnIdentifiers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/Icon/icons8-text-cursor-48.png"))); // NOI18N
        btnIdentifiers.setText("Ident");
        btnIdentifiers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIdentifiers.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/pressed/icons8-text-cursor-48.png"))); // NOI18N
        btnIdentifiers.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/On Layer/icons8-text-cursor-48.png"))); // NOI18N
        btnIdentifiers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/Icon/icons8_code_48px.png"))); // NOI18N
        btnCompilar.setText("Compilar");
        btnCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompilar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/pressed/icons8_code_48px_p.png"))); // NOI18N
        btnCompilar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/On Layer/icons8_code_48px_on.png"))); // NOI18N
        btnCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        btnReserved.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/Icon/icons8-text-color-48.png"))); // NOI18N
        btnReserved.setText("Reservadas");
        btnReserved.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReserved.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/pressed/icons8-text-color-48.png"))); // NOI18N
        btnReserved.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/On Layer/icons8-text-color-48.png"))); // NOI18N
        btnReserved.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnTokens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/Icon/icons8-index-48.png"))); // NOI18N
        btnTokens.setText("Tokens");
        btnTokens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTokens.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/pressed/icons8-index-48.png"))); // NOI18N
        btnTokens.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/emptystack/iconos/On Layer/icons8-index-48.png"))); // NOI18N
        btnTokens.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jtpCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtpCodeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtpCode);

        jtaCompile.setColumns(20);
        jtaCompile.setRows(5);
        jScrollPane2.setViewportView(jtaCompile);

        jLabel1.setText("Area de Programacion");

        jLabel2.setText("Consola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnReserved, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnTokens, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1249, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel1))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReserved, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTokens, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        jtaCompile.setText("");
        dir.Nuevo(this);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        dir.Guardar(this);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        dir.Abrir(this);
        clearAllComp();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void jtpCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtpCodeKeyReleased
        int keyCode =evt.getKeyCode();
        if((keyCode>=65 && keyCode <=90 ) || (keyCode >=48 && keyCode <=57)
                || (keyCode>=97 && keyCode <=122 ) || (keyCode !=27 && !(keyCode >=37
                && keyCode <=40) && !(keyCode >=16
                && keyCode <=18) && keyCode !=524
                && keyCode !=20)){
        
        if(!getTitle().contains("*")){
            setTitle(getTitle()+"*");
        }
    }
    }//GEN-LAST:event_jtpCodeKeyReleased

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(jtpCode.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            
        }
        
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    jtaCompile.setText(resultado);
                    return;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Simbolo no definido\n";
                        break;
                    case Identificador: case Numero: case Reservadas:
                        resultado += lexer.lexeme + ": Es un " + tokens + "\n";
                        break;
                    default:
                        resultado += "Token: " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
           
        }
    }//GEN-LAST:event_btnCompilarActionPerformed

          
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);                
            }
        });
    }
    
   
    
    //Lismpiar antes de cualquier metodo (Viene de la clase directorio)
    public void clearAllComp(){
        jtaCompile.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIdentifiers;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReserved;
    private javax.swing.JButton btnTokens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaCompile;
    public javax.swing.JTextPane jtpCode;
    // End of variables declaration//GEN-END:variables

   
}
