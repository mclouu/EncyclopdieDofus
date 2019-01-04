/*
 * Created by Romain Mathieu => https://github.com/mclouu
 */

package com.romain.mathieu.encyclopdiedofus.feature.Model;


public class CardData {

    private String name;
    private String lvl;
    private String imageURL;
    private String description;


    public CardData(String mName, String mLvl, String mImageURL, String mdescription) {

        this.name = mName;
        this.imageURL = mImageURL;
        this.lvl = mLvl;
        this.description = mdescription;

    }


    public String getName() {
        return name;
    }

    public String getLvl() {
        return lvl;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getDescription() {
        return description;
    }

}
