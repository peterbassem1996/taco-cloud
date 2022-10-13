package sia.tacocloud;

import lombok.Data;

@Data
public class Ingredient {
    private String id;
    private String name;
    private final Type type;
    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
    
}
