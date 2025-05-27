// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.Action
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.CanvasComponent
import yfiles.view.ModifierKeys

/**
 * An [IInputMode] that recognizes simple key events and invokes a registered action.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-constructor-KeyboardInputMode">Online Documentation</a>
 */
open external class KeyboardInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets the canvas instance this mode is currently installed in or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23canvasComponent">Online Documentation</a>
   */
  final val canvasComponent: CanvasComponent?
  
  /**
   * Gets the installed [controller][KeyboardInputMode].
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
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Adds a [Command] and associated execution handlers to this instance.
   * @param [command] The command to register handlers with.
   * @param [executedHandler] The handler for the execution.
   * @param [canExecuteHandler] The handler that determines whether the `command` can be executed, `null` if the command can always be executed.
   * @return A token for the newly created command binding that can be used to later [remove][KeyboardInputModeBinding] this binding from this instance again.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-addCommandBinding">Online Documentation</a>
   */
  open fun addCommandBinding(
    command: Command,
    executedHandler: ExecuteCommandHandler,
    canExecuteHandler: CanExecuteCommandHandler?  = definedExternally,
  ): KeyboardInputModeBinding
  
  /**
   * Adds an action for a specific key down event to this mode.
   * @param [key] The key that should be recognized. The value of a key corresponds to <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key">KeyboardEvent.key</a>. It is treated as case-insensitive and the `modifiers` are handled separately.
   * @param [modifiers] The modifiers that should be recognized when the key is pressed.
   * @param [action] The action that will be invoked if the given key down event is recognized.
   * @return A token for the newly created command binding that can be used to later [remove][KeyboardInputModeBinding] this binding from this instance again.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-addKeyBinding">Online Documentation</a>
   */
  open fun addKeyBinding(
    key: String,
    modifiers: ModifierKeys,
    action: Action,
  ): KeyboardInputModeBinding
  
  /**
   * Adds a given `action` to this instance that will be triggered if the given event recognizer recognizes a [key event][yfiles.view.KeyEventArgs] that has been triggered by the [canvasComponent][KeyboardInputMode].
   * @param [recognizer] An event recognizer that will be fed with all key events.
   * @param [action] The action to invoke if the recognizer matches an event.
   * @return A token for the newly created command binding that can be used to later [remove][KeyboardInputModeBinding] this binding from this instance again.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-addRecognizerBinding">Online Documentation</a>
   */
  open fun addRecognizerBinding(
    recognizer: EventRecognizer,
    action: Action,
  ): KeyboardInputModeBinding
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][KeyboardInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called after [cancel][KeyboardInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Called after [tryStop][KeyboardInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * Triggers the [text-input][KeyboardInputMode] event.
   * @param [event] The event arguments.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-onTextInput">Online Documentation</a>
   */
  protected open fun onTextInput(
    event: TextEventArgs,
  )
  
  /**
   * Overridden to only return `true` if this instance does not currently [have the input mutex][ConcurrencyController].
   * @return `true` iff this instance does not [own the mutex][ConcurrencyController].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23KeyboardInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<KeyboardInputMode> {
  }
}

inline fun KeyboardInputMode(
    block: KeyboardInputMode.() -> Unit
): KeyboardInputMode {
    return KeyboardInputMode()
        .apply(block)
}

/**
 * `text-input`: Occurs when text was input, but the event was not handled or did not match a command.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyboardInputMode%23text-input">Online Documentation</a>
 */
inline fun  KeyboardInputMode.addTextInputHandler(
  crossinline handler: (context:IInputModeContext, text:String) -> Unit
): () -> Unit {
  val listener: EventHandler1<TextEventArgs> = { event, _ -> handler(event.context, event.text) }
  addEventListener("text-input", listener)
  return { removeEventListener("text-input", listener) }
}
