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
import yfiles.view.ModifierKeys
import yfiles.view.MouseButtons

/**
 * Provides data for the [TableEditorInputMode.ItemClicked], [TableEditorInputMode.ItemDoubleClicked], [TableEditorInputMode.ItemLeftClicked], [TableEditorInputMode.ItemLeftDoubleClicked], [TableEditorInputMode.ItemRightClicked] and [TableEditorInputMode.ItemRightDoubleClicked] events.
 * @param [T] The type of the item this event carries.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemClickedEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TableItemClickedEventArgs] class.
 * @param [item] The item which is the subject of the event.
 * @param [region] The specific region on a stripe where the click has occurred.
 * @param [tableNode] The table node where `item` is associated.
 * @param [context] The context in which the click or tap occurred.
 * @param [location] The location.
 * @param [modifiers] State of the modifiers.
 * @param [mouseButtons] The mouse button(s) that have changed.
 * @param [clickCount] The number of clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemClickedEventArgs%23TableItemClickedEventArgs-constructor-TableItemClickedEventArgs">Online Documentation</a>
 * 
 * @property region
 * The specific region on a stripe where the click has occurred.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemClickedEventArgs%23region">Online Documentation</a>
 * 
 * @property tableNode
 * The table node where [ItemClickedEventArgs.item] is associated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemClickedEventArgs%23tableNode">Online Documentation</a>
 */
external open class TableItemClickedEventArgs<T : IModelItem>  (
 item: T ,
final val region: StripeSubregion?,
final val tableNode: INode?,
 context: IInputModeContext ,
 location: Point ,
 modifiers: ModifierKeys ,
 mouseButtons: MouseButtons ,
 clickCount: Int ) : ItemClickedEventArgs<T> {

companion object : ClassMetadata<TableItemClickedEventArgs<*>> {
}
}
