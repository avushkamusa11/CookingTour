package exam.cooking.tour.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class MeasuringUnits extends MainEntity{
    private String name;
    private BigDecimal quantity;
}
