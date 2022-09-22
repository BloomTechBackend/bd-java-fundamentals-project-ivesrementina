package main.com.adventure.objects.keys;

public class HoleContent {

    private Key content;
    private boolean isCovered = true;

    /**
     *
     * @param key - key ni sya
     */
    public HoleContent(Key key){

    }

    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }

    public boolean isCovered() {
        return this.isCovered;
    }

    public Key getKey() {
        return content;
    }

    public Key getContent() {
        return content;
    }

    public void setContent(Key content) {
        this.content = content;
    }

    public void setCovered(boolean covered) {
        isCovered = covered;
    }
}
