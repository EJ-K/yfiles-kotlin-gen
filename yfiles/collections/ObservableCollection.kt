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
import yfiles.lang.YObject

/**
 * An implementation of an [IObservableCollection] that is backed by an ordinary [ICollection]
 * @param [T] The type of the elements contained in this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection">Online Documentation</a>
 * 
 * @constructor Creates a new instance using a provided collection as the backing store.
 * @param [items] The collection to use as the backing store. If no collection is provided a [List] will be used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-constructor-ObservableCollection">Online Documentation</a>
 */
external open class ObservableCollection<T : YObject>  ( items: ICollection<out T>?  = definedExternally) : IObservableCollection<T> {

/**
 * Gets whether this collection is read only.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23isReadOnly">Online Documentation</a>
 */
final override val isReadOnly: Boolean
/**
 * Gets the collection used internally as the backing store.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23items">Online Documentation</a>
 */
final val items: ICollection<out T>
/**
 * Adds the item the the collection and triggers the [ItemAdded] event.
 * @param [item] The item to add to the collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-add">Online Documentation</a>
 */
 override   fun add( item: T )
/**
 * Clears this collection, triggering an [ItemRemoved] event for each element removed.
 * @see [onItemRemoved]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-clear">Online Documentation</a>
 */
 override   fun clear()
/**
 * Copies the items to the given array.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-copyTo">Online Documentation</a>
 */
 final override   fun copyTo( array: Array<in T> ,
 arrayIndex: Int )
/**
 * Returns an enumerator over the elements in this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<T>
/**
 * Triggers the [ItemAdded] event.
 * @param [item] The item that has just been added to the collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-onItemAdded">Online Documentation</a>
 */
 open protected   fun onItemAdded( item: T )
/**
 * Triggers the [ItemChanged] event.
 * @param [item] The item that has changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-onItemChanged">Online Documentation</a>
 */
 open protected   fun onItemChanged( item: T )
/**
 * Triggers the [ItemRemoved] event.
 * @param [item] The item that has just been removed from the collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-onItemRemoved">Online Documentation</a>
 */
 open protected   fun onItemRemoved( item: T )
/**
 * Method that may be called by client code to trigger an [ItemChanged] event.
 * @param [item] The item to trigger the change event for.
 * @see [onItemChanged]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-publishItemChanged">Online Documentation</a>
 */
 final   fun publishItemChanged( item: T )
/**
 * Tries to remove the item from the collection and triggers the [ItemRemoved] event.
 * @param [item] The item to remove.
 * @return Whether the item has been removed.
 * @see [onItemRemoved]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ObservableCollection-method-remove">Online Documentation</a>
 */
 override   fun remove( item: T ):Boolean
/**
 * Occurs when an item has been added to this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ItemAdded">Online Documentation</a>
 */
override fun addItemAddedListener(listener: EventHandler1<ItemEventArgs<T>>)
override fun removeItemAddedListener(listener: EventHandler1<ItemEventArgs<T>>)

/**
 * Occurs when an item has been removed from this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ItemRemoved">Online Documentation</a>
 */
override fun addItemRemovedListener(listener: EventHandler1<ItemEventArgs<T>>)
override fun removeItemRemovedListener(listener: EventHandler1<ItemEventArgs<T>>)

/**
 * Occurs when an item has been changed inside this collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObservableCollection%23ItemChanged">Online Documentation</a>
 */
override fun addItemChangedListener(listener: EventHandler1<ItemEventArgs<T>>)
override fun removeItemChangedListener(listener: EventHandler1<ItemEventArgs<T>>)

companion object : ClassMetadata<ObservableCollection<*>> {
}
}
