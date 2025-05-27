// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.core.Void
import yfiles.collections.ICollection
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.view.CanvasComponent
import yfiles.view.IVisualTemplate
import yfiles.view.MouseWheelBehaviors
import yfiles.view.ResourceKey

/**
 * An [IInputMode] that can be used for an overview [CanvasComponent].
 * @see [canvasComponent]
 * @see [handleInputMode]
 * @see [moveInputMode]
 * @see [keyboardInputMode]
 * @see [clickInputMode]
 * @see [tapInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-constructor-OverviewInputMode">Online Documentation</a>
 */
external open class OverviewInputMode  () : MultiplexingInputMode {

/**
 * Gets or sets whether the canvas this mode is installed in should automatically be invalidated if the client canvas gets invalidated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23autoInvalidate">Online Documentation</a>
 */
final var autoInvalidate: Boolean
/**
 * Gets the list of commands that are available in this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23availableCommands">Online Documentation</a>
 */
final val availableCommands: ICollection<out ICommand<*>>
/**
 * Gets or sets the canvas this canvas should use to navigate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23canvasComponent">Online Documentation</a>
 */
final var canvasComponent: CanvasComponent?
/**
 * Gets the [clickInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23clickInputMode">Online Documentation</a>
 */
final val clickInputMode: ClickInputMode
/**
 * Gets the [HandleInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23handleInputMode">Online Documentation</a>
 */
final val handleInputMode: HandleInputMode
/**
 * Gets the [KeyboardInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23keyboardInputMode">Online Documentation</a>
 */
final val keyboardInputMode: KeyboardInputMode
/**
 * Gets and sets the insets in view coordinates that should be used by the [updateVisibleArea] operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23margins">Online Documentation</a>
 */
final var margins: Insets
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
 * Gets the [tapInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23tapInputMode">Online Documentation</a>
 */
final val tapInputMode: TapInputMode
/**
 * Gets or sets the template that is used for the visualization of the marquee rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23template">Online Documentation</a>
 */
final var template: IVisualTemplate<Void>?
/**
 * Factory method for the [clickInputMode] property.
 * @return a new instance of ClickInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-createClickInputMode">Online Documentation</a>
 */
 open protected   fun createClickInputMode():ClickInputMode
/**
 * Factory method for the [handleInputMode] property.
 * @return a new instance of [HandleInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-createHandleInputMode">Online Documentation</a>
 */
 open protected   fun createHandleInputMode():HandleInputMode
/**
 * Factory method for the [keyboardInputMode] property.
 * @return a new instance of [KeyboardInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-createKeyboardInputMode">Online Documentation</a>
 */
 open protected   fun createKeyboardInputMode():KeyboardInputMode
/**
 * Factory method for the [moveInputMode] property.
 * @return a new instance of MoveInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-createMoveInputMode">Online Documentation</a>
 */
 open protected   fun createMoveInputMode():MoveInputMode
/**
 * Factory method for the [tapInputMode] property.
 * @return a new instance of TapInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-createTapInputMode">Online Documentation</a>
 */
 open protected   fun createTapInputMode():TapInputMode
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-initialize">Online Documentation</a>
 */
 override   fun initialize()
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [ConcurrencyController] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Called by [createKeyboardInputMode] to determine which of the built-in [ICommand]s to install.
 * @param [command] The command to install.
 * @return Whether to install this command.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-shouldInstallCommand">Online Documentation</a>
 */
 open protected   fun shouldInstallCommand( command: ICommand<*> ):Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Updates the [zoom][CanvasComponent.zoom] and [viewpoint][CanvasComponent.viewPoint] of the overview control.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23OverviewInputMode-method-updateVisibleArea">Online Documentation</a>
 */
 open protected   fun updateVisibleArea()

companion object : ClassMetadata<OverviewInputMode> {
/**
 * A resource key that should yield a [IVisualTemplate] that will be used by this mode render the viewport.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OverviewInputMode%23VIEWPORT_TEMPLATE_KEY">Online Documentation</a>
 */
 val VIEWPORT_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
}
}

inline fun OverviewInputMode(
    block: OverviewInputMode.() -> Unit
): OverviewInputMode {
    return OverviewInputMode()
        .apply(block)
}
