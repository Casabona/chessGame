package SJCE.more.Log;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.io.*;
/**
 * gère les copier et coller en plain text
 * @author minet.adrien
 *
 */
public final class ClipboardTextTransfer implements ClipboardOwner {
  public void lostOwnership( Clipboard aClipboard, Transferable aContents) {
     //do nothing
   }
  public void setClipboardContents( String aString ){
	  //CTRL+C : on stock ce qu'on a sélectionné
    StringSelection stringSelection = new StringSelection( aString );
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents( stringSelection, this );
  }
  public String getClipboardContents() {
	  //CTRL+V : on colle ce qu'on a stocké
    String result = "";
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    //odd: the Object param of getContents is not currently used
    Transferable contents = clipboard.getContents(null);
    boolean hasTransferableText =
      (contents != null) &&
      contents.isDataFlavorSupported(DataFlavor.stringFlavor)
    ;
    if ( hasTransferableText ) {
    	//on vérifie que l'on peut le copier le contenu du presse papier
      try {
        result = (String)contents.getTransferData(DataFlavor.stringFlavor);
      }
      catch (UnsupportedFlavorException ex){
        //highly unlikely since we are using a standard DataFlavor
        System.out.println(ex);
        ex.printStackTrace();
      }
      catch (IOException ex) {
        System.out.println(ex);
        ex.printStackTrace();
      }
    }
    return result;
  }
} 
