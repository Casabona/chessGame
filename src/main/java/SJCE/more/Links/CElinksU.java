package SJCE.more.Links;

import static SJCE.XChessFrame.frame;
import SJCE.more.Mail_Url;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
/**
 * gère les liens vers des sites internets en liens
 * @author minet.adrien
 *
 */
public class CElinksU extends javax.swing.JDialog {

    public static final int RET_CANCEL = 0;
    public static final int RET_OK = 1;

    public CElinksU (java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(frame);
        this.setTitle("Uci Engines Links and Ratings");
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    public int getReturnStatus() {
        return returnStatus;
    }
/**
 * initalise les bouttons
 */
    private void initButton() {
    	 jButton11 = new javax.swing.JButton();
         jToolBar6 = new javax.swing.JToolBar();
         jToolBar1 = new javax.swing.JToolBar();
         jButton32 = new javax.swing.JButton();
         jButton36 = new javax.swing.JButton();
         jButton35 = new javax.swing.JButton();
         jButton22 = new javax.swing.JButton();
         jButton4 = new javax.swing.JButton();
         jButton34 = new javax.swing.JButton();
         jButton20 = new javax.swing.JButton();
         jButton3 = new javax.swing.JButton();
         jButton33 = new javax.swing.JButton();
         jButton27 = new javax.swing.JButton();
         jButton28 = new javax.swing.JButton();
         jButton31 = new javax.swing.JButton();
         jButton29 = new javax.swing.JButton();
         jButton30 = new javax.swing.JButton();
         jButton12 = new javax.swing.JButton();
         jButton16 = new javax.swing.JButton();
         jButton17 = new javax.swing.JButton();
         jButton23 = new javax.swing.JButton();
         jButton24 = new javax.swing.JButton();
         jToolBar4 = new javax.swing.JToolBar();
         jButton55 = new javax.swing.JButton();
         jButton1 = new javax.swing.JButton();
         jButton56 = new javax.swing.JButton();
         jButton57 = new javax.swing.JButton();
         jButton44 = new javax.swing.JButton();
         jButton58 = new javax.swing.JButton();
         jButton59 = new javax.swing.JButton();
         jButton61 = new javax.swing.JButton();
         jButton62 = new javax.swing.JButton();
         jButton63 = new javax.swing.JButton();
         jButton64 = new javax.swing.JButton();
         jButton65 = new javax.swing.JButton();
         jButton66 = new javax.swing.JButton();
         jButton67 = new javax.swing.JButton();
         jButton68 = new javax.swing.JButton();
         jButton69 = new javax.swing.JButton();
         jButton70 = new javax.swing.JButton();
         jButton71 = new javax.swing.JButton();
         jButton72 = new javax.swing.JButton();

    	
    }
    /**
     * initalise la position des boutton de la JtoolBar4
     * @param button
     */
    private void initButtonJtoolBar4(javax.swing.JButton button) {
    	button.setFocusable(false);
    	button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    	button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }
    /**
     * defini le texte de chaque bouton indiquant le rating
     */
    private void initRating() {
    	jButton55.setText(" Rating = 2323");
    	  jButton1.setText(" Rating = 1750");
    	  jButton56.setText(" Rating = 2455");
    	  jButton57.setText(" Rating = 2588");
    	  jButton44.setText(" Rating = 1372");
    	  jButton58.setText(" Rating = 2294");
    	  jButton59.setText(" Rating = 2347"); 
    	  jButton61.setText(" Rating = ");       	    
    	  jButton62.setText(" Rating = 2319");
    	  jButton63.setText(" Rating = ");
    	  jButton64.setText(" Rating = 2546");
    	  jButton65.setText(" Rating = 1706");
    	  jButton66.setText(" Rating = 1968");
    	  jButton67.setText(" Rating = ");
    	  jButton68.setText(" Rating = ");
    	  jButton69.setText(" Rating = 1706");
    	  jButton70.setText(" Rating = 2400");
    	  jButton71.setText(" Rating = ");
    	  jButton72.setText(" Rating = ");
    	  
    	  
    	  
    }
    
    /**
     * initalise la JtoolBar4
     */
    private void initJtoolBar4() {
    	initRating();
        jToolBar4.setFloatable(false);
        jToolBar4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        
        initButtonJtoolBar4(jButton55);
        jToolBar4.add(jButton55);

      
        initButtonJtoolBar4(jButton1);
        jToolBar4.add(jButton1);

       
        initButtonJtoolBar4(jButton56);
        jToolBar4.add(jButton56);

        
        initButtonJtoolBar4(jButton57);
        jToolBar4.add(jButton57);

    
        initButtonJtoolBar4(jButton44);
        jToolBar4.add(jButton44);

       
        initButtonJtoolBar4(jButton58);
        jToolBar4.add(jButton58);

      
        initButtonJtoolBar4(jButton59);
        jToolBar4.add(jButton59);

        
        initButtonJtoolBar4(jButton61);
        jToolBar4.add(jButton61);

        
        initButtonJtoolBar4(jButton62);
        jToolBar4.add(jButton62);

        
        initButtonJtoolBar4(jButton63);
        jToolBar4.add(jButton63);

        
        initButtonJtoolBar4(jButton64);
        jToolBar4.add(jButton64);

        
        initButtonJtoolBar4(jButton65);
        jToolBar4.add(jButton65);

        
        initButtonJtoolBar4(jButton66);
        jToolBar4.add(jButton66);

        
        initButtonJtoolBar4(jButton67);
        jToolBar4.add(jButton67);

        
        initButtonJtoolBar4(jButton68);
        jToolBar4.add(jButton68);

        
        initButtonJtoolBar4(jButton69);
        jToolBar4.add(jButton69);

        
        initButtonJtoolBar4(jButton70);
        jToolBar4.add(jButton70);

        
        initButtonJtoolBar4(jButton71);
        jToolBar4.add(jButton71);

        
        initButtonJtoolBar4(jButton72);
        jToolBar4.add(jButton72);
    }
    
    /**
     * initalise la position des bouttons de la JtoolBar1
     * @param button
     */
    private void initButtonJtoolBar1(javax.swing.JButton button) {
    	button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    	button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    	button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    	button.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton32ActionPerformed(evt);
             }
         });
    }
    /**
     * initialise les liens des boutons 
     */
    private void initLinks() {
    	   jButton32.setText("<html><a href=\"http://bagaturchess.sourceforge.net/\">Bagatur v1.4c = http://bagaturchess.sourceforge.net/</a></html>");
    	   jButton36.setText("<html><a href=\"https://code.google.com/p/calculonx/\">Calculon v0.4.2 = https://code.google.com/p/calculonx/</a></html>");
    	   jButton35.setText("<html><a href=\"https://github.com/albertoruibal/carballo/\">Carballo v1.7 = https://github.com/albertoruibal/carballo/</a></html>");
    	   jButton22.setText("<html><a href=\"http://web.comhem.se/petero2home/javachess/index.html\">Cuckoo v1.12 = http://web.comhem.se/petero2home/javachess/index.html</a></html>");
    	   jButton4.setText("<html><a href=\"http://kirr.homeunix.org/chess/engines/Jim%20Ablett/EDEN/\">Eden v0.0.13 = http://kirr.homeunix.org/chess/engines/Jim%20Ablett/EDEN/</a></html>");
           jButton34.setText("<html><a href=\"http://www.stuckardt.de/index.php/schachengine-fischerle.html\">Fischerle v0.9.70 SE 32bit = http://www.stuckardt.de/index.php/schachengine-fischerle.html</a></html>");
           jButton20.setText("<html><a href=\"https://github.com/fluxroot/flux/releases\">Flux v2.2.1 = https://github.com/fluxroot/flux/releases</a></html>");
           jButton3.setText("<html><a href=\"https://code.google.com/archive/p/magnumchess/downloads\">Magnum v4.0 = https://code.google.com/archive/p/magnumchess/downloads</a></html>");
           jButton33.setText("<html><a href=\"http://mediocrechess.sourceforge.net/\">Mediocre v0.5 = http://mediocrechess.sourceforge.net/</a></html>");
           jButton27.setText("<html><a href=\"https://github.com/jwilson82/presbyter\">Presbyter v1.3.0 = https://github.com/jwilson82/presbyter</a></html>");
           jButton28.setText("<html><a href=\"https://github.com/rahular/phoenix\">Phoenix-Cuckoo v1.13a9 = https://github.com/rahular/phoenix</a></html>");
           jButton31.setText("<html><a href=\"https://github.com/fluxroot/pulse/releases/\">Pulse v1.6.1 = https://github.com/fluxroot/pulse/releases/</a></html>");
           jButton29.setText("<html><a href=\"http://www.rivalchess.com/downloads/\">Rival build 0094 = http://www.rivalchess.com/downloads/</a></html>");
           jButton30.setText("<html><a href=\"https://github.com/Zaloum/\">Rumney v0.2.1 = https://github.com/Zaloum/</a></html>");
           jButton12.setText("<html><a href=\"https://github.com/micaherne/unidexter/\">Unidexter v0.0.1= https://github.com/micaherne/unidexter/</a></html>");
           jButton16.setText("<html><a href=\"https://github.com/krummi/ChessEngine/\">Ziggy v0.7 = https://github.com/krummi/ChessEngine/</a></html>");
           jButton17.setText("<html><a href=\"https://github.com/sandermvdb/chess22k/\">Chess22k v1.5 = https://github.com/sandermvdb/chess22k</a></html>");
           jButton23.setText("<html><a href=\"https://github.com/eliucs/kasparov/\">Kasparov Chess v1.0.0 = https://github.com/eliucs/kasparov/</a></html>");
           jButton24.setText("<html><a href=\"http://computer-chess.org/doku.php?id=computer_chess:wiki:lists:chess_engine_list\">Koedem v1.1 = http://computer-chess.org/doku.php?id=computer_chess:wiki:lists:chess_engine_list</a></html>");
           
    }
    private void initJtoolBar1() {
    	initLinks();
    	 jToolBar1.setFloatable(false);
         jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);

      
         initButtonJtoolBar1(jButton32);
         jToolBar1.add(jButton32);

       
         initButtonJtoolBar1(jButton36);
         jToolBar1.add(jButton36);

        
         initButtonJtoolBar1(jButton35);
         jToolBar1.add(jButton35);

        
         initButtonJtoolBar1(jButton22);
         jToolBar1.add(jButton22);

        
         initButtonJtoolBar1(jButton4);
         jToolBar1.add(jButton4);


         initButtonJtoolBar1(jButton34);
         jToolBar1.add(jButton34);

       
         initButtonJtoolBar1(jButton20);
         jToolBar1.add(jButton20);

        
         initButtonJtoolBar1(jButton3);
         jToolBar1.add(jButton3);

      
         initButtonJtoolBar1(jButton33);
         jToolBar1.add(jButton33);


         initButtonJtoolBar1(jButton27);
         jToolBar1.add(jButton27);


         initButtonJtoolBar1(jButton28);
         jToolBar1.add(jButton28);

     
         initButtonJtoolBar1(jButton31);
         jToolBar1.add(jButton31);


         initButtonJtoolBar1(jButton29);
         jToolBar1.add(jButton29);


         initButtonJtoolBar1(jButton30);
         jToolBar1.add(jButton30);

         
         initButtonJtoolBar1(jButton12);
         jToolBar1.add(jButton12);

      
         initButtonJtoolBar1(jButton16);
         jToolBar1.add(jButton16);

       
         initButtonJtoolBar1(jButton17);
         jToolBar1.add(jButton17);

       
         initButtonJtoolBar1(jButton23);
         jToolBar1.add(jButton23);

     
         initButtonJtoolBar1(jButton24);
         jToolBar1.add(jButton24);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	initButton();
       
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Java Chess Engines Links and Ratings");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jButton11.setText("OK");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, java.awt.BorderLayout.SOUTH);

        jToolBar6.setBorder(javax.swing.BorderFactory.createTitledBorder("UCI engines"));
        jToolBar6.setFloatable(false);

       initJtoolBar1();

        jToolBar6.add(jToolBar1);

    initJtoolBar4();

        jToolBar6.add(jToolBar4);

        getContentPane().add(jToolBar6, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        Mail_Url.goURL("http://web.comhem.se/petero2home/javachess/index.html");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Mail_Url.goURL("http://kirr.homeunix.org/chess/engines/Jim%20Ablett/EDEN/");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Mail_Url.goURL("https://code.google.com/archive/p/magnumchess/downloads");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        Mail_Url.goURL("https://github.com/jwilson82/presbyter");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        Mail_Url.goURL("https://github.com/rahular/phoenix");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        Mail_Url.goURL("http://www.rivalchess.com/downloads/");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        Mail_Url.goURL("https://github.com/Zaloum/");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Mail_Url.goURL("https://github.com/micaherne/unidexter/");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Mail_Url.goURL("https://github.com/krummi/ChessEngine/");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        Mail_Url.goURL("https://github.com/fluxroot/flux/releases");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        Mail_Url.goURL("https://github.com/fluxroot/pulse/releases/");
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        Mail_Url.goURL("http://bagaturchess.sourceforge.net/");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        Mail_Url.goURL("http://mediocrechess.sourceforge.net/");
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        Mail_Url.goURL("http://www.stuckardt.de/index.php/schachengine-fischerle.html");
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        Mail_Url.goURL("https://github.com/albertoruibal/carballo/");
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        Mail_Url.goURL("https://code.google.com/p/calculonx/");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Mail_Url.goURL("https://github.com/sandermvdb/chess22k/");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        Mail_Url.goURL("https://github.com/eliucs/kasparov/");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        Mail_Url.goURL("http://computer-chess.org/doku.php?id=computer_chess:wiki:lists:chess_engine_list");
    }//GEN-LAST:event_jButton24ActionPerformed
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    public static void aboutRun() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CElinksU dialog = new CElinksU(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar6;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
