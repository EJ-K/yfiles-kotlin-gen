// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.gl.WebGLProgram
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher

/**
 * Class containing helper methods for WebGL rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLSupport">Online Documentation</a>
 */
external class WebGLSupport  : IEventDispatcher {
  /**
   * Can be called to deallocate and delete program resources created previously via [useProgram][WebGLSupport].
   * @param [program] A program created by [useProgram][WebGLSupport]
   * @throws InvalidOperationError If this method is invoked outside of [createVisual][IVisualCreator] or [updateVisual][IVisualCreator]. When not currently rendering, this method cannot be used. For instance, this method cannot be used inside a [dispose callback][IRenderContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLSupport%23WebGLSupport-method-deleteProgram">Online Documentation</a>
   */
  fun deleteProgram(
    program: WebGLProgram?,
  )
  
  /**
   * Sets the active program as defined by the vertex and fragment shader sources and provides view and world transforms that can be used in the shader definitions.
   * @param [vertexShaderSource] The vertex shader source text.
   * @param [fragmentShaderSource] The fragment shader source text.
   * @return A new or cached instance of [WebGLProgram].
   * @throws InvalidOperationError If this method is invoked outside of [createVisual][IVisualCreator] or [updateVisual][IVisualCreator]. When not currently rendering, this method cannot be used.
   * @see [deleteProgram]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLSupport%23WebGLSupport-method-useProgram">Online Documentation</a>
   */
  fun useProgram(
    vertexShaderSource: String,
    fragmentShaderSource: String,
  ): WebGLProgram
  
  companion object : ClassMetadata<WebGLSupport> {
  }
}

/**
 * `flushing-context`: Occurs when all [visuals][WebGLVisual] have finished rendering into the current WebGL rendering context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLSupport%23flushing-context">Online Documentation</a>
 */
inline fun  WebGLSupport.addFlushingContextHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
  addEventListener("flushing-context", listener)
  return { removeEventListener("flushing-context", listener) }
}
