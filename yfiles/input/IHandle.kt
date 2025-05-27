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
import yfiles.view.Cursor

/**
 * Interface for a handle that can be displayed in a [CanvasComponent][yfiles.view.CanvasComponent] as a UI element for the user to modify the contents of the control.
 * @see [HandleInputMode]
 * @see [IDragHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHandle">Online Documentation</a>
 */
external interface IHandle : IDragHandler {
/**
 * Gets the cursor to display when the mouse hovers over or drags this handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHandle%23cursor">Online Documentation</a>
 */
val cursor: Cursor
/**
 * Gets the type of the handle that can be used by the rendering engine to render types differently.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHandle%23type">Online Documentation</a>
 */
val type: HandleTypes
/**
 * Called to indicate that the handle has been clicked by the user.
 * @param [event] Arguments describing the click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHandle%23IHandle-method-handleClick">Online Documentation</a>
 */
   fun handleClick( event: ClickEventArgs )

companion object : InterfaceMetadata<IHandle> {
}
}
