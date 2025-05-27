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
 * Base class for [Visual]s that use HTML5's Canvas for the visualization.
 * @see [paint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlCanvasVisual">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlCanvasVisual%23HtmlCanvasVisual-constructor-HtmlCanvasVisual">Online Documentation</a>
 */
external abstract class HtmlCanvasVisual  () : Visual {

/**
 * Paints onto the context using HTML5 Canvas operations.
 * @param [renderContext] The render context of the [CanvasComponent]
 * @param [ctx] The HTML5 Canvas context to use for rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HtmlCanvasVisual%23HtmlCanvasVisual-method-paint">Online Documentation</a>
 */
 abstract   fun paint( renderContext: IRenderContext ,
 ctx: CanvasRenderingContext2D )

companion object : ClassMetadata<HtmlCanvasVisual> {
}
}
