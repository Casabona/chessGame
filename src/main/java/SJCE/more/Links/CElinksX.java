package SJCE.more.Links;

import SJCE.more.Mail_Url;
import static SJCE.XChessFrame.frame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class CElinksX extends javax.swing.JDialog {

    public static final int RET_CANCEL = 0;
    public static final int RET_OK = 1;

    public CElinksX (java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(frame);
        this.setTitle("Xboard Engines Links and Ratings");
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
private void initButton() {
	 jButton11 = new javax.swing.JButton();
     jToolBar3 = new javax.swing.JToolBar();
     jToolBar5 = new javax.swing.JToolBar();
     jButton18 = new javax.swing.JButton();
     jButton10 = new javax.swing.JButton();
     jButton19 = new javax.swing.JButton();
     jButton5 = new javax.swing.JButton();
     jButton17 = new javax.swing.JButton();
     jButton21 = new javax.swing.JButton();
     jButton15 = new javax.swing.JButton();
     jButton8 = new javax.swing.JButton();
     jButton23 = new javax.swing.JButton();
     jButton1 = new javax.swing.JButton();
     jButton6 = new javax.swing.JButton();
     jButton13 = new javax.swing.JButton();
     jButton26 = new javax.swing.JButton();
     jButton9 = new javax.swing.JButton();
     jButton24 = new javax.swing.JButton();
     jButton25 = new javax.swing.JButton();
     jButton7 = new javax.swing.JButton();
     jButton14 = new javax.swing.JButton();
     jButton2 = new javax.swing.JButton();
     jButton3 = new javax.swing.JButton();
     jToolBar2 = new javax.swing.JToolBar();
     jButton36 = new javax.swing.JButton();
     jButton37 = new javax.swing.JButton();
     jButton38 = new javax.swing.JButton();
     jButton39 = new javax.swing.JButton();
     jButton40 = new javax.swing.JButton();
     jButton41 = new javax.swing.JButton();
     jButton42 = new javax.swing.JButton();
     jButton43 = new javax.swing.JButton();
     jButton45 = new javax.swing.JButton();
     jButton46 = new javax.swing.JButton();
     jButton47 = new javax.swing.JButton();
     jButton48 = new javax.swing.JButton();
     jButton56 = new javax.swing.JButton();
     jButton49 = new javax.swing.JButton();
     jButton50 = new javax.swing.JButton();
     jButton51 = new javax.swing.JButton();
     jButton52 = new javax.swing.JButton();
     jButton53 = new javax.swing.JButton();
     jButton54 = new javax.swing.JButton();
     jButton55 = new javax.swing.JButton();

}

private void initButtonToolBar5(javax.swing.JButton button) {
	button.setFocusable(false);
	button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
	button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	button.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            jButton18ActionPerformed(evt);
	        }
	    });
}

private void initLinks() {
	 jButton18.setText("<html><a href=\"http://kirr.homeunix.org/chess/engines/Jim%20Ablett/ALF/\">Alf v1.09 = http://kirr.homeunix.org/chess/engines/Jim%20Ablett/ALF/</a></html>");
	  jButton19.setText("<html><a href=\"http://computer-chess.org/doku.php?id=computer_chess:wiki:download:engine_download_list\">Arabian Knight v1.55 = http://computer-chess.org/</a></html>");
	  jButton5.setText("<html><a href=\"http://bremboce.cisana.com/\">BremboCE v0.6.2 = http://bremboce.cisana.com/</a></html>");
	  jButton17.setText("<html><a href=\"http://cavechess.sourceforge.net/\">CaveChess r61 = http://cavechess.sourceforge.net/</a></html>");
	  jButton21.setText("<html><a href=\"http://kirr.homeunix.org/chess/engines/Jim%20Ablett/CUPCAKE/\">CupCake v11c = http://kirr.homeunix.org/chess/engines/Jim%20Ablett/CUPCAKE/</a></html>");
	  jButton15.setText("<html><a href=\"https://github.com/alexandersoto/chess-bot\">ChessBot = https://github.com/alexandersoto/chess-bot</a></html>");
	  jButton8.setText("<html><a href=\"https://www.vanheusden.com/DeepBrutePos/\">DeepBrutePos v2.1 = https://www.vanheusden.com/DeepBrutePos/</a></html>");
	  jButton23.setText("<html><a href=\"http://kirr.homeunix.org/chess/engines/Jim%20Ablett/FRANK-WALTER/\">Frank Walter v1.08 = http://kirr.homeunix.org/chess/engines/Jim%20Ablett/FRANK-WALTER/</a></html>");
	  jButton1.setText("<html><a href=\"http://frittle.sourceforge.net/\">Frittle v1.0 = http://frittle.sourceforge.net/</a></html>");
	  jButton6.setText("<html><a href=\"https://github.com/dagaren/gladiator-chess\">Gladiator v0.0.6 = https://github.com/dagaren/gladiator-chess</a></html>");
	  jButton13.setText("<html><a href=\"http://www.forthgo.com/chessbox/\">GNU chess 5.0.7 = ChessBox_Gnu4j v1.02 = http://www.forthgo.com/chessbox/</a></html>");
	  jButton26.setText("<html><a href=\"http://jchecs.free.fr/\">jChecs v0.1.0 = http://jchecs.free.fr/</a></html>");
	  jButton9.setText("<html><a href=\"https://github.com/bugyvlad/javalin\">Javalin v1.3.0 = https://github.com/bugyvlad/javalin</a></html>");
	  jButton24.setText("<html><a href=\"http://computer-chess.org/\">JChess v1.0 = http://computer-chess.org/</a></html>");
	  jButton25.setText("<html><a href=\"http://kirr.homeunix.org/chess/engines/Jim%20Ablett/KINGSOUT/\">King's Out v0.2.42 = http://kirr.homeunix.org/chess/engines/Jim%20Ablett/KINGSOUT/</a></html>");
	  jButton7.setText("<html><a href=\"http://kirr.homeunix.org/chess/engines/Jim%20Ablett/OLITHINK/\">OliThink v5.3.2 = http://kirr.homeunix.org/chess/engines/Jim%20Ablett/OLITHINK/</a></html>");
	   jButton14.setText("<html><a href=\"http://talvmenni.sourceforge.net\">Talvmenni v0.0.1 = http://talvmenni.sourceforge.net/</a></html>");
	    jButton2.setText("<html><a href=\"http://tiffanys.sourceforge.net/\">Tiffanys v0.5 = http://tiffanys.sourceforge.net/</a></html>");
	    jButton3.setText("<html><a href=\"http://chess.dubmun.com/\">Tri-OS/cs4210 = http://chess.dubmun.com/</a></html>");
	  

}
private void initJtoolBar5() {
	initLinks();
    jToolBar5.setFloatable(false);
    jToolBar5.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jToolBar5.setAlignmentX(0.5F);

   
    initButtonToolBar5(jButton18);
    jToolBar5.add(jButton18);

   
    jToolBar5.add(jButton10);

  
    initButtonToolBar5(jButton19);
    jToolBar5.add(jButton19);

   
    initButtonToolBar5(jButton5);
    jToolBar5.add(jButton5);

  
    initButtonToolBar5(jButton17);
    jToolBar5.add(jButton17);

   
    initButtonToolBar5(jButton21);
    jToolBar5.add(jButton21);

   
    initButtonToolBar5(jButton15);
    jToolBar5.add(jButton15);

    
    initButtonToolBar5(jButton8);
    jToolBar5.add(jButton8);

   
    initButtonToolBar5(jButton23);
    jToolBar5.add(jButton23);

  
    initButtonToolBar5(jButton1);
    jToolBar5.add(jButton1);

   
    initButtonToolBar5(jButton6);
    jToolBar5.add(jButton6);

  
    initButtonToolBar5(jButton13);
    jToolBar5.add(jButton13);


    initButtonToolBar5(jButton26);
    jToolBar5.add(jButton26);

    
    initButtonToolBar5(jButton9);
    jToolBar5.add(jButton9);


    initButtonToolBar5(jButton24);
    jToolBar5.add(jButton24);

  
    initButtonToolBar5(jButton25);
    jToolBar5.add(jButton25);

   
    initButtonToolBar5(jButton7);
    jToolBar5.add(jButton7);

 
    initButtonToolBar5(jButton14);
    jToolBar5.add(jButton14);


    initButtonToolBar5(jButton2);
    jToolBar5.add(jButton2);

    initButtonToolBar5(jButton5);
    jToolBar5.add(jButton3);

    jToolBar3.add(jToolBar5);
}

private void initJbuttonJtoolBar2(javax.swing.JButton button) {
	button.setFocusable(false);
	button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
}


private void initRating() {
	 jButton36.setText(" Rating = 2190");
	 jButton37.setText(" Rating = ");
	  jButton38.setText(" Rating = 1860");
	  jButton39.setText(" Rating = 1771");
	   jButton41.setText(" Rating = 1994");
	   jButton42.setText(" Rating = ");
	   jButton43.setText(" Rating = ");
	   jButton47.setText(" Rating = ");
	   jButton45.setText(" Rating = 1988");
	   jButton46.setText(" Rating = ");
	   jButton48.setText(" Rating = 2760");
	   jButton40.setText(" Rating = ");
	   jButton56.setText(" Rating = 1134");
	   jButton49.setText(" Rating = ");
	   jButton50.setText(" Rating = 1375");
	   jButton51.setText(" Rating = 2059");
	   jButton52.setText(" Rating = 2380");
	   jButton53.setText(" Rating = 1450");
	   jButton54.setText(" Rating = ");
	   jButton55.setText(" Rating = ");
	   
}
private void initJtoolBar2() {
	initRating();
    jToolBar2.setFloatable(false);
    jToolBar2.setOrientation(javax.swing.SwingConstants.VERTICAL);

   
  
    initJbuttonJtoolBar2(jButton36);
    jToolBar2.add(jButton36);

    
    initJbuttonJtoolBar2(jButton37);
    jToolBar2.add(jButton37);

  
    initJbuttonJtoolBar2(jButton38);
    jToolBar2.add(jButton38);

    
    initJbuttonJtoolBar2(jButton39);
    jToolBar2.add(jButton39);

    
    initJbuttonJtoolBar2(jButton40);
    jToolBar2.add(jButton40);

 
    initJbuttonJtoolBar2(jButton41);
    jToolBar2.add(jButton41);

   
    initJbuttonJtoolBar2(jButton42);
    jToolBar2.add(jButton42);

   
    initJbuttonJtoolBar2(jButton43);
    jToolBar2.add(jButton43);

   
    initJbuttonJtoolBar2(jButton45);
    jToolBar2.add(jButton45);

   
    initJbuttonJtoolBar2(jButton46);
    jToolBar2.add(jButton46);

   
    initJbuttonJtoolBar2(jButton47);
    jToolBar2.add(jButton47);

    
    initJbuttonJtoolBar2(jButton48);
    jToolBar2.add(jButton48);

    
    initJbuttonJtoolBar2(jButton56);
    jToolBar2.add(jButton56);

    
    initJbuttonJtoolBar2(jButton49);
    jToolBar2.add(jButton49);

    
    initJbuttonJtoolBar2(jButton50);
    jToolBar2.add(jButton50);

    
    initJbuttonJtoolBar2(jButton51);
    jToolBar2.add(jButton51);

    
    initJbuttonJtoolBar2(jButton52);
    jToolBar2.add(jButton52);

    
    initJbuttonJtoolBar2(jButton53);
    jToolBar2.add(jButton53);

    
    initJbuttonJtoolBar2(jButton54);
    jToolBar2.add(jButton54);

    
    initJbuttonJtoolBar2(jButton55);
    jToolBar2.add(jButton55);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	initButton();
       
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Xboard Engines Links and Ratings");
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

        jToolBar3.setBorder(javax.swing.BorderFactory.createTitledBorder("XBOARD engines"));
        jToolBar3.setFloatable(false);

initJtoolBar5();
initJtoolBar2();

        jToolBar3.add(jToolBar2);

        getContentPane().add(jToolBar3, java.awt.BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Mail_Url.goURL("https://www.vanheusden.com/DeepBrutePos/");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Mail_Url.goURL("http://kirr.homeunix.org/chess/engines/Jim%20Ablett/OLITHINK/");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Mail_Url.goURL("https://github.com/dagaren/gladiator-chess");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Mail_Url.goURL("http://animatschess.sourceforge.net");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Mail_Url.goURL("https://github.com/bugyvlad/javalin");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Mail_Url.goURL("http://bremboce.cisana.com/");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Mail_Url.goURL("http://tiffanys.sourceforge.net");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mail_Url.goURL("http://frittle.sourceforge.net");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Mail_Url.goURL("http://www.forthgo.com/chessbox/");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Mail_Url.goURL("http://talvmenni.sourceforge.net");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Mail_Url.goURL("https://github.com/alexandersoto/chess-bot");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Mail_Url.goURL("http://cavechess.sourceforge.net");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Mail_Url.goURL("http://kirr.homeunix.org/chess/engines/Jim%20Ablett/ALF/");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        Mail_Url.goURL("http://computer-chess.org/doku.php?id=computer_chess:wiki:download:engine_download_list");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        Mail_Url.goURL("http://kirr.homeunix.org/chess/engines/Jim%20Ablett/CUPCAKE/");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        Mail_Url.goURL("http://kirr.homeunix.org/chess/engines/Jim%20Ablett/FRANK-WALTER/");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        Mail_Url.goURL("http://computer-chess.org/doku.php?id=computer_chess:wiki:download:engine_download_list");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        Mail_Url.goURL("http://kirr.homeunix.org/chess/engines/Jim%20Ablett/KINGSOUT/");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Mail_Url.goURL("http://chess.dubmun.com/");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        Mail_Url.goURL("http://jchecs.free.fr/");
    }//GEN-LAST:event_jButton26ActionPerformed
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    public static void aboutRun() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CElinksX dialog = new CElinksX(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar5;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
