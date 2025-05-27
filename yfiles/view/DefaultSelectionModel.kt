// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IEnumerator
import yfiles.collections.IObservableCollection
import yfiles.collections.ItemEventArgs
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate

/**
 * Default implementation of an [ISelectionModel] that is based on an observable collection to hold the selected elements.
 * @param [T] The type of the items to be selected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel">Online Documentation</a>
 * 
 * @constructor Creates a default selection model implementation that uses a [ObservableCollection][yfiles.collections.ObservableCollection] to hold the selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23DefaultSelectionModel-constructor-DefaultSelectionModel">Online Documentation</a>
 */
external open class DefaultSelectionModel<T : IModelItem>  () : ISelectionModel<T> {

/**
 * Gets or sets the predicate which determines whether the queried item should be considered for this selection model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23isInDomain">Online Documentation</a>
 */
final var isInDomain: Predicate<T>?
/**
 * Gets an observable collection view over the selected items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23selection">Online Documentation</a>
 */
final val selection: IObservableCollection<T>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23DefaultSelectionModel-method-clear">Online Documentation</a>
 */
 override   fun clear()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23DefaultSelectionModel-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<T>
/**
 * Determines whether an item is selected by checking for the containment in the [selection].
 * @param [item] The item to check
 * @return Whether the item is selected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23DefaultSelectionModel-method-isSelected">Online Documentation</a>
 */
 override   fun isSelected( item: T ):Boolean
/**
 * Event handler for domain item removal events that removes the item from this model.
 * @param [source] The instance that raised the event.
 * @param [event] The event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23DefaultSelectionModel-method-itemRemovedFromDomainHandler">Online Documentation</a>
 */
 final   fun itemRemovedFromDomainHandler( source: IEventDispatcher ,
 event: ItemEventArgs<T> )
/**
 * Called when an item gets selected or deselected.
 * @param [o] The item.
 * @param [selected] Whether or not the item is selected after the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23DefaultSelectionModel-method-onItemSelectionChanged">Online Documentation</a>
 */
 open protected   fun onItemSelectionChanged( o: T ,
 selected: Boolean )
/**
 * Removes the given `item` from the selection in response to the item being removed from the domain.
 * @param [item] The item to remove from the considered items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23DefaultSelectionModel-method-removeDomainItem">Online Documentation</a>
 */
 open   fun removeDomainItem( item: T )
/**
 * Sets the selection state of the item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23DefaultSelectionModel-method-setSelected">Online Documentation</a>
 */
 override   fun setSelected( item: T ,
 selected: Boolean )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultSelectionModel%23ItemSelectionChanged">Online Documentation</a>
 */
override fun addItemSelectionChangedListener(listener: EventHandler1<ItemSelectionChangedEventArgs<T>>)
override fun removeItemSelectionChangedListener(listener: EventHandler1<ItemSelectionChangedEventArgs<T>>)

companion object : ClassMetadata<DefaultSelectionModel<*>> {
}
}
