package org.andengine.examples.game.pong.adt;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 12:11:58 - 01.03.2011
 */
public class Score {


	private int mScore = 0;

	public int getScore() {
		return this.mScore;
	}

	public void increase() {
		this.mScore++;
	}
}
