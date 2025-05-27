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
import yfiles.view.ModifierKeys
import yfiles.view.MouseButtons

/**
 * Provides data for the [GraphInputMode.ItemClicked], [GraphInputMode.ItemDoubleClicked], [GraphInputMode.ItemLeftClicked], [GraphInputMode.ItemLeftDoubleClicked], [GraphInputMode.ItemRightClicked] and [GraphInputMode.ItemRightDoubleClicked] events.
 * @param [T] The type of the item this event carries.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemClickedEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ItemClickedEventArgs] class.
 * @param [item] The item which is the subject of the event.
 * @param [context] The context in which the click or tap occurred.
 * @param [location] The location.
 * @param [modifiers] State of the modifiers.
 * @param [mouseButtons] The mouse button(s) that have changed.
 * @param [clickCount] The number of clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemClickedEventArgs%23ItemClickedEventArgs-constructor-ItemClickedEventArgs">Online Documentation</a>
 * 
 * @property item
 * Gets the item that is the subject of the event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemClickedEventArgs%23item">Online Documentation</a>
 */
external open class ItemClickedEventArgs<T : IModelItem>  (
final val item: T,
 context: IInputModeContext ,
 location: Point ,
 modifiers: ModifierKeys  = definedExternally,
 mouseButtons: MouseButtons  = definedExternally,
 clickCount: Int  = definedExternally) : ClickEventArgs {

companion object : ClassMetadata<ItemClickedEventArgs<*>> {
}
}
