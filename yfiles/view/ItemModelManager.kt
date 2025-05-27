// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IComparer
import yfiles.collections.IEnumerable
import yfiles.collections.ItemEventArgs
import yfiles.lang.ClassMetadata
import yfiles.lang.IEventDispatcher
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Installs and removes visual representations of items into or from the canvas.
 * @param [T] The type of managed items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ItemModelManager].
 * @param [itemType] The type of managed items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-constructor-ItemModelManager">Online Documentation</a>
 */
external open class ItemModelManager<T : YObject>  ( itemType: YClass<T> ) : YObject, IEventDispatcher {

/**
 * Gets or sets the canvas object group used by [install].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23canvasObjectGroup">Online Documentation</a>
 */
final var canvasObjectGroup: ICanvasObjectGroup?
/**
 * Gets or sets an [IComparer] that compares the items so that they are put into the correct order in the canvas tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23comparer">Online Documentation</a>
 */
final var comparer: IComparer<T>?
/**
 * Gets or sets the canvas object descriptor used by [install] when an item is [added][ICanvasObjectGroup.addChild] to an canvas object group.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23descriptor">Online Documentation</a>
 */
final var descriptor: ICanvasObjectDescriptor<T>?
/**
 * Registers and [installs][install] the given `item` into the canvas.
 * @param [item] The item to install.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-addItem">Online Documentation</a>
 */
 open   fun addItem( item: T )
/**
 * [Adds][addItem] all items to the canvas.
 * @param [items] The items to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-addItems">Online Documentation</a>
 */
 open   fun addItems( items: IEnumerable<T> )
/**
 * Retrieves the canvas object that has been registered for the given item or `null`.
 * @param [item] The item to retrieve the canvas object for.
 * @return A canvas object instance or `null`.
 * @see [install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-getCanvasObject">Online Documentation</a>
 */
 open   fun getCanvasObject( item: T ):ICanvasObject?
/**
 * Gets the [ICanvasObjectGroup] used to [install] the `item` in the canvas.
 * 
 * The default implementation simply returns the value of [canvasObjectGroup].
 * @param [item] The item to get the group for.
 * @return The [ICanvasObjectGroup] used to [install] an item in the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-getCanvasObjectGroup">Online Documentation</a>
 */
 open protected   fun getCanvasObjectGroup( item: T ):ICanvasObjectGroup?
/**
 * Returns the [ICanvasObjectDescriptor] used to [install] the `item` in the canvas.
 * 
 * The default implementation simply returns the value of [descriptor].
 * @param [item] The item to get the descriptor for.
 * @return The [ICanvasObjectDescriptor] used to [install] an item in the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-getDescriptor">Online Documentation</a>
 */
 open protected   fun getDescriptor( item: T ):ICanvasObjectDescriptor<T>?
/**
 * Tries to find the item managed by this instance that is associated with the given canvas object.
 * @param [canvasObject] The canvas object to query the corresponding model item for.
 * @return The item or `null` if no such item could be found.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-getItem">Online Documentation</a>
 */
 open   fun getItem( canvasObject: ICanvasObject ):T?
/**
 * Installs a member of the collection into the canvas using the [descriptor].
 * @param [item] The member to install.
 * @return The canvas object that has been returned by the installer or `null` if the item was not installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-install">Online Documentation</a>
 */
 open protected   fun install( item: T ):ICanvasObject?
/**
 * Event handler for item creation events that adds the item to this manager.
 * @param [source] The instance that raised the event.
 * @param [event] The event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-itemAddedHandler">Online Documentation</a>
 */
 open   fun itemAddedHandler( source: IEventDispatcher ,
 event: ItemEventArgs<T> )
/**
 * Event handler for item change events that updates the visual representation for that item.
 * @param [source] The event source.
 * @param [event] The item event args which indicate the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-itemChangedHandler">Online Documentation</a>
 */
 open   fun itemChangedHandler( source: IEventDispatcher ,
 event: ItemEventArgs<T> )
/**
 * Event handler for item removal events that removes the item from this manager.
 * @param [source] The instance that raised the event.
 * @param [event] The event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-itemRemovedHandler">Online Documentation</a>
 */
 open   fun itemRemovedHandler( source: IEventDispatcher ,
 event: ItemEventArgs<T> )
/**
 * Deregisters and uninstalls the given `item` from the canvas.
 * @param [item] The item to uninstall.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-removeItem">Online Documentation</a>
 */
 open   fun removeItem( item: T )
/**
 * [Removes][removeItem] all items from the canvas.
 * @param [items] The items to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-removeItems">Online Documentation</a>
 */
 open   fun removeItems( items: IEnumerable<T> )
/**
 * This method may be called to update the visual representation of the given item in the canvas.
 * @param [item] The item to update.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-update">Online Documentation</a>
 */
 open   fun update( item: T )

companion object : ClassMetadata<ItemModelManager<*>> {
}
}
