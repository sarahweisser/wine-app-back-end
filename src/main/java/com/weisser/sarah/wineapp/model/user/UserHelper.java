package com.weisser.sarah.wineapp.model.user;


import org.springframework.util.StringUtils;

public class UserHelper {
    private User user;

    public UserHelper (User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFullName() {
        // TODO find most effiecient capacity for full name
        StringBuilder sb = new StringBuilder(100);
        if (StringUtils.hasLength(user.getTitle())) {
            sb.append(user.getTitle());
            sb.append(". ");
        }
        sb.append(user.getFirstName());
        sb.append(" ");
        sb.append(user.getLastName());
        return sb.toString();
    }
}
