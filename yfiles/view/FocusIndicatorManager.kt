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
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher

/**
 * A [ModelManager] implementation that manages the visual decoration of the focused element in a canvas.
 * @param [T] The type of the items.
 * @see [FocusIndicatorManager]
 * @see [HighlightIndicatorManager]
 * @see [SelectionIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-constructor-FocusIndicatorManager">Online Documentation</a>
 */
open external class FocusIndicatorManager<T : IModelItem> () : ModelManager<T>, IEventDispatcher {
  /**
   * Gets or sets a value indicating whether the [container][CanvasComponent] this manager is installed in currently is focused.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23focused">Online Documentation</a>
   */
  final var focused: Boolean
  
  /**
   * Gets or sets the focused item, updates the canvas, and fires the [corresponding][FocusIndicatorManager] event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23focusedItem">Online Documentation</a>
   */
  final var focusedItem: T?
  
  /**
   * Gets or sets the policy for when the focus indicator should be visible.
   * 
   * The default is [WHEN_USING_KEYBOARD][ShowFocusPolicy].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23showFocusPolicy">Online Documentation</a>
   */
  final var showFocusPolicy: ShowFocusPolicy
  
  /**
   * Gets or sets a value that determines whether the user is currently using the keyboard to control the [focusedItem][FocusIndicatorManager].
   * @see [showFocusPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23usingKeyboard">Online Documentation</a>
   */
  final var usingKeyboard: Boolean
  
  /**
   * Overridden to do nothing.
   * @param [item] The item to add, which is ignored in this implementation.
   * @return Always returns `null` as no action is performed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-addItem">Online Documentation</a>
   */
  override fun addItem(
    item: T,
  ): IRenderTreeElement?
  
  /**
   * Called by [installItem][ModelManager] to retrieve the render tree group for a given item.
   * @param [item] The item to find a render tree group for.
   * @return An [IRenderTreeGroup] or `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-getRenderTreeGroup">Online Documentation</a>
   */
  override fun getRenderTreeGroup(
    item: T,
  ): IRenderTreeGroup?
  
  /**
   * Called by [installItem][ModelManager] to retrieve the renderer for a given item.
   * @param [item] The item to find a renderer for.
   * @return A renderer or `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-getRenderer">Online Documentation</a>
   */
  override fun getRenderer(
    item: T,
  ): IObjectRenderer<T>?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-install">Online Documentation</a>
   */
  override fun install(
    canvasComponent: CanvasComponent,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-onDisabled">Online Documentation</a>
   */
  override fun onDisabled()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-onEnabled">Online Documentation</a>
   */
  override fun onEnabled()
  
  /**
   * Called when the [focused][FocusIndicatorManager] property has changed.
   * @see [focused]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-onFocusedChanged">Online Documentation</a>
   */
  protected open fun onFocusedChanged()
  
  /**
   * Called when the focused item has changed.
   * @param [event] a description of the event
   * @see [focusedItem]
   * @see [focused-item-changed]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-onFocusedItemChanged">Online Documentation</a>
   */
  protected open fun onFocusedItemChanged(
    event: ItemEventArgs<T?>,
  )
  
  /**
   * Called when the [usingKeyboard][FocusIndicatorManager] property has changed.
   * @see [usingKeyboard]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-onUsingKeyboardChanged">Online Documentation</a>
   */
  protected open fun onUsingKeyboardChanged()
  
  /**
   * Overridden to do nothing.
   * @param [item] The item to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-removeItem">Online Documentation</a>
   */
  override fun removeItem(
    item: T,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    canvasComponent: CanvasComponent,
  )
  
  companion object : ClassMetadata<FocusIndicatorManager<*>> {
  }
}

/**
 * `focused-item-changed`: Occurs when the [focusedItem][FocusIndicatorManager] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23focused-item-changed">Online Documentation</a>
 */
inline fun <T : IModelItem> FocusIndicatorManager<T>.addFocusedItemChangedHandler(
  crossinline handler: (item:T) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<T>> = { event, _ -> handler(event.item) }
  addEventListener("focused-item-changed", listener)
  return { removeEventListener("focused-item-changed", listener) }
}
