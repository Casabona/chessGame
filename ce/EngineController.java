/*
 * Copyright (c) 2008-2011, David Garcinuño Enríquez <dagaren@gmail.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package es.dagaren.gladiator.communication.xboard;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import es.dagaren.gladiator.communication.ProtocolController;
import es.dagaren.gladiator.notation.Notation;
import es.dagaren.gladiator.representation.Movement;

/**
 * @author dagaren
 * 
 */
public class EngineController extends ProtocolController implements
      EngineToUser
{
   protected UserToEngine receiver;

   /**
    * @param receiver
    *           the receiver to set
    */
   public void setReceiver(UserToEngine receiver)
   {
      this.receiver = receiver;
   }

   /**
    * @return the receiver
    */
   public UserToEngine getReceiver()
   {
      return receiver;
   }

   @Override
   public void onCommandReceived(String command)
   {
      Scanner commandScanner = new Scanner(command);
      commandScanner.useDelimiter("\\s+");

      if (receiver != null)
      {
         if ("xboard".equals(command) || "analyze".equals(command) || "new".equals(command) || "quit".equals(command) || "random".equals(command) || "force".equals(command) || "go".equals(command) || "playother".equals(command) || "white".equals(command) || "black".equals(command) || "draw".equals(command) || "edit".equals(command) || "hint".equals(command) || "bk".equals(command) || "undo".equals(command) || "remove".equals(command) || "hard".equals(command) || "easy".equals(command) || "post".equals(command) || "nopost".equals(command) || "computer".equals(command) || "pause".equals(command) || "resume".equals(command) || "rating".equals(command))
         {receiver.getClass().getMethod(command);}
         
         else if (command.startsWith("variant")){commandScanner.next();String variant = commandScanner.next();if (variant != null && variant.trim() != "") {receiver.variant(variant);}}
         
         else if (command.startsWith("level")){commandScanner.next();String numMoves = commandScanner.next();String baseTime = commandScanner.next();String incrementTime = commandScanner.next();receiver.level(numMoves, baseTime, incrementTime);}
         
         else if (command.startsWith("st")){commandScanner.next();String temp_ = commandScanner.next();receiver.st(temp_);}
         
         else if (command.startsWith("time")){commandScanner.next();String temp_ = commandScanner.next();receiver.time(temp_);}
         
         else if (command.startsWith("sd")){commandScanner.next();String temp_ = commandScanner.next();receiver.sd(temp_);}
         
         else if (command.startsWith("otim")){commandScanner.next();String temp_ = commandScanner.next();receiver.otim(temp_);}
         
         else if(command.startsWith("ics")){commandScanner.next();String temp_ = commandScanner.next();receiver.ics(temp_);}
         
         else if(command.startsWith("protover")){commandScanner.next();String temp_ = commandScanner.next();receiver.protover(temp_);}
         
         else if(command.startsWith("accepted")){commandScanner.next();String temp_ = commandScanner.next();receiver.accepted(temp_);}
         
         else if(command.startsWith("rejected")){commandScanner.next();String temp_ = commandScanner.next();receiver.protover(temp_);}
         
         else if(command.startsWith("usermove")){commandScanner.next();Movement move = Notation.parseMove(commandScanner.next());receiver.usermove(move);}
         
         else if("ping".equals(command)){commandScanner.next();String n = commandScanner.next();receiver.ping(n);}
         
         else if ("?".equals(command)){receiver.moveNow(); }
         
         else if (command.startsWith("result")){commandScanner.next();String result = commandScanner.next();commandScanner.useDelimiter("");String comment = "";receiver.result(result, comment);}
         
         else if (command.startsWith("name")){commandScanner.next();commandScanner.useDelimiter("");String name = commandScanner.next();receiver.name(name);}
         
         else if(command.startsWith("setboard")){commandScanner.next();String fen = commandScanner.nextLine().trim();receiver.setboard(fen);}
         
         else{Movement move = Notation.parseMove(command);receiver.usermove(move);}}}

   
   @Override
   public synchronized void feature(Map<String, String> features)
   {
      
      String command = "feature";
      
      Iterator<Entry<String, String>> itr = features.entrySet().iterator();
      
      while(itr.hasNext())
      {
         Entry<String, String> e = itr.next();
         
         String feature = (String)e.getKey();
         String value = (String)e.getValue();
         
         try{
            Integer.parseInt(value);
         }
         catch(Exception ex)
         {
           value = "\"" + value + "\"";  
         }
         
         command += " " + feature + "="  + value;
      }
      
      commandController.sendCommand(command);
   }
   
   /*
    * (non-Javadoc)
    * 
    * @see
    * es.dagaren.gladiator.protocols.xboard.EngineToUser#askuser(java.lang.String
    * , java.lang.String)
    */
   @Override
   synchronized public void askuser(String reptag, String message)
   {
      commandController.sendCommand("askuser " + reptag + " " + message);
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * es.dagaren.gladiator.protocols.xboard.EngineToUser#error(java.lang.String,
    * java.lang.String)
    */
   @Override
   synchronized public void error(String errorType, String command)
   {
      commandController.sendCommand("Error (" + errorType + "): " + command);
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * es.dagaren.gladiator.protocols.xboard.EngineToUser#illegalMove(java.lang
    * .String, java.lang.String)
    */
   @Override
   synchronized public void illegalMove(String move, String reason)
   {
      if (reason != null && reason != "")
         commandController
               .sendCommand("Illegal move (" + reason + "): " + move);
      else
         commandController.sendCommand("Illegal move: " + move);
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * es.dagaren.gladiator.protocols.xboard.EngineToUser#move(java.lang.String)
    */
   @Override
   synchronized public void move(String move)
   {
      commandController.sendCommand("move " + move);
   }

   /*
    * (non-Javadoc)
    * 
    * @see es.dagaren.gladiator.protocols.xboard.EngineToUser#offerDraw()
    */
   @Override
   public void offerDraw()
   {
      commandController.sendCommand("offer draw");
   }

   /*
    * (non-Javadoc)
    * 
    * @see es.dagaren.gladiator.protocols.xboard.EngineToUser#resign()
    */
   @Override
   public void resign()
   {
      commandController.sendCommand("resign");
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * es.dagaren.gladiator.protocols.xboard.EngineToUser#result(java.lang.String
    * , java.lang.String)
    */
   @Override
   public void result(String result, String comment)
   {
      commandController.sendCommand(result + " {" + comment + "}");
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * es.dagaren.gladiator.protocols.xboard.EngineToUser#tellics(java.lang.String
    * )
    */
   @Override
   public void tellics(String message)
   {
      commandController.sendCommand("tellics " + message);
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * es.dagaren.gladiator.protocols.xboard.EngineToUser#telluser(java.lang.
    * String)
    */
   @Override
   public void telluser(String message)
   {
      commandController.sendCommand("telluser " + message);
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * es.dagaren.gladiator.protocols.xboard.EngineToUser#tellusererror(java.
    * lang.String)
    */
   @Override
   public void tellusererror(String message)
   {
      commandController.sendCommand("tellusererror " + message);
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * es.dagaren.gladiator.protocols.xboard.EngineToUser#thinkingOutput(java
    * .lang.String, java.lang.String, java.lang.String, java.lang.String,
    * java.lang.String)
    */
   @Override
   public void thinkingOutput(String deep, String rating, String time,
         String nodes, String pv)
   {
      commandController.sendCommand(deep + " " + rating + " " + time + " "
            + nodes + " " + pv);
   }

   /* (non-Javadoc)
    * @see es.dagaren.gladiator.communication.xboard.EngineToUser#tellall(java.lang.String)
    */
   @Override
   public void tellall(String message)
   {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see es.dagaren.gladiator.communication.xboard.EngineToUser#tellicsnoalias(java.lang.String)
    */
   @Override
   public void tellicsnoalias(String message)
   {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see es.dagaren.gladiator.communication.xboard.EngineToUser#tellopponent(java.lang.String)
    */
   @Override
   public void tellopponent(String message)
   {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see es.dagaren.gladiator.communication.xboard.EngineToUser#tellothers(java.lang.String)
    */
   @Override
   public void tellothers(String message)
   {
      // TODO Auto-generated method stub
      
   }

   /* (non-Javadoc)
    * @see es.dagaren.gladiator.communication.xboard.EngineToUser#pong(java.lang.String)
    */
   @Override
   public void pong(String n)
   {
      // TODO Auto-generated method stub
      commandController.sendCommand("pong " + n);
   }

}
