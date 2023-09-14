/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import com_decom.comp;
import com_decom.decom;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author BIM SAI CHARAN
 */
public class AppFrame  extends JFrame implements ActionListener{
    JButton compressorButton ;
    JButton decompressorButton;
    AppFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compressorButton = new JButton("select file to compress ");
        compressorButton.setBounds(100, 100, 200, 30 );
        compressorButton.addActionListener(this);
        
        decompressorButton = new JButton( "select file to decompress");
        decompressorButton.setBounds(250, 100, 200, 30);
        decompressorButton.addActionListener(this);
        
        this.add(compressorButton);
        this.add(decompressorButton);
        this.setSize(1000 , 500 );
        this.getContentPane().setBackground(Color.green);
        this.setVisible(true);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e ){
        if(e.getSource() == compressorButton){
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if( response == JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    comp.method(file);
                }
                catch(Exception ee ){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
        
        if ( e.getSource() == decompressorButton){
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if( response == JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    decom.method(file);
                }
                catch(Exception ee ){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            } 
        }
    }
}
