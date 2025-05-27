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
import yfiles.graph.ILookup
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YClass

/**
 * Interface that provides the context of a GraphML write process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext">Online Documentation</a>
 */
external interface IWriteContext : ILookup {
/**
 * Gets the currently active graph object
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23graph">Online Documentation</a>
 */
val graph: IGraph
/**
 * Gets the current nesting of graphs and graph elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23objectStack">Online Documentation</a>
 */
val objectStack: IListEnumerable<Any>
/**
 * Gets an implementation of [IWriteEvents] that allows to subscribe to various events in the write process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23writeEvents">Online Documentation</a>
 */
val writeEvents: IWriteEvents
/**
 * Gets the current [IXmlWriter] implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23writer">Online Documentation</a>
 */
val writer: IXmlWriter
/**
 * Returns the most current (the last element) within the container hierarchy as it is returned by [objectStack] or `default(T)` if the most current element is not of the desired target type.
 * @param [T] The desired target type.
 * @param [itemType] The desired target type.
 * @return the most current element within the container hierarchy or `default(T)`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23IWriteContext-method-getCurrent">Online Documentation</a>
 */
   fun <T : Any>getCurrent( itemType: YClass<T> ):T?
/**
 * Get a property value that specifies information about how to handle specific cases
 * @param [key] The identifier for the property
 * @return The property value, or `null` if no such property exists
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23IWriteContext-method-getSerializationProperty">Online Documentation</a>
 */
   fun <T : Any>getSerializationProperty( key: SerializationPropertyKey<T> ):T?
/**
 * Serialize the `item`.
 * @param [T] The type of the object that is serialized.
 * @param [targetType] The type of the object that is serialized.
 * @param [item] The object that should be serialized.
 * @throws SerializationNotSupportedError
 * @see [serializeCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23IWriteContext-defaultmethod-serialize(yfiles.lang.Class,T)">Online Documentation</a>
 */
  final  fun <T : Any>serialize( targetType: YClass<T> ,
 item: T? ):Unit = definedExternally
/**
 * Serializes the specified item using the provided type information.
 * @param [item] The item to serialize.
 * @param [t] The type the item is known to be of at deserialization time.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23IWriteContext-defaultmethod-serialize(Object,yfiles.lang.Class)">Online Documentation</a>
 */
  final  fun serialize( item: Any? ,
 t: YClass<*> ):Unit = definedExternally
/**
 * Serialize `item` to an XML representation.
 * @param [T] The type of the object that is serialized.
 * @param [targetType] The type of the object that is serialized.
 * @param [context] The current write context.
 * @param [item] The object that should be serialized.
 * @throws SerializationNotSupportedError
 * @see [serialize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23IWriteContext-method-serializeCore">Online Documentation</a>
 */
   fun <T : Any>serializeCore( targetType: YClass<T> ,
 context: IWriteContext ,
 item: T? )
/**
 * Serialize an replacement object `replacement` instead of the original `originalItem`.
 * @param [T] The type of the object that is serialized.
 * @param [originalItem] The original object that should be serialized.
 * @param [replacement] The replacement object that will actually be serialized instead.
 * @throws SerializationNotSupportedError
 * @see [serializeCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IWriteContext%23IWriteContext-defaultmethod-serializeReplacement">Online Documentation</a>
 */
  final  fun <T>serializeReplacement( targetType: YClass<*> ,
 originalItem: Any? ,
 replacement: T? ):Unit = definedExternally

companion object : InterfaceMetadata<IWriteContext> {
}
}
