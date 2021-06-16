package az.library.model;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private Integer page;
    private Float purchasePrice;
    private Float salePrice;
    private Integer stock;
    private Float profit;
}
