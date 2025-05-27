// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.graph.GraphItemTypes
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor

/**
 * An input mode for use in a [GraphComponent][yfiles.view.GraphComponent] that fires events when the pointer enters or leaves the visualization of a [graph item][IModelItem].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ItemHoverInputMode] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-constructor-ItemHoverInputMode">Online Documentation</a>
 */
open external class ItemHoverInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets the installed [controller][ItemHoverInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets the current item the pointer is hovering over.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23currentHoverItem">Online Documentation</a>
   */
  final val currentHoverItem: IModelItem?
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Gets or sets the cursor to use when the pointer is hovering over a [isValidHoverItem][ItemHoverInputMode] valid hover item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23hoverCursor">Online Documentation</a>
   */
  final var hoverCursor: Cursor?
  
  /**
   * Gets or sets which graph items are considered by this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23hoverItems">Online Documentation</a>
   */
  final var hoverItems: GraphItemTypes
  
  /**
   * Gets or sets a value indicating whether items that have been hit at the current location that are not [valid items][ItemHoverInputMode] should be ignored (and an underlying valid item be considered instead) or reported as `null`.
   * @see [isValidHoverItem]
   * @see [getHitItemsAt]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ignoreInvalidItems">Online Documentation</a>
   */
  final var ignoreInvalidItems: Boolean
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Creates an implementation of [IInputModeContext] that is specific to this mode.
   * @return A readily configured [IInputModeContext].
   * @see [IHitTester.enumerateHits]
   * @see [IHitTestable.isHit]
   * @see [IInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Gets the items that have been hit at the given location.
   * @param [location] The location in world coordinates to query.
   * @return An enumerable over the items that have been hit at the given location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-getHitItemsAt">Online Documentation</a>
   */
  protected open fun getHitItemsAt(
    location: Point,
  ): IEnumerable<IModelItem>
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][ItemHoverInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Determines whether the given item is a valid item to be considered for hovering.
   * @param [item] The item to check.
   * @return `true` if it is valid to report a hover over the specified item; `false` otherwise.
   * @see [getHitItemsAt]
   * @see [ignoreInvalidItems]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-isValidHoverItem">Online Documentation</a>
   */
  protected open fun isValidHoverItem(
    item: IModelItem,
  ): Boolean
  
  /**
   * Called after [cancel][ItemHoverInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Raises the [hovered-item-changed][ItemHoverInputMode] event.
   * @param [event] The [HoveredItemChangedEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-onHoveredItemChanged">Online Documentation</a>
   */
  protected open fun onHoveredItemChanged(
    event: HoveredItemChangedEventArgs,
  )
  
  /**
   * Called after [tryStop][ItemHoverInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * Overridden to only return `true` if this instance does not currently [have the input mutex][ConcurrencyController].
   * @return `true` iff this instance does not [own the mutex][ConcurrencyController].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  /**
   * Forces a reevaluation of the item that the pointer is currently hovering over or at a specific location.
   * @param [location] The query location. If omitted, the last location is queried again.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23ItemHoverInputMode-method-updateHover">Online Documentation</a>
   */
  fun updateHover(
    location: Point  = definedExternally,
  )
  
  companion object : ClassMetadata<ItemHoverInputMode> {
  }
}

inline fun ItemHoverInputMode(
    block: ItemHoverInputMode.() -> Unit
): ItemHoverInputMode {
    return ItemHoverInputMode()
        .apply(block)
}

/**
 * `hovered-item-changed`: Occurs when the item that is being hovered over with the pointer changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemHoverInputMode%23hovered-item-changed">Online Documentation</a>
 */
inline fun  ItemHoverInputMode.addHoveredItemChangedHandler(
  crossinline handler: (item:IModelItem?, oldItem:IModelItem?) -> Unit
): () -> Unit {
  val listener: EventHandler1<HoveredItemChangedEventArgs> = { event, _ -> handler(event.item, event.oldItem) }
  addEventListener("hovered-item-changed", listener)
  return { removeEventListener("hovered-item-changed", listener) }
}
