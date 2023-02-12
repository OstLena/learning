package module6;

public class LevelLoaderTestSecond {

    public static void main(String[] args) throws LevelTooBigException {
        //Level loaded
        try {
            new LevelLoaderSecond().load(new LevelSecond(10, 20));
        } catch (Exception ex) {
            throw new LevelTooBigException();
        }

        //Level too big
        try {
            new LevelLoaderSecond().load(new LevelSecond(10000, 2000));
        } catch (Exception ex) {
            throw new LevelTooBigException();
        }
    }
}

class LevelSecond {
    private int width;
    private int height;

    public LevelSecond(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoaderSecond {
    public void load(LevelSecond levelSecond) throws LevelTooBigException {

        if (levelSecond.getHeight() * levelSecond.getWidth() >100000){
            throw new LevelTooBigException();
        }
        System.out.println("Level loaded");
    }
}

class LevelTooBigException extends Exception{
        LevelTooBigException(){
            super("Level too big");
        }
}
