public class Render {
    public void showPlaying(int bytesLength){
        System.out.println("\u25B6 playing " + bytesLength + " bytes");
    }

    public void showCache(boolean last){
        System.out.println("Cached last frame? " + last);
    }
}
