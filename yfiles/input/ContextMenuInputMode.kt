// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor

/**
 * An implementation of the [IInputMode] interface that handles the display of a custom context menu when the user right clicks on the [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ContextMenuInputMode] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-constructor-ContextMenuInputMode">Online Documentation</a>
 */
external open class ContextMenuInputMode  () : IInputMode, IEventDispatcher {

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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
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
 * Gets or sets the cursor to use when the mouse is at a [valid menu location][validMenuLocationHitTestable].
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
 override   fun cancel()
/**
 * Creates an [IInputModeContext] for use with the [PopulateMenu] call in the upcoming query.
 * @return An instance of [IInputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-createPopulateMenuContext">Online Documentation</a>
 */
 open protected   fun createPopulateMenuContext():IInputModeContext
/**
 * Installs this mode in the canvas.
 * @param [context] The context to install this mode into.
 * @param [controller] The [controller] for this mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * This method must be called by custom code to indicate that the menu has been closed.
 * @see [addCloseMenuListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-menuClosed">Online Documentation</a>
 */
 final   fun menuClosed()
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called when the menu is closed and triggers the [CloseMenu] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onCloseMenu">Online Documentation</a>
 */
 open protected   fun onCloseMenu()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * This will populate the context menu for the given world coordinate.
 * @param [location] The location in the world coordinate system for which the context menu has been invoked.
 * @return Whether to show the context menu.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onMenuOpening">Online Documentation</a>
 */
 open protected   fun onMenuOpening( location: Point ):Boolean
/**
 * Raises the [PopulateMenu] event.
 * @param [event] The [PopulateMenuEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onPopulateMenu">Online Documentation</a>
 */
 open protected   fun onPopulateMenu( event: PopulateMenuEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * This method must be called by custom code to inform this input mode that a context menu is about to be opened by a user gesture.
 * @param [queryLocation] The optional location for which the context menu content should be queried. This value will be passed to [onPopulateMenu] and will ultimately be available in [PopulateMenuEventArgs.queryLocation]. If not specified, the last known mouse location will be used.
 * @see [menuClosed]
 * @see [addCloseMenuListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-shouldOpenMenu">Online Documentation</a>
 */
 open   fun shouldOpenMenu( queryLocation: Point?  = definedExternally):Boolean
/**
 * Stops the display of the context menu and requests that the context menu is closed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Removes the menu from the context and replaces it with the old instance.
 * @param [context] The context to uninstall this mode from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23ContextMenuInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs when the context menu is about to be shown.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23PopulateMenu">Online Documentation</a>
 */
fun addPopulateMenuListener(listener: EventHandler1<PopulateMenuEventArgs>)
fun removePopulateMenuListener(listener: EventHandler1<PopulateMenuEventArgs>)

/**
 * Occurs when this instance requests closing an open context menu.
 * @see [menuClosed]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23CloseMenu">Online Documentation</a>
 */
fun addCloseMenuListener(listener: EventHandler1<EventArgs>)
fun removeCloseMenuListener(listener: EventHandler1<EventArgs>)

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
 * Occurs when the context menu is about to be shown.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23PopulateMenu">Online Documentation</a>
 */
inline fun  ContextMenuInputMode.addPopulateMenuHandler(
    crossinline handler: (event:PopulateMenuEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<PopulateMenuEventArgs> = { _, event -> handler(event) }
    addPopulateMenuListener(listener)
    return { removePopulateMenuListener(listener) }
}
/**
 * Occurs when this instance requests closing an open context menu.
 * @see [menuClosed]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ContextMenuInputMode%23CloseMenu">Online Documentation</a>
 */
inline fun  ContextMenuInputMode.addCloseMenuHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addCloseMenuListener(listener)
    return { removeCloseMenuListener(listener) }
}
