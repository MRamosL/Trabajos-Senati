import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Piano extends World
{
    private String[] whiteKeys =
        { "A", "S", "D", "F", "G", "H", "J", "K", "L", ",", ".", "-" };
    private  String[] whiteNotes =
        { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };
        
    private String[] blackKeys =
        { "W", "E", "", "T", "Y", "U", "", "O", "P", "", "+" }; 
    private String[] blackNotes =
        { "3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#" }; 

    /**
    *Hacer el piano esto significa definir el tama?o,
     */
    public Piano() 
    {
        super(800, 340, 1);
        makeKeys();
        showMessage();
    }
    
    
    
    
    /**
     * Crea las teclas del piano (blancas y negras) y col?calas en el mundo.
     */
    private void makeKeys() 
    {
        // make the white keys
        for(int i = 0; i < whiteKeys.length; i++) {
            Key key = new Key(whiteKeys[i], whiteNotes[i]+".wav", "white-key.png", "white-key-down.png");
            addObject(key, 54 + (i*63), 140);
        }

        // make the black keys
        for(int i = 0; i < whiteKeys.length-1; i++) {
            if( ! blackKeys[i].equals("") ) {
                Key key = new Key(blackKeys[i], blackNotes[i]+".wav", "black-key.png", "black-key-down.png");
                addObject(key, 85 + (i*63), 86);
            }
        }
    }

    
    
    public void showMessage()
    {
        GreenfootImage bg = getBackground();
        bg.setColor(Color.WHITE);
        
    }

}