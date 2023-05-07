package springtestcase.productorderservice.product;

class ProductService {
    private final ProductPort productPort;

    ProductService(ProductPort productPort) {
        this.productPort = productPort;
    }

    public void addProduct(AddProductRequest request) {
        Product product = new Product(request.getName(), request.getPrice(), request.getDiscountPolicy());

        productPort.save(product);
    }

}
