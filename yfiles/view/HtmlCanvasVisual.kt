// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.canvas.CanvasRenderingContext2D
import yfiles.lang.ClassMetadata

/**
 * Base class for [Visual]s that use an `HTMLCanvasElement` for the visualization to render into a [CanvasRenderingContext2D].
 * @see [render]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlCanvasVisual">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlCanvasVisual%23HtmlCanvasVisual-constructor-HtmlCanvasVisual">Online Documentation</a>
 */
abstract external class HtmlCanvasVisual () : Visual {
  /**
   * Paints onto the context using HTML Canvas operations.
   * @param [renderContext] The render context of the [CanvasComponent]
   * @param [ctx] The HTML Canvas context to use for rendering.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlCanvasVisual%23HtmlCanvasVisual-method-render">Online Documentation</a>
   */
  abstract fun render(
    renderContext: IRenderContext,
    ctx: CanvasRenderingContext2D,
  )
  
  companion object : ClassMetadata<HtmlCanvasVisual> {
  }
}
