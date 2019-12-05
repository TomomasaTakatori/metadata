/*
 * api/service.proto
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: version not set
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Events distinguish between an artifact that is written by the execution (possibly as a cache), versus artifacts that are part of the declared output of the Execution. For more information on what DECLARED_ means, see the comment on the message.
 */
@JsonAdapter(MlMetadataEventType.Adapter.class)
public enum MlMetadataEventType {
  
  UNKNOWN("UNKNOWN"),
  
  DECLARED_OUTPUT("DECLARED_OUTPUT"),
  
  DECLARED_INPUT("DECLARED_INPUT"),
  
  INPUT("INPUT"),
  
  OUTPUT("OUTPUT");

  private String value;

  MlMetadataEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MlMetadataEventType fromValue(String value) {
    for (MlMetadataEventType b : MlMetadataEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MlMetadataEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MlMetadataEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MlMetadataEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MlMetadataEventType.fromValue(value);
    }
  }
}
