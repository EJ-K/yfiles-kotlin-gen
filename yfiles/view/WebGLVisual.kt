// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.gl.WebGLRenderingContext
import yfiles.lang.ClassMetadata

/**
 * Base class for [Visual]s that use WebGL for the visualization.
 * @see [render]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLVisual">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLVisual%23WebGLVisual-constructor-WebGLVisual">Online Documentation</a>
 */
external abstract class WebGLVisual  () : Visual {

/**
 * Renders into the context using WebGL operations.
 * @param [ctx] The render context of the [CanvasComponent]
 * @param [gl] The WebGL Rendering context to use for rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLVisual%23WebGLVisual-method-render">Online Documentation</a>
 */
 abstract   fun render( ctx: IRenderContext ,
 gl: WebGLRenderingContext )

companion object : ClassMetadata<WebGLVisual> {
}
}
