package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    public Building(int length, int width, int lotlength, int lotwidth) {
        mLength = length;
        mWidth = width;
        mLotLength = lotlength;
        mLotWidth = lotwidth;
    }

    public int getLength() {
        return mLength;
    }

    public void setLength(int mLength) {
        this.mLength = mLength;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int mWidth) {
        this.mWidth = mWidth;
    }

    public int getLotLength() {
        return mLotLength;
    }

    public void setLotLength(int mLotLength) {
        this.mLotLength = mLotLength;
    }

    public int getLotWidth() {
        return mLotWidth;
    }

    public void setLotWidth(int mLotWidth) {
        this.mLotWidth = mLotWidth;
    }
    public int calcBuildingArea(){
        return getLength()*getWidth();
    }
    public int calcLotArea(){
        return getLotLength()*getLotWidth();
    }
    public String toString(){
        return "Owner:n/a";
    }
    // TODO - Put your code here.
    
}
