/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.menu;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Menu2 extends JFrame{

    private JPanel panelBtns ;
    private JButton deposito;
    private JButton retiro;
    private JButton saldo;
    private JButton transferencia;
    private JButton Cerrar;
    
    
    public static Color COLOR_BACK_1 = new Color(112, 146, 190);
    public static Color COLOR_BACK_2 = new Color(255, 255, 255);
    public static Color COLOR_BACK_3 = new Color(0, 153, 204);
    
    public Menu2() {
        init();
        iniciar();
        this.setLocationRelativeTo(null);
    }
    
    private void iniciar() {
        setBounds(200, 200, 300, 500);
        setTitle("Sistemas Distribidos");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.validate();
        setVisible(true);
     
    } 

    private void init() {
         // create the main panel
        panelBtns = new JPanel(new BorderLayout());
        //panelBtns.setBounds(200, 200, 700, 500);
        panelBtns.setLayout( new GridLayout(5, 1, 0, 2) );
       

        //create the botom
        //btnConsultaS = new JButton("Consulta Saldo");
        
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/imagenes/consulta.png"));
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/imagenes/retiro.png"));
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/imagenes/deposito.png"));
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/imagenes/transferencia.png"));
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/imagenes/salir.png"));
        Font f = new Font( "Arial",Font.BOLD,14 );
        
        saldo = new JButton("Consultar Saldo",imagen1);
        saldo.setHorizontalTextPosition(SwingConstants.CENTER);
        saldo.setVerticalTextPosition(SwingConstants.BOTTOM);
        saldo.setFont( f );
        
        retiro = new JButton("Retiro Saldo",imagen2);
        retiro.setHorizontalTextPosition(SwingConstants.CENTER);
        retiro.setVerticalTextPosition(SwingConstants.BOTTOM);
        retiro.setFont( f );
        
        deposito = new JButton("Deposito Saldo",imagen3);
        deposito.setHorizontalTextPosition(SwingConstants.CENTER);
        deposito.setVerticalTextPosition(SwingConstants.BOTTOM);
        deposito.setFont( f );
        
        transferencia = new JButton("Transferencia Saldo",imagen4);
        transferencia.setHorizontalTextPosition(SwingConstants.CENTER);
        transferencia.setVerticalTextPosition(SwingConstants.BOTTOM);
        transferencia.setFont( f );
        
        Cerrar = new JButton("Cerrar Sesión",imagen5);
        Cerrar.setHorizontalTextPosition(SwingConstants.CENTER);
        Cerrar.setVerticalTextPosition(SwingConstants.BOTTOM);
        Cerrar.setFont( f );
        
        //add to pnlBtns
        panelBtns.add(saldo );
        panelBtns.add( retiro );
        panelBtns.add( deposito );
        panelBtns.add( transferencia );
        panelBtns.add( Cerrar );
        panelBtns.setVisible(true);
        this.getContentPane().add(panelBtns,BorderLayout.NORTH);
       
        
        // Add Click events
        saldo.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saldo saldo = new Saldo();
                saldo.setVisible(true);
            }
        } );
        retiro.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retiro retiro= new Retiro();
                retiro.setVisible(true);
            }
        } );
        deposito.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Deposito deposito= new Deposito();
                deposito.setVisible(true);
            }
        } );
        transferencia.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transferencia trans= new Transferencia();
                trans.setVisible(true);
            }
        } );
        Cerrar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( JOptionPane.showConfirmDialog(null, 
                        "¿Esta seguro que desea cerrar sesión?", "Cerrar sesión", JOptionPane.YES_NO_OPTION) == 0 ){
                    cerrarSesion();
                }
            }
        } );
        
        // Add colors
        saldo.setBackground(COLOR_BACK_3);
        Cerrar.setBackground(COLOR_BACK_3);
        deposito.setBackground(COLOR_BACK_3);
        retiro.setBackground(COLOR_BACK_3);
        transferencia.setBackground(COLOR_BACK_3);
        saldo.setForeground(COLOR_BACK_2);
        Cerrar.setForeground(COLOR_BACK_2);
        deposito.setForeground(COLOR_BACK_2);
        retiro.setForeground(COLOR_BACK_2);
        transferencia.setForeground(COLOR_BACK_2);
        panelBtns.setBackground(COLOR_BACK_2);
        
       
    }

    //****** VIEW INTERFACE ***************************************

    public void closeApplication() {
        //Mainframe.setVisible(false);
        System.exit(1);
    }

 
    
    public void cerrarSesion(){
        
        closeApplication();
        
    }
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }
}
