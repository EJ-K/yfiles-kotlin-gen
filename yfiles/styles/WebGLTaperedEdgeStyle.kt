// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ClassMetadata
import yfiles.view.Color

/**
 * An edge style that uses WebGL rendering and displays edges as tapered straight lines that connect the centers of the source and target nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLTaperedEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLTaperedEdgeStyle%23WebGLTaperedEdgeStyle-constructor-WebGLTaperedEdgeStyle">Online Documentation</a>
 */
external open class WebGLTaperedEdgeStyle  () : IEdgeStyle {

/**
 * Gets or sets the [Color] of the line.
 * 
 * The default value is [Color.BLACK].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLTaperedEdgeStyle%23color">Online Documentation</a>
 */
final var color: Color
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLTaperedEdgeStyle%23renderer">Online Documentation</a>
 */
final override val renderer: IEdgeStyleRenderer
/**
 * Gets or sets the thickness at the source end of the line.
 * 
 * The default value is 5.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLTaperedEdgeStyle%23thickness">Online Documentation</a>
 */
final var thickness: Double
/**
 * Performs a [YObject.memberwiseClone][yfiles.lang.YObject.memberwiseClone]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLTaperedEdgeStyle%23WebGLTaperedEdgeStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():WebGLTaperedEdgeStyle

companion object : ClassMetadata<WebGLTaperedEdgeStyle> {
}
}

inline fun WebGLTaperedEdgeStyle(
    block: WebGLTaperedEdgeStyle.() -> Unit
): WebGLTaperedEdgeStyle {
    return WebGLTaperedEdgeStyle()
        .apply(block)
}
