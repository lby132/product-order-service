package springtestcase.productorderservice.product;

class Product {
    private final String name;
    private final int price;
    private final DiscountPolicy discountPolicy;

    private Long id;

    public Product(String name, int price, DiscountPolicy discountPolicy) {
        this.name = name;
        this.price = price;
        this.discountPolicy = discountPolicy;
    }

    public void assignId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
