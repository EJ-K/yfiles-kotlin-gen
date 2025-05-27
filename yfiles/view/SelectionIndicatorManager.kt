// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IObservableCollection
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * A [ModelManager] implementation that manages the visual decorations of selected elements in a canvas.
 * @param [T] The type of the items in the collection and selection model.
 * @see [SelectionIndicatorManager]
 * @see [FocusIndicatorManager]
 * @see [HighlightIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance that for all selected items in the model dynamically installs a selection indicator visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-constructor-SelectionIndicatorManager">Online Documentation</a>
 */
open external class SelectionIndicatorManager<T : IModelItem> () : ModelManager<T> {
  /**
   * Gets or sets the model that describes the domain for the selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23domain">Online Documentation</a>
   */
  final var domain: IObservableCollection<T>
  
  /**
   * Gets or sets the selection model that determines which items are selected.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23items">Online Documentation</a>
   */
  final var items: IObservableCollection<T>
  
  /**
   * Called by [installItem][ModelManager] to retrieve the render tree group for a given item.
   * @param [item] The item to find a render tree group for.
   * @return An [IRenderTreeGroup] or `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-getRenderTreeGroup">Online Documentation</a>
   */
  override fun getRenderTreeGroup(
    item: T,
  ): IRenderTreeGroup?
  
  /**
   * Called by [installItem][ModelManager] to retrieve the renderer for a given item.
   * @param [item] The item to find a renderer for.
   * @return A renderer or `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-getRenderer">Online Documentation</a>
   */
  override fun getRenderer(
    item: T,
  ): IObjectRenderer<T>?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-install">Online Documentation</a>
   */
  override fun install(
    canvasComponent: CanvasComponent,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-onDisabled">Online Documentation</a>
   */
  override fun onDisabled()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-onEnabled">Online Documentation</a>
   */
  override fun onEnabled()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    canvasComponent: CanvasComponent,
  )
  
  companion object : ClassMetadata<SelectionIndicatorManager<*>> {
  }
}
