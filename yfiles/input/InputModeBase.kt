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
 * Abstract base class implementation of an [IInputMode] that can be used concurrently with other [IInputMode] implementations if its [exclusive] property is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [InputModeBase] class.
 * @param [exclusive] Iff this mode should be [exclusive].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-constructor-InputModeBase(boolean)">Online Documentation</a>
 * 
 * @property exclusive
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23exclusive">Online Documentation</a>
 */
external abstract class InputModeBase 
protected constructor (
final var exclusive: Boolean = definedExternally) : IInputMode, IEventDispatcher {

/**
 * Gets if this mode is active.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23active">Online Documentation</a>
 */
final val active: Boolean
/**
 * Gets the installed [controller].
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
 * Gets the context instance this mode is currently installed in or `null` if this instance is not installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets whether this mode is currently installed in a [CanvasComponent][yfiles.view.CanvasComponent].
 * @see [install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23installed">Online Documentation</a>
 */
final val installed: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Determines whether this instance can request the mutex.
 * @return Whether a call to [requestMutex] would currently succeed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-canRequestMutex">Online Documentation</a>
 */
 final protected   fun canRequestMutex():Boolean
/**
 * Cancels the editing of this mode by first disabling and afterwards reenabling the installed [controller].
 * @see [onCanceled]
 * @see [addCanceledListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Creates an implementation of [IInputModeContext] that is specific to this mode.
 * @return A readily configured [IInputModeContext].
 * @see [CanvasComponent.hitElementsAt][yfiles.view.CanvasComponent.hitElementsAt]
 * @see [IHitTestable.isHit]
 * @see [IInputModeContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-createChildInputModeContext">Online Documentation</a>
 */
 open protected   fun createChildInputModeContext():IInputModeContext
/**
 * Helper method that yields a suitably configured [InputModeEventArgs] for this input mode.
 * @param [context] An input mode context that is available in the [InputModeEventArgs].
 *   Can be `null` in which case a new context for this instance is created automatically.
 * @return An input mode event argument that is configured for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-createInputModeEventArgs">Online Documentation</a>
 */
 open protected   fun createInputModeEventArgs( context: IInputModeContext? ):InputModeEventArgs
/**
 * Determines whether this instance owns the input mutex.
 * @return Whether this instance has the input mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-hasMutex">Online Documentation</a>
 */
 final protected   fun hasMutex():Boolean
/**
 * Performs one-time initialization of this instance.
 * @see [install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-initialize">Online Documentation</a>
 */
 open protected   fun initialize()
/**
 * Installs this mode into a [CanvasComponent][yfiles.view.CanvasComponent] using the provided [IInputModeContext].
 * @param [context] the context to install this mode into
 * @param [controller] The [controller] for this mode.
 * @see [inputModeContext]
 * @see [CanvasComponent.inputMode][yfiles.view.CanvasComponent.inputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Event dispatch method that will dispatch the [Canceled] event.
 * @param [event] The event arguments.
 * @see [initialize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled( event: InputModeEventArgs )
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Event dispatch method that will dispatch the [Initialized] event.
 * @param [event] The event arguments.
 * @see [initialize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onInitialized">Online Documentation</a>
 */
 open protected   fun onInitialized( event: InputModeEventArgs )
/**
 * Event dispatch method that will dispatch the [Initializing] event.
 * @param [event] The event arguments.
 * @see [initialize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onInitializing">Online Documentation</a>
 */
 open protected   fun onInitializing( event: InputModeEventArgs )
/**
 * Called when this instance obtains the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onMutexObtained">Online Documentation</a>
 */
 open protected   fun onMutexObtained()
/**
 * Called when this instance released the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onMutexReleased">Online Documentation</a>
 */
 open protected   fun onMutexReleased()
/**
 * Event dispatch method that will dispatch the [Stopped] event.
 * @param [event] The event arguments.
 * @see [tryStop]
 * @see [addStoppedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped( event: InputModeEventArgs )
/**
 * Releases previously captured keyboard input.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-releaseKeyboard">Online Documentation</a>
 */
 open protected   fun releaseKeyboard()
/**
 * Releases the mutex that is currently owned by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-releaseMutex">Online Documentation</a>
 */
 final protected   fun releaseMutex()
/**
 * Releases previously captured mouse and touch input.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-releasePointer">Online Documentation</a>
 */
 open protected   fun releasePointer()
/**
 * Requests capturing of all keyboard input that happens in the [CanvasComponent][yfiles.view.CanvasComponent].
 * @see [releaseKeyboard]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-requestKeyboard">Online Documentation</a>
 */
 open protected   fun requestKeyboard()
/**
 * Requests the mutex from the current [controller].
 * @throws Error If the mutex could not be obtained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-requestMutex">Online Documentation</a>
 */
 final protected   fun requestMutex()
/**
 * Requests capturing of all mouse and touch input that happens in the [CanvasComponent][yfiles.view.CanvasComponent].
 * @see [releasePointer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-requestPointer">Online Documentation</a>
 */
 open protected   fun requestPointer()
/**
 * Tries to stop the editing.
 * @return `true` iff this instance does not [own the mutex][hasMutex].
 * @see [onStopped]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the canvas.
 * @param [context] The context to remove this mode from. This is the same instance that has been passed to [install].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23InputModeBase-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs before the call to [initialize]
 * @see [install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23Initializing">Online Documentation</a>
 */
fun addInitializingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeInitializingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs after the call to [initialize]
 * @see [install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23Initialized">Online Documentation</a>
 */
fun addInitializedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeInitializedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs after the call to [cancel]
 * @see [onCanceled]
 * @see [cancel]
 * @see [tryStop]
 * @see [addStoppedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23Canceled">Online Documentation</a>
 */
fun addCanceledListener(listener: EventHandler1<InputModeEventArgs>)
fun removeCanceledListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs after the call to [tryStop]
 * @see [onStopped]
 * @see [cancel]
 * @see [tryStop]
 * @see [addCanceledListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23Stopped">Online Documentation</a>
 */
fun addStoppedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeStoppedListener(listener: EventHandler1<InputModeEventArgs>)

companion object : ClassMetadata<InputModeBase> {
}
}

/**
 * Occurs before the call to [initialize]
 * @see [install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23Initializing">Online Documentation</a>
 */
inline fun  InputModeBase.addInitializingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addInitializingListener(listener)
    return { removeInitializingListener(listener) }
}
/**
 * Occurs after the call to [initialize]
 * @see [install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23Initialized">Online Documentation</a>
 */
inline fun  InputModeBase.addInitializedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addInitializedListener(listener)
    return { removeInitializedListener(listener) }
}
/**
 * Occurs after the call to [cancel]
 * @see [onCanceled]
 * @see [cancel]
 * @see [tryStop]
 * @see [addStoppedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23Canceled">Online Documentation</a>
 */
inline fun  InputModeBase.addCanceledHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addCanceledListener(listener)
    return { removeCanceledListener(listener) }
}
/**
 * Occurs after the call to [tryStop]
 * @see [onStopped]
 * @see [cancel]
 * @see [tryStop]
 * @see [addCanceledListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InputModeBase%23Stopped">Online Documentation</a>
 */
inline fun  InputModeBase.addStoppedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addStoppedListener(listener)
    return { removeStoppedListener(listener) }
}
