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
import yfiles.collections.ItemEventArgs
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.lang.IClassMetadata
import yfiles.lang.IEventDispatcher

/**
 * Installs and removes visual representations of items into or from the canvas.
 * @param [T] The type of managed items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ItemModelManager].
 * @param [itemType] The type of managed items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-constructor-ItemModelManager">Online Documentation</a>
 */
open external class ItemModelManager<T> (
  itemType: IClassMetadata<T>,
) : IEventDispatcher {
  /**
   * Gets or sets a comparison that compares the items so that they are put into the correct order in the canvas tree.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23comparator">Online Documentation</a>
   */
  final var comparator: Comparison1<T>?
  
  /**
   * Gets or sets the render tree group used by [install][ItemModelManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23renderTreeGroup">Online Documentation</a>
   */
  final var renderTreeGroup: IRenderTreeGroup?
  
  /**
   * Gets or sets the renderer used by [install][ItemModelManager] when an item is [added][RenderTree] to a render tree group.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23renderer">Online Documentation</a>
   */
  final var renderer: IObjectRenderer<T>?
  
  /**
   * Registers and [installs][ItemModelManager] the given `item` into the canvas.
   * @param [item] The item to install.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-addItem">Online Documentation</a>
   */
  open fun addItem(
    item: T,
  )
  
  /**
   * [Adds][ItemModelManager] all items to the canvas.
   * @param [items] The items to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-addItems">Online Documentation</a>
   */
  open fun addItems(
    items: IEnumerable<T>,
  )
  
  /**
   * Tries to find the item managed by this instance that is associated with the given render tree element.
   * @param [renderTreeElement] The render tree element to query the corresponding model item for.
   * @return The item or `null` if no such item could be found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-getItem">Online Documentation</a>
   */
  open fun getItem(
    renderTreeElement: IRenderTreeElement,
  ): T?
  
  /**
   * Retrieves the render tree element that has been registered for the given item or `null`.
   * @param [item] The item to retrieve the render tree element for.
   * @return A render tree element instance or `null`.
   * @see [install]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-getRenderTreeElement">Online Documentation</a>
   */
  open fun getRenderTreeElement(
    item: T,
  ): IRenderTreeElement?
  
  /**
   * Gets the [IRenderTreeGroup] used to [install][ItemModelManager] the `item` in the canvas.
   * 
   * The default implementation simply returns the value of [renderTreeGroup][ItemModelManager].
   * @param [item] The item to get the group for.
   * @return The [IRenderTreeGroup] used to [install][ItemModelManager] an item in the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-getRenderTreeGroup">Online Documentation</a>
   */
  protected open fun getRenderTreeGroup(
    item: T,
  ): IRenderTreeGroup?
  
  /**
   * Returns the [IObjectRenderer] used to [install][ItemModelManager] the `item` in the canvas.
   * 
   * The default implementation simply returns the value of [renderer][ItemModelManager].
   * @param [item] The item to get the renderer for.
   * @return The [IObjectRenderer] used to [install][ItemModelManager] an item in the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-getRenderer">Online Documentation</a>
   */
  protected open fun getRenderer(
    item: T,
  ): IObjectRenderer<T>?
  
  /**
   * Installs a member of the collection into the canvas using the [renderer][ItemModelManager].
   * @param [item] The member to install.
   * @return The new render tree element or `null` if the item was not installed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-install">Online Documentation</a>
   */
  protected open fun install(
    item: T,
  ): IRenderTreeElement?
  
  /**
   * Event handler for item creation events that adds the item to this manager.
   * @param [event] The event arguments.
   * @param [source] The instance that raised the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-itemAddedHandler">Online Documentation</a>
   */
  open fun itemAddedHandler(
    event: ItemEventArgs<T>,
    source: IEventDispatcher,
  )
  
  /**
   * Event handler for item removal events that removes the item from this manager.
   * @param [event] The event arguments.
   * @param [source] The instance that raised the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-itemRemovedHandler">Online Documentation</a>
   */
  open fun itemRemovedHandler(
    event: ItemEventArgs<T>,
    source: IEventDispatcher,
  )
  
  /**
   * Deregisters and uninstalls the given `item` from the canvas.
   * @param [item] The item to uninstall.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-removeItem">Online Documentation</a>
   */
  open fun removeItem(
    item: T,
  )
  
  /**
   * [Removes][ItemModelManager] all items from the canvas.
   * @param [items] The items to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-removeItems">Online Documentation</a>
   */
  open fun removeItems(
    items: IEnumerable<T>,
  )
  
  /**
   * This method may be called to update the visual representation of the given item in the canvas.
   * @param [item] The item to update.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemModelManager%23ItemModelManager-method-update">Online Documentation</a>
   */
  open fun update(
    item: T,
  )
  
  companion object : ClassMetadata<ItemModelManager<*>> {
  }
}
