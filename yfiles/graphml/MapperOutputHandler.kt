// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IMapper
import yfiles.lang.Action3
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata

/**
 * An implementation of the [OutputHandlerBase] class, that uses an [IMapper] to retrieve the values to output for each item and a [serializer][MapperOutputHandler] callback for the serialization or delegates to the [serializeCore][IWriteContext] callback.
 * @param [TKey] The type of the keys.
 * @param [TData] The type of the data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperOutputHandler">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [MapperOutputHandler] class using the provided key scope, the name, and the key type.
 * @param [keyType] The type of the keys.
 * @param [dataType] The type of the data.
 * @param [scope] The scope for the key definition attributes.
 * @param [name] The name for the key definition attributes.
 * @param [type] The type for the key definition attributes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperOutputHandler%23MapperOutputHandler-constructor-MapperOutputHandler">Online Documentation</a>
 */
open external class MapperOutputHandler<TKey, TData> (
  keyType: IClassMetadata<TKey>,
  dataType: IClassMetadata<TData>,
  scope: KeyScope,
  name: String?,
  type: KeyType,
) : OutputHandlerBase<TKey, TData> {
  /**
   * Gets or sets the mapper to use for querying the data for each item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperOutputHandler%23mapper">Online Documentation</a>
   */
  final var mapper: IMapper<TKey, TData>
  
  /**
   * Gets or sets the serialization callback to use for serializing the value in [writeValueCore][MapperOutputHandler].
   * @see [sourceType]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperOutputHandler%23serializer">Online Documentation</a>
   */
  final var serializer: Action3<IWriteContext, TData, IClassMetadata<*>>?
  
  /**
   * Gets or sets the source type of the serialization.
   * @see [serializer]
   * @see [HandleSerializationEventArgs]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperOutputHandler%23sourceType">Online Documentation</a>
   */
  final var sourceType: IClassMetadata<*>?
  
  /**
   * Obtains the data for the given key.
   * @param [context] The context.
   * @param [key] The key.
   * @return The data that is associated with the key using the [mapper][MapperOutputHandler].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperOutputHandler%23MapperOutputHandler-method-getValue">Online Documentation</a>
   */
  override fun getValue(
    context: IWriteContext,
    key: TKey,
  ): TData?
  
  /**
   * Performs the actual writing of the data using either the [serializer][MapperOutputHandler] or the [serializeCore][IWriteContext] method.
   * @param [context] The context to use for writing.
   * @param [data] The data to write.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperOutputHandler%23MapperOutputHandler-method-writeValueCore">Online Documentation</a>
   */
  override fun writeValueCore(
    context: IWriteContext,
    data: TData?,
  )
  
  companion object : ClassMetadata<MapperOutputHandler<*, *>> {
  }
}
