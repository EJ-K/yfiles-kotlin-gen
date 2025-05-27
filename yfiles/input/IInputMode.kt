// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.InterfaceMetadata

/**
 * Interface implemented by input modes to handle user input in a [CanvasComponent][yfiles.view.CanvasComponent] instance.
 * @see [InputModeBase]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode">Online Documentation</a>
 */
external interface IInputMode  {
  /**
   * Gets the priority of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23priority">Online Documentation</a>
   */
  val priority: Int
  
  /**
   * Will be called to unconditionally cancel all ongoing edits.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23IInputMode-method-cancel">Online Documentation</a>
   */
  fun cancel()
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried while the mode is installed.
   * @param [controller] The [ConcurrencyController] for this mode.
   * @see [uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23IInputMode-method-install">Online Documentation</a>
   */
  fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Will be called to request a stop of the current editing progress.
   * @return `true` if and only if the editing has been stopped or there was no edit in progress
   * @see [cancel]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23IInputMode-method-tryStop">Online Documentation</a>
   */
  fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23IInputMode-method-uninstall">Online Documentation</a>
   */
  fun uninstall(
    context: IInputModeContext,
  )

  
  companion object : InterfaceMetadata<IInputMode> {
  }
}
