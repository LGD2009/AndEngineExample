package org.andengine.input.sensor;

import java.util.Arrays;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 16:50:44 - 10.03.2010
 */
public class BaseSensorData {


	protected final float[] mValues;
	protected int mAccuracy;
	protected int mDisplayRotation;

	public BaseSensorData(final int pValueCount, int pDisplayRotation) {
		this.mValues = new float[pValueCount];

		this.mDisplayRotation = pDisplayRotation;
	}

	public float[] getValues() {
		return this.mValues;
	}

	public void setValues(final float[] pValues) {
		System.arraycopy(pValues, 0, this.mValues, 0, pValues.length);
	}

	public void setAccuracy(final int pAccuracy) {
		this.mAccuracy = pAccuracy;
	}

	public int getAccuracy() {
		return this.mAccuracy;
	}

	@Override
	public String toString() {
		return "Values: " + Arrays.toString(this.mValues);
	}
}
