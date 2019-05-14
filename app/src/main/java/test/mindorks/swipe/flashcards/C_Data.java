package test.mindorks.swipe.flashcards;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class C_Data {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("url")
    @Expose
    private String imageUrl;



    @SerializedName("location")
    @Expose
    private String des;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLocation() {
        return des;
    }

    public void setLocation(String des) {
        this.des = des;
    }
}
