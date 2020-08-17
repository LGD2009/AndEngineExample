package org.andengine.util.adt.io.in;

import java.io.IOException;
import java.io.InputStream;

import android.content.res.AssetManager;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 12:05:38 - 02.03.2012
 */
public class AssetInputStreamOpener implements IInputStreamOpener {


	private final AssetManager mAssetManager;
	private final String mAssetPath;

	public AssetInputStreamOpener(final AssetManager pAssetManager, final String pAssetPath) {
		this.mAssetManager = pAssetManager;
		this.mAssetPath = pAssetPath;
	}

	@Override
	public InputStream open() throws IOException {
		return this.mAssetManager.open(this.mAssetPath);
	}
}
