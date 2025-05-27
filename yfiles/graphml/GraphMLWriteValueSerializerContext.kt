// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata

/**
 * Special implementation of [IValueSerializerContext] that should be used in a GraphML write context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriteValueSerializerContext">Online Documentation</a>
 * 
 * @constructor Creates a new instance that wraps `context`
 * @param [context] The current write context
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriteValueSerializerContext%23GraphMLWriteValueSerializerContext-constructor-GraphMLWriteValueSerializerContext">Online Documentation</a>
 */
open external class GraphMLWriteValueSerializerContext (
  context: IWriteContext,
) : IValueSerializerContext {
  /**
   * Gets or sets the parent object if such an object currently exists.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriteValueSerializerContext%23owner">Online Documentation</a>
   */
  final var owner: Any?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriteValueSerializerContext%23GraphMLWriteValueSerializerContext-method-getValueSerializerFor">Online Documentation</a>
   */
  override fun getValueSerializerFor(
    type: IClassMetadata<*>,
  ): ValueSerializer?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriteValueSerializerContext%23GraphMLWriteValueSerializerContext-method-getValueSerializerFor">Online Documentation</a>
   */
  override fun getValueSerializerFor(
    property: Property,
  ): ValueSerializer?
  
  /**
   * Returns the wrapped [IWriteContext] for this serviceType, otherwise `null`
   * @param [type] The serviceType
   * @return the wrapped [IWriteContext] for this serviceType, otherwise `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLWriteValueSerializerContext%23GraphMLWriteValueSerializerContext-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  companion object : ClassMetadata<GraphMLWriteValueSerializerContext> {
  }
}
