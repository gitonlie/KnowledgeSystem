package priv.gitonline.knowledge.designPatterns.builder;


/**
 * 指挥者
 */
public class Director {

    public Product create(){
        Product product = new Product();
        Builder builder = new BuilderImpl(product);
        builder.buildA();
        builder.buildB();
        builder.buildC();
        product = builder.getProduct();
        return product;
    }

}
