package business.model;

import com.google.common.collect.ImmutableMap;
import java.util.Map;


/**
 *
 * Here the pattern factory method was applied.
 */
public abstract class OccurrenceType {
    private static final Map<String, OccurrenceTypeFactory> factoryMap =
            ImmutableMap.<String,OccurrenceTypeFactory>builder()
                    .put("THEFT",TheftFactory)
                    .put("ASSAULT", AssaultFactory).build();

    public abstract String getOccurrenceName();

    public static OccurrenceType getInstance(String type){
        OccurrenceTypeFactory occurrenceTypeFactory = (OccurrenceTypeFactory)factoryMap.get(type);
        return occurrenceTypeFactory.getInstance();

    }


}
