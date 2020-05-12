package priv.gitonline.knowledge.designPatterns.proxy;

/**
 * 静态代理
 */
public class StaticProxy implements IUserDao{

    private IUserDao dao;

    public StaticProxy(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public void save() {
        System.out.println("先查询表记录");
        dao.save();
        System.out.println("添加记录到另外一张表");
    }
}
