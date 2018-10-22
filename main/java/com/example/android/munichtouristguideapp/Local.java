package com.example.android.munichtouristguideapp;

public class Local {
    private String mlocal;
    private String maddress;
    private String mtelephone;
    private String mdescription;
    private int mImageResourceId;

    public Local(String local, String address, String telephone, String description,int imageResourceId) {
        mlocal=local;
        maddress=address;
        mtelephone=telephone;
        mdescription=description;
        mImageResourceId = imageResourceId;
    }
    public String getlocal() {
        return mlocal;
    }
    public String getaddress() {
        return maddress;
    }
    public String gettelephone() {return mtelephone;}
    public String getdescription() {
        return mdescription;
    }
    public int getImageResourceId() {return mImageResourceId;}

    @Override
    public String toString() {
        return "Place{" +
                "mlocal='" + mlocal + '\'' +
                ", maddress='" + maddress + '\'' +
                "mtelephone='" + mtelephone + '\'' +
                ", mdescription='" + mdescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
