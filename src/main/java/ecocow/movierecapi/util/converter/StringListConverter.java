package ecocow.movierecapi.util.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.List;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        return attribute == null ? null : String.join(",", attribute);

    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        return dbData == null ? null : Arrays.asList(dbData.split(","));
    }
}
