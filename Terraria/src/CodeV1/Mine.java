package CodeV1;


public class Mine extends Local {
    private final int numero; /*les finals c''est a degager*/
    private final String type; /*les finals c''est a degager*/
    private int capacite;
    private int min=0;
    private int max=50;
    private int stock;

    public Mine(int numero, String type) {
        /*super("Mine", "M" + type.charAt(0)); .... ok */
        this.numero = numero;
        this.type = type;
        this.capacite = (int) (max + Math.random() * ( max - min ));
    }

    @Override
    public String getinfo(){
        return "" +
                "M " + this.numero + "\n" +
                /** sa ligne et sa colonne**/
                "\t"+ this.type + this.stock + "/" + this.capacite;
    }

    public int getStock() {
        this.stock=capacite;
        return stock;
    }
}