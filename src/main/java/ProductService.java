public class ProductService {
    public  int countByFilter(IFilter filter, ProductParty party){
        int count = 0 ;
        for(IProduct product : party.getProducts()){

            if (filter.apply(product.getName()))++count;
        }
        return count;
    }
    public  int checkAllWeighted(ProductParty party){
        int count = 0 ;
        for(IProduct product : party.getProducts()){

            if (product.getClass() == (new ProductWithWeight()).getClass() || product.getClass() == (new ProductWithWeightPackaged()).getClass())++count;
        }
        return count;
    }
}
