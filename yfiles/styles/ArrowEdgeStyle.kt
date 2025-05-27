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
 * Edge style that renders like different single-segment arrow shapes with configurable arrow tip angle and arrow shaft thickness.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance with default properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23ArrowEdgeStyle-constructor-ArrowEdgeStyle">Online Documentation</a>
 */
external open class ArrowEdgeStyle  () : IEdgeStyle {

/**
 * Gets or sets the angle of the angled sides in radians.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23angle">Online Documentation</a>
 */
final var angle: Double
/**
 * Gets or sets a CSS class that will be applied to the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the [Fill] for filling the interior of the shape.
 * 
 * The default value is [Fill.WHITE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23fill">Online Documentation</a>
 */
final var fill: Fill?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23renderer">Online Documentation</a>
 */
final override val renderer: IEdgeStyleRenderer
/**
 * Gets or sets the thickness of the arrow shaft as ratio of the [thickness].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23shaftRatio">Online Documentation</a>
 */
final var shaftRatio: Double
/**
 * Gets or sets the basic shape.
 * 
 * The default value is [ArrowStyleShape.ARROW].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23shape">Online Documentation</a>
 */
final var shape: ArrowStyleShape
/**
 * Gets or sets the distance that the end of the arrow shape should stay away from the intersection with its source shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23sourceCropping">Online Documentation</a>
 */
final var sourceCropping: Double
/**
 * Gets or sets the [Stroke] used for drawing the outline of the shape.
 * 
 * The default value is [Stroke.BLACK].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23stroke">Online Documentation</a>
 */
final var stroke: Stroke?
/**
 * Gets or sets the distance that the tip of the arrow shape should stay away from the intersection with its target shape.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23targetCropping">Online Documentation</a>
 */
final var targetCropping: Double
/**
 * Gets or sets the width of the arrow that is drawn.
 * 
 * The default value is `10`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23thickness">Online Documentation</a>
 */
final var thickness: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowEdgeStyle%23ArrowEdgeStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():ArrowEdgeStyle

companion object : ClassMetadata<ArrowEdgeStyle> {
}
}

inline fun ArrowEdgeStyle(
    block: ArrowEdgeStyle.() -> Unit
): ArrowEdgeStyle {
    return ArrowEdgeStyle()
        .apply(block)
}
