package org.andengine.input.sensor.acceleration;

import org.andengine.input.sensor.SensorDelay;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 11:10:34 - 31.10.2010
 */
public class AccelerationSensorOptions {


	final SensorDelay mSensorDelay;

	public AccelerationSensorOptions(final SensorDelay pSensorDelay) {
		this.mSensorDelay = pSensorDelay;
	}

	public SensorDelay getSensorDelay() {
		return this.mSensorDelay;
	}
}
