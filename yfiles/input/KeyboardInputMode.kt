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
import yfiles.view.Key
import yfiles.view.ModifierKeys

/**
 * An [IInputMode] that recognizes simple key events and invokes a registered handler.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [KeyboardInputMode] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-constructor-KeyboardInputMode">Online Documentation</a>
 */
external open class KeyboardInputMode  () : IInputMode {

/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Adds a command and associated execution handlers to this instance.
 * @param [command] The command to register handlers with.
 * @param [execute] The handler for the execution.
 * @param [canExecute] The handler that determines executability or always enabled if omitted.
 * @return A token for the newly created command binding that can used to later [remove][KeyboardInputModeBinding.remove] this binding from this instance again.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-addCommandBinding">Online Documentation</a>
 */
 final   fun <T : Any>addCommandBinding( command: ICommand<T> ,
 execute: ExecuteCommandHandler<T>?  = definedExternally,
 canExecute: CanExecuteCommandHandler<T>?  = definedExternally):KeyboardInputModeBinding
/**
 * Adds an event handler for a specific key press gesture to this mode.
 * @param [key] The key constant that should be recognized.
 * @param [modifiers] The modifiers that should be recognized when the key is pressed.
 * @param [command] The command to execute.
 * @param [commandParameter] The command parameter to use for the [execution][ICommand.execute]; `null` if omitted.
 * @return A token for the newly created command binding that can used to later [remove][KeyboardInputModeBinding.remove] this binding from this instance again.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-addKeyBinding(Key,ModifierKeys,ICommand,Object)">Online Documentation</a>
 */
 final   fun <T : Any>addKeyBinding( key: Key ,
 modifiers: ModifierKeys ,
 command: ICommand<T> ,
 commandParameter: T?  = definedExternally):KeyboardInputModeBinding
/**
 * Adds an event handler for a specific key press gesture to this mode.
 * @param [key] The key constant that should be recognized.
 * @param [modifiers] The modifiers that should be recognized when the key is pressed. Defaults to [ModifierKeys.NONE] if omitted.
 * @param [execute] The handler for the execution.
 * @param [canExecute] The handler that determines executability or always enabled if omitted.
 * @return A token for the newly created command binding that can used to later [remove][KeyboardInputModeBinding.remove] this binding from this instance again.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-addKeyBinding(Key,ModifierKeys,ExecuteCommandHandler,CanExecuteCommandHandler)">Online Documentation</a>
 */
 final   fun <T : Any>addKeyBinding( key: Key ,
 modifiers: ModifierKeys  = definedExternally,
 execute: ExecuteCommandHandler<T>?  = definedExternally,
 canExecute: CanExecuteCommandHandler<T>?  = definedExternally):KeyboardInputModeBinding
/**
 * Adds a given handler to this instance that will be triggered if the event recognizer recognizes a [key event][KeyEventArgs] that has been triggered by the [CanvasComponent][yfiles.view.CanvasComponent].
 * @param [recognizer] An event recognizer that will be fed with all key events.
 * @param [command] The command to invoke if the recognizer matches a key event.
 * @param [commandParameter] The optional parameter to provide to the command.
 * @return The newly constructed binding on which [KeyboardInputModeBinding.remove] can be called to remove the resulting binding from this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-addRecognizerBinding(EventRecognizer,ICommand,Object)">Online Documentation</a>
 */
 final   fun <T : Any>addRecognizerBinding( recognizer: EventRecognizer ,
 command: ICommand<T> ,
 commandParameter: T?  = definedExternally):KeyboardInputModeBinding
/**
 * Adds a given handler to this instance that will be triggered if the event recognizer recognizes a [key event][KeyEventArgs] that has been triggered by the [CanvasComponent][yfiles.view.CanvasComponent].
 * @param [recognizer] An event recognizer that will be fed with all key events.
 * @param [execute] The handler for the execution.
 * @param [canExecute] The handler that determines executability or always enabled if omitted.
 * @return The newly constructed binding on which [KeyboardInputModeBinding.remove] can be called to remove the resulting binding from this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-addRecognizerBinding(EventRecognizer,ExecuteCommandHandler,CanExecuteCommandHandler)">Online Documentation</a>
 */
 final   fun <T : Any>addRecognizerBinding( recognizer: EventRecognizer ,
 execute: ExecuteCommandHandler<T>?  = definedExternally,
 canExecute: CanExecuteCommandHandler<T>?  = definedExternally):KeyboardInputModeBinding
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * Removes all previously registered commands from this instance.
 * @param [command] The command to remove from all registered bindings.
 * @see [addCommandBinding]
 * @see [addKeyBinding]
 * @see [addRecognizerBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-removeCommand">Online Documentation</a>
 */
 final   fun removeCommand( command: ICommand<*> )
/**
 * Overridden to only return `true` if this instance does not currently [have the input mutex][ConcurrencyController.hasMutex].
 * @return `true` iff this instance does not [own the mutex][ConcurrencyController.hasMutex].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )

companion object : ClassMetadata<KeyboardInputMode> {
}
}

inline fun KeyboardInputMode(
    block: KeyboardInputMode.() -> Unit
): KeyboardInputMode {
    return KeyboardInputMode()
        .apply(block)
}
