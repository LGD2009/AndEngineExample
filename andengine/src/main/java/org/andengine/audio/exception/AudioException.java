package org.andengine.audio.exception;

import org.andengine.util.exception.AndEngineRuntimeException;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 20:44:53 - 09.11.2011
 */
public class AudioException extends AndEngineRuntimeException {


	private static final long serialVersionUID = 2647561236520151571L;

	public AudioException() {
		super();
	}

	public AudioException(final String pMessage) {
		super(pMessage);
	}

	public AudioException(final Throwable pThrowable) {
		super(pThrowable);
	}

	public AudioException(final String pMessage, final Throwable pThrowable) {
		super(pMessage, pThrowable);
	}
}
