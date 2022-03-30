import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaCatlogListTest {

    static class Product{
        public final String id;
        public final String name;

        public Product(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    static class CatelogService{

        List<Product> getProductsByCatelogId(String catelogId){
            Product p = new Product("1","1");
            return Arrays.asList(new Product[]{p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p,p, p, p,p, p});
        }
    }

    static class PricingService{

        static class Price {
            public Price(String productId, String price) {
                this.productId = productId;
                this.price = price;
            }

            public final String productId;
            public final String price;
        }
        Price getPrices(String productId){
            return new Price("1", "1");
        }
    }

    static class DiscountService{

        static class Discount {
            public Discount(String productId, String disc) {
                this.productId = productId;
                this.disc = disc;
            }

            public final String productId;
            public final String disc;
        }
        Optional<Discount> getDisc(String productId){
            return Optional.of(new Discount("", ""));
        }
    }

    static class CatelogListService {

        public static void main(String[] args) {
            CatelogListService catelogListService = new CatelogListService(new CatelogService(), new PricingService(), new DiscountService());
            catelogListService.getProductsByCatlogId("1", 10,10);
        }
        CatelogService catelogService;
        PricingService pricingService;
        DiscountService discountService;



        static class ListCatelog{
            public final String productId;
            public final String name;
            public final String price;
            public final String disc;

            ListCatelog(String productId, String name, String price, String disc) {
                this.productId = productId;
                this.name = name;
                this.price = price;
                this.disc = disc;
            }
        }

        public CatelogListService(CatelogService catelogService, PricingService pricingService, DiscountService discountService) {
            this.catelogService = catelogService;
            this.pricingService = pricingService;
            this.discountService = discountService;
        }
        int pageNumber;
        public int numberOfProductsInPage = 10;
        List<ListCatelog> getProductsByCatlogId(String catelogId, int pageNumber, int numberOfProductsInPage){
            final List<ListCatelog> listCatelogs = new ArrayList<>();;
                if(catelogId != null) {
                    List<Product>  products = catelogService.getProductsByCatelogId(catelogId);
                    if(products != null){
                        products.stream().skip((pageNumber-1)*numberOfProductsInPage).limit(numberOfProductsInPage).forEach(
                                each-> {
                                    String productId = each.id;
                                    PricingService.Price price = pricingService.getPrices(productId);
                                    Optional<DiscountService.Discount> discount = discountService.getDisc(productId);
                                    String disc = null;
                                    if(discount.get() != null){
                                        disc = discount.get().disc;
                                    }
                                    ListCatelog listCatelog = new ListCatelog(each.id, each.name, price.price, disc);
                                    listCatelogs.add(listCatelog);
                                }
                        );
                        /*for (Product  product : products) {
                            String productId = product.id;
                            PricingService.Price price = pricingService.getPrices(productId);
                            Optional<DiscountService.Discount> discount = discountService.getDisc(productId);
                            String disc = null;
                            if(discount.get() != null){
                                disc = discount.get().disc;
                            }
                            ListCatelog listCatelog = new ListCatelog(product.id, product.name, price.price, disc);
                            listCatelogs.add(listCatelog);
                        }*/
                    }
                }
            return listCatelogs;
        }
    }
}
