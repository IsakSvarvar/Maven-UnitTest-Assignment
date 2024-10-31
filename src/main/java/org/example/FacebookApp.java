package org.example;

public class FacebookApp {
    //Pretend code to get friends from profile
    public String[] getFacebookFriends(String profileLink) {
        if (profileLink.equals("https://facebook.com/isaksvarvar")) {
            return new String[] {"Anders Andersson", "Berit Bengtsson"};
        }
        else {
            return new String[]{};
        }
    }
}
