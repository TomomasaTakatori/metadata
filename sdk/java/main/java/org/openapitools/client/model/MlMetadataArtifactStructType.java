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
import org.openapitools.client.model.MlMetadataArtifactType;
import org.openapitools.client.model.MlMetadataDictArtifactStructType;
import org.openapitools.client.model.MlMetadataIntersectionArtifactStructType;
import org.openapitools.client.model.MlMetadataListArtifactStructType;
import org.openapitools.client.model.MlMetadataTupleArtifactStructType;
import org.openapitools.client.model.MlMetadataUnionArtifactStructType;

/**
 * The type of an ArtifactStruct. An artifact struct type represents an infinite set of artifact structs. It can specify the input or output type of an ExecutionType. See the more specific types referenced in the message for more details.
 */
@ApiModel(description = "The type of an ArtifactStruct. An artifact struct type represents an infinite set of artifact structs. It can specify the input or output type of an ExecutionType. See the more specific types referenced in the message for more details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-29T15:59:29.714+09:00[Asia/Tokyo]")
public class MlMetadataArtifactStructType {
  public static final String SERIALIZED_NAME_SIMPLE = "simple";
  @SerializedName(SERIALIZED_NAME_SIMPLE)
  private MlMetadataArtifactType simple = null;

  public static final String SERIALIZED_NAME_UNION_TYPE = "union_type";
  @SerializedName(SERIALIZED_NAME_UNION_TYPE)
  private MlMetadataUnionArtifactStructType unionType = null;

  public static final String SERIALIZED_NAME_INTERSECTION = "intersection";
  @SerializedName(SERIALIZED_NAME_INTERSECTION)
  private MlMetadataIntersectionArtifactStructType intersection = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private MlMetadataListArtifactStructType list = null;

  public static final String SERIALIZED_NAME_NONE = "none";
  @SerializedName(SERIALIZED_NAME_NONE)
  private Object none = null;

  public static final String SERIALIZED_NAME_ANY = "any";
  @SerializedName(SERIALIZED_NAME_ANY)
  private Object any = null;

  public static final String SERIALIZED_NAME_TUPLE = "tuple";
  @SerializedName(SERIALIZED_NAME_TUPLE)
  private MlMetadataTupleArtifactStructType tuple = null;

  public static final String SERIALIZED_NAME_DICT = "dict";
  @SerializedName(SERIALIZED_NAME_DICT)
  private MlMetadataDictArtifactStructType dict = null;

  public MlMetadataArtifactStructType simple(MlMetadataArtifactType simple) {
    this.simple = simple;
    return this;
  }

   /**
   * Get simple
   * @return simple
  **/
  @ApiModelProperty(value = "")
  public MlMetadataArtifactType getSimple() {
    return simple;
  }

  public void setSimple(MlMetadataArtifactType simple) {
    this.simple = simple;
  }

  public MlMetadataArtifactStructType unionType(MlMetadataUnionArtifactStructType unionType) {
    this.unionType = unionType;
    return this;
  }

   /**
   * Get unionType
   * @return unionType
  **/
  @ApiModelProperty(value = "")
  public MlMetadataUnionArtifactStructType getUnionType() {
    return unionType;
  }

  public void setUnionType(MlMetadataUnionArtifactStructType unionType) {
    this.unionType = unionType;
  }

  public MlMetadataArtifactStructType intersection(MlMetadataIntersectionArtifactStructType intersection) {
    this.intersection = intersection;
    return this;
  }

   /**
   * Get intersection
   * @return intersection
  **/
  @ApiModelProperty(value = "")
  public MlMetadataIntersectionArtifactStructType getIntersection() {
    return intersection;
  }

  public void setIntersection(MlMetadataIntersectionArtifactStructType intersection) {
    this.intersection = intersection;
  }

  public MlMetadataArtifactStructType list(MlMetadataListArtifactStructType list) {
    this.list = list;
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public MlMetadataListArtifactStructType getList() {
    return list;
  }

  public void setList(MlMetadataListArtifactStructType list) {
    this.list = list;
  }

  public MlMetadataArtifactStructType none(Object none) {
    this.none = none;
    return this;
  }

   /**
   * Get none
   * @return none
  **/
  @ApiModelProperty(value = "")
  public Object getNone() {
    return none;
  }

  public void setNone(Object none) {
    this.none = none;
  }

  public MlMetadataArtifactStructType any(Object any) {
    this.any = any;
    return this;
  }

   /**
   * Every ArtifactStruct is a member of this type.
   * @return any
  **/
  @ApiModelProperty(value = "Every ArtifactStruct is a member of this type.")
  public Object getAny() {
    return any;
  }

  public void setAny(Object any) {
    this.any = any;
  }

  public MlMetadataArtifactStructType tuple(MlMetadataTupleArtifactStructType tuple) {
    this.tuple = tuple;
    return this;
  }

   /**
   * Get tuple
   * @return tuple
  **/
  @ApiModelProperty(value = "")
  public MlMetadataTupleArtifactStructType getTuple() {
    return tuple;
  }

  public void setTuple(MlMetadataTupleArtifactStructType tuple) {
    this.tuple = tuple;
  }

  public MlMetadataArtifactStructType dict(MlMetadataDictArtifactStructType dict) {
    this.dict = dict;
    return this;
  }

   /**
   * Get dict
   * @return dict
  **/
  @ApiModelProperty(value = "")
  public MlMetadataDictArtifactStructType getDict() {
    return dict;
  }

  public void setDict(MlMetadataDictArtifactStructType dict) {
    this.dict = dict;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MlMetadataArtifactStructType mlMetadataArtifactStructType = (MlMetadataArtifactStructType) o;
    return Objects.equals(this.simple, mlMetadataArtifactStructType.simple) &&
        Objects.equals(this.unionType, mlMetadataArtifactStructType.unionType) &&
        Objects.equals(this.intersection, mlMetadataArtifactStructType.intersection) &&
        Objects.equals(this.list, mlMetadataArtifactStructType.list) &&
        Objects.equals(this.none, mlMetadataArtifactStructType.none) &&
        Objects.equals(this.any, mlMetadataArtifactStructType.any) &&
        Objects.equals(this.tuple, mlMetadataArtifactStructType.tuple) &&
        Objects.equals(this.dict, mlMetadataArtifactStructType.dict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simple, unionType, intersection, list, none, any, tuple, dict);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MlMetadataArtifactStructType {\n");
    sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
    sb.append("    unionType: ").append(toIndentedString(unionType)).append("\n");
    sb.append("    intersection: ").append(toIndentedString(intersection)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    none: ").append(toIndentedString(none)).append("\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
    sb.append("    tuple: ").append(toIndentedString(tuple)).append("\n");
    sb.append("    dict: ").append(toIndentedString(dict)).append("\n");
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

