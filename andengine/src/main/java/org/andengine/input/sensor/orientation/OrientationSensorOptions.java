package org.andengine.input.sensor.orientation;

import org.andengine.input.sensor.SensorDelay;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 11:12:36 - 31.10.2010
 */
public class OrientationSensorOptions {


	final SensorDelay mSensorDelay;

	public OrientationSensorOptions(final SensorDelay pSensorDelay) {
		this.mSensorDelay = pSensorDelay;
	}

	public SensorDelay getSensorDelay() {
		return this.mSensorDelay;
	}
}
