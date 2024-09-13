package exam.cooking.tour.dto;

import exam.cooking.tour.entities.Product;
import exam.cooking.tour.entities.TypeMeasuring;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProductCategoryDto {
    private Long id;
    private List<Product> products;
    private TypeMeasuring typeMeasuring;
}
