package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacebookAppTest {

    //Positive tests
    //Checks if (hardcoded list) profile fetch works correctly
    @Test
    public void testValidProfileWithFriends() {
        FacebookApp app = new FacebookApp();
        String[] friends = app.getFacebookFriends("https://facebook.com/isaksvarvar");
        assertArrayEquals(new String[]{"Anders Andersson", "Berit Bengtsson"}, friends);
    }

    //Valid link without friends should return empty list
    @Test
    public void testValidProfileWithNoFriends() {
        FacebookApp app = new FacebookApp();
        String[] friends = app.getFacebookFriends("https://facebook.com/unknown");
        assertArrayEquals(new String[]{}, friends);
    }

    //Negative tests
    //No profile link should return empty list
    @Test
    public void testEmptyProfileLink() {
        FacebookApp app = new FacebookApp();
        String[] friends = app.getFacebookFriends("");
        assertArrayEquals(new String[]{}, friends);
    }

    //Invalid link should also return empty list
    @Test
    public void testInvalidProfileLink() {
        FacebookApp app = new FacebookApp();
        String[] friends = app.getFacebookFriends("https://facebook.com/invalid");
        assertArrayEquals(new String[]{}, friends);
    }

    //A simple performace test could be implemented by taking a timestamp before the getFacebookFriends function starts and one after its done. Calculate the time it took and if it is within desired performace then pass, otherwise fail.

}
