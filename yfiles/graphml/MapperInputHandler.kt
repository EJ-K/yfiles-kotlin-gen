// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import web.dom.Node
import yfiles.collections.IMapper
import yfiles.lang.ClassMetadata
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata

/**
 * An [IInputHandler] implementation that uses an [IMapper] instance to associate the values with the keys.
 * @param [TKey] The type of the key.
 * @param [TData] The type of the value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [MapperInputHandler] class that uses the [IParseContext] for deserialization.
 * @param [keyType] The type of the key.
 * @param [dataType] The type of the value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-constructor-MapperInputHandler(Constructor,Constructor)">Online Documentation</a>
 */
open external class MapperInputHandler<TKey, TData> (
  keyType: IClassMetadata<TKey>,
  dataType: IClassMetadata<TData>,
) : InputHandlerBase<TKey, TData> {
  /**
   * Initializes a new instance of the [MapperInputHandler] class that uses the provided callback for deserialization and suggests the provided target type for the deserializer.
   * @param [keyType] The type of the key.
   * @param [dataType] The type of the value.
   * @param [deserializer] The callback used to deserialize.
   * @param [deserializerTargetType] The type that should be suggested for the deserializer.
   * @see [deserializerTargetType]
   * @see [deserializer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-constructor-MapperInputHandler(Constructor,Constructor,system.Func4,Constructor)">Online Documentation</a>
   */ constructor(
    keyType: IClassMetadata<TKey>,
    dataType: IClassMetadata<TData>,
    deserializer: Func4<IParseContext, Node, IClassMetadata<*>, TData>?,
    deserializerTargetType: IClassMetadata<*>  = definedExternally,
  )
  /**
   * Gets or sets the deserializer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23deserializer">Online Documentation</a>
   */
  final var deserializer: Func4<IParseContext, Node, IClassMetadata<*>, TData>?
  
  /**
   * Gets or sets the target deserialization type for the [targetType][HandleDeserializationEventArgs] property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23deserializerTargetType">Online Documentation</a>
   */
  final var deserializerTargetType: IClassMetadata<*>?
  
  /**
   * Gets or sets the mapper to use for storing the data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23mapper">Online Documentation</a>
   */
  final var mapper: IMapper<TKey, TData>
  
  /**
   * Gets or sets a value indicating whether values that are applied via the [applyDefault][InputHandlerBase] mechanism and are equal to the value that is already present in the mapper will explicitly be overridden in the mapper.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23overrideDefaultValue">Online Documentation</a>
   */
  final var overrideDefaultValue: Boolean
  
  /**
   * Gets or sets whether [getDeserializationXmlNode][MapperInputHandler] returns either the `'data'`/`'default'` element itself or its content.
   * 
   * The default value is `false`, meaning that [getDeserializationXmlNode][MapperInputHandler] should return the content of the `'data'`/`'default'` node.
   * @see [getDeserializationXmlNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23useParentElementForDeserialization">Online Documentation</a>
   */
  final var useParentElementForDeserialization: Boolean
  
  /**
   * Overridden to take the [overrideDefaultValue][MapperInputHandler] property into account.
   * @param [context] The context for the parse operation.
   * @see [overrideDefaultValue]
   * @see [InputHandlerBase.applyDefault]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-method-applyDefault">Online Documentation</a>
   */
  override fun applyDefault(
    context: IParseContext,
  )
  
  /**
   * Gets the node to pass to [deserializer][MapperInputHandler] or [IParseContext.Deserialize][IParseContext] respectively, given the 'data' or 'default' element from the GraphML.
   * @param [context] The context within which the node is parsed.
   * @param [node] The 'data' or 'default' node.
   * @return The node that should be deserialized.
   * @see [useParentElementForDeserialization]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-method-getDeserializationXmlNode">Online Documentation</a>
   */
  protected open fun getDeserializationXmlNode(
    context: IParseContext,
    node: Node,
  ): Node?
  
  /**
   * Parses the data using either the [deserializer][MapperInputHandler] or the [deserializeCore][IParseContext] call.
   * @param [context] The context.
   * @param [node] The node that contains the data. This is either the GraphML `'data'` element or the `'default'` element.
   * @return The parsed data.
   * @throws DeserializationNotSupportedError `DeserializationNotSupportedException` if [deserializer][MapperInputHandler] could not handle the node.
   * @see [getDeserializationXmlNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-method-parseDataCore">Online Documentation</a>
   */
  override fun parseDataCore(
    context: IParseContext,
    node: Node,
  ): TData?
  
  /**
   * This method uses the [mapper][MapperInputHandler] to associate the data with the key.
   * @param [context] The context.
   * @param [key] The key.
   * @param [data] The data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-method-setValue">Online Documentation</a>
   */
  override fun setValue(
    context: IParseContext,
    key: TKey?,
    data: TData?,
  )
  
  companion object : ClassMetadata<MapperInputHandler<*, *>> {
  }
}
