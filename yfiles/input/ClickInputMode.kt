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
import yfiles.view.ModifierKeys
import yfiles.view.MouseButtons

/**
 * An input mode that recognizes simple mouse clicks.
 * @see [doubleClickPolicy]
 * @see [swallowFocusClick]
 * @see [activeButtons]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this mode that detects left mouse clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-constructor-ClickInputMode">Online Documentation</a>
 */
external open class ClickInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets or sets for which button(s) mouse clicks should be processed.
 * @see [createClickRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23activeButtons">Online Documentation</a>
 */
final var activeButtons: MouseButtons
/**
 * Gets the location of the last click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23clickLocation">Online Documentation</a>
 */
final val clickLocation: Point
/**
 * Gets the installed [controller].
 * @see [IInputMode.install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the click handling mode that determines the triggering behavior of [Clicked] and [DoubleClicked].
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23doubleClickPolicy">Online Documentation</a>
 */
final var doubleClickPolicy: DoubleClickPolicy
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets the state of the modifier keys at the time [Clicked] is invoked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23modifiers">Online Documentation</a>
 */
final val modifiers: ModifierKeys
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets whether to [request the mutex][ConcurrencyController.requestMutex] on a click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23requestMutexOnClick">Online Documentation</a>
 */
final var requestMutexOnClick: Boolean
/**
 * Gets or sets a property that determines whether clicks should be swallowed if they happen within a short amount of time after the [CanvasComponent][yfiles.view.CanvasComponent] got focus.
 * 
 * The default is `false`. If set to `true` clicks are discarded within 100 ms after the focus entered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23swallowFocusClick">Online Documentation</a>
 */
final var swallowFocusClick: Boolean
/**
 * Gets or sets the cursor to use when hovering over a valid hit region.
 * 
 * The default is `null` and the current cursor is used instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23validClickHitCursor">Online Documentation</a>
 */
final var validClickHitCursor: Cursor?
/**
 * Gets or sets a hit test that determines where this mode should recognize clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23validClickHitTestable">Online Documentation</a>
 */
final var validClickHitTestable: IHitTestable
/**
 * Cancels the editing of this mode.
 * @see [onCanceled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Creates the event recognizer that is used to recognize the clicks for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-createClickRecognizer">Online Documentation</a>
 */
 open protected   fun createClickRecognizer():EventRecognizer
/**
 * Creates the event recognizer that is used to recognize the press event for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-createPressRecognizer">Online Documentation</a>
 */
 open protected   fun createPressRecognizer():EventRecognizer
/**
 * Creates the event recognizer that is used to recognize the release event for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-createReleaseRecognizer">Online Documentation</a>
 */
 open protected   fun createReleaseRecognizer():EventRecognizer
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Determines whether the given event is a press event that occurred at an invalid location.
 * @see [validClickHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-isInvalidPress">Online Documentation</a>
 */
 open protected   fun isInvalidPress( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Determines whether the given event is a valid click event.
 * @see [validClickHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-isValidClick">Online Documentation</a>
 */
 open protected   fun isValidClick( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Determines whether the given event is a valid press event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-isValidPress">Online Documentation</a>
 */
 open protected   fun isValidPress( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Determines whether the given event is a valid release event.
 * @see [validClickHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-isValidRelease">Online Documentation</a>
 */
 open protected   fun isValidRelease( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called once this mode has recognized a click gesture.
 * @param [event] The arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onClicked">Online Documentation</a>
 */
 open protected   fun onClicked( event: ClickEventArgs )
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Called once this mode has recognized a double-click gesture.
 * @param [event] The arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onDoubleClicked">Online Documentation</a>
 */
 open protected   fun onDoubleClicked( event: ClickEventArgs )
/**
 * Called once this mode has recognized a left click gesture.
 * @param [event] The arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onLeftClicked">Online Documentation</a>
 */
 open protected   fun onLeftClicked( event: ClickEventArgs )
/**
 * Called once this mode has recognized a left double-click gesture.
 * @param [event] The arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onLeftDoubleClicked">Online Documentation</a>
 */
 open protected   fun onLeftDoubleClicked( event: ClickEventArgs )
/**
 * Called once this mode has recognized a right click gesture.
 * @param [event] The arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onRightClicked">Online Documentation</a>
 */
 open protected   fun onRightClicked( event: ClickEventArgs )
/**
 * Called once this mode has recognized a double-click gesture.
 * @param [event] The arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onRightDoubleClicked">Online Documentation</a>
 */
 open protected   fun onRightDoubleClicked( event: ClickEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * Prevents a double-click event from being issued if the next click would do so and sends only a single click instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-preventNextDoubleClick">Online Documentation</a>
 */
 final   fun preventNextDoubleClick()
/**
 * Returns and resets the flag set by [preventNextDoubleClick].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-queryAndResetPreventNextDoubleClick">Online Documentation</a>
 */
 open protected   fun queryAndResetPreventNextDoubleClick():Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23ClickInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs once a click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23Clicked">Online Documentation</a>
 */
fun addClickedListener(listener: EventHandler1<ClickEventArgs>)
fun removeClickedListener(listener: EventHandler1<ClickEventArgs>)

/**
 * Occurs once a left click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23LeftClicked">Online Documentation</a>
 */
fun addLeftClickedListener(listener: EventHandler1<ClickEventArgs>)
fun removeLeftClickedListener(listener: EventHandler1<ClickEventArgs>)

/**
 * Occurs once a right click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23RightClicked">Online Documentation</a>
 */
fun addRightClickedListener(listener: EventHandler1<ClickEventArgs>)
fun removeRightClickedListener(listener: EventHandler1<ClickEventArgs>)

/**
 * Occurs once a double-click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23DoubleClicked">Online Documentation</a>
 */
fun addDoubleClickedListener(listener: EventHandler1<ClickEventArgs>)
fun removeDoubleClickedListener(listener: EventHandler1<ClickEventArgs>)

/**
 * Occurs once a left double-click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23LeftDoubleClicked">Online Documentation</a>
 */
fun addLeftDoubleClickedListener(listener: EventHandler1<ClickEventArgs>)
fun removeLeftDoubleClickedListener(listener: EventHandler1<ClickEventArgs>)

/**
 * Occurs once a right double-click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23RightDoubleClicked">Online Documentation</a>
 */
fun addRightDoubleClickedListener(listener: EventHandler1<ClickEventArgs>)
fun removeRightDoubleClickedListener(listener: EventHandler1<ClickEventArgs>)

companion object : ClassMetadata<ClickInputMode> {
}
}

inline fun ClickInputMode(
    block: ClickInputMode.() -> Unit
): ClickInputMode {
    return ClickInputMode()
        .apply(block)
}

/**
 * Occurs once a click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23Clicked">Online Documentation</a>
 */
inline fun  ClickInputMode.addClickedHandler(
    crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ClickEventArgs> = { _, event -> handler(event) }
    addClickedListener(listener)
    return { removeClickedListener(listener) }
}
/**
 * Occurs once a left click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23LeftClicked">Online Documentation</a>
 */
inline fun  ClickInputMode.addLeftClickedHandler(
    crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ClickEventArgs> = { _, event -> handler(event) }
    addLeftClickedListener(listener)
    return { removeLeftClickedListener(listener) }
}
/**
 * Occurs once a right click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23RightClicked">Online Documentation</a>
 */
inline fun  ClickInputMode.addRightClickedHandler(
    crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ClickEventArgs> = { _, event -> handler(event) }
    addRightClickedListener(listener)
    return { removeRightClickedListener(listener) }
}
/**
 * Occurs once a double-click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23DoubleClicked">Online Documentation</a>
 */
inline fun  ClickInputMode.addDoubleClickedHandler(
    crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ClickEventArgs> = { _, event -> handler(event) }
    addDoubleClickedListener(listener)
    return { removeDoubleClickedListener(listener) }
}
/**
 * Occurs once a left double-click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23LeftDoubleClicked">Online Documentation</a>
 */
inline fun  ClickInputMode.addLeftDoubleClickedHandler(
    crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ClickEventArgs> = { _, event -> handler(event) }
    addLeftDoubleClickedListener(listener)
    return { removeLeftDoubleClickedListener(listener) }
}
/**
 * Occurs once a right double-click has been detected.
 * @see [ClickEventArgs]
 * @see [doubleClickPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickInputMode%23RightDoubleClicked">Online Documentation</a>
 */
inline fun  ClickInputMode.addRightDoubleClickedHandler(
    crossinline handler: (event:ClickEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<ClickEventArgs> = { _, event -> handler(event) }
    addRightDoubleClickedListener(listener)
    return { removeRightDoubleClickedListener(listener) }
}
