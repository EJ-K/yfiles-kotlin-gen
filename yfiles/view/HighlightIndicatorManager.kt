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
 * A [ModelManager] implementation that manages the visual decorations of highlighted elements in a canvas.
 * @param [T] The type of the items.
 * @see [HighlightIndicatorManager]
 * @see [FocusIndicatorManager]
 * @see [SelectionIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-constructor-HighlightIndicatorManager">Online Documentation</a>
 */
open external class HighlightIndicatorManager<T : IModelItem> () : ModelManager<T> {
  /**
   * Gets or sets the model that describes the domain for the highlight.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23domain">Online Documentation</a>
   */
  final var domain: IObservableCollection<T>
  
  /**
   * Gets or sets the item collection that determines which items are highlighted.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23items">Online Documentation</a>
   */
  final var items: IObservableCollection<T>
  
  /**
   * Called by [installItem][ModelManager] to retrieve the render tree group for a given item.
   * @param [item] The item to find a render tree group for.
   * @return An [IRenderTreeGroup] or `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-getRenderTreeGroup">Online Documentation</a>
   */
  override fun getRenderTreeGroup(
    item: T,
  ): IRenderTreeGroup?
  
  /**
   * Called by [installItem][ModelManager] to retrieve the renderer for a given item.
   * @param [item] The item to find a renderer for.
   * @return A renderer or `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-getRenderer">Online Documentation</a>
   */
  override fun getRenderer(
    item: T,
  ): IObjectRenderer<T>?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-install">Online Documentation</a>
   */
  override fun install(
    canvasComponent: CanvasComponent,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-onDisabled">Online Documentation</a>
   */
  override fun onDisabled()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-onEnabled">Online Documentation</a>
   */
  override fun onEnabled()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    canvasComponent: CanvasComponent,
  )
  
  companion object : ClassMetadata<HighlightIndicatorManager<*>> {
  }
}
