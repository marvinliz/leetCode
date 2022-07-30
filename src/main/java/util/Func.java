package util;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Func {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T jsonToObject(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T jsonToObject(String json, TypeReference<T> typeReference) {
        try {
            return objectMapper.readValue(json, typeReference);
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }
    }

    public static String objectToJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }
    }
}
