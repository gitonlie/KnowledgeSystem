package priv.gitonline.knowledge.designPatterns.proxy;

public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("保存用户信息");
    }
}
