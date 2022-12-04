/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import cine.controlCine;


import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.Objects;

/**
 *
 * @author user
 */
public class frame extends javax.swing.JFrame {
    
    /**
     * Creates new form frame
     */
    public frame() {
        initComponents();
        this.setLocationRelativeTo(null); //para que cuando corra, el frame apareza al centro de la pantalla
    }
    controlCine oSala;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombreSala = new javax.swing.JLabel();
        NombreSala = new javax.swing.JTextField();
        jLabelNumAsientos = new javax.swing.JLabel();
        NumAsientos = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        CrearSala = new javax.swing.JButton();
        jLabelSala = new javax.swing.JLabel();
        jComboBoxSala = new javax.swing.JComboBox<>();
        jLabelBoletosVendidos = new javax.swing.JLabel();
        BoletosVendidos = new javax.swing.JTextField();
        obtnerImporteTotal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreSala.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombreSala.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabelNombreSala.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreSala.setText("Nombre sala :");
        jPanel1.add(jLabelNombreSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 86, -1, 28));

        NombreSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreSalaActionPerformed(evt);
            }
        });
        jPanel1.add(NombreSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 89, 110, -1));

        jLabelNumAsientos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabelNumAsientos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumAsientos.setText("Número de asientos :");
        jPanel1.add(jLabelNumAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 120, -1, 28));
        jPanel1.add(NumAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 123, 90, -1));

        jLabelPrecio.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("Precio entrada :");
        jPanel1.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 154, 111, 28));

        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 157, 80, -1));

        CrearSala.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        CrearSala.setText("Crear Sala");
        CrearSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearSalaActionPerformed(evt);
            }
        });
        jPanel1.add(CrearSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 188, 334, -1));

        jLabelSala.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabelSala.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSala.setText("Sala");
        jPanel1.add(jLabelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 40, 30));

        jComboBoxSala.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jComboBoxSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Sala" }));
        jComboBoxSala.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSalaItemStateChanged(evt);
            }
        });
        jComboBoxSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSalaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 126, 24));

        jLabelBoletosVendidos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabelBoletosVendidos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBoletosVendidos.setText("Boletos vendidos");
        jPanel1.add(jLabelBoletosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 111, -1));

        BoletosVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoletosVendidosActionPerformed(evt);
            }
        });
        jPanel1.add(BoletosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 70, 30));

        obtnerImporteTotal.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        obtnerImporteTotal.setText("Vender");
        obtnerImporteTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtnerImporteTotalActionPerformed(evt);
            }
        });
        jPanel1.add(obtnerImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 386, 105, 37));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 311, 205, 132));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 90, 32));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel2.setText("UTP JAVA CINE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 45));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel3.setText("VENTA DE ENTRADAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/CintaCine.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 380, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/LogoCanchita.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 210, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 470));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sala", "Bol. vendidos", "Precio", "Ganancia"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 340, 270));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setText("ESTADO DE LAS SALAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 260, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/Personas.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 60, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/FondoAsientos.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 400, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int contador = 0;
    private void CrearSalaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CrearSalaActionPerformed

        //si el boton ha sido ejecutado mas de una vez, ya no ejecutar la funcion controlCine():

        if (contador == 0) {
            oSala = new controlCine();
            contador++;
        }
        
        //agregando nombre de sala al combobox
        jComboBoxSala.addItem(NombreSala.getText());

        //instanciando la clase cCine dando como parametros los valores de los campos de texto:
        oSala.crearSalaCine(
            NombreSala.getText(),
            Integer.parseInt(NumAsientos.getText()),
            Double.parseDouble(Precio.getText())
        );

        //comprobando que se haya creado la sala:
        System.out.println(oSala.obtenerSalaCineNombre(NombreSala.getText()));

        //añadiendo a jTable1 ordenadamente el nombre de sala y cantidad de asientos vendidos:
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{NombreSala.getText(), 
            BoletosVendidos.getText(),Precio.getText(),
            });
        

        //limpiando los campos de texto:
        NombreSala.setText("");
        NumAsientos.setText("");
        Precio.setText("");

       

    }//GEN-LAST:event_CrearSalaActionPerformed

    private void BoletosVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoletosVendidosActionPerformed


    }//GEN-LAST:event_BoletosVendidosActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioActionPerformed

    private void obtnerImporteTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtnerImporteTotalActionPerformed

        
        
        //obtner el valor del combobox
        //TIPADO FUERTE! DEJAR COMO RECORDATORIO: String nombreSala = Objects.requireNonNull(jComboBoxSala.getSelectedItem()).toString();

        //obtener el valor de los boletos vendidos
        int boletosVendidos = Integer.parseInt(BoletosVendidos.getText());

        //mediante el nombre de la sala obtenemos el Índice mediante obtenerSalaCinePosicion:
        int posicion = oSala.buscarSalaCine(jComboBoxSala.getSelectedItem().toString());

        //con el índice hubicamos la sala en el arraylist y le asignamos el valor de los boletos vendidos:
        oSala.setAsientosVendidos(posicion,boletosVendidos);

        //comprobando que se haya creado la sala:
        System.out.println(oSala.obtenerSalaCineNombre(jComboBoxSala.getSelectedItem().toString()));


        //borrando los campos de texto:
        BoletosVendidos.setText("0");
        
        //Pasando datos al textArea y mostrar su ganancias totales:
        jTextArea1.setText(""+
                oSala.obtenerSalaCineNombre(jComboBoxSala.getSelectedItem().toString()) +
                "Total a pagar = "+ oSala.obtenerGanancias(jComboBoxSala.getSelectedItem().toString())
        );
        

    }//GEN-LAST:event_obtnerImporteTotalActionPerformed

    private void NombreSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreSalaActionPerformed

    private void jComboBoxSalaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSalaItemStateChanged
        
    }//GEN-LAST:event_jComboBoxSalaItemStateChanged

    private void jComboBoxSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSalaActionPerformed
    jTextField1.setText("Precio:" + oSala.obtenerPrecioEntradaNombre(jComboBoxSala.getSelectedItem().toString()) );
    }//GEN-LAST:event_jComboBoxSalaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BoletosVendidos;
    private javax.swing.JButton CrearSala;
    private javax.swing.JTextField NombreSala;
    private javax.swing.JTextField NumAsientos;
    private javax.swing.JTextField Precio;
    private javax.swing.JComboBox<String> jComboBoxSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBoletosVendidos;
    private javax.swing.JLabel jLabelNombreSala;
    private javax.swing.JLabel jLabelNumAsientos;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelSala;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton obtnerImporteTotal;
    // End of variables declaration//GEN-END:variables

    private int jLabelNumAsientos() {
        throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int jLabelPrecioNiños() {
        throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int jLabelPrecioAdultos() {
        throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
