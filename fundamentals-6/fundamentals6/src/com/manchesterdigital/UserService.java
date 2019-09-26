package com.manchesterdigital;

public class UserService {

    private static User user;

    static {
        user = new User("April");
        user.setId(1L);
    }

    public User retrieveUser(Long id) {
        if (!id.equals(user.getId())) {
//        This is an example of an unchecked example as there is no user with the value of Long.MAX_VALUE.
//        The compiler does not know that there is not a user with this ID therefore it is unchecked.
            throw new UserNotFoundException("User not found matching ID: " + id);
        }

        return user;

    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        User retrievedUser = userService.retrieveUser(1L);
        System.out.println(retrievedUser.toString());

    }
}
