/*
 * Vetokonsultit Oy:n harjoitustehtavia.
 * harjoitustehtavat netissa
 * http://kehitys.vetokonsultit.fi/javaharj/
 * 
 *  Tehtävä 3.2
 * 
 * BussiGUI luokka
 * 
 */
package vetokonsultit.olioharjoitukset.ui;

import java.io.File;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;

/**
 *
 * Lataa eri autonkuvia nayttoikkunaan
 * @author pasi haverinen
 */
public class AutonvalintaGUI extends javax.swing.JFrame {

    /** Creates new form AutonvalintaGUI */
    public AutonvalintaGUI() {
        initComponents();
        //ladataan ensimmainen kuva
         String kuvaTiedostoPolku="vetokonsultit/olioharjoitukset/ui/images/"+this.imageFileNames[this.kuva_index++];
        this.lataaKuva(kuvaTiedostoPolku, "kuva1");
         
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton_VaihdaKuva = new javax.swing.JButton();
        photographLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_VaihdaKuva.setLabel("Vaihda Kuva");
        jButton_VaihdaKuva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VaihdaKuvaActionPerformed(evt);
            }
        });
        jButton_VaihdaKuva.setBounds(20, 140, 110, 28);
        jLayeredPane1.add(jButton_VaihdaKuva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jButton_VaihdaKuva.getAccessibleContext().setAccessibleName("");

        photographLabel.setPreferredSize(new java.awt.Dimension(100, 32));
        photographLabel.setRequestFocusEnabled(false);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(photographLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(photographLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        photographLabel.getAccessibleContext().setAccessibleName("Kuva");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

private void jButton_VaihdaKuvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VaihdaKuvaActionPerformed
    
   
                   //asetetaan kuvatiedostopolku
                   String kuvaTiedostoPolku="vetokonsultit/olioharjoitukset/ui/images/"+this.imageFileNames[this.kuva_index];
                   
                   this.lataaKuva(kuvaTiedostoPolku, "autokuva"+this.kuva_index);
                   
                   //asetetaan kuvaindeksi alkuun jos ollaan kuvaarrayn lopussa
                   //mussa tapauksessa kasvatetaan indeksia
                   if(this.kuva_index==this.imageFileNames.length-1)
                   {
                       this.kuva_index=0;
                   }else
                   {
                       this.kuva_index++;
                   }
            
}//GEN-LAST:event_jButton_VaihdaKuvaActionPerformed

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
            java.util.logging.Logger.getLogger(AutonvalintaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutonvalintaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutonvalintaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutonvalintaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AutonvalintaGUI().setVisible(true);
            }
        });
    }
     
     /**
     * luo  Nykyisen ohjelman ajonaikaisen hakemiston
     */
    protected String getCurrentDirectory() {

        CodeSource codeSource = AutonvalintaGUI.class.getProtectionDomain().getCodeSource();
        String jarDir="";
        File jarFile=null;
        try {
            jarFile = new File(codeSource.getLocation().toURI().getPath());
        } catch (URISyntaxException ex) {
            Logger.getLogger(AutonvalintaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        jarDir = jarFile.getParentFile().getPath();
        return jarDir;
    }
      
     /**
     * luo  ImageIcon objektin jos annettu polku on validi.
     * @param String - rerussin polku
     * @param String - kuvan kuvaus
     */
    protected ImageIcon LuoKuvaIkoni(String path,
            String description) {
        
        ClassLoader cldr = this.getClass().getClassLoader();

        java.net.URL imgURL = cldr.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("tiedostoa ei loytynyt: " + path);
            return null;
        }
    }
      //ladataan kuva erilliseen threadiin.
    private void lataaKuva(final String imagePath,final String imageDescription) {
       SwingWorker<ImageIcon, Void> worker = 
          new SwingWorker<ImageIcon, Void>() {
 
          public ImageIcon doInBackground() {
            ImageIcon imageIcon = LuoKuvaIkoni(imagePath, imageDescription);
            return imageIcon;
          }
          public void done() {
            try {
               autonkuvaIcon= get();
               photographLabel.setIcon(autonkuvaIcon);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            } catch (ExecutionException ex) {
               ex.printStackTrace();
            }
          }
       };
       worker.execute();
     

    }
   
    private ImageIcon autonkuvaIcon;
    
    private int kuva_index=0;
    /**
     * lista ladattavista auton kuvista
     */
    private String[] imageFileNames = { "audi.jpg", "classic.jpg",
    "concept_car.jpg", "dodgeviper.jpg", "modern.jpg","red.jpg","salama.jpg","sportcar.jpeg"};
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton_VaihdaKuva;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JLabel photographLabel;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
}