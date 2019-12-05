/*
 * Engine.java
 *
 * Created on 14 of July 2002, 22:15
 */

import java.io.*;
import java.util.*;
import java.text.*;

/**
 * The main engine class.
 *
 * @author Tomasz Michniewski
 * @version 1.0
 */
public class Engine extends java.lang.Object
{
	/** A constant representing the maximal number of items in one command. */
	private static final int MAX_ITEMS = 100;

	/** A constant representing the search margin used in aspiration search. */
	private static final int SEARCH_MARGIN = 10;

	/** This field stores the mode (true == winboard, false = textmode). */
	private boolean xboard;

	/** This field stores information about the color the machine plays. */
	private boolean computerWhite;

	/** This field stores information about the side to play the next move. */
	private boolean moveOfWhite;

	/** This field stores an indicator whether to think on oponents time. */
	private boolean ponder;

	/** This field stores the current position. */
	private Position p;

	/** This field stores the status of the go command. */
	private boolean wasGo;

	/** This field stores indicator whether to post the best line or not. */
	private boolean post;

	/** This field stores the number of moves to the next time control. */
	private int levelMoves;

	/** This field stores the time to the next time control. */
	private int levelTime;

	/** This field stores the increment added after each move. */
	private int levelIncrement;

	/** This field stores the number of moves played before the next time control. */
	private int numberOfMoves;

	/** This field stores the current move number. */
	private int moveNumber;

	/** This field stores the time in seconds till the next time control. */
	private int timeLeft;

	/** This field stores the time in seconds per one move for the operator. */
	private int operatorTime;

	/** This field stores the number of processors availaible on the machine. */
	private int numberOfProcessors;

	/** This field stores the number of threads */
	private int numberOfThreads;

	/** This field stores the first searching thread. */
	private Search s1;

	/** This field stores the second searching thread. */
	private Search s2;

	/** This field stores the game written in PGN format. */
	private String gamePGN;

	/** This field stores the opening moves in Atak format. */
	private String openingMoves;

	/** This field stores the log used to store every message exchanged. */
	private PrintWriter log;

	/**
	 * Initialization of members.
	 * @throws IOException It might be thrown by the FileWriter constructor.
	 */
	public Engine()
	throws IOException
	{
		super();

		xboard = false;
		computerWhite = false;
		moveOfWhite = true;
		p = new Position();
		wasGo = false;
		numberOfThreads = 0;
		gamePGN = "";
		openingMoves = "";
		log = new PrintWriter(new BufferedWriter(new FileWriter("JChess.log")));

		ponderCmd("off");
		postCmd();
		levelCmd(0, 5, 0);
		operatorCmd(0); // seconds per move

		numberOfProcessors =
			Integer.parseInt(System.getProperty("number_of_processors", "1"));
		threadsCmd(1);
/*
		if (numberOfProcessors == 1)
			threadsCmd(3);
		else
			threadsCmd(4);
*/
	}
	
}
