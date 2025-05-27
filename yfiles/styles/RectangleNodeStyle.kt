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
import yfiles.view.Fill
import yfiles.view.Stroke

/**
 * Node style that uses a rectangular shape as basis and supports configurable round or diagonal corners.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided renderer.
 * @param [renderer] Custom renderer instance for this style. If none is provided, a new [RectangleNodeStyleRenderer] is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23RectangleNodeStyle-constructor-RectangleNodeStyle">Online Documentation</a>
 * 
 * @property renderer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23renderer">Online Documentation</a>
 */
external open class RectangleNodeStyle  (
final override val renderer: RectangleNodeStyleRenderer = definedExternally) : INodeStyle {

/**
 * Gets or sets the size of the corners.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23cornerSize">Online Documentation</a>
 */
final var cornerSize: Double
/**
 * Gets or sets the [RectangleCornerStyle] that defines how the affected [corners] are drawn.
 * 
 * The default value is [RectangleCornerStyle.ROUND].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23cornerStyle">Online Documentation</a>
 */
final var cornerStyle: RectangleCornerStyle
/**
 * Gets or sets which corners are drawn with the chosen [cornerStyle].
 * 
 * The default value is [RectangleCorners.ALL].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23corners">Online Documentation</a>
 */
final var corners: RectangleCorners
/**
 * Gets or sets a CSS class that will be applied to the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the [Fill] for filling the interior of the shape.
 * 
 * The default value is [Fill.WHITE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23fill">Online Documentation</a>
 */
final var fill: Fill?
/**
 * Gets or sets whether the [cornerSize] property is interpreted absolute or scaled by the node size.
 * 
 * The default value is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23scaleCornerSize">Online Documentation</a>
 */
final var scaleCornerSize: Boolean
/**
 * Gets or sets the [Stroke] used for drawing the outline of the shape.
 * 
 * The default value is [Stroke.BLACK].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23stroke">Online Documentation</a>
 */
final var stroke: Stroke?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23RectangleNodeStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():RectangleNodeStyle

companion object : ClassMetadata<RectangleNodeStyle> {
}
}

inline fun RectangleNodeStyle(
    block: RectangleNodeStyle.() -> Unit
): RectangleNodeStyle {
    return RectangleNodeStyle()
        .apply(block)
}
