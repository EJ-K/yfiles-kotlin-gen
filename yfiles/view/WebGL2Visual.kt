// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.gl.WebGL2RenderingContext
import yfiles.lang.ClassMetadata

/**
 * Base class for [Visual]s that use WebGL2 for the visualization.
 * @see [render]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Visual">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Visual%23WebGL2Visual-constructor-WebGL2Visual">Online Documentation</a>
 */
external abstract class WebGL2Visual  () : Visual {

/**
 * Renders into the context using WebGL2 operations.
 * @param [ctx] The render context of the [CanvasComponent]
 * @param [gl] The WebGL2 Rendering context to use for rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2Visual%23WebGL2Visual-method-render">Online Documentation</a>
 */
 abstract   fun render( ctx: IRenderContext ,
 gl: WebGL2RenderingContext )

companion object : ClassMetadata<WebGL2Visual> {
}
}
