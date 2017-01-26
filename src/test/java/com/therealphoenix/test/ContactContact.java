package com.therealphoenix.test;

import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * Created by Hp on 24.01.2017.
 */
public class ContactContact {
    List<WebElement> faceBookList;
    List<WebElement> imageList;

    public boolean isFacebookList() {
        boolean result = false;

        for (int i = 0; i < faceBookList.size(); i++) {
            if (faceBookList.get(i).getAttribute("href").contains("facebook")) {
                result = true;
            }

        }
        return result;
    }

    public boolean isImageList() {

        return imageList.size() > 0;

    }

}
