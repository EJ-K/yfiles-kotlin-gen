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

/**
 * Provides data for the [GraphInputMode.ItemTapped] and [GraphInputMode.ItemDoubleTapped] events.
 * @param [T] The type of the item this event carries.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemTappedEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ItemTappedEventArgs] class.
 * @param [item] The item which is the subject of the event.
 * @param [context] The context in which the tap occurred.
 * @param [location] The location.
 * @param [tapCount] The number of taps associated with this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemTappedEventArgs%23ItemTappedEventArgs-constructor-ItemTappedEventArgs">Online Documentation</a>
 * 
 * @property item
 * Gets the item that is the subject of the event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemTappedEventArgs%23item">Online Documentation</a>
 */
external open class ItemTappedEventArgs<T : IModelItem>  (
final val item: T,
 context: IInputModeContext ,
 location: Point ,
 tapCount: Int  = definedExternally) : TapEventArgs {

companion object : ClassMetadata<ItemTappedEventArgs<*>> {
}
}
