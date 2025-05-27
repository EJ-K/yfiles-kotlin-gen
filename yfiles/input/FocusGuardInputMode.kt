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
import yfiles.view.Cursor

/**
 * An [IInputMode] that can be added to a [MultiplexingInputMode] to suppress other modes from performing unwanted actions if the control has just become focused.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23FocusGuardInputMode-constructor-FocusGuardInputMode">Online Documentation</a>
 */
open external class FocusGuardInputMode () : IInputMode {
  /**
   * Gets the installed [controller][FocusGuardInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets the [Cursor] that will be shown during active guards.
   * 
   * The default is [DEFAULT][Cursor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23guardCursor">Online Documentation</a>
   */
  final var guardCursor: Cursor?
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23FocusGuardInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][FocusGuardInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23FocusGuardInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called after [cancel][FocusGuardInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23FocusGuardInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23FocusGuardInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23FocusGuardInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Called after [tryStop][FocusGuardInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23FocusGuardInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23FocusGuardInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusGuardInputMode%23FocusGuardInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<FocusGuardInputMode> {
  }
}

inline fun FocusGuardInputMode(
    block: FocusGuardInputMode.() -> Unit
): FocusGuardInputMode {
    return FocusGuardInputMode()
        .apply(block)
}
