/*
 * OpsGenie REST API
 * OpsGenie API Description
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ifountain.opsgenie.client.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;

/**
 * AssignAlertRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-25T18:12:50.652+03:00")
public class AssignAlertRequest {
  @JsonProperty("user")
  private String user = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("owner")
  private UserRecipient owner = null;

  public AssignAlertRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Display name of the request owner
   * @return user
  **/
  @ApiModelProperty(value = "Display name of the request owner")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public AssignAlertRequest note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Additional note that will be added while creating the alert
   * @return note
  **/
  @ApiModelProperty(value = "Additional note that will be added while creating the alert")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public AssignAlertRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source field of the alert. Default value is IP address of the incoming request
   * @return source
  **/
  @ApiModelProperty(value = "Source field of the alert. Default value is IP address of the incoming request")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public AssignAlertRequest owner(UserRecipient owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  public UserRecipient getOwner() {
    return owner;
  }

  public void setOwner(UserRecipient owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AssignAlertRequest assignAlertRequest = (AssignAlertRequest) o;
    return ObjectUtils.equals(this.user, assignAlertRequest.user) &&
    ObjectUtils.equals(this.note, assignAlertRequest.note) &&
    ObjectUtils.equals(this.source, assignAlertRequest.source) &&
    ObjectUtils.equals(this.owner, assignAlertRequest.owner);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(user, note, source, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignAlertRequest {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

