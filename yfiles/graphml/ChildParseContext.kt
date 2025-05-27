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
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * An implementation of [IParseContext] that delegates most calls to a [parentContext], but adds the capability to locally add [lookup] results and [deserialization properties][getDeserializationProperty]
 * @see [setDeserializationProperty]
 * @see [setLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ChildParseContext] class that delegates to the provided context and adds the `currentObject` to the [objectStack].
 * @param [parentContext] The parent context.
 * @param [currentObject] The current object to add to the [objectStack] and return in [getCurrent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23ChildParseContext-constructor-ChildParseContext(IParseContext,Object)">Online Documentation</a>
 * 
 * @property parentContext
 * Gets the parent context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23parentContext">Online Documentation</a>
 */
external open class ChildParseContext  (
final val parentContext: IParseContext,
 currentObject: Any?  = definedExternally) : IParseContext {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23graph">Online Documentation</a>
 */
final override val graph: IGraph
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23objectStack">Online Documentation</a>
 */
final override val objectStack: IListEnumerable<Any>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23parseEvents">Online Documentation</a>
 */
final override val parseEvents: IParseEvents
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23ChildParseContext-method-deserializeCore">Online Documentation</a>
 */
 override   fun <T : Any>deserializeCore( targetType: YClass<T> ,
 context: IParseContext ,
 targetNode: Node ):T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23ChildParseContext-method-getCurrent">Online Documentation</a>
 */
 final override   fun <T : Any>getCurrent( itemType: YClass<T> ):T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23ChildParseContext-method-getDeserializationProperty">Online Documentation</a>
 */
 override   fun <T : Any>getDeserializationProperty( key: SerializationPropertyKey<T> ):T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23ChildParseContext-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Removes a previously locally [set][setDeserializationProperty] deserialization property.
 * @param [key] The key for which the local property override should be removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23ChildParseContext-method-removeDeserializationProperty">Online Documentation</a>
 */
 open   fun removeDeserializationProperty( key: SerializationPropertyKey<*> )
/**
 * Removes a local lookup override that has been added using [setLookup]
 * @param [tType] The type key to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23ChildParseContext-method-removeLookup">Online Documentation</a>
 */
 open   fun removeLookup( tType: YClass<*> )
/**
 * Sets the local deserialization property for the given key to the value.
 * @param [key] The key to override.
 * @param [value] The value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23ChildParseContext-method-setDeserializationProperty">Online Documentation</a>
 */
 open   fun <T : Any>setDeserializationProperty( key: SerializationPropertyKey<T> ,
 value: T? )
/**
 * Adds another lookup result to the local lookup override.
 * @param [T] The type to use as a key for the lookup.
 * @param [tType] The type to use as a key for the lookup.
 * @param [value] The value to provide for queries to `T`.
 * @see [removeLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildParseContext%23ChildParseContext-method-setLookup">Online Documentation</a>
 */
 open   fun <T : Any>setLookup( tType: YClass<T> ,
 value: T? )

companion object : ClassMetadata<ChildParseContext> {
}
}
