/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thfinal;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jiang
 */
public class THFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        // TODO code application logic here
        JFrame mainFrame = new JFrame();
        mainFrame.setLayout(new FlowLayout());
        JButton themNV = new JButton();
        themNV.setText("Them NV");
        themNV.addActionListener((e) -> {
            ThemNhanVien_JFrame themNhanVien_JFrame = new ThemNhanVien_JFrame();
            themNhanVien_JFrame.setVisible(true);
            themNhanVien_JFrame.setLocationRelativeTo(null);
        });
        JButton themHD = new JButton();
        themHD.setText("Them Hoa Don");
        themHD.addActionListener((e) -> {
            ThemHoaDon_JFrame themHoaDon_JFrame = new ThemHoaDon_JFrame();
            themHoaDon_JFrame.setVisible(true);
            themHoaDon_JFrame.setLocationRelativeTo(null);
        });
        JButton lietKe = new JButton();
        lietKe.setText("Liet ke Hoa Don");
        lietKe.addActionListener((e) -> {
            LietKe_JFrame lietKe_JFrame = new LietKe_JFrame();
            lietKe_JFrame.setVisible(true);
            lietKe_JFrame.setLocationRelativeTo(null);
        });
        mainFrame.add(themNV);
        mainFrame.add(themHD);
        mainFrame.add(lietKe);
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setPreferredSize(new Dimension(50,150));
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
    
}
