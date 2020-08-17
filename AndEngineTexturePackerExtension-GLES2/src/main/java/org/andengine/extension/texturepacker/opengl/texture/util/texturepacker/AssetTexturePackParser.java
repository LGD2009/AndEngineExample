package org.andengine.extension.texturepacker.opengl.texture.util.texturepacker;

import java.io.IOException;
import java.io.InputStream;

import org.andengine.opengl.texture.TextureManager;

import android.content.res.AssetManager;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 21:24:00 - 12.09.2011
 */
public class AssetTexturePackParser extends TexturePackParser {


	private final AssetManager mAssetManager;
	private final String mAssetBasePath;

	public AssetTexturePackParser(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetBasePath) {
		super(pTextureManager);

		this.mAssetManager = pAssetManager;
		this.mAssetBasePath = pAssetBasePath;
	}

	protected InputStream onGetInputStream(final String pFilename) throws IOException {
		return this.mAssetManager.open(this.mAssetBasePath + pFilename);
	}
}
