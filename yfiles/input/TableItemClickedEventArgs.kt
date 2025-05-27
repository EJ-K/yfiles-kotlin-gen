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
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.view.PointerButtons
import yfiles.view.PointerEventArgs

/**
 * Provides data for the [item-clicked][TableEditorInputMode], [item-double-clicked][TableEditorInputMode], [item-left-clicked][TableEditorInputMode], [item-left-double-clicked][TableEditorInputMode], [item-right-clicked][TableEditorInputMode] and [item-right-double-clicked][TableEditorInputMode] events.
 * @param [T] The type of the item this event carries.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemClickedEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TableItemClickedEventArgs] class.
 * @param [item] The item which is the subject of the event.
 * @param [region] The specific region on a stripe where the click has occurred.
 * @param [tableNode] The table node where `item` is associated.
 * @param [context] The context in which the click or tap occurred.
 * @param [location] The location.
 * @param [buttons] The pointer button(s) that have changed.
 * @param [clickCount] The number of clicks.
 * @param [event] The original event args.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemClickedEventArgs%23TableItemClickedEventArgs-constructor-TableItemClickedEventArgs">Online Documentation</a>
 * 
 * @property region
 * The specific region on a stripe where the click has occurred.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemClickedEventArgs%23region">Online Documentation</a>
 * 
 * @property tableNode
 * The table node where [item][ItemClickedEventArgs] is associated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemClickedEventArgs%23tableNode">Online Documentation</a>
 */
external class TableItemClickedEventArgs<T : IModelItem> (
item: T,
final val region: StripeSubregion?,
final val tableNode: INode?,
context: IInputModeContext,
location: Point,
buttons: PointerButtons,
clickCount: Int,
event: PointerEventArgs) : ItemClickedEventArgs<T> {
  
  companion object : ClassMetadata<TableItemClickedEventArgs<*>> {
  }
}
