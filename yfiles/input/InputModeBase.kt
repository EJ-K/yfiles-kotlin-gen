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

/**
 * Abstract base class implementation of an [IInputMode] that can be used concurrently with other [IInputMode] implementations if its [exclusive][InputModeBase] property is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [InputModeBase] class.
 * @param [exclusive] Whether this mode should be [exclusive][InputModeBase]. The default value is `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-constructor-InputModeBase">Online Documentation</a>
 * 
 * @property exclusive
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23exclusive">Online Documentation</a>
 */
abstract external class InputModeBase protected constructor(
final var exclusive: Boolean = definedExternally) : IInputMode, IEventDispatcher {
  /**
   * Gets if this mode is active.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23active">Online Documentation</a>
   */
  final val active: Boolean
  
  /**
   * Gets the installed [controller][InputModeBase].
   * @see [requestMutex]
   * @see [releaseMutex]
   * @see [hasMutex]
   * @see [canRequestMutex]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets whether this mode is currently installed so a call to [parentInputModeContext][InputModeBase] will yield a non- `null` result.
   * @see [install]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23installed">Online Documentation</a>
   */
  final val installed: Boolean
  
  /**
   * Gets the context instance this mode is currently installed in or `null` if this instance is not installed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Determines whether this instance can request the mutex.
   * @return Whether a call to [requestMutex][InputModeBase] would currently succeed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-canRequestMutex">Online Documentation</a>
   */
  protected fun canRequestMutex(): Boolean
  
  /**
   * Cancels the editing of this mode by first disabling and afterward re-enabling the installed [controller][InputModeBase].
   * @see [onCanceled]
   * @see [canceled]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Creates an implementation of [IInputModeContext] that is specific to this mode.
   * @return A readily configured [IInputModeContext].
   * @see [IHitTester.enumerateHits]
   * @see [IHitTestable.isHit]
   * @see [IInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Helper method that yields a suitably configured [InputModeEventArgs] for this input mode.
   * @param [context] An input mode context that should be made available in the [context][InputModeEventArgs] property.
   *   May be omitted, in which case a child context for this instance is created automatically.
   * @return An input mode event argument that is configured for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-createInputModeEventArgs">Online Documentation</a>
   */
  protected open fun createInputModeEventArgs(
    context: IInputModeContext?,
  ): InputModeEventArgs
  
  /**
   * Determines whether this instance owns the input mutex.
   * @return Whether this instance has the input mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-hasMutex">Online Documentation</a>
   */
  protected fun hasMutex(): Boolean
  
  /**
   * Performs one-time initialization of this instance.
   * @see [install]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-initialize">Online Documentation</a>
   */
  protected open fun initialize()
  
  /**
   * Installs this mode into a [CanvasComponent][yfiles.view.CanvasComponent] using the provided [IInputModeContext].
   * @param [context] the context to install this mode into
   * @param [controller] The [controller][InputModeBase] for this mode.
   * @see [parentInputModeContext]
   * @see [CanvasComponent.inputMode][yfiles.view.CanvasComponent.inputMode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Event dispatch method that will dispatch the [canceled][InputModeBase] event.
   * @param [event] The event arguments.
   * @see [initialize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled(
    event: InputModeEventArgs,
  )
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Event dispatch method that will dispatch the [initialized][InputModeBase] event.
   * @param [event] The event arguments.
   * @see [initialize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onInitialized">Online Documentation</a>
   */
  protected open fun onInitialized(
    event: InputModeEventArgs,
  )
  
  /**
   * Event dispatch method that will dispatch the [initializing][InputModeBase] event.
   * @param [event] The event arguments.
   * @see [initialize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onInitializing">Online Documentation</a>
   */
  protected open fun onInitializing(
    event: InputModeEventArgs,
  )
  
  /**
   * Called when this instance obtains the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onMutexObtained">Online Documentation</a>
   */
  protected open fun onMutexObtained()
  
  /**
   * Called when this instance released the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onMutexReleased">Online Documentation</a>
   */
  protected open fun onMutexReleased()
  
  /**
   * Event dispatch method that will dispatch the [stopped][InputModeBase] event.
   * @param [event] The event arguments.
   * @see [tryStop]
   * @see [stopped]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped(
    event: InputModeEventArgs,
  )
  
  /**
   * Releases previously captured keyboard input.
   * @see [requestKeyboard]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-releaseKeyboard">Online Documentation</a>
   */
  protected open fun releaseKeyboard()
  
  /**
   * Releases the mutex that is currently owned by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-releaseMutex">Online Documentation</a>
   */
  protected fun releaseMutex()
  
  /**
   * Releases previously captured [MOUSE][yfiles.view.PointerType], [TOUCH][yfiles.view.PointerType] and [PEN][yfiles.view.PointerType] input.
   * @see [requestPointer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-releasePointer">Online Documentation</a>
   */
  protected open fun releasePointer()
  
  /**
   * Requests capturing of all keyboard input that happens in the [CanvasComponent][yfiles.view.CanvasComponent].
   * @see [releaseKeyboard]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-requestKeyboard">Online Documentation</a>
   */
  protected open fun requestKeyboard()
  
  /**
   * Requests the mutex from the current [controller][InputModeBase].
   * @throws Error If the mutex could not be obtained.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-requestMutex">Online Documentation</a>
   */
  protected fun requestMutex()
  
  /**
   * Requests capturing of all [MOUSE][yfiles.view.PointerType], [TOUCH][yfiles.view.PointerType] and [PEN][yfiles.view.PointerType] input that happens in the [CanvasComponent][yfiles.view.CanvasComponent].
   * @see [releasePointer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-requestPointer">Online Documentation</a>
   */
  protected open fun requestPointer()
  
  /**
   * Tries to stop the editing.
   * @return `true` iff this instance does not [own the mutex][InputModeBase].
   * @see [onStopped]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the canvas.
   * @param [context] The context to remove this mode from. This is the same instance that has been passed to [install][InputModeBase].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<InputModeBase> {
  }
}

/**
 * `initializing`: Occurs before the call to [initialize][InputModeBase]
 * @see [addInstallHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23initializing">Online Documentation</a>
 */
inline fun  InputModeBase.addInitializingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("initializing", listener)
  return { removeEventListener("initializing", listener) }
}

/**
 * `initialized`: Occurs after the call to [initialize][InputModeBase]
 * @see [addInstallHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23initialized">Online Documentation</a>
 */
inline fun  InputModeBase.addInitializedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("initialized", listener)
  return { removeEventListener("initialized", listener) }
}

/**
 * `canceled`: Occurs after the call to [cancel][InputModeBase]
 * @see [addOnCanceledHandler]
 * @see [addCancelHandler]
 * @see [addTryStopHandler]
 * @see [addStoppedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23canceled">Online Documentation</a>
 */
inline fun  InputModeBase.addCanceledHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("canceled", listener)
  return { removeEventListener("canceled", listener) }
}

/**
 * `stopped`: Occurs after the call to [tryStop][InputModeBase]
 * @see [addOnStoppedHandler]
 * @see [addCancelHandler]
 * @see [addTryStopHandler]
 * @see [addCanceledHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23stopped">Online Documentation</a>
 */
inline fun  InputModeBase.addStoppedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("stopped", listener)
  return { removeEventListener("stopped", listener) }
}
