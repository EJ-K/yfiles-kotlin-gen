// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * Manages the visual representations of items in a [CanvasComponent].
 * @param [T] The type of items this instance deals with.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-constructor-ModelManager">Online Documentation</a>
 */
abstract external class ModelManager<T : IModelItem> protected constructor()  {
  /**
   * Gets the canvas instance this instance is managing.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23canvasComponent">Online Documentation</a>
   */
  final var canvasComponent: CanvasComponent?
  
  /**
   * Gets or sets whether this [ModelManager] is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23enabled">Online Documentation</a>
   */
  final var enabled: Boolean
  
  /**
   * Installs an item and adds it to this manager's set of managed items.
   * @param [item] The item to add.
   * @return The newly created render tree element or `null` if nothing was installed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-addItem">Online Documentation</a>
   */
  protected open fun addItem(
    item: T,
  ): IRenderTreeElement?
  
  /**
   * Called by [installItem][ModelManager] to retrieve the render tree group for a given item.
   * @param [item] The item to find a render tree group for.
   * @return An [IRenderTreeGroup] or `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-getRenderTreeGroup">Online Documentation</a>
   */
  protected abstract fun getRenderTreeGroup(
    item: T,
  ): IRenderTreeGroup?
  
  /**
   * Called by [installItem][ModelManager] to retrieve the renderer for a given item.
   * @param [item] The item to find a renderer for.
   * @return A renderer or `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-getRenderer">Online Documentation</a>
   */
  protected abstract fun getRenderer(
    item: T,
  ): IObjectRenderer<T>?
  
  /**
   * Installs this instance in the given [CanvasComponent] instance.
   * @param [canvasComponent] The [CanvasComponent] instance to install this manager instance in.
   * @throws ArgumentError if `canvasComponent` is `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-install">Online Documentation</a>
   */
  open fun install(
    canvasComponent: CanvasComponent,
  )
  
  /**
   * Installs a member of the collection into the canvas using the [IObjectRenderer] which is returned by [getRenderer][ModelManager].
   * @param [item] The member to install.
   * @return The new render tree element or `null` if the item was not installed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-installItem">Online Documentation</a>
   */
  protected open fun installItem(
    item: T,
  ): IRenderTreeElement?
  
  /**
   * Called when this manager gets [disabled][ModelManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-onDisabled">Online Documentation</a>
   */
  protected abstract fun onDisabled()
  
  /**
   * Called when this manager gets [enabled][ModelManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-onEnabled">Online Documentation</a>
   */
  protected abstract fun onEnabled()
  
  /**
   * Uninstalls the provided item and removes it from this manager's set of managed items.
   * @param [item] The item to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-removeItem">Online Documentation</a>
   */
  protected open fun removeItem(
    item: T,
  )
  
  /**
   * Uninstalls this instance from the given [CanvasComponent] instance.
   * @param [canvasComponent] The [CanvasComponent] to remove this manager instance from.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-uninstall">Online Documentation</a>
   */
  open fun uninstall(
    canvasComponent: CanvasComponent,
  )
  
  /**
   * Removes the given [IRenderTreeElement].
   * @param [renderTreeElement] The render tree element that has been associated with the renderer.
   * @see [RenderTree.remove]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ModelManager%23ModelManager-method-uninstallItem">Online Documentation</a>
   */
  protected open fun uninstallItem(
    renderTreeElement: IRenderTreeElement,
  )
  
  companion object : ClassMetadata<ModelManager<*>> {
  }
}
