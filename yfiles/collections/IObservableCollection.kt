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

/**
 * The interface for a collection that will notify registered event handlers of changes to its contents.
 * @param [T] The type of the items in the collection.
 * @see [ObservableCollection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection">Online Documentation</a>
 */
external interface IObservableCollection<T> : ICollection<T>, IEventDispatcher {

  
  companion object : InterfaceMetadata<IObservableCollection<*>> {
  }
}

/**
 * `item-added`: Occurs when an item has been added to this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection%23item-added">Online Documentation</a>
 */
inline fun <T> IObservableCollection<T>.addItemAddedHandler(
  crossinline handler: (item:T) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<T>> = { event, _ -> handler(event.item) }
  addEventListener("item-added", listener)
  return { removeEventListener("item-added", listener) }
}
/**
 * `item-removed`: Occurs when an item has been removed from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObservableCollection%23item-removed">Online Documentation</a>
 */
inline fun <T> IObservableCollection<T>.addItemRemovedHandler(
  crossinline handler: (item:T) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<T>> = { event, _ -> handler(event.item) }
  addEventListener("item-removed", listener)
  return { removeEventListener("item-removed", listener) }
}
