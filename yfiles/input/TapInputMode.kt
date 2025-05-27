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

/**
 * An input mode that recognizes simple touch taps.
 * @see [tapHandlingPolicy]
 * @see [swallowFocusTap]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this mode that detects touch taps.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-constructor-TapInputMode">Online Documentation</a>
 */
external open class TapInputMode  () : IInputMode, IEventDispatcher {

/**
 * Returns the installed [ConcurrencyController].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets whether to [request the mutex][ConcurrencyController.requestMutex] on a tap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23requestMutexOnTap">Online Documentation</a>
 */
final var requestMutexOnTap: Boolean
/**
 * Gets or sets a property that determines whether taps should be swallowed if they happen within a short amount of time after the [CanvasComponent][yfiles.view.CanvasComponent] got focus.
 * 
 * The default is `false`. If set to `true` taps are discarded within 100 ms after the focus entered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23swallowFocusTap">Online Documentation</a>
 */
final var swallowFocusTap: Boolean
/**
 * Gets or sets the tap handling policy that determines the triggering behavior of [Tapped] and [DoubleTapped].
 * @see [tapHandlingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23tapHandlingPolicy">Online Documentation</a>
 */
final var tapHandlingPolicy: TapHandlingPolicy
/**
 * Gets the location of the last tap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23tapLocation">Online Documentation</a>
 */
final val tapLocation: Point
/**
 * Gets or sets a hit test that determines where this mode should recognize taps.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23validTapHitTestable">Online Documentation</a>
 */
final var validTapHitTestable: IHitTestable
/**
 * Cancels the editing of this mode.
 * @see [onCanceled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Creates the event recognizer that is used to recognize the press event for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-createPressRecognizer">Online Documentation</a>
 */
 open protected   fun createPressRecognizer():EventRecognizer
/**
 * Creates the event recognizer that is used to recognize the release event for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-createReleaseRecognizer">Online Documentation</a>
 */
 open protected   fun createReleaseRecognizer():EventRecognizer
/**
 * Creates the event recognizer that is used to recognize the taps for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-createTapRecognizer">Online Documentation</a>
 */
 open protected   fun createTapRecognizer():EventRecognizer
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [ConcurrencyController] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Determines whether the given event is a press event that occurred at an invalid location.
 * @see [validTapHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-isInvalidPress">Online Documentation</a>
 */
 open protected   fun isInvalidPress( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Determines whether the given event is a valid press event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-isValidPress">Online Documentation</a>
 */
 open protected   fun isValidPress( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Determines whether the given event is a valid release event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-isValidRelease">Online Documentation</a>
 */
 open protected   fun isValidRelease( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Determines whether the given event is a valid tap event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-isValidTap">Online Documentation</a>
 */
 open protected   fun isValidTap( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Called once this mode has recognized a double-tap gesture.
 * @param [event] The arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-onDoubleTapped">Online Documentation</a>
 */
 open protected   fun onDoubleTapped( event: TapEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * Called once this mode has recognized a tap gesture.
 * @param [event] The arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-onTapped">Online Documentation</a>
 */
 open protected   fun onTapped( event: TapEventArgs )
/**
 * Prevents a double-tap event from being issued if the next tap would do so and sends only a single tap instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-preventNextDoubleTap">Online Documentation</a>
 */
 final   fun preventNextDoubleTap()
/**
 * Returns and resets the flag set by [preventNextDoubleTap].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-queryAndResetPreventNextDoubleTap">Online Documentation</a>
 */
 open protected   fun queryAndResetPreventNextDoubleTap():Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23TapInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs once a tap has been detected.
 * @see [TapEventArgs]
 * @see [tapHandlingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23Tapped">Online Documentation</a>
 */
fun addTappedListener(listener: EventHandler1<TapEventArgs>)
fun removeTappedListener(listener: EventHandler1<TapEventArgs>)

/**
 * Occurs once a double-tap has been detected.
 * @see [TapEventArgs]
 * @see [tapHandlingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23DoubleTapped">Online Documentation</a>
 */
fun addDoubleTappedListener(listener: EventHandler1<TapEventArgs>)
fun removeDoubleTappedListener(listener: EventHandler1<TapEventArgs>)

companion object : ClassMetadata<TapInputMode> {
}
}

inline fun TapInputMode(
    block: TapInputMode.() -> Unit
): TapInputMode {
    return TapInputMode()
        .apply(block)
}

/**
 * Occurs once a tap has been detected.
 * @see [TapEventArgs]
 * @see [tapHandlingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23Tapped">Online Documentation</a>
 */
inline fun  TapInputMode.addTappedHandler(
    crossinline handler: (event:TapEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TapEventArgs> = { _, event -> handler(event) }
    addTappedListener(listener)
    return { removeTappedListener(listener) }
}
/**
 * Occurs once a double-tap has been detected.
 * @see [TapEventArgs]
 * @see [tapHandlingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapInputMode%23DoubleTapped">Online Documentation</a>
 */
inline fun  TapInputMode.addDoubleTappedHandler(
    crossinline handler: (event:TapEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TapEventArgs> = { _, event -> handler(event) }
    addDoubleTappedListener(listener)
    return { removeDoubleTappedListener(listener) }
}
