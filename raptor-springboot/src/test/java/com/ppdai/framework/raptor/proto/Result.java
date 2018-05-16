// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: com/ppdai/framework/raptor/proto/Result.proto
package com.ppdai.framework.raptor.proto;

import com.ppdai.framework.raptor.annotation.RaptorMessage;
import com.squareup.wire.*;
import com.squareup.wire.internal.Internal;
import okio.ByteString;

import java.io.IOException;
import java.util.List;

@RaptorMessage(
    protoFile = "Result"
)
public final class Result extends Message<Result, Result.Builder> {
  public static final ProtoAdapter<Result> ADAPTER = new ProtoAdapter_Result();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_URL = "";

  public static final String DEFAULT_TITLE = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  private String url;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  private String title;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  private List<String> snippets;

  public Result() {
    super(ADAPTER, ByteString.EMPTY);
  }

  public Result(String url, String title, List<String> snippets) {
    this(url, title, snippets, ByteString.EMPTY);
  }

  public Result(String url, String title, List<String> snippets, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.url = url;
    this.title = title;
    this.snippets = Internal.immutableCopyOf("snippets", snippets);
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url=url;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title=title;
  }

  public List<String> getSnippets() {
    return this.snippets;
  }

  public void setSnippets(List<String> snippets) {
    this.snippets=snippets;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.url = url;
    builder.title = title;
    builder.snippets = Internal.copyOf("snippets", snippets);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Result)) return false;
    Result o = (Result) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(url, o.url)
        && Internal.equals(title, o.title)
        && snippets.equals(o.snippets);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (url != null ? url.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + snippets.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (url != null) builder.append(", url=").append(url);
    if (title != null) builder.append(", title=").append(title);
    if (!snippets.isEmpty()) builder.append(", snippets=").append(snippets);
    return builder.replace(0, 2, "Result{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Result, Builder> {
    public String url;

    public String title;

    public List<String> snippets;

    public Builder() {
      snippets = Internal.newMutableList();
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder snippets(List<String> snippets) {
      Internal.checkElementsNotNull(snippets);
      this.snippets = snippets;
      return this;
    }

    @Override
    public Result build() {
      return new Result(url, title, snippets, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Result extends ProtoAdapter<Result> {
    public ProtoAdapter_Result() {
      super(FieldEncoding.LENGTH_DELIMITED, Result.class);
    }

    @Override
    public int encodedSize(Result value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.url)
          + ProtoAdapter.STRING.encodedSizeWithTag(2, value.title)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, value.snippets)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Result value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.title);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 3, value.snippets);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Result decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.url(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.snippets.add(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public Result redact(Result value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}