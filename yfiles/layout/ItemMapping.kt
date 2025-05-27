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
import yfiles.lang.YObject

/**
 * Provides different ways to define a mapping from items to values for use with [LayoutData].
 * @param [TItem] The type of the items that are mapped.
 * @param [TValue] The type of the values the items are mapped to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemMapping">Online Documentation</a>
 * 
 * @constructor Default constructor that does not explicitly initialize any of the [mapper], [delegate] or [constant] properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemMapping%23ItemMapping-constructor-ItemMapping()">Online Documentation</a>
 */
external open class ItemMapping<TItem : IModelItem, TValue>  () : YObject {
/**
 * Constructor overload that directly sets the [delegate].
 * @param [delegate] A delegate that implements the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemMapping%23ItemMapping-constructor-ItemMapping(MapperDelegate)">Online Documentation</a>
 */
 constructor( delegate: MapperDelegate<TItem, TValue> )
/**
 * Constructor overload that directly sets the [mapper].
 * @param [mapper] An [IMapper] that implements the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemMapping%23ItemMapping-constructor-ItemMapping(IMapper)">Online Documentation</a>
 */
 constructor( mapper: IMapper<TItem, TValue> )
/**
 * Constructor overload that directly sets a [constant] mapping.
 * @param [constant] A constant value all items are mapped to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemMapping%23ItemMapping-constructor-ItemMapping(TValue)">Online Documentation</a>
 */
 constructor( constant: TValue )

/**
 * Gets or sets a constant value all items are mapped to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemMapping%23constant">Online Documentation</a>
 */
final var constant: TValue?
/**
 * Gets or sets a delegate that implements the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemMapping%23delegate">Online Documentation</a>
 */
final var delegate: MapperDelegate<TItem, TValue>?
/**
 * Gets or sets an [IMapper] that realizes the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemMapping%23mapper">Online Documentation</a>
 */
final var mapper: IMapper<TItem, TValue>

companion object : ClassMetadata<ItemMapping<*, *>> {
}
}
