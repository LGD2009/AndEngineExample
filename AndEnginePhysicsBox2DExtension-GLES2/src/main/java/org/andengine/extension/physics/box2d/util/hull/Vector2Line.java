package org.andengine.extension.physics.box2d.util.hull;

import com.badlogic.gdx.math.Vector2;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 13:43:54 - 14.09.2010
 */
class Vector2Line {


	Vector2 mVertexA;
	Vector2 mVertexB;

	public Vector2Line(final Vector2 pVertexA, final Vector2 pVertexB) {
		this.mVertexA = pVertexA;
		this.mVertexB = pVertexB;
	}
}
