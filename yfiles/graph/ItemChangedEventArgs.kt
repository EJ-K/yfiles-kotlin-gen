// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ItemEventArgs
import yfiles.lang.ClassMetadata

/**
 * Event argument class used by [IGraph] if a model item's property has been changed.
 * @param [TItem] The type of the item contained in the event.
 * @param [TValue] The type of the item's property that has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemChangedEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ItemChangedEventArgs] class.
 * @param [item] The item whose property has been changed.
 * @param [oldValue] The value of the property before the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemChangedEventArgs%23ItemChangedEventArgs-constructor-ItemChangedEventArgs">Online Documentation</a>
 * 
 * @property oldValue
 * Gets the value of the property before the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemChangedEventArgs%23oldValue">Online Documentation</a>
 */
external open class ItemChangedEventArgs<TItem : ITagOwner, TValue : Any>  (
 item: TItem ,
final val oldValue: TValue?) : ItemEventArgs<TItem> {

companion object : ClassMetadata<ItemChangedEventArgs<*, *>> {
}
}
