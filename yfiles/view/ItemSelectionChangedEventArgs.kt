// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.ItemEventArgs
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * Provides data for the [ISelectionModel.ItemSelectionChanged] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemSelectionChangedEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new event argument instance for the given item and its selection state.
 * @param [item] The item whose [selection state][ISelectionModel.isSelected] has changed.
 * @param [itemSelected] The value indicating whether the item is selected after the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemSelectionChangedEventArgs%23ItemSelectionChangedEventArgs-constructor-ItemSelectionChangedEventArgs">Online Documentation</a>
 * 
 * @property itemSelected
 * Gets a value indicating whether the item is selected after the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemSelectionChangedEventArgs%23itemSelected">Online Documentation</a>
 */
external  class ItemSelectionChangedEventArgs<T : IModelItem>  (
 item: T ,
final val itemSelected: Boolean) : ItemEventArgs<T> {

companion object : ClassMetadata<ItemSelectionChangedEventArgs<*>> {
}
}
