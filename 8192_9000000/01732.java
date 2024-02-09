/**
 * 根据商品id获取商品的促销信息
 */
private PromotionProduct getPromotionProductById(Long productId, List<PromotionProduct> promotionProductList){
    for (PromotionProduct promotionProduct : promotionProductList) {
        if (productId.equals(promotionProduct.getId())) {
            return promotionProduct;
        }
    }
    return null;
}