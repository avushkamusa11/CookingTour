package exam.cooking.tour.dto;

import exam.cooking.tour.entities.TypeMeasuring;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateProductCategoryDto {
    private String name;
    private TypeMeasuring typeMeasuring;
}