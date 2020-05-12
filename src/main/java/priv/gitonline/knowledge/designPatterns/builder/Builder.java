package priv.gitonline.knowledge.designPatterns.builder;

/**
 * 建造者接口
 */
public abstract class Builder {

    public abstract void buildA();

    public abstract void buildB();

    public abstract void buildC();

    public abstract Product getProduct();
}
