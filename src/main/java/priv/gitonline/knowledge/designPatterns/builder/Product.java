package priv.gitonline.knowledge.designPatterns.builder;

/**
 * 具体的产品
 */
public class Product {

    private String buildA;//第一步
    private String buildB;//第二步
    private String buildC;//第三步


    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public void descript(){
        String text = buildA +"=>"+buildB+"=>"+buildC;
        System.out.println(text);
    }

}
