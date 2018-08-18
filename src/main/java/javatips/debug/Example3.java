package javatips.debug;

/**
 * 回到上一步
 *
 * @author biezhi
 * @date 2018/8/14
 */
public class Example3 {

    private static int excludeO(String str) {
        str = str.toLowerCase();
        int count = str.replaceAll("[^o]+", "").length();
        System.out.println("asdasdad");
        return count;
    }

    static class User {
        String username;
        String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    public static void main(String[] args) {
        User user = new User("biezhi", "123456");
        if(user.username.isEmpty()){
            System.out.println("username is empty.");
        }
        String name  = "Hello W0rld";
        int    count = excludeO(name);
        System.out.println(count);
    }

}
