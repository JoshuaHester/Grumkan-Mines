import java.io.File;

public class Block{
    private File textureFilePath;
    private int textureWidth;
    private int textureHeight;
    private String name;

    public void setTextureDirectory(){

    }

    public void setTexture(String fileName){
        textureFilePath = new File(fileName);
    }
    public void setTextureSize(int width,int height){
        textureWidth = width;
        textureHeight = height;
    }

    public void setName(String name){
        this.name = name;
    }

    public Block(){
        setName("Perfectly Generic Block");
        setTextureSize(12,12);
        setTextureDirectory();
        setTexture("generic.png");
    }


}
