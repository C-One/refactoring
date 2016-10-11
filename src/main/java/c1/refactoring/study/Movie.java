package c1.refactoring.study;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by jykang on 2016. 10. 11..
 */
@AllArgsConstructor//모든 인자를 가진 생성자
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    @Getter
    private String title;
    @Getter @Setter
    private int priceCode;

}
