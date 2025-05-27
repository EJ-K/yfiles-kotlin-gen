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
import yfiles.lang.YObject

/**
 * Class containing helper methods for WebGL rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLSupport">Online Documentation</a>
 */
external  class WebGLSupport  : YObject, IEventDispatcher {

/**
 * Should be called to deallocate and delete program resources created previously via [useProgram].
 * @param [program] A program created by [useProgram]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLSupport%23WebGLSupport-method-deleteProgram">Online Documentation</a>
 */
 final   fun deleteProgram( program: WebGLProgram? )
/**
 * Sets the active program as defined by the vertex and fragment shader sources and provides view and world transforms that can be used in the shader definitions.
 * @see [deleteProgram]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLSupport%23WebGLSupport-method-useProgram">Online Documentation</a>
 */
 final   fun useProgram( vertexShaderSource: String ,
 fragmentShaderSource: String ):WebGLProgram
/**
 * Occurs when all [visuals][WebGLVisual] have finished rendering into the current WebGL rendering context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLSupport%23FlushingContext">Online Documentation</a>
 */
fun addFlushingContextListener(listener: EventHandler1<EventArgs>)
fun removeFlushingContextListener(listener: EventHandler1<EventArgs>)

companion object : ClassMetadata<WebGLSupport> {
}
}

/**
 * Occurs when all [visuals][WebGLVisual] have finished rendering into the current WebGL rendering context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLSupport%23FlushingContext">Online Documentation</a>
 */
inline fun  WebGLSupport.addFlushingContextHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addFlushingContextListener(listener)
    return { removeFlushingContextListener(listener) }
}
