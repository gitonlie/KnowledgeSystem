package priv.gitonline.knowledge.designPatterns.builder;

/**
 * 建造者实现类
 */
public class BuilderImpl extends Builder {

    private Product product;

    public BuilderImpl(Product product) {
        this.product = product;
    }

    @Override
    public void buildA() {
        product.setBuildA("第一步完成");
    }

    @Override
    public void buildB() {
        product.setBuildB("第二步完成");
    }

    @Override
    public void buildC() {
        product.setBuildC("第三步完成");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
