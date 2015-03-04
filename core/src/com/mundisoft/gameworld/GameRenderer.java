package com.mundisoft.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.mundisoft.gameobjects.Circle;
import com.mundisoft.lghelpers.AssetLoader;

public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;
    
    private SpriteBatch batcher;
    
    private int midPointY;
    private int gameHeight;

    private Circle circle;
    
    
    //game assets
    private TextureRegion circleLeft;
    private TextureRegion circleRight;
    private TextureRegion line;
    
    
    public GameRenderer(GameWorld world, int gameHeight, int midPointY) {
        myWorld = world;
        this.gameHeight = gameHeight;
        this.midPointY = midPointY;
        
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, gameHeight);

        batcher = new SpriteBatch();
        batcher.setProjectionMatrix(cam.combined);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
        
        initGameObjects();
        initAssets();
    }

    public void render(float runTime) {

    	//fill screen with black
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeType.Filled);
        
        //draw BG
        shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        shapeRenderer.rect(0, 0, 136,2 * midPointY); //was midPointY + 66
        shapeRenderer.end();
        
        
        // Begin SpriteBatch
        batcher.begin();
        // Draw circle at its coordinates.
        // Pass in the runTime variable to get the current frame.
        batcher.draw(circleLeft,
                circle.getX(), circle.getY(), circle.getWidth(), circle.getHeight());

        // End SpriteBatch
        batcher.end();

    }
    
    
    private void initGameObjects() {
        circle = myWorld.getCircle();
    }

    private void initAssets() {
        circleLeft = AssetLoader.circleLeft;
        circleRight = AssetLoader.circleRight;
        line = AssetLoader.line;

    }
    

}
