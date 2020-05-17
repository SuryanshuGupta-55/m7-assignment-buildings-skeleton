package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
    private String mBusinessName;
    private int mParkingSpace;
    private static int sTotalOffices=0;
    public Office(int length,int width,int lotLength,int lotWidth){
        super(length,width,lotLength,lotWidth);
        mBusinessName=null;
        mParkingSpace=0;
        sTotalOffices+=1;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String BusinessName){
        super(length,width,lotLength,lotWidth);
        mBusinessName=BusinessName;
        sTotalOffices+=1;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String BusinessName,int ParkingSpace){
        super(length,width,lotLength,lotWidth);
        mBusinessName=BusinessName;
        mParkingSpace=ParkingSpace;
        sTotalOffices+=1;
    }
    public String getBusinessName(){
        return mBusinessName;
    }
    public int getParkingSpaces(){
        return mParkingSpace;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public void setParkingSpaces(int mParkingSpace) {
        this.mParkingSpace = mParkingSpace;
    }

    @Override
    public String toString() {
        return "Buisness : " +
                (mBusinessName!=null?mBusinessName:"unoccupied") +
                (mParkingSpace!=0?"; has " + mParkingSpace + "parking spaces ": " ")+
                "(total offices:" + sTotalOffices + ")";

    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Office))  return false;
        Office office=(Office)o;
        return (calcBuildingArea()==office.calcBuildingArea()) && (getParkingSpaces()==office.getParkingSpaces());
    }
    // TODO - Put your code here.
    
}
