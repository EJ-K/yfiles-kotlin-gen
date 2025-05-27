// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * The event arguments for the event handler used by [prepare-render-context][CanvasComponent]
 * @see [CanvasComponent.prepare-render-context]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PrepareRenderContextEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PrepareRenderContextEventArgs] class.
 * @param [context] The initial context which can be modified by the event handlers using the [context][PrepareRenderContextEventArgs] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PrepareRenderContextEventArgs%23PrepareRenderContextEventArgs-constructor-PrepareRenderContextEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets or sets the context.
 * @throws ArgumentError If the argument is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PrepareRenderContextEventArgs%23context">Online Documentation</a>
 */
external class PrepareRenderContextEventArgs (
final var context: IRenderContext) : EventArgs {
  
  companion object : ClassMetadata<PrepareRenderContextEventArgs> {
  }
}
