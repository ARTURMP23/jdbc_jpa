package anotacao;

import java.lang.annotation.*;

/**
 * @author artur.matos
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
