package com.example.tortue.myapplication;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.Display;
import android.view.MotionEvent;

/**
 * Created by Tortue on 21/12/2016.
 */

public class GameView extends GLSurfaceView {
    private final GameRenderer gameRenderer;
    public GameView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
        gameRenderer = new GameRenderer(context);
        setRenderer(gameRenderer);
    }
}
