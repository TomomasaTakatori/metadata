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
import org.openapitools.client.model.MlMetadataArtifact;

/**
 * ApiCreateArtifactResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-29T15:59:29.714+09:00[Asia/Tokyo]")
public class ApiCreateArtifactResponse {
  public static final String SERIALIZED_NAME_ARTIFACT = "artifact";
  @SerializedName(SERIALIZED_NAME_ARTIFACT)
  private MlMetadataArtifact artifact = null;

  public ApiCreateArtifactResponse artifact(MlMetadataArtifact artifact) {
    this.artifact = artifact;
    return this;
  }

   /**
   * Get artifact
   * @return artifact
  **/
  @ApiModelProperty(value = "")
  public MlMetadataArtifact getArtifact() {
    return artifact;
  }

  public void setArtifact(MlMetadataArtifact artifact) {
    this.artifact = artifact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCreateArtifactResponse apiCreateArtifactResponse = (ApiCreateArtifactResponse) o;
    return Objects.equals(this.artifact, apiCreateArtifactResponse.artifact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCreateArtifactResponse {\n");
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
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

