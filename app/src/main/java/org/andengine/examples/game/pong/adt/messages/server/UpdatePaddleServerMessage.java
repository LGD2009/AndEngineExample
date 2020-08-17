package org.andengine.examples.game.pong.adt.messages.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.andengine.examples.game.pong.util.constants.PongConstants;
import org.andengine.extension.multiplayer.protocol.adt.message.server.ServerMessage;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 19:48:32 - 28.02.2011
 */
public class UpdatePaddleServerMessage extends ServerMessage implements PongConstants {


	public int mPaddleID;
	public float mX;
	public float mY;

	public UpdatePaddleServerMessage() {

	}

	public UpdatePaddleServerMessage(final int pPaddleID, final float pX, final float pY) {
		this.mPaddleID = pPaddleID;
		this.mX = pX;
		this.mY = pY;
	}

	public void set(final int pPaddleID, final float pX,final float pY) {
		this.mPaddleID = pPaddleID;
		this.mX = pX;
		this.mY = pY;
	}

	@Override
	public short getFlag() {
		return FLAG_MESSAGE_SERVER_UPDATE_PADDLE;
	}

	@Override
	protected void onReadTransmissionData(DataInputStream pDataInputStream) throws IOException {
		this.mPaddleID = pDataInputStream.readInt();
		this.mX = pDataInputStream.readFloat();
		this.mY = pDataInputStream.readFloat();
	}

	@Override
	protected void onWriteTransmissionData(final DataOutputStream pDataOutputStream) throws IOException {
		pDataOutputStream.writeInt(this.mPaddleID);
		pDataOutputStream.writeFloat(this.mX);
		pDataOutputStream.writeFloat(this.mY);
	}
}