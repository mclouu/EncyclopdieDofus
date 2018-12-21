/*
 * Created by Romain Mathieu => https://github.com/mclouu
 */

package com.romain.mathieu.encyclopdiedofus.feature.Model;


public class CardData {

    private String name;
    private String lvl;
    private String imageURL;


    public CardData(String mName, String mLvl, String mImageURL) {

        this.name = mName;
        this.imageURL = mImageURL;
        this.lvl = mLvl;

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

}
