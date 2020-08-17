package org.andengine.extension.svg.util.constants;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 12:13:38 - 24.05.2011
 */
public class MathUtils {


	public static final double[] POWERS_OF_10 = new double[128];
	static {
		for (int i = 0; i < POWERS_OF_10.length; i++) {
			POWERS_OF_10[i] = Math.pow(10, i);
		}
	}
}
