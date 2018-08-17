// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: com/ppdai/framework/raptor/proto/Dog.proto
package com.ppdai.framework.raptor.proto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ppdai.framework.raptor.annotation.RaptorField;
import com.ppdai.framework.raptor.annotation.RaptorMessage;

import java.util.Objects;

@RaptorMessage(
    protoFile = "Dog"
)
public final class Dog {
  private static final long serialVersionUID = 0L;

  @RaptorField(
      fieldType = "string",
      order = 1,
      name = "name"
  )
  @JsonProperty("name")
  private String name;

  public Dog() {
  }

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name=name;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Dog)) return false;
    Dog o = (Dog) other;
    return true
        && Objects.equals(name, o.name);
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = result * 37 + (name != null ? name.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    return builder.replace(0, 2, "Dog{").append('}').toString();
  }
}