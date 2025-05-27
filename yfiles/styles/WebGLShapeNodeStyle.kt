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
 * A node style that uses WebGL rendering and displays nodes as geometric shapes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLShapeNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this node style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLShapeNodeStyle%23WebGLShapeNodeStyle-constructor-WebGLShapeNodeStyle">Online Documentation</a>
 */
external open class WebGLShapeNodeStyle  () : INodeStyle {

/**
 * Gets or sets the [color] of this style.
 * 
 * The default value is [Color.WHITE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLShapeNodeStyle%23color">Online Documentation</a>
 */
final var color: Color
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLShapeNodeStyle%23renderer">Online Documentation</a>
 */
final override val renderer: INodeStyleRenderer
/**
 * Gets or sets the shape of this style.
 * 
 * The default value is [ShapeNodeShape.RECTANGLE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLShapeNodeStyle%23shape">Online Documentation</a>
 */
final var shape: ShapeNodeShape
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGLShapeNodeStyle%23WebGLShapeNodeStyle-method-clone">Online Documentation</a>
 */
 final override   fun clone():WebGLShapeNodeStyle

companion object : ClassMetadata<WebGLShapeNodeStyle> {
}
}

inline fun WebGLShapeNodeStyle(
    block: WebGLShapeNodeStyle.() -> Unit
): WebGLShapeNodeStyle {
    return WebGLShapeNodeStyle()
        .apply(block)
}
