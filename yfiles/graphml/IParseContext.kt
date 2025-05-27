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
import yfiles.collections.IListEnumerable
import yfiles.graph.IGraph
import yfiles.graph.ILookup
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YClass

/**
 * Interface that defines the context of a GraphML parsing context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseContext">Online Documentation</a>
 */
external interface IParseContext : ILookup {
/**
 * Gets the currently active graph object
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseContext%23graph">Online Documentation</a>
 */
val graph: IGraph
/**
 * Gets the current nesting of created graphs and graph elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseContext%23objectStack">Online Documentation</a>
 */
val objectStack: IListEnumerable<Any>
/**
 * Gets an implementation of [IParseEvents] that allows to subscribe to various events in the parse process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseContext%23parseEvents">Online Documentation</a>
 */
val parseEvents: IParseEvents
/**
 * Deserialize the object representation in `targetNode`.
 * @param [T] The desired target type.
 * @param [targetType] The desired target type.
 * @param [targetNode] The XML node that should be deserialized.
 * @return an instance of `T` or `null`.
 * @throws DeserializationNotSupportedError
 * @see [deserializeCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseContext%23IParseContext-defaultmethod-deserialize">Online Documentation</a>
 */
  final  fun <T : Any>deserialize( targetType: YClass<T> ,
 targetNode: Node ):T? = definedExternally
/**
 * Deserialize the object representation in `targetNode`
 * @param [T] The expected return type.
 * @param [targetType] The expected return type.
 * @param [context] The current parse context.
 * @param [targetNode] The XML node that should be deserialized.
 * @return The deserialized object from `targetNode` or an [DeserializationNotSupportedError][yfiles.lang.Exception] if `targetNode` could not be deserialized.
 * @see [deserialize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseContext%23IParseContext-method-deserializeCore">Online Documentation</a>
 */
   fun <T : Any>deserializeCore( targetType: YClass<T> ,
 context: IParseContext ,
 targetNode: Node ):T?
/**
 * Returns the most current (the last element) within the container hierarchy as it is returned by [objectStack] or `default(T)` if the most current element is not of the desired target type.
 * @param [T] The desired target type.
 * @param [itemType] The desired target type.
 * @return the most current element within the container hierarchy or `default(T)`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseContext%23IParseContext-method-getCurrent">Online Documentation</a>
 */
   fun <T : Any>getCurrent( itemType: YClass<T> ):T?
/**
 * Get a property value that specifies information about how to handle specific cases.
 * @param [key] The identifier for the property
 * @return The property value, or `null` if no such property exists.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IParseContext%23IParseContext-method-getDeserializationProperty">Online Documentation</a>
 */
   fun <T : Any>getDeserializationProperty( key: SerializationPropertyKey<T> ):T?

companion object : InterfaceMetadata<IParseContext> {
}
}
