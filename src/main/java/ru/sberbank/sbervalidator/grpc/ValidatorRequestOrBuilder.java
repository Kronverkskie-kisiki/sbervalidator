// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/ru/sberbank/sbervalidator/service/proto/ValidatorService.proto

// Protobuf Java Version: 3.25.1
package ru.sberbank.sbervalidator.grpc;

public interface ValidatorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ValidatorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; documentContents = 1;</code>
   */
  int getDocumentContentsCount();
  /**
   * <code>map&lt;string, string&gt; documentContents = 1;</code>
   */
  boolean containsDocumentContents(
      java.lang.String key);
  /**
   * Use {@link #getDocumentContentsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDocumentContents();
  /**
   * <code>map&lt;string, string&gt; documentContents = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDocumentContentsMap();
  /**
   * <code>map&lt;string, string&gt; documentContents = 1;</code>
   */
  /* nullable */
java.lang.String getDocumentContentsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; documentContents = 1;</code>
   */
  java.lang.String getDocumentContentsOrThrow(
      java.lang.String key);
}
