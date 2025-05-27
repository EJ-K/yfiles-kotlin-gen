// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.IEnumerable
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.Predicate
import yfiles.lang.YObject

/**
 * Represents a single item of type `TItem`.
 * @param [TItem] The type of the single item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleItem">Online Documentation</a>
 * 
 * @constructor Default constructor that does not explicitly initialize any of the [delegate], [item] or [source] properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleItem%23SingleItem-constructor-SingleItem()">Online Documentation</a>
 */
external open class SingleItem<TItem : IModelItem>  () : YObject {
/**
 * Constructor overload that directly sets the [source] that lists the item contained in this instance.
 * @param [source] An enumerable that lists the single item in this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleItem%23SingleItem-constructor-SingleItem(IEnumerable)">Online Documentation</a>
 */
 constructor( source: IEnumerable<TItem> )
/**
 * Constructor overload that directly sets the [delegate] that describes which item is contained in this instance.
 * @param [delegate] A delegate that implements the mapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleItem%23SingleItem-constructor-SingleItem(system.Predicate)">Online Documentation</a>
 */
 constructor( delegate: Predicate<TItem> )
/**
 * Constructor overload that directly sets the single [item].
 * @param [item] The single item contained in this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleItem%23SingleItem-constructor-SingleItem(TItem)">Online Documentation</a>
 */
 constructor( item: TItem )

/**
 * Gets or sets a predicate that defines the item to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleItem%23delegate">Online Documentation</a>
 */
final var delegate: Predicate<TItem>?
/**
 * Gets or sets an item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleItem%23item">Online Documentation</a>
 */
final var item: TItem?
/**
 * An [IEnumerable] of items, the first of which is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleItem%23source">Online Documentation</a>
 */
final var source: IEnumerable<TItem>?

companion object : ClassMetadata<SingleItem<*>> {
}
}
