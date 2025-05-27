// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * Event argument class containing information about which [IModelItem] the mouse is currently hovering over.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HoveredItemChangedEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [HoveredItemChangedEventArgs] class.
 * @param [item] The model item, possibly `null`.
 * @param [oldItem] The old item, possibly `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HoveredItemChangedEventArgs%23HoveredItemChangedEventArgs-constructor-HoveredItemChangedEventArgs">Online Documentation</a>
 * 
 * @property item
 * Gets the item that is currently hovered or `null` if no item is hovered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HoveredItemChangedEventArgs%23item">Online Documentation</a>
 * 
 * @property oldItem
 * Gets or sets the item that was previously hovered, possibly `null`.
 * @see [ItemEventArgs.item][yfiles.collections.ItemEventArgs.item]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HoveredItemChangedEventArgs%23oldItem">Online Documentation</a>
 */
external open class HoveredItemChangedEventArgs  (
final val item: IModelItem?,
final val oldItem: IModelItem?) : EventArgs {

companion object : ClassMetadata<HoveredItemChangedEventArgs> {
}
}
