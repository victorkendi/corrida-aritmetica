package com.usp.corrida;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

import javax.swing.plaf.TextUI;

/**
 * Classe responsável pelo carregamento de recursos compartilhados
 */
public class Resources {

    public static final int MAX_SPRITES = 11;

    // Shared font
    public BitmapFont font;

    // Shared texture
    public Texture texBlack;
    public Texture texTextbox;

    // Sprites configuration
    public Texture[] texSprite = new Texture[MAX_SPRITES];
    public int[] SPRITE_WIDTH = new int[MAX_SPRITES];
    public int[] SPRITE_HEIGHT = new int[MAX_SPRITES];
    public int[] SPRITE_FRAMES = new int[MAX_SPRITES];


    /**
     * Faz o carregamento de todos os recursos compartilhados
     */
    public Resources(){
        font = new BitmapFont(Gdx.files.internal("font/clacon.fnt"));

        texBlack = new Texture(Gdx.files.internal("black.png"));
        texTextbox = new Texture(Gdx.files.internal("textbox.png"));

        // Loading sprites
        for(int i = 0;i < MAX_SPRITES;i++){
            texSprite[i] = new Texture(Gdx.files.internal("sprites/"+i+".png"));
        }

        SPRITE_WIDTH[0] = 32; SPRITE_HEIGHT[0] = 32; SPRITE_FRAMES[0] = 4;
        SPRITE_WIDTH[1] = 16; SPRITE_HEIGHT[1] = 16; SPRITE_FRAMES[1] = 2;
        SPRITE_WIDTH[2] = 16; SPRITE_HEIGHT[2] = 32; SPRITE_FRAMES[2] = 2;
        SPRITE_WIDTH[3] = 16; SPRITE_HEIGHT[3] = 16; SPRITE_FRAMES[3] = 4;
        SPRITE_WIDTH[4] = 16; SPRITE_HEIGHT[4] = 32; SPRITE_FRAMES[4] = 4;
        SPRITE_WIDTH[5] = 16; SPRITE_HEIGHT[5] = 16; SPRITE_FRAMES[5] = 4;
        SPRITE_WIDTH[6] = 16; SPRITE_HEIGHT[6] = 16; SPRITE_FRAMES[6] = 2;
        SPRITE_WIDTH[7] = 16; SPRITE_HEIGHT[7] = 32; SPRITE_FRAMES[7] = 2;
        SPRITE_WIDTH[8] = 32; SPRITE_HEIGHT[8] = 32; SPRITE_FRAMES[8] = 2;
        SPRITE_WIDTH[9] = 16; SPRITE_HEIGHT[9] = 16; SPRITE_FRAMES[9] = 4;
        SPRITE_WIDTH[10] = 16; SPRITE_HEIGHT[10] = 16; SPRITE_FRAMES[10] = 6;
    }

    /**
     * Descarrega todos os recursos
     */
    public void dispose(){
        font.dispose();
        texBlack.dispose();
        texTextbox.dispose();

        for(int i = 0;i < MAX_SPRITES;i++) {
            texSprite[i].dispose();
        }
    }
}
