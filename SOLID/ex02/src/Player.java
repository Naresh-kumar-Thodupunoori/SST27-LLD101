public class Player {
    private FrameCache frameCache;
    private Render render;
    private Decoder decoder;

    public Player(){
        this.frameCache = new FrameCache();
        this.render = new Render();
        this.decoder = new Decoder();
    }

    void play(byte[] fileBytes){
        // decode
        Frame frame = decoder.decode(fileBytes); // pretend decoding
        
        // Cache
        frameCache.cache(frame);

        //Show UI
        render.showPlaying(fileBytes.length);
        render.showCache(frameCache.isCached());

        // draw UI
        // System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        // cache
        // System.out.println("Cached last frame? " + (last!=null));
    }
}