// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * Event that holds a specific item that is related to the event.
 * @param [T] The type of the item contained in the event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new event argument for the given item.
 * @param [item] The item which is the subject of the event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemEventArgs%23ItemEventArgs-constructor-ItemEventArgs">Online Documentation</a>
 * 
 * @property item
 * Gets the item that is the subject of the event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemEventArgs%23item">Online Documentation</a>
 */
open external class ItemEventArgs<T : Any?> (
final val item: T) : EventArgs {
  
  companion object : ClassMetadata<ItemEventArgs<*>> {
  }
}
