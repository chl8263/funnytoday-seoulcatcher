package todday.funny.seoulcatcher.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Call implements Parcelable {
    // private User user;
    private String kind;
    private String age;
    private String name;
    private String address;
    private String latitude;
    private String longitude;


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    /*  public User getUser() {
          return user;
      }

      public void setUser(User user) {
          this.user = user;
      }
  */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Call() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.kind);
        dest.writeString(this.age);
        dest.writeString(this.name);
        dest.writeString(this.address);
        dest.writeString(this.latitude);
        dest.writeString(this.longitude);
    }

    protected Call(Parcel in) {
        this.kind = in.readString();
        this.age = in.readString();
        this.name = in.readString();
        this.address = in.readString();
        this.latitude = in.readString();
        this.longitude = in.readString();
    }

    public static final Creator<Call> CREATOR = new Creator<Call>() {
        @Override
        public Call createFromParcel(Parcel source) {
            return new Call(source);
        }

        @Override
        public Call[] newArray(int size) {
            return new Call[size];
        }
    };
}