package org.lemon.transients;

import java.io.*;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年04月29日 17:50:00
 */
public class TransientUsage {

    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setAge(23);
        user.setName("zhangsan");
        String filePath = "D://template";
        serialize(user, filePath);
        User res = deSerialize(filePath);
        System.out.println("反序列化后age:" + res.getAge());
    }

    private static void serialize(User user, String path) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(user);
        oos.close();
    }

    private static User deSerialize(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)));
        User user = (User)ois.readObject();
        return user;
    }
}
