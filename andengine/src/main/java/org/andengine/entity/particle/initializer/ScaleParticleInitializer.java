package org.andengine.entity.particle.initializer;

import org.andengine.entity.IEntity;
import org.andengine.entity.particle.Particle;


/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 10:03:29 - 19.11.2011
 */
public class ScaleParticleInitializer<T extends IEntity> extends BaseSingleValueParticleInitializer<T> {

	public ScaleParticleInitializer(final float pScale) {
		super(pScale, pScale);
	}

	public ScaleParticleInitializer(final float pMinScale, final float pMaxScale) {
		super(pMinScale, pMaxScale);
	}

	@Override
	protected void onInitializeParticle(final Particle<T> pParticle, final float pScale) {
		pParticle.getEntity().setScale(pScale);
	}
}
