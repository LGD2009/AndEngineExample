package org.andengine.extension.svg.util;


/**
 * @author Larva Labs, LLC
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 16:50:17 - 21.05.2011
 */
public class SVGNumberParser {

	public static SVGNumberParserFloatResult parseFloats(final String pString) {
		if(pString == null) {
			return null;
		}

		final String[] parts = pString.split("[\\s,]+");
		final float[] numbers = new float[parts.length];
		for(int i = parts.length - 1; i >= 0; i--) {
			numbers[i] = Float.parseFloat(parts[i]);
		}

		return new SVGNumberParserFloatResult(numbers);
	}

	public static SVGNumberParserIntegerResult parseInts(final String pString) {
		if(pString == null) {
			return null;
		}

		final String[] parts = pString.split("[\\s,]+");
		final int[] numbers = new int[parts.length];
		for(int i = parts.length - 1; i >= 0; i--) {
			numbers[i] = Integer.parseInt(parts[i]);
		}

		return new SVGNumberParserIntegerResult(numbers);
	}

	public static class SVGNumberParserIntegerResult {


		private final int[] mNumbers;

		public SVGNumberParserIntegerResult(final int[] pNumbers) {
			this.mNumbers = pNumbers;
		}


		public int[] getNumbers() {
			return this.mNumbers;
		}

		public int getNumberCount() {
			return this.mNumbers.length;
		}

		public int getNumber(final int pIndex) {
			return this.mNumbers[pIndex];
		}
	}

	public static class SVGNumberParserFloatResult {


		private final float[] mNumbers;

		public SVGNumberParserFloatResult(final float[] pNumbers) {
			this.mNumbers = pNumbers;
		}


		public float[] getNumbers() {
			return this.mNumbers;
		}

		public int getNumberCount() {
			return this.mNumbers.length;
		}

		public float getNumber(final int pIndex) {
			return this.mNumbers[pIndex];
		}
	}
}