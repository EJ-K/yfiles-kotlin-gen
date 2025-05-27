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

/**
 * Provides data for the [TableEditorInputMode.ItemTapped] and [TableEditorInputMode.ItemDoubleTapped] events.
 * @param [T] The type of the item this event carries.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemTappedEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TableItemTappedEventArgs] class.
 * @param [item] The item which is the subject of the event.
 * @param [region] The specific region on a stripe where the click has occured.
 * @param [tableNode] The table node where `item` is associated.
 * @param [context] The context in which the click or tap occurred.
 * @param [location] The location.
 * @param [clickCount] The number of clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemTappedEventArgs%23TableItemTappedEventArgs-constructor-TableItemTappedEventArgs">Online Documentation</a>
 * 
 * @property region
 * The specific region on a stripe where the click has occured.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemTappedEventArgs%23region">Online Documentation</a>
 * 
 * @property tableNode
 * The table node where [ItemTappedEventArgs.item] is associated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableItemTappedEventArgs%23tableNode">Online Documentation</a>
 */
external open class TableItemTappedEventArgs<T : IModelItem>  (
 item: T ,
final val region: StripeSubregion?,
final val tableNode: INode?,
 context: IInputModeContext ,
 location: Point ,
 clickCount: Int ) : ItemTappedEventArgs<T> {

companion object : ClassMetadata<TableItemTappedEventArgs<*>> {
}
}
