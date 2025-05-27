// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IEnumerable
import yfiles.graph.IModelItem
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.InterfaceMetadata

/**
 * An interface that models the selection state of a set of items.
 * @param [T] The type of items contained in the selection's domain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISelectionModel">Online Documentation</a>
 */
external interface ISelectionModel<T : IModelItem> : IEnumerable<T>, IEventDispatcher {
/**
 * Clears the selection.
 * @see [addItemSelectionChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISelectionModel%23ISelectionModel-method-clear">Online Documentation</a>
 */
   fun clear()
/**
 * Determines whether an item is currently selected.
 * @param [item] The item to check.
 * @return Whether it is currently selected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISelectionModel%23ISelectionModel-method-isSelected">Online Documentation</a>
 */
   fun isSelected( item: T ):Boolean
/**
 * Sets the selection state of an item.
 * @param [item] The item to set the selection state for.
 * @param [selected] Whether to select the object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISelectionModel%23ISelectionModel-method-setSelected">Online Documentation</a>
 */
   fun setSelected( item: T ,
 selected: Boolean )
/**
 * Occurs when an item changed its selection state from selected to unselected or vice versa.
 * @see [setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISelectionModel%23ItemSelectionChanged">Online Documentation</a>
 */
fun addItemSelectionChangedListener(listener: EventHandler1<ItemSelectionChangedEventArgs<T>>)
fun removeItemSelectionChangedListener(listener: EventHandler1<ItemSelectionChangedEventArgs<T>>)

companion object : InterfaceMetadata<ISelectionModel<*>> {
}
}

/**
 * Occurs when an item changed its selection state from selected to unselected or vice versa.
 * @see [setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISelectionModel%23ItemSelectionChanged">Online Documentation</a>
 */
inline fun <T : IModelItem> ISelectionModel<T>.addItemSelectionChangedHandler(
    crossinline handler: (event:ItemSelectionChangedEventArgs<T>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemSelectionChangedEventArgs<T>> = { _, event -> handler(event) }
    addItemSelectionChangedListener(listener)
    return { removeItemSelectionChangedListener(listener) }
}
