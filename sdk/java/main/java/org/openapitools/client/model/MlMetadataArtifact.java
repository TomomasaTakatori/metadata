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
import org.openapitools.client.model.MlMetadataValue;

/**
 * MlMetadataArtifact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-29T15:59:29.714+09:00[Asia/Tokyo]")
public class MlMetadataArtifact {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private String typeId;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, MlMetadataValue> properties = new HashMap<String, MlMetadataValue>();

  public static final String SERIALIZED_NAME_CUSTOM_PROPERTIES = "custom_properties";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PROPERTIES)
  private Map<String, MlMetadataValue> customProperties = new HashMap<String, MlMetadataValue>();

  public MlMetadataArtifact id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the artifact.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the artifact.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MlMetadataArtifact typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * The id of an ArtifactType. Type must be specified when an artifact is created, and it cannot be changed.
   * @return typeId
  **/
  @ApiModelProperty(value = "The id of an ArtifactType. Type must be specified when an artifact is created, and it cannot be changed.")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public MlMetadataArtifact uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The uniform resource identifier of the physical artifact. May be empty if there is no physical artifact.
   * @return uri
  **/
  @ApiModelProperty(value = "The uniform resource identifier of the physical artifact. May be empty if there is no physical artifact.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public MlMetadataArtifact properties(Map<String, MlMetadataValue> properties) {
    this.properties = properties;
    return this;
  }

  public MlMetadataArtifact putPropertiesItem(String key, MlMetadataValue propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, MlMetadataValue>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Properties of the artifact. Properties must be specified in the ArtifactType.
   * @return properties
  **/
  @ApiModelProperty(value = "Properties of the artifact. Properties must be specified in the ArtifactType.")
  public Map<String, MlMetadataValue> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, MlMetadataValue> properties) {
    this.properties = properties;
  }

  public MlMetadataArtifact customProperties(Map<String, MlMetadataValue> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public MlMetadataArtifact putCustomPropertiesItem(String key, MlMetadataValue customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, MlMetadataValue>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

   /**
   * User provided custom properties which are not defined by its type.
   * @return customProperties
  **/
  @ApiModelProperty(value = "User provided custom properties which are not defined by its type.")
  public Map<String, MlMetadataValue> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, MlMetadataValue> customProperties) {
    this.customProperties = customProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MlMetadataArtifact mlMetadataArtifact = (MlMetadataArtifact) o;
    return Objects.equals(this.id, mlMetadataArtifact.id) &&
        Objects.equals(this.typeId, mlMetadataArtifact.typeId) &&
        Objects.equals(this.uri, mlMetadataArtifact.uri) &&
        Objects.equals(this.properties, mlMetadataArtifact.properties) &&
        Objects.equals(this.customProperties, mlMetadataArtifact.customProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, typeId, uri, properties, customProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MlMetadataArtifact {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
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
