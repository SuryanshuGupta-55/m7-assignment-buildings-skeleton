package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
    private String mOwner;
    private boolean mPool;
    public House(int length,int width,int lotLength,int lotWidth){
        super(length,width,lotLength,lotWidth);
        mOwner=null;
        mPool=false;
    }
    public House(int length,int width,int lotLength,int lotWidth,String owner){
        super(length,width,lotLength,lotWidth);
        mOwner=owner;
        mPool=false;
    }

    public House(int length,int width,int lotLength,int lotWidth,String owner,boolean pool){
        super(length,width,lotLength,lotWidth);
        mOwner=owner;
        mPool=pool;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    @Override
    public String toString() {
        if (calcLotArea() > calcBuildingArea()) {
            if (mOwner != null)
                return "Owner: " + mOwner + ";" + mPool + ";" + "has a big open space";
            else
                return "Owner: " + "n/a" + ";" + mPool + ";" + "has a big open space";
        } else {
            if (mOwner != null)
                return "Owner: " + mOwner + ";" + mPool + ";";
            else
                return "Owner: " + "n/a" + ";" + mPool + ";";
        }
    }

    @Override
    public boolean equals(Object o) {
        House house=(House)o;
        if(o instanceof House && (mPool==house.hasPool()) && (calcBuildingArea() == house.calcBuildingArea()))
            return true;
         else
             return false;
    }
    // TODO - Put your code here.
    
}
