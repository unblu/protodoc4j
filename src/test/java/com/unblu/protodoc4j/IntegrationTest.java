package com.unblu.protodoc4j;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class IntegrationTest {

    private static final ObjectMapper MAPPER = createMapper();

    @Test
    void testExample() throws Exception {
        Path file = Paths.get("src/test/resources/example.json");
        Doc doc = runTest(file);

        assertThat(doc.getFiles()).hasSize(3);
        assertThat(doc.getScalarValueTypes()).hasSize(15);
    }

    @Test
    void testHello() throws Exception {
        Path file = Paths.get("src/test/resources/hello.json");
        Doc doc = runTest(file);

        assertThat(doc.getFiles()).hasSize(1);
        assertThat(doc.getScalarValueTypes()).hasSize(15);
    }

    private Doc runTest(Path file) throws IOException, JsonProcessingException, JsonMappingException {
        String originalContent = readString(file);

        Doc object = MAPPER.readValue(originalContent, Doc.class);
        String newContent = MAPPER.writeValueAsString(object);

        assertThatJson(newContent).isEqualTo(originalContent);
        return object;
    }

    private String readString(Path file) throws IOException {
        byte[] b = Files.readAllBytes(file);
        return new String(b, StandardCharsets.UTF_8);
    }

    private static ObjectMapper createMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        mapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE);
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        return mapper;
    }
}
