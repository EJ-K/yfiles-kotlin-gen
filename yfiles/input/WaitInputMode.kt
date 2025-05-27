// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor

/**
 * An [IInputMode] implementation that can be used to block user interaction.
 * @see [waiting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-constructor-WaitInputMode">Online Documentation</a>
 */
external open class WaitInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets the WaitCursor property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23waitCursor">Online Documentation</a>
 */
final var waitCursor: Cursor?
/**
 * Gets or sets the Waiting property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23waiting">Online Documentation</a>
 */
final var waiting: Boolean
/**
 * Returns if this mode can request the mutex when [waiting] is set to `true`.
 * @return if this mode can request the mutex when [waiting] is set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-canStartWaiting">Online Documentation</a>
 */
 open   fun canStartWaiting():Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Called when waiting is finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-endWaiting">Online Documentation</a>
 */
 open protected   fun endWaiting()
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * Raises the [WaitingEnded] event.
 * @param [event] The [InputModeEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onWaitingEnded">Online Documentation</a>
 */
 open protected   fun onWaitingEnded( event: InputModeEventArgs )
/**
 * Raises the [WaitingStarted] event.
 * @param [event] The [InputModeEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onWaitingStarted">Online Documentation</a>
 */
 open protected   fun onWaitingStarted( event: InputModeEventArgs )
/**
 * This will initiate the waiting process by trying to [ConcurrencyController.requestMutex]request the input mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-startWaiting">Online Documentation</a>
 */
 open protected   fun startWaiting()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs when the waiting started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitingStarted">Online Documentation</a>
 */
fun addWaitingStartedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeWaitingStartedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the waiting ended.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitingEnded">Online Documentation</a>
 */
fun addWaitingEndedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeWaitingEndedListener(listener: EventHandler1<InputModeEventArgs>)

companion object : ClassMetadata<WaitInputMode> {
}
}

inline fun WaitInputMode(
    block: WaitInputMode.() -> Unit
): WaitInputMode {
    return WaitInputMode()
        .apply(block)
}

/**
 * Occurs when the waiting started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitingStarted">Online Documentation</a>
 */
inline fun  WaitInputMode.addWaitingStartedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addWaitingStartedListener(listener)
    return { removeWaitingStartedListener(listener) }
}
/**
 * Occurs when the waiting ended.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitingEnded">Online Documentation</a>
 */
inline fun  WaitInputMode.addWaitingEndedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addWaitingEndedListener(listener)
    return { removeWaitingEndedListener(listener) }
}
