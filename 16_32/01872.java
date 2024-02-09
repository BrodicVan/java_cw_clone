/**
 * @param categoryId id of category of this product
 * @param name name of this product
 * @param description description for this product
 * @param popularity product popularity
 */
public Product(long categoryId, String name, String description, int popularity){
    this.categoryId = categoryId;
    this.name = name;
    this.description = description;
    this.popularity = popularity;
}