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
open external class WaitInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets the installed [controller][WaitInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
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
   * Returns if this mode can request the mutex when [waiting][WaitInputMode] is set to `true`.
   * @return if this mode can request the mutex when [waiting][WaitInputMode] is set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-canStartWaiting">Online Documentation</a>
   */
  open fun canStartWaiting(): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Called when waiting is finished.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-endWaiting">Online Documentation</a>
   */
  protected open fun endWaiting()
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][WaitInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called after [cancel][WaitInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Called after [tryStop][WaitInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * Raises the [waiting-ended][WaitInputMode] event.
   * @param [event] The [InputModeEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onWaitingEnded">Online Documentation</a>
   */
  protected open fun onWaitingEnded(
    event: InputModeEventArgs,
  )
  
  /**
   * Raises the [waiting-started][WaitInputMode] event.
   * @param [event] The [InputModeEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-onWaitingStarted">Online Documentation</a>
   */
  protected open fun onWaitingStarted(
    event: InputModeEventArgs,
  )
  
  /**
   * This will initiate the waiting process by trying to [requestMutex][ConcurrencyController] request the input mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-startWaiting">Online Documentation</a>
   */
  protected open fun startWaiting()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23WaitInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
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
 * `waiting-started`: Occurs when the waiting started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23waiting-started">Online Documentation</a>
 */
inline fun  WaitInputMode.addWaitingStartedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("waiting-started", listener)
  return { removeEventListener("waiting-started", listener) }
}

/**
 * `waiting-ended`: Occurs when the waiting ended.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WaitInputMode%23waiting-ended">Online Documentation</a>
 */
inline fun  WaitInputMode.addWaitingEndedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("waiting-ended", listener)
  return { removeEventListener("waiting-ended", listener) }
}
