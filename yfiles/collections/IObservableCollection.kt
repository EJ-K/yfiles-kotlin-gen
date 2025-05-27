// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * The interface for a collection that will notify registered event handlers of changes to its contents.
 * @param [T] The type of the items in the collection.
 * @see [ObservableCollection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection">Online Documentation</a>
 */
external interface IObservableCollection<T : YObject> : ICollection<T>, IEventDispatcher {
/**
 * Occurs when an item has been added to this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection%23ItemAdded">Online Documentation</a>
 */
fun addItemAddedListener(listener: EventHandler1<ItemEventArgs<T>>)
fun removeItemAddedListener(listener: EventHandler1<ItemEventArgs<T>>)

/**
 * Occurs when an item has been removed from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection%23ItemRemoved">Online Documentation</a>
 */
fun addItemRemovedListener(listener: EventHandler1<ItemEventArgs<T>>)
fun removeItemRemovedListener(listener: EventHandler1<ItemEventArgs<T>>)

/**
 * Occurs when an item in this collection has changed significantly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection%23ItemChanged">Online Documentation</a>
 */
fun addItemChangedListener(listener: EventHandler1<ItemEventArgs<T>>)
fun removeItemChangedListener(listener: EventHandler1<ItemEventArgs<T>>)

companion object : InterfaceMetadata<IObservableCollection<*>> {
}
}

/**
 * Occurs when an item has been added to this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection%23ItemAdded">Online Documentation</a>
 */
inline fun <T : YObject> IObservableCollection<T>.addItemAddedHandler(
    crossinline handler: (item:T) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<T>> = { _, event -> handler(event.item) }
    addItemAddedListener(listener)
    return { removeItemAddedListener(listener) }
}
/**
 * Occurs when an item has been removed from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection%23ItemRemoved">Online Documentation</a>
 */
inline fun <T : YObject> IObservableCollection<T>.addItemRemovedHandler(
    crossinline handler: (item:T) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<T>> = { _, event -> handler(event.item) }
    addItemRemovedListener(listener)
    return { removeItemRemovedListener(listener) }
}
/**
 * Occurs when an item in this collection has changed significantly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection%23ItemChanged">Online Documentation</a>
 */
inline fun <T : YObject> IObservableCollection<T>.addItemChangedHandler(
    crossinline handler: (item:T) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<T>> = { _, event -> handler(event.item) }
    addItemChangedListener(listener)
    return { removeItemChangedListener(listener) }
}
