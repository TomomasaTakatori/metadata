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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.MlMetadataArtifactStructType;

/**
 * MlMetadataDictArtifactStructType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-29T15:59:29.714+09:00[Asia/Tokyo]")
public class MlMetadataDictArtifactStructType {
  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, MlMetadataArtifactStructType> properties = new HashMap<String, MlMetadataArtifactStructType>();

  public static final String SERIALIZED_NAME_NONE_TYPE_NOT_REQUIRED = "none_type_not_required";
  @SerializedName(SERIALIZED_NAME_NONE_TYPE_NOT_REQUIRED)
  private Boolean noneTypeNotRequired;

  public static final String SERIALIZED_NAME_EXTRA_PROPERTIES_TYPE = "extra_properties_type";
  @SerializedName(SERIALIZED_NAME_EXTRA_PROPERTIES_TYPE)
  private MlMetadataArtifactStructType extraPropertiesType = null;

  public MlMetadataDictArtifactStructType properties(Map<String, MlMetadataArtifactStructType> properties) {
    this.properties = properties;
    return this;
  }

  public MlMetadataDictArtifactStructType putPropertiesItem(String key, MlMetadataArtifactStructType propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, MlMetadataArtifactStructType>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Underlying properties for the type.
   * @return properties
  **/
  @ApiModelProperty(value = "Underlying properties for the type.")
  public Map<String, MlMetadataArtifactStructType> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, MlMetadataArtifactStructType> properties) {
    this.properties = properties;
  }

  public MlMetadataDictArtifactStructType noneTypeNotRequired(Boolean noneTypeNotRequired) {
    this.noneTypeNotRequired = noneTypeNotRequired;
    return this;
  }

   /**
   * If true, then if properties[\&quot;foo\&quot;] can be None, then that key is not required.
   * @return noneTypeNotRequired
  **/
  @ApiModelProperty(value = "If true, then if properties[\"foo\"] can be None, then that key is not required.")
  public Boolean getNoneTypeNotRequired() {
    return noneTypeNotRequired;
  }

  public void setNoneTypeNotRequired(Boolean noneTypeNotRequired) {
    this.noneTypeNotRequired = noneTypeNotRequired;
  }

  public MlMetadataDictArtifactStructType extraPropertiesType(MlMetadataArtifactStructType extraPropertiesType) {
    this.extraPropertiesType = extraPropertiesType;
    return this;
  }

   /**
   * Get extraPropertiesType
   * @return extraPropertiesType
  **/
  @ApiModelProperty(value = "")
  public MlMetadataArtifactStructType getExtraPropertiesType() {
    return extraPropertiesType;
  }

  public void setExtraPropertiesType(MlMetadataArtifactStructType extraPropertiesType) {
    this.extraPropertiesType = extraPropertiesType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MlMetadataDictArtifactStructType mlMetadataDictArtifactStructType = (MlMetadataDictArtifactStructType) o;
    return Objects.equals(this.properties, mlMetadataDictArtifactStructType.properties) &&
        Objects.equals(this.noneTypeNotRequired, mlMetadataDictArtifactStructType.noneTypeNotRequired) &&
        Objects.equals(this.extraPropertiesType, mlMetadataDictArtifactStructType.extraPropertiesType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, noneTypeNotRequired, extraPropertiesType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MlMetadataDictArtifactStructType {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    noneTypeNotRequired: ").append(toIndentedString(noneTypeNotRequired)).append("\n");
    sb.append("    extraPropertiesType: ").append(toIndentedString(extraPropertiesType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
