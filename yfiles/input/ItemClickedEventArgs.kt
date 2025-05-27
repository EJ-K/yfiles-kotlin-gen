// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.view.PointerButtons
import yfiles.view.PointerEventArgs

/**
 * Provides data for the [item-clicked][GraphInputMode], [item-double-clicked][GraphInputMode], [item-left-clicked][GraphInputMode], [item-left-double-clicked][GraphInputMode], [item-right-clicked][GraphInputMode] and [item-right-double-clicked][GraphInputMode] events.
 * @param [T] The type of the item this event carries.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemClickedEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ItemClickedEventArgs] class.
 * @param [item] The item which is the subject of the event.
 * @param [context] The context in which the click or tap occurred.
 * @param [location] The location.
 * @param [buttons] The pointer button(s) that have changed.
 * @param [clickCount] The number of clicks.
 * @param [event] The original pointer event args.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemClickedEventArgs%23ItemClickedEventArgs-constructor-ItemClickedEventArgs">Online Documentation</a>
 * 
 * @property item
 * Gets the item that is the subject of the event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemClickedEventArgs%23item">Online Documentation</a>
 */
open external class ItemClickedEventArgs<T : IModelItem> (
final val item: T,
context: IInputModeContext,
location: Point,
buttons: PointerButtons,
clickCount: Int,
event: PointerEventArgs) : ClickEventArgs {
  
  companion object : ClassMetadata<ItemClickedEventArgs<*>> {
  }
}
