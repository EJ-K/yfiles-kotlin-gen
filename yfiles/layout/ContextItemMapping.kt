// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.IMapper
import yfiles.graph.IModelItem
import yfiles.graph.MapperDelegate
import yfiles.lang.ClassMetadata
import yfiles.lang.Func3

/**
 * Provides different ways to define a mapping from items to values that takes a context object into consideration, too.
 * @param [TItem] The type of the items that are mapped.
 * @param [TValue] The type of the values the items are mapped to.
 * @param [TContext] The type of the context passed to the [contextDelegate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextItemMapping">Online Documentation</a>
 * 
 * @constructor Default constructor that does not explicitly initialize any of the [contextDelegate], [ItemMapping.mapper], [ItemMapping.delegate] or [ItemMapping.constant] properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextItemMapping%23ContextItemMapping-constructor-ContextItemMapping()">Online Documentation</a>
 */
external open class ContextItemMapping<TItem : IModelItem, TValue, TContext>  () : ItemMapping<TItem, TValue> {
/**
 * Constructor overload that directly sets the [ItemMapping.delegate].
 * @param [delegate] A delegate that implements the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextItemMapping%23ContextItemMapping-constructor-ContextItemMapping(MapperDelegate)">Online Documentation</a>
 */
 constructor( delegate: MapperDelegate<TItem, TValue> )
/**
 * Constructor overload that directly sets the [ItemMapping.mapper].
 * @param [mapper] An [IMapper] that implements the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextItemMapping%23ContextItemMapping-constructor-ContextItemMapping(IMapper)">Online Documentation</a>
 */
 constructor( mapper: IMapper<TItem, TValue> )
/**
 * Constructor overload that directly sets a [ItemMapping.constant] mapping.
 * @param [constant] A constant value all items are mapped to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextItemMapping%23ContextItemMapping-constructor-ContextItemMapping(TValue)">Online Documentation</a>
 */
 constructor( constant: TValue )

/**
 * Gets or sets a delegate from the items and a context object to the values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextItemMapping%23contextDelegate">Online Documentation</a>
 */
final var contextDelegate: Func3<TItem, TContext, TValue>?

companion object : ClassMetadata<ContextItemMapping<*, *, *>> {
}
}
