// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.ICollection
import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.Predicate
import yfiles.lang.YObject

/**
 * Provides different ways to define the items in a collection for use with [LayoutData].
 * @param [TItem] The type of the items in the collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection">Online Documentation</a>
 * 
 * @constructor Default constructor that does not explicitly initialize any of the [mapper], [delegate], [item], [items] or [source] properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23ItemCollection-constructor-ItemCollection()">Online Documentation</a>
 */
external open class ItemCollection<TItem : IModelItem>  () : YObject {
/**
 * Constructor overload that directly sets the single [item].
 * @param [item] The single item contained in this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23ItemCollection-constructor-ItemCollection(TItem)">Online Documentation</a>
 */
 constructor( item: TItem )
/**
 * Constructor overload that directly sets the [items] that hold the items are contained in this instance.
 * @param [items] An enumerable that holds the elements in this instance.
 * @param [excludes] A collection of items which are explicitly excluded from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23ItemCollection-constructor-ItemCollection(ICollection,ItemCollection)">Online Documentation</a>
 */
 constructor( items: ICollection<out TItem> ,
 excludes: ItemCollection<TItem>?  = definedExternally)
/**
 * Constructor overload that directly sets the [source] that lists which items are contained in this instance.
 * @param [source] An enumerable that lists the elements in this instance.
 * @param [excludes] A collection of items which are explicitly excluded from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23ItemCollection-constructor-ItemCollection(IEnumerable,ItemCollection)">Online Documentation</a>
 */
 constructor( source: IEnumerable<TItem> ,
 excludes: ItemCollection<TItem>?  = definedExternally)
/**
 * Constructor overload that directly sets the [mapper] that describes which items are contained in this instance.
 * @param [mapper] An [IMapper]that implements the mapping.
 * @param [excludes] A collection of items which are explicitly excluded from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23ItemCollection-constructor-ItemCollection(IMapper,ItemCollection)">Online Documentation</a>
 */
 constructor( mapper: IMapper<TItem, Boolean> ,
 excludes: ItemCollection<TItem>?  = definedExternally)
/**
 * Constructor overload that directly sets the [delegate] that describes which items are contained in this instance.
 * @param [delegate] A delegate that implements the mapping.
 * @param [excludes] A collection of items which are explicitly excluded from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23ItemCollection-constructor-ItemCollection(system.Predicate,ItemCollection)">Online Documentation</a>
 */
 constructor( delegate: Predicate<TItem> ,
 excludes: ItemCollection<TItem>?  = definedExternally)

/**
 * Gets or sets a delegate from the items to a boolean value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23delegate">Online Documentation</a>
 */
final var delegate: Predicate<TItem>?
/**
 * A collection of items which are explicitly excluded from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23excludes">Online Documentation</a>
 */
final var excludes: ItemCollection<TItem>
/**
 * Gets or sets the single item this item collection contains.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23item">Online Documentation</a>
 */
final var item: TItem?
/**
 * Gets or sets a collection of items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23items">Online Documentation</a>
 */
final var items: ICollection<out TItem>
/**
 * Gets or sets a mapping from the items to a boolean value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23mapper">Online Documentation</a>
 */
final var mapper: IMapper<TItem, Boolean>?
/**
 * Get or sets an enumerable of items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCollection%23source">Online Documentation</a>
 */
final var source: IEnumerable<TItem>?

companion object : ClassMetadata<ItemCollection<*>> {
}
}
