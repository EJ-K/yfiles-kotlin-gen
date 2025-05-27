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
 * An edge style that uses WebGL rendering and displays edges as polygonal straight line segments that connect the bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this edge style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23WebGLPolylineEdgeStyle-constructor-WebGLPolylineEdgeStyle">Online Documentation</a>
 */
external open class WebGLPolylineEdgeStyle  () : IEdgeStyle {

/**
 * Gets or sets the [color] of the line.
 * 
 * The default value is [Color.BLACK].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23color">Online Documentation</a>
 */
final var color: Color
/**
 * Gets or sets whether the line path will be cropped at the source and target node bounds, potentially leaving space for the arrowheads.
 * 
 * The default value is `false` since cropping is an expensive operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23cropPath">Online Documentation</a>
 */
final var cropPath: Boolean
/**
 * Gets the renderer implementation that has been supplied to this instance in the constructor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23renderer">Online Documentation</a>
 */
final override val renderer: IEdgeStyleRenderer
/**
 * Gets or sets whether a source arrow should be drawn.
 * 
 * The default value is `false`. Note that for correct arrow rendering, [cropPath] has to be enabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23sourceArrow">Online Documentation</a>
 */
final var sourceArrow: Boolean
/**
 * Gets or sets the ratio between the source arrow width and the edge width.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23sourceArrowRatio">Online Documentation</a>
 */
final var sourceArrowRatio: Double
/**
 * Gets or sets the factor by which the source arrow is scaled.
 * 
 * The default value is `1.0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23sourceArrowScale">Online Documentation</a>
 */
final var sourceArrowScale: Double
/**
 * Gets or sets whether a target arrow should be drawn.
 * 
 * The default value is `false`. Note that for correct arrow rendering, [cropPath] has to be enabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23targetArrow">Online Documentation</a>
 */
final var targetArrow: Boolean
/**
 * Gets or sets the ratio between the target arrow width and the edge width.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23targetArrowRatio">Online Documentation</a>
 */
final var targetArrowRatio: Double
/**
 * Gets or sets the factor by which the target arrow is scaled.
 * 
 * The default value is `1.0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23targetArrowScale">Online Documentation</a>
 */
final var targetArrowScale: Double
/**
 * Gets or sets the [thickness] of the line.
 * 
 * The default value is `1.0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23thickness">Online Documentation</a>
 */
final var thickness: Double
/**
 * Performs a [YObject.memberwiseClone][yfiles.lang.YObject.memberwiseClone]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLPolylineEdgeStyle%23WebGLPolylineEdgeStyle-method-clone">Online Documentation</a>
 */
 final override   fun clone():WebGLPolylineEdgeStyle

companion object : ClassMetadata<WebGLPolylineEdgeStyle> {
}
}

inline fun WebGLPolylineEdgeStyle(
    block: WebGLPolylineEdgeStyle.() -> Unit
): WebGLPolylineEdgeStyle {
    return WebGLPolylineEdgeStyle()
        .apply(block)
}
