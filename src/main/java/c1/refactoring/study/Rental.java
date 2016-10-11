package c1.refactoring.study;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by jykang on 2016. 10. 11..
 */
@AllArgsConstructor
public class Rental {

    @Getter
    private Movie movie;
    @Getter
    private int daysRented;

}
