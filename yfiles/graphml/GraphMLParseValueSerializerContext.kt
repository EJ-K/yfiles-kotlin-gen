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
 * Special implementation of [IValueSerializerContext] that should be used in a GraphML parse context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParseValueSerializerContext">Online Documentation</a>
 * 
 * @constructor Creates a new instance that wraps `context`
 * @param [context] The current write context
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParseValueSerializerContext%23GraphMLParseValueSerializerContext-constructor-GraphMLParseValueSerializerContext">Online Documentation</a>
 */
open external class GraphMLParseValueSerializerContext (
  context: IParseContext,
) : IValueSerializerContext {
  /**
   * Gets or sets the parent object if such an object currently exists.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParseValueSerializerContext%23owner">Online Documentation</a>
   */
  final var owner: Any?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParseValueSerializerContext%23GraphMLParseValueSerializerContext-method-getValueSerializerFor">Online Documentation</a>
   */
  override fun getValueSerializerFor(
    type: IClassMetadata<*>,
  ): ValueSerializer?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParseValueSerializerContext%23GraphMLParseValueSerializerContext-method-getValueSerializerFor">Online Documentation</a>
   */
  override fun getValueSerializerFor(
    property: Property,
  ): ValueSerializer?
  
  /**
   * Returns the wrapped [IParseContext] for this serviceType, otherwise `null`
   * @param [type] The serviceType
   * @return the wrapped [IParseContext] for this serviceType, otherwise `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLParseValueSerializerContext%23GraphMLParseValueSerializerContext-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  companion object : ClassMetadata<GraphMLParseValueSerializerContext> {
  }
}
