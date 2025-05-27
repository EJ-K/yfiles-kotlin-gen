// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import web.html.HTMLElement
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor
import yfiles.view.PopulateContextMenuEventArgs

/**
 * An implementation of the [IInputMode] interface that handles the display of a custom context menu when the user right-clicks on the [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ContextMenuInputMode] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-constructor-ContextMenuInputMode">Online Documentation</a>
 */
open external class ContextMenuInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets or sets a custom parent element to which the context menu is added as a child in the DOM.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23contextMenuParentElement">Online Documentation</a>
   */
  final var contextMenuParentElement: HTMLElement?
  
  /**
   * Gets the installed [ConcurrencyController].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets a value that determines whether clicks are swallowed if they happen within a short amount of time after a context menu was closed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23swallowCloseClick">Online Documentation</a>
   */
  final var swallowCloseClick: Boolean
  
  /**
   * Gets or sets the cursor to use when the mouse is at a [valid menu location][ContextMenuInputMode].
   * 
   * The default is `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23validMenuLocationCursor">Online Documentation</a>
   */
  final var validMenuLocationCursor: Cursor?
  
  /**
   * Gets or sets an [IHitTestable] that determines whether it is valid to open a context menu at the queried position.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23validMenuLocationHitTestable">Online Documentation</a>
   */
  final var validMenuLocationHitTestable: IHitTestable?
  
  /**
   * Cancels the display of the context menu and requests that the context menu is closed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * This method must be called by custom event listeners on [HTMLElement]s added in [contextMenu][PopulateContextMenuEventArgs] to indicate that the menu has been closed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-closeMenu">Online Documentation</a>
   */
  fun closeMenu()
  
  /**
   * Creates an input mode context that uses this instance as the [inputMode][IInputModeContext] and delegates to [parentInputModeContext][ContextMenuInputMode] otherwise.
   * @return An instance that has this [IInputMode] set as the [inputMode][IInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Creates an [IInputModeContext] for use with the [populate-menu][ContextMenuInputMode] call in the upcoming query.
   * @return An instance of [IInputModeContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-createPopulateMenuContext">Online Documentation</a>
   */
  protected open fun createPopulateMenuContext(): IInputModeContext
  
  /**
   * Installs this mode in the canvas.
   * @param [context] The context to install this mode into.
   * @param [controller] The [controller][ContextMenuInputMode] for this mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called after [cancel][ContextMenuInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Called when the menu is closed and triggers the [menu-closed][ContextMenuInputMode] event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onMenuClosed">Online Documentation</a>
   */
  protected open fun onMenuClosed()
  
  /**
   * Populates the context menu for the given world coordinate.
   * @param [location] The location in the world coordinate system for which the context menu has been invoked.
   * @return The [PopulateContextMenuEventArgs].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onMenuOpening">Online Documentation</a>
   */
  protected open fun onMenuOpening(
    location: Point,
  ): PopulateContextMenuEventArgs
  
  /**
   * Raises the [populate-menu][ContextMenuInputMode] event.
   * @param [event] The [PopulateContextMenuEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onPopulateMenu">Online Documentation</a>
   */
  protected open fun onPopulateMenu(
    event: PopulateContextMenuEventArgs,
  )
  
  /**
   * Called after [tryStop][ContextMenuInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * Stops the display of the context menu and requests that the context menu is closed.
   * @return `true` if successful, otherwise `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Removes the menu from the context and replaces it with the old instance.
   * @param [context] The context to uninstall this mode from.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<ContextMenuInputMode> {
  }
}

inline fun ContextMenuInputMode(
    block: ContextMenuInputMode.() -> Unit
): ContextMenuInputMode {
    return ContextMenuInputMode()
        .apply(block)
}

/**
 * `populate-menu`: Occurs when the context menu is about to be shown.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23populate-menu">Online Documentation</a>
 */
inline fun  ContextMenuInputMode.addPopulateMenuHandler(
  crossinline handler: (event:PopulateContextMenuEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PopulateContextMenuEventArgs> = { event, _ -> handler(event) }
  addEventListener("populate-menu", listener)
  return { removeEventListener("populate-menu", listener) }
}

/**
 * `menu-closed`: Occurs when this instance requests closing an open context menu.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23menu-closed">Online Documentation</a>
 */
inline fun  ContextMenuInputMode.addMenuClosedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
  addEventListener("menu-closed", listener)
  return { removeEventListener("menu-closed", listener) }
}
