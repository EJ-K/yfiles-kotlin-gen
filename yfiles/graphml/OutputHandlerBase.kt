// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata

/**
 * Abstract base implementation of the [IOutputHandler] interface.
 * @param [TKey] The type of the keys.
 * @param [TData] The type of the data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [OutputHandlerBase] class using the provided scope, name, and type for the key definition.
 * @param [keyType] The type of the keys.
 * @param [dataType] The type of the data.
 * @param [scope] The scope.
 * @param [name] The name to use for the key definition.
 * @param [type] The type to use for the key definition.
 * @see [setKeyDefinitionUri]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-constructor-OutputHandlerBase">Online Documentation</a>
 */
abstract external class OutputHandlerBase<TKey, TData> protected constructor(
  keyType: IClassMetadata<TKey>,
  dataType: IClassMetadata<TData>,
  scope: KeyScope,
  name: String?,
  type: KeyType,
) : IOutputHandler {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23dataTagAttributes">Online Documentation</a>
   */
  open override val dataTagAttributes: IEnumerable<GraphMLXmlAttribute>
  
  /**
   * Gets or sets a value indicating whether a default value has been assigned.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23defaultExists">Online Documentation</a>
   */
  final var defaultExists: Boolean
  
  /**
   * Gets or sets the default value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23defaultValue">Online Documentation</a>
   */
  final var defaultValue: TData?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23keyDefinitionAttributes">Online Documentation</a>
   */
  open override val keyDefinitionAttributes: IEnumerable<GraphMLXmlAttribute>
  
  /**
   * Gets or sets the write precedence for the handler.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23precedence">Online Documentation</a>
   */
  final override var precedence: WritePrecedence
  
  /**
   * Gets or sets a value indicating whether to write the key default.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23writeKeyDefault">Online Documentation</a>
   */
  final var writeKeyDefault: Boolean
  
  /**
   * Obtains the data for the given key.
   * @param [context] The context.
   * @param [key] The key.
   * @return The data that is associated with the key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-method-getValue">Online Documentation</a>
   */
  protected abstract fun getValue(
    context: IWriteContext,
    key: TKey,
  ): TData?
  
  /**
   * Determines whether in the current context, the value is the default value and therefore no data element needs to be written.
   * @param [context] The context.
   * @return `true` if for the current context the default value applies and therefore no data element needs to be written.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-method-isDefaultValue">Online Documentation</a>
   */
  override fun isDefaultValue(
    context: IWriteContext,
  ): Boolean
  
  /**
   * Sets the name for the key definition.
   * @param [name] The name of the key element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-method-setKeyDefinitionName">Online Documentation</a>
   */
  fun setKeyDefinitionName(
    name: String?,
  )
  
  /**
   * Sets the scope for the key definition.
   * @param [scope] The scope of the key element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-method-setKeyDefinitionScope">Online Documentation</a>
   */
  fun setKeyDefinitionScope(
    scope: KeyScope,
  )
  
  /**
   * Sets the key type for the key definition.
   * @param [type] The type of the key element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-method-setKeyDefinitionType">Online Documentation</a>
   */
  fun setKeyDefinitionType(
    type: KeyType,
  )
  
  /**
   * Sets an optional URI for the key definition.
   * @param [uri] The URI of the key element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-method-setKeyDefinitionUri">Online Documentation</a>
   */
  fun setKeyDefinitionUri(
    uri: String?,
  )
  
  /**
   * Writes the contents of the key definition.
   * @param [context] The context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-method-writeKeyDefinitionContent">Online Documentation</a>
   */
  override fun writeKeyDefinitionContent(
    context: IWriteContext,
  )
  
  /**
   * Actually writes the value for the current context.
   * @param [context] The context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-method-writeValue">Online Documentation</a>
   */
  final override fun writeValue(
    context: IWriteContext,
  )
  
  /**
   * Performs the actual writing of the data.
   * @param [context] The context.
   * @param [data] The data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputHandlerBase%23OutputHandlerBase-method-writeValueCore">Online Documentation</a>
   */
  protected abstract fun writeValueCore(
    context: IWriteContext,
    data: TData?,
  )
  
  companion object : ClassMetadata<OutputHandlerBase<*, *>> {
  }
}
