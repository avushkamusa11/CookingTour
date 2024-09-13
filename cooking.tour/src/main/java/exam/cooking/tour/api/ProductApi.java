package exam.cooking.tour.api;

import exam.cooking.tour.dto.CreateProductDto;
import exam.cooking.tour.dto.CreateUserDto;
import exam.cooking.tour.dto.ProductDto;
import exam.cooking.tour.dto.UserDto;
import exam.cooking.tour.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductApi {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDto> getProducts(){
        return productService.getAll();
    }

    @PostMapping("/create")
    public void createProduct(@RequestBody CreateProductDto productDto){
        productService.save(productDto);
    }

    @GetMapping("/{productId}")
    public ProductDto get(@PathVariable(name = "productId") Long productId){
        return productService.getBy(productId);
    }
}
