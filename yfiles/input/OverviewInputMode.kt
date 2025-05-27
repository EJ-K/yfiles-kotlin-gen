// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.ICollection
import yfiles.geometry.IRectangle
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Predicate
import yfiles.view.CanvasComponent
import yfiles.view.IObjectRenderer
import yfiles.view.MouseWheelBehaviors

/**
 * An [IInputMode] that can be used for an overview [CanvasComponent].
 * @see [canvasComponent]
 * @see [handleInputMode]
 * @see [moveInputMode]
 * @see [keyboardInputMode]
 * @see [clickInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-constructor-OverviewInputMode">Online Documentation</a>
 */
open external class OverviewInputMode () : MultiplexingInputMode {
  /**
   * Gets or sets whether the canvas this mode is installed in should automatically be invalidated if the client canvas gets invalidated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23autoInvalidate">Online Documentation</a>
   */
  final var autoInvalidate: Boolean
  
  /**
   * Gets the list of commands that are available in this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23availableCommands">Online Documentation</a>
   */
  final val availableCommands: ICollection<out Command>
  
  /**
   * Gets or sets the canvas this canvas should use to navigate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23canvasComponent">Online Documentation</a>
   */
  final var canvasComponent: CanvasComponent?
  
  /**
   * Gets the [clickInputMode][OverviewInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23clickInputMode">Online Documentation</a>
   */
  final val clickInputMode: ClickInputMode
  
  /**
   * Gets and sets the margins in view coordinates that should be used by the [updateVisibleArea][OverviewInputMode] operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23contentMargins">Online Documentation</a>
   */
  final var contentMargins: Insets
  
  /**
   * Gets the [HandleInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23handleInputMode">Online Documentation</a>
   */
  final val handleInputMode: HandleInputMode
  
  /**
   * Gets or sets a predicate that is queried by [createKeyboardInputMode][OverviewInputMode] to determine whether a built-in [Command] should be installed.
   * 
   * The default value always returns `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23installCommandPredicate">Online Documentation</a>
   */
  final var installCommandPredicate: Predicate<Command>
  
  /**
   * Gets the [KeyboardInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23keyboardInputMode">Online Documentation</a>
   */
  final val keyboardInputMode: KeyboardInputMode
  
  /**
   * Gets or sets the behavior of the mouse wheel.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23mouseWheelBehavior">Online Documentation</a>
   */
  final var mouseWheelBehavior: MouseWheelBehaviors
  
  /**
   * Gets the [MoveInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23moveInputMode">Online Documentation</a>
   */
  final val moveInputMode: MoveInputMode
  
  /**
   * Gets or sets the [IObjectRenderer] that visualizes the viewport rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23viewportRectangleRenderer">Online Documentation</a>
   */
  final var viewportRectangleRenderer: IObjectRenderer<IRectangle>
  
  /**
   * Factory method for the [clickInputMode][OverviewInputMode] property.
   * @return a new instance of ClickInputMode
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-createClickInputMode">Online Documentation</a>
   */
  protected open fun createClickInputMode(): ClickInputMode
  
  /**
   * Factory method for the [handleInputMode][OverviewInputMode] property.
   * @return a new instance of [HandleInputMode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-createHandleInputMode">Online Documentation</a>
   */
  protected open fun createHandleInputMode(): HandleInputMode
  
  /**
   * Factory method for the [keyboardInputMode][OverviewInputMode] property.
   * @return a new instance of [KeyboardInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-createKeyboardInputMode">Online Documentation</a>
   */
  protected open fun createKeyboardInputMode(): KeyboardInputMode
  
  /**
   * Factory method for the [moveInputMode][OverviewInputMode] property.
   * @return a new instance of MoveInputMode
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-createMoveInputMode">Online Documentation</a>
   */
  protected open fun createMoveInputMode(): MoveInputMode
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-initialize">Online Documentation</a>
   */
  override fun initialize()
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [ConcurrencyController] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  /**
   * Updates the [zoom][CanvasComponent] and [viewPoint][CanvasComponent] of the overview control.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-updateVisibleArea">Online Documentation</a>
   */
  protected open fun updateVisibleArea()
  
  companion object : ClassMetadata<OverviewInputMode> {
  }
}

inline fun OverviewInputMode(
    block: OverviewInputMode.() -> Unit
): OverviewInputMode {
    return OverviewInputMode()
        .apply(block)
}
