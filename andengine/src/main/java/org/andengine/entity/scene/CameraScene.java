package org.andengine.entity.scene;

import org.andengine.engine.camera.Camera;
import org.andengine.entity.shape.IAreaShape;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.util.GLState;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 15:35:53 - 29.03.2010
 */
public class CameraScene extends Scene {


	protected Camera mCamera;

	/**
	 * {@link CameraScene#setCamera(Camera)} needs to be called manually. Otherwise nothing will be drawn.
	 */
	public CameraScene() {
		this(null);
	}

	public CameraScene(final Camera pCamera) {
		this.mCamera = pCamera;
	}

	public Camera getCamera() {
		return this.mCamera;
	}

	public void setCamera(final Camera pCamera) {
		this.mCamera = pCamera;
	}

	@Override
	public boolean onSceneTouchEvent(final TouchEvent pSceneTouchEvent) {
		if(this.mCamera == null) {
			return false;
		} else {
			this.mCamera.convertSceneToCameraSceneTouchEvent(pSceneTouchEvent);

			final boolean handled = super.onSceneTouchEvent(pSceneTouchEvent);

			if(handled) {
				return true;
			} else {
				this.mCamera.convertCameraSceneToSceneTouchEvent(pSceneTouchEvent);
				return false;
			}
		}
	}

	@Override
	protected boolean onChildSceneTouchEvent(final TouchEvent pSceneTouchEvent) {
		final boolean childIsCameraScene = this.mChildScene instanceof CameraScene;
		if(childIsCameraScene) {
			this.mCamera.convertCameraSceneToSceneTouchEvent(pSceneTouchEvent);
			final boolean result = super.onChildSceneTouchEvent(pSceneTouchEvent);
			this.mCamera.convertSceneToCameraSceneTouchEvent(pSceneTouchEvent);
			return result;
		} else {
			return super.onChildSceneTouchEvent(pSceneTouchEvent);
		}
	}

	@Override
	protected void onApplyMatrix(final GLState pGLState, final Camera pCamera) {
		this.mCamera.onApplyCameraSceneMatrix(pGLState);
	}

	public void centerShapeInCamera(final IAreaShape pAreaShape) {
		final Camera camera = this.mCamera;
		pAreaShape.setPosition((camera.getWidth() - pAreaShape.getWidth()) * 0.5f, (camera.getHeight() - pAreaShape.getHeight()) * 0.5f);
	}

	public void centerShapeInCameraHorizontally(final IAreaShape pAreaShape) {
		pAreaShape.setPosition((this.mCamera.getWidth() - pAreaShape.getWidth()) * 0.5f, pAreaShape.getY());
	}

	public void centerShapeInCameraVertically(final IAreaShape pAreaShape) {
		pAreaShape.setPosition(pAreaShape.getX(), (this.mCamera.getHeight() - pAreaShape.getHeight()) * 0.5f);
	}
}
