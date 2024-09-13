package exam.cooking.tour.api;

import exam.cooking.tour.dto.CreateProductCategoryDto;
import exam.cooking.tour.dto.CreateProductDto;
import exam.cooking.tour.dto.ProductCategoryDto;
import exam.cooking.tour.dto.ProductDto;
import exam.cooking.tour.services.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-category")
public class ProductCategoryApi {
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping
    public List<ProductCategoryDto> getProductCategories(){
        return productCategoryService.getAll();
    }

    @PostMapping("/create")
    public void createProductCategory(@RequestBody CreateProductCategoryDto productCategoryDto){
        productCategoryService.save(productCategoryDto);
    }

    @GetMapping("/{productCategoryId}")
    public ProductCategoryDto get(@PathVariable(name = "productCategoryId") Long productCategoryId){
        return productCategoryService.getBy(productCategoryId);
    }

}
