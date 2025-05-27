// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IListEnumerable
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata

/**
 * An [IWriteContext] implementation that wraps a given instance and delegates most of the calls to it but allows for modifying [lookup][ChildWriteContext] and [serialization properties][ChildWriteContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ChildWriteContext] class that delegates to the provided context and returns the given value in [getCurrent][ChildWriteContext].
 * @param [parentContext] The parent context to delegate calls to.
 * @param [currentObject] The current object to return in [getCurrent][ChildWriteContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23ChildWriteContext-constructor-ChildWriteContext(IWriteContext,any)">Online Documentation</a>
 * 
 * @property parentContext
 * Gets the parent context to which most calls are delegated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23parentContext">Online Documentation</a>
 */
open external class ChildWriteContext (
final val parentContext: IWriteContext,
currentObject: Any?  = definedExternally) : IWriteContext {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23graph">Online Documentation</a>
   */
  final override val graph: IGraph
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23objectStack">Online Documentation</a>
   */
  final override val objectStack: IListEnumerable<Any>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23writeEvents">Online Documentation</a>
   */
  open override val writeEvents: IWriteEvents
  
  /**
   * Gets or sets the writer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23writer">Online Documentation</a>
   */
  final override var writer: IXmlWriter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23ChildWriteContext-method-getCurrent">Online Documentation</a>
   */
  final override fun <T> getCurrent(
    itemType: IClassMetadata<T>,
  ): T?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23ChildWriteContext-method-getSerializationProperty">Online Documentation</a>
   */
  override fun <T : Any> getSerializationProperty(
    key: SerializationPropertyKey<T>,
  ): T?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23ChildWriteContext-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  /**
   * Removes a local lookup override that has been added using [setLookup][ChildWriteContext]
   * @param [T] The type key to remove.
   * @param [tType] The type key to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23ChildWriteContext-method-removeLookup">Online Documentation</a>
   */
  open fun <T> removeLookup(
    tType: IClassMetadata<T>,
  )
  
  /**
   * Removes a previously locally [set][ChildWriteContext] serialization property.
   * @param [key] The key for which the local property override should be removed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23ChildWriteContext-method-removeSerializationProperty">Online Documentation</a>
   */
  open fun removeSerializationProperty(
    key: SerializationPropertyKey<*>,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23ChildWriteContext-method-serializeCore">Online Documentation</a>
   */
  override fun <T> serializeCore(
    targetType: IClassMetadata<T>,
    context: IWriteContext,
    item: T?,
  )
  
  /**
   * Adds another lookup result to the local lookup override.
   * @param [T] The type to use as a key for the lookup.
   * @param [tType] The type to use as a key for the lookup.
   * @param [value] The value to provide for queries to `T`.
   * @see [removeLookup]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23ChildWriteContext-method-setLookup">Online Documentation</a>
   */
  open fun <T> setLookup(
    tType: IClassMetadata<T>,
    value: T?,
  )
  
  /**
   * Sets the local serialization property for the given key to the value.
   * @param [key] The key to override.
   * @param [value] The value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildWriteContext%23ChildWriteContext-method-setSerializationProperty">Online Documentation</a>
   */
  open fun <T : Any> setSerializationProperty(
    key: SerializationPropertyKey<T>,
    value: T?,
  )
  
  companion object : ClassMetadata<ChildWriteContext> {
  }
}
