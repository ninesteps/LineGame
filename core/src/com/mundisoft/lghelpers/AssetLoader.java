package com.mundisoft.lghelpers;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {

    public static Texture texture;
    public static TextureRegion circleLeft, circleRight, line;


    public static void load() {

        texture = new Texture(Gdx.files.internal("data/texture.png"));
        texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);


        circleLeft = new TextureRegion(texture, 3, 3, 16, 64);
        circleLeft.flip(false, true);

        circleRight = new TextureRegion(texture, 19, 3, 16, 64);
        circleRight.flip(false, true);

        line = new TextureRegion(texture, 7, 6, 1, 3);
        line.flip(false, true);
    }

    public static void dispose() {
        // We must dispose of the texture when we are finished.
        texture.dispose();
    }

}