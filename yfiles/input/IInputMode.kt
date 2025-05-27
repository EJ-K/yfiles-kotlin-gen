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
import yfiles.lang.YObject

/**
 * Interface implemented by input modes that can be registered with a [CanvasComponent][yfiles.view.CanvasComponent] instance.
 * @see [InputModeBase]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode">Online Documentation</a>
 */
external interface IInputMode : YObject {
/**
 * Gets the context instance this mode is currently installed in or `null` if this instance is not installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23inputModeContext">Online Documentation</a>
 */
val inputModeContext: IInputModeContext?
/**
 * Gets the priority of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23priority">Online Documentation</a>
 */
val priority: Int
/**
 * Called by the client to unconditionally cancel all editing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23IInputMode-method-cancel">Online Documentation</a>
 */
   fun cancel()
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [ConcurrencyController] for this mode.
 * @see [uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23IInputMode-method-install">Online Documentation</a>
 */
   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Called by the client in order to stop a current editing progress.
 * @return `true` if and only if the editing has been stopped or there was no edit in progress
 * @see [cancel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23IInputMode-method-tryStop">Online Documentation</a>
 */
   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputMode%23IInputMode-method-uninstall">Online Documentation</a>
 */
   fun uninstall( context: IInputModeContext )

companion object : InterfaceMetadata<IInputMode> {
}
}
