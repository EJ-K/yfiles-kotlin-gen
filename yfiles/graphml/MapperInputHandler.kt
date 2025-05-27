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
import yfiles.lang.EventHandler1
import yfiles.lang.YClass

/**
 * An [IInputHandler] implementation that uses an [IMapper] instance to associate the values with the keys.
 * @param [TKey] The type of the key.
 * @param [TData] The type of the value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [MapperInputHandler] class that uses the [IParseContext] for deserialization.
 * @param [keyType] The type of the key.
 * @param [dataType] The type of the value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-constructor-MapperInputHandler(yfiles.lang.Class,yfiles.lang.Class)">Online Documentation</a>
 */
external open class MapperInputHandler<TKey : Any, TData : Any>  ( keyType: YClass<TKey> ,
 dataType: YClass<TData> ) : InputHandlerBase<TKey, TData> {
/**
 * Initializes a new instance of the [MapperInputHandler] class that uses the event handler for deserialization and suggests the provided target type for the deserializer.
 * @param [keyType] The type of the key.
 * @param [dataType] The type of the value.
 * @see [deserializerTargetType]
 * @see [deserializer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-constructor-MapperInputHandler(yfiles.lang.Class,yfiles.lang.Class,system.EventHandler1,yfiles.lang.Class)">Online Documentation</a>
 */
 constructor( keyType: YClass<TKey> ,
 dataType: YClass<TData> ,
 deserializer: EventHandler1<HandleDeserializationEventArgs>? ,
 deserializerTargetType: YClass<*>?  = definedExternally)

/**
 * Gets or sets the deserializer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23deserializer">Online Documentation</a>
 */
final var deserializer: EventHandler1<HandleDeserializationEventArgs>?
/**
 * Gets or sets the target deserialization type for the [HandleDeserializationEventArgs.targetType] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23deserializerTargetType">Online Documentation</a>
 */
final var deserializerTargetType: YClass<*>?
/**
 * Gets or sets the mapper to use for storing the data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23mapper">Online Documentation</a>
 */
final var mapper: IMapper<TKey, TData>
/**
 * Gets or sets a value indicating whether values that are applied via the [InputHandlerBase.applyDefault] mechanism and are equal to the value that is already present in the mapper will explicitly be overridden in the mapper.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23overrideDefaultValue">Online Documentation</a>
 */
final var overrideDefaultValue: Boolean
/**
 * Gets or sets whether [getDeserializationXmlNode] returns either the `'data'`/`'default'` element itself or its content.
 * 
 * The default value is `false`, meaning that [getDeserializationXmlNode] should return the content of the `'data'`/`'default'` node.
 * @see [getDeserializationXmlNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23useParentElementForDeserialization">Online Documentation</a>
 */
final var useParentElementForDeserialization: Boolean
/**
 * Overridden to take the [overrideDefaultValue] property into account.
 * @param [context] The context for the parse operation.
 * @see [overrideDefaultValue]
 * @see [InputHandlerBase.applyDefault]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-method-applyDefault">Online Documentation</a>
 */
 override   fun applyDefault( context: IParseContext )
/**
 * Gets the node to pass to [deserializer] or [IParseContext.Deserialize][IParseContext.deserializeCore] respectively, given the 'data' or 'default' element from the GraphML.
 * @param [context] The context within which the node is parsed.
 * @param [node] The 'data' or 'default' node.
 * @return The node that should be deserialized.
 * @see [useParentElementForDeserialization]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-method-getDeserializationXmlNode">Online Documentation</a>
 */
 open protected   fun getDeserializationXmlNode( context: IParseContext ,
 node: Node ):Node?
/**
 * Parses the data using either the [deserializer] or the [IParseContext.deserializeCore] call.
 * @param [context] The context.
 * @param [node] The node that contains the data. This is either the GraphML `'data'` element or the `'default'` element.
 * @return The parsed data.
 * @throws DeserializationNotSupportedError `DeserializationNotSupportedException` if [deserializer] could not handle the node.
 * @see [getDeserializationXmlNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-method-parseDataCore">Online Documentation</a>
 */
 override   fun parseDataCore( context: IParseContext ,
 node: Node ):TData?
/**
 * This method uses the [mapper] to associate the data with the key.
 * @param [context] The context.
 * @param [key] The key.
 * @param [data] The data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MapperInputHandler%23MapperInputHandler-method-setValue">Online Documentation</a>
 */
 override   fun setValue( context: IParseContext ,
 key: TKey? ,
 data: TData? )

companion object : ClassMetadata<MapperInputHandler<*, *>> {
}
}
