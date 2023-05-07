package springtestcase.productorderservice.product;

import org.springframework.util.Assert;

class AddProductRequest {
    private final String name;
    private final int price;
    private final DiscountPolicy discountPolicy;

    public AddProductRequest(String name, int price, DiscountPolicy discountPolicy) {
        this.name = name;
        this.price = price;
        this.discountPolicy = discountPolicy;
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "상품명은 필수입니다.");
        Assert.notNull(discountPolicy, "상품명은 필수입니다.");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }
}
