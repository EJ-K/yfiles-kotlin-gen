// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import js.array.ReadonlyArray
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1

/**
 * An implementation of an [IObservableCollection] that is backed by an ordinary [ICollection]
 * @param [T] The type of the elements contained in this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @param [items] An optional backing store. If not specified, a [List] is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-constructor-ObservableCollection">Online Documentation</a>
 */
external class ObservableCollection<T> (
  items: ICollection<out T>  = definedExternally,
) : IObservableCollection<T> {
  /**
   * Gets whether this collection is read-only.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23isReadOnly">Online Documentation</a>
   */
  final override val isReadOnly: Boolean
  
  /**
   * Adds the item to the collection and triggers the [item-added][ObservableCollection] event.
   * @param [item] The item to add to the collection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-add">Online Documentation</a>
   */
  override fun add(
    item: T,
  )
  
  /**
   * Clears this collection, triggering an [item-removed][ObservableCollection] event for each element removed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-clear">Online Documentation</a>
   */
  override fun clear()
  
  /**
   * Copies the items to the given array.
   * @param [array] The one-dimensional Array that is the destination of the copied elements. The Array must have zero-based indexing.
   * @param [arrayIndex] The zero-based index in array at which copying begins.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-copyTo">Online Documentation</a>
   */
  override fun copyTo(
    array: Array<in T>,
    arrayIndex: Int,
  )
  
  /**
   * Returns an enumerator that iterates over the elements in this collection.
   * @return An enumerator that allows iteration over the elements in the collection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-getEnumerator">Online Documentation</a>
   */
  override fun getEnumerator(): IEnumerator<T>
  
  /**
   * Tries to remove the item from the collection and triggers the [item-removed][ObservableCollection] event.
   * @param [item] The item to remove.
   * @return Whether the item has been removed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-remove">Online Documentation</a>
   */
  override fun remove(
    item: T,
  ): Boolean
  
  companion object : ClassMetadata<ObservableCollection<*>> {
  }
}

/**
 * `item-added`: Occurs when an item has been added to this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23item-added">Online Documentation</a>
 */
inline fun <T> ObservableCollection<T>.addItemAddedHandler(
  crossinline handler: (item:T) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<T>> = { event, _ -> handler(event.item) }
  addEventListener("item-added", listener)
  return { removeEventListener("item-added", listener) }
}

/**
 * `item-removed`: Occurs when an item has been removed from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23item-removed">Online Documentation</a>
 */
inline fun <T> ObservableCollection<T>.addItemRemovedHandler(
  crossinline handler: (item:T) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<T>> = { event, _ -> handler(event.item) }
  addEventListener("item-removed", listener)
  return { removeEventListener("item-removed", listener) }
}
