// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloServer.proto

package net.devh.boot.grpc.examples.lib;

/**
 * Protobuf type {@code HelloTwoRequest}
 */
public  final class HelloTwoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HelloTwoRequest)
    HelloTwoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloTwoRequest.newBuilder() to construct.
  private HelloTwoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloTwoRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HelloTwoRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            net.devh.boot.grpc.examples.lib.MetaData.Builder subBuilder = null;
            if (requestCase_ == 1) {
              subBuilder = ((net.devh.boot.grpc.examples.lib.MetaData) request_).toBuilder();
            }
            request_ =
                input.readMessage(net.devh.boot.grpc.examples.lib.MetaData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((net.devh.boot.grpc.examples.lib.MetaData) request_);
              request_ = subBuilder.buildPartial();
            }
            requestCase_ = 1;
            break;
          }
          case 18: {
            net.devh.boot.grpc.examples.lib.File.Builder subBuilder = null;
            if (requestCase_ == 2) {
              subBuilder = ((net.devh.boot.grpc.examples.lib.File) request_).toBuilder();
            }
            request_ =
                input.readMessage(net.devh.boot.grpc.examples.lib.File.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((net.devh.boot.grpc.examples.lib.File) request_);
              request_ = subBuilder.buildPartial();
            }
            requestCase_ = 2;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.devh.boot.grpc.examples.lib.HelloServerProto.internal_static_HelloTwoRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.devh.boot.grpc.examples.lib.HelloServerProto.internal_static_HelloTwoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.devh.boot.grpc.examples.lib.HelloTwoRequest.class, net.devh.boot.grpc.examples.lib.HelloTwoRequest.Builder.class);
  }

  private int requestCase_ = 0;
  private java.lang.Object request_;
  public enum RequestCase
      implements com.google.protobuf.Internal.EnumLite {
    METADATA(1),
    FILE(2),
    REQUEST_NOT_SET(0);
    private final int value;
    private RequestCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RequestCase valueOf(int value) {
      return forNumber(value);
    }

    public static RequestCase forNumber(int value) {
      switch (value) {
        case 1: return METADATA;
        case 2: return FILE;
        case 0: return REQUEST_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RequestCase
  getRequestCase() {
    return RequestCase.forNumber(
        requestCase_);
  }

  public static final int METADATA_FIELD_NUMBER = 1;
  /**
   * <code>.MetaData metadata = 1;</code>
   */
  public boolean hasMetadata() {
    return requestCase_ == 1;
  }
  /**
   * <code>.MetaData metadata = 1;</code>
   */
  public net.devh.boot.grpc.examples.lib.MetaData getMetadata() {
    if (requestCase_ == 1) {
       return (net.devh.boot.grpc.examples.lib.MetaData) request_;
    }
    return net.devh.boot.grpc.examples.lib.MetaData.getDefaultInstance();
  }
  /**
   * <code>.MetaData metadata = 1;</code>
   */
  public net.devh.boot.grpc.examples.lib.MetaDataOrBuilder getMetadataOrBuilder() {
    if (requestCase_ == 1) {
       return (net.devh.boot.grpc.examples.lib.MetaData) request_;
    }
    return net.devh.boot.grpc.examples.lib.MetaData.getDefaultInstance();
  }

  public static final int FILE_FIELD_NUMBER = 2;
  /**
   * <code>.File file = 2;</code>
   */
  public boolean hasFile() {
    return requestCase_ == 2;
  }
  /**
   * <code>.File file = 2;</code>
   */
  public net.devh.boot.grpc.examples.lib.File getFile() {
    if (requestCase_ == 2) {
       return (net.devh.boot.grpc.examples.lib.File) request_;
    }
    return net.devh.boot.grpc.examples.lib.File.getDefaultInstance();
  }
  /**
   * <code>.File file = 2;</code>
   */
  public net.devh.boot.grpc.examples.lib.FileOrBuilder getFileOrBuilder() {
    if (requestCase_ == 2) {
       return (net.devh.boot.grpc.examples.lib.File) request_;
    }
    return net.devh.boot.grpc.examples.lib.File.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (requestCase_ == 1) {
      output.writeMessage(1, (net.devh.boot.grpc.examples.lib.MetaData) request_);
    }
    if (requestCase_ == 2) {
      output.writeMessage(2, (net.devh.boot.grpc.examples.lib.File) request_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (net.devh.boot.grpc.examples.lib.MetaData) request_);
    }
    if (requestCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (net.devh.boot.grpc.examples.lib.File) request_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.devh.boot.grpc.examples.lib.HelloTwoRequest)) {
      return super.equals(obj);
    }
    net.devh.boot.grpc.examples.lib.HelloTwoRequest other = (net.devh.boot.grpc.examples.lib.HelloTwoRequest) obj;

    boolean result = true;
    result = result && getRequestCase().equals(
        other.getRequestCase());
    if (!result) return false;
    switch (requestCase_) {
      case 1:
        result = result && getMetadata()
            .equals(other.getMetadata());
        break;
      case 2:
        result = result && getFile()
            .equals(other.getFile());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (requestCase_) {
      case 1:
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
        break;
      case 2:
        hash = (37 * hash) + FILE_FIELD_NUMBER;
        hash = (53 * hash) + getFile().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.devh.boot.grpc.examples.lib.HelloTwoRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code HelloTwoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HelloTwoRequest)
      net.devh.boot.grpc.examples.lib.HelloTwoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.devh.boot.grpc.examples.lib.HelloServerProto.internal_static_HelloTwoRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.devh.boot.grpc.examples.lib.HelloServerProto.internal_static_HelloTwoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.devh.boot.grpc.examples.lib.HelloTwoRequest.class, net.devh.boot.grpc.examples.lib.HelloTwoRequest.Builder.class);
    }

    // Construct using net.devh.boot.grpc.examples.lib.HelloTwoRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      requestCase_ = 0;
      request_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.devh.boot.grpc.examples.lib.HelloServerProto.internal_static_HelloTwoRequest_descriptor;
    }

    public net.devh.boot.grpc.examples.lib.HelloTwoRequest getDefaultInstanceForType() {
      return net.devh.boot.grpc.examples.lib.HelloTwoRequest.getDefaultInstance();
    }

    public net.devh.boot.grpc.examples.lib.HelloTwoRequest build() {
      net.devh.boot.grpc.examples.lib.HelloTwoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public net.devh.boot.grpc.examples.lib.HelloTwoRequest buildPartial() {
      net.devh.boot.grpc.examples.lib.HelloTwoRequest result = new net.devh.boot.grpc.examples.lib.HelloTwoRequest(this);
      if (requestCase_ == 1) {
        if (metadataBuilder_ == null) {
          result.request_ = request_;
        } else {
          result.request_ = metadataBuilder_.build();
        }
      }
      if (requestCase_ == 2) {
        if (fileBuilder_ == null) {
          result.request_ = request_;
        } else {
          result.request_ = fileBuilder_.build();
        }
      }
      result.requestCase_ = requestCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.devh.boot.grpc.examples.lib.HelloTwoRequest) {
        return mergeFrom((net.devh.boot.grpc.examples.lib.HelloTwoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.devh.boot.grpc.examples.lib.HelloTwoRequest other) {
      if (other == net.devh.boot.grpc.examples.lib.HelloTwoRequest.getDefaultInstance()) return this;
      switch (other.getRequestCase()) {
        case METADATA: {
          mergeMetadata(other.getMetadata());
          break;
        }
        case FILE: {
          mergeFile(other.getFile());
          break;
        }
        case REQUEST_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      net.devh.boot.grpc.examples.lib.HelloTwoRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.devh.boot.grpc.examples.lib.HelloTwoRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int requestCase_ = 0;
    private java.lang.Object request_;
    public RequestCase
        getRequestCase() {
      return RequestCase.forNumber(
          requestCase_);
    }

    public Builder clearRequest() {
      requestCase_ = 0;
      request_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        net.devh.boot.grpc.examples.lib.MetaData, net.devh.boot.grpc.examples.lib.MetaData.Builder, net.devh.boot.grpc.examples.lib.MetaDataOrBuilder> metadataBuilder_;
    /**
     * <code>.MetaData metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return requestCase_ == 1;
    }
    /**
     * <code>.MetaData metadata = 1;</code>
     */
    public net.devh.boot.grpc.examples.lib.MetaData getMetadata() {
      if (metadataBuilder_ == null) {
        if (requestCase_ == 1) {
          return (net.devh.boot.grpc.examples.lib.MetaData) request_;
        }
        return net.devh.boot.grpc.examples.lib.MetaData.getDefaultInstance();
      } else {
        if (requestCase_ == 1) {
          return metadataBuilder_.getMessage();
        }
        return net.devh.boot.grpc.examples.lib.MetaData.getDefaultInstance();
      }
    }
    /**
     * <code>.MetaData metadata = 1;</code>
     */
    public Builder setMetadata(net.devh.boot.grpc.examples.lib.MetaData value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }
      requestCase_ = 1;
      return this;
    }
    /**
     * <code>.MetaData metadata = 1;</code>
     */
    public Builder setMetadata(
        net.devh.boot.grpc.examples.lib.MetaData.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        request_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      requestCase_ = 1;
      return this;
    }
    /**
     * <code>.MetaData metadata = 1;</code>
     */
    public Builder mergeMetadata(net.devh.boot.grpc.examples.lib.MetaData value) {
      if (metadataBuilder_ == null) {
        if (requestCase_ == 1 &&
            request_ != net.devh.boot.grpc.examples.lib.MetaData.getDefaultInstance()) {
          request_ = net.devh.boot.grpc.examples.lib.MetaData.newBuilder((net.devh.boot.grpc.examples.lib.MetaData) request_)
              .mergeFrom(value).buildPartial();
        } else {
          request_ = value;
        }
        onChanged();
      } else {
        if (requestCase_ == 1) {
          metadataBuilder_.mergeFrom(value);
        }
        metadataBuilder_.setMessage(value);
      }
      requestCase_ = 1;
      return this;
    }
    /**
     * <code>.MetaData metadata = 1;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        if (requestCase_ == 1) {
          requestCase_ = 0;
          request_ = null;
          onChanged();
        }
      } else {
        if (requestCase_ == 1) {
          requestCase_ = 0;
          request_ = null;
        }
        metadataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.MetaData metadata = 1;</code>
     */
    public net.devh.boot.grpc.examples.lib.MetaData.Builder getMetadataBuilder() {
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.MetaData metadata = 1;</code>
     */
    public net.devh.boot.grpc.examples.lib.MetaDataOrBuilder getMetadataOrBuilder() {
      if ((requestCase_ == 1) && (metadataBuilder_ != null)) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        if (requestCase_ == 1) {
          return (net.devh.boot.grpc.examples.lib.MetaData) request_;
        }
        return net.devh.boot.grpc.examples.lib.MetaData.getDefaultInstance();
      }
    }
    /**
     * <code>.MetaData metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.devh.boot.grpc.examples.lib.MetaData, net.devh.boot.grpc.examples.lib.MetaData.Builder, net.devh.boot.grpc.examples.lib.MetaDataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        if (!(requestCase_ == 1)) {
          request_ = net.devh.boot.grpc.examples.lib.MetaData.getDefaultInstance();
        }
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.devh.boot.grpc.examples.lib.MetaData, net.devh.boot.grpc.examples.lib.MetaData.Builder, net.devh.boot.grpc.examples.lib.MetaDataOrBuilder>(
                (net.devh.boot.grpc.examples.lib.MetaData) request_,
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      requestCase_ = 1;
      onChanged();;
      return metadataBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        net.devh.boot.grpc.examples.lib.File, net.devh.boot.grpc.examples.lib.File.Builder, net.devh.boot.grpc.examples.lib.FileOrBuilder> fileBuilder_;
    /**
     * <code>.File file = 2;</code>
     */
    public boolean hasFile() {
      return requestCase_ == 2;
    }
    /**
     * <code>.File file = 2;</code>
     */
    public net.devh.boot.grpc.examples.lib.File getFile() {
      if (fileBuilder_ == null) {
        if (requestCase_ == 2) {
          return (net.devh.boot.grpc.examples.lib.File) request_;
        }
        return net.devh.boot.grpc.examples.lib.File.getDefaultInstance();
      } else {
        if (requestCase_ == 2) {
          return fileBuilder_.getMessage();
        }
        return net.devh.boot.grpc.examples.lib.File.getDefaultInstance();
      }
    }
    /**
     * <code>.File file = 2;</code>
     */
    public Builder setFile(net.devh.boot.grpc.examples.lib.File value) {
      if (fileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
        onChanged();
      } else {
        fileBuilder_.setMessage(value);
      }
      requestCase_ = 2;
      return this;
    }
    /**
     * <code>.File file = 2;</code>
     */
    public Builder setFile(
        net.devh.boot.grpc.examples.lib.File.Builder builderForValue) {
      if (fileBuilder_ == null) {
        request_ = builderForValue.build();
        onChanged();
      } else {
        fileBuilder_.setMessage(builderForValue.build());
      }
      requestCase_ = 2;
      return this;
    }
    /**
     * <code>.File file = 2;</code>
     */
    public Builder mergeFile(net.devh.boot.grpc.examples.lib.File value) {
      if (fileBuilder_ == null) {
        if (requestCase_ == 2 &&
            request_ != net.devh.boot.grpc.examples.lib.File.getDefaultInstance()) {
          request_ = net.devh.boot.grpc.examples.lib.File.newBuilder((net.devh.boot.grpc.examples.lib.File) request_)
              .mergeFrom(value).buildPartial();
        } else {
          request_ = value;
        }
        onChanged();
      } else {
        if (requestCase_ == 2) {
          fileBuilder_.mergeFrom(value);
        }
        fileBuilder_.setMessage(value);
      }
      requestCase_ = 2;
      return this;
    }
    /**
     * <code>.File file = 2;</code>
     */
    public Builder clearFile() {
      if (fileBuilder_ == null) {
        if (requestCase_ == 2) {
          requestCase_ = 0;
          request_ = null;
          onChanged();
        }
      } else {
        if (requestCase_ == 2) {
          requestCase_ = 0;
          request_ = null;
        }
        fileBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.File file = 2;</code>
     */
    public net.devh.boot.grpc.examples.lib.File.Builder getFileBuilder() {
      return getFileFieldBuilder().getBuilder();
    }
    /**
     * <code>.File file = 2;</code>
     */
    public net.devh.boot.grpc.examples.lib.FileOrBuilder getFileOrBuilder() {
      if ((requestCase_ == 2) && (fileBuilder_ != null)) {
        return fileBuilder_.getMessageOrBuilder();
      } else {
        if (requestCase_ == 2) {
          return (net.devh.boot.grpc.examples.lib.File) request_;
        }
        return net.devh.boot.grpc.examples.lib.File.getDefaultInstance();
      }
    }
    /**
     * <code>.File file = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.devh.boot.grpc.examples.lib.File, net.devh.boot.grpc.examples.lib.File.Builder, net.devh.boot.grpc.examples.lib.FileOrBuilder> 
        getFileFieldBuilder() {
      if (fileBuilder_ == null) {
        if (!(requestCase_ == 2)) {
          request_ = net.devh.boot.grpc.examples.lib.File.getDefaultInstance();
        }
        fileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.devh.boot.grpc.examples.lib.File, net.devh.boot.grpc.examples.lib.File.Builder, net.devh.boot.grpc.examples.lib.FileOrBuilder>(
                (net.devh.boot.grpc.examples.lib.File) request_,
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      requestCase_ = 2;
      onChanged();;
      return fileBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:HelloTwoRequest)
  }

  // @@protoc_insertion_point(class_scope:HelloTwoRequest)
  private static final net.devh.boot.grpc.examples.lib.HelloTwoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.devh.boot.grpc.examples.lib.HelloTwoRequest();
  }

  public static net.devh.boot.grpc.examples.lib.HelloTwoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloTwoRequest>
      PARSER = new com.google.protobuf.AbstractParser<HelloTwoRequest>() {
    public HelloTwoRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HelloTwoRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloTwoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloTwoRequest> getParserForType() {
    return PARSER;
  }

  public net.devh.boot.grpc.examples.lib.HelloTwoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

