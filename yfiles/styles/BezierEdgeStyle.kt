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
import yfiles.view.Stroke

/**
 * Provides an edge representation as a cubic bezier path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided renderer.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyle%23BezierEdgeStyle-constructor-BezierEdgeStyle(BezierEdgeStyleRenderer)">Online Documentation</a>
 * 
 * @property renderer
 * Gets the renderer implementation that has been supplied to this instance in the constructor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyle%23renderer">Online Documentation</a>
 */
external open class BezierEdgeStyle  (
final override val renderer: BezierEdgeStyleRenderer = definedExternally) : IEdgeStyle {

/**
 * Gets or sets a CSS class that will be applied to the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyle%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the visual arrow at the source end of edges that use this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyle%23sourceArrow">Online Documentation</a>
 */
final var sourceArrow: IArrow
/**
 * Gets or sets the [Stroke] that is used to draw the path.
 * 
 * The default value is [Stroke.BLACK].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyle%23stroke">Online Documentation</a>
 */
final var stroke: Stroke?
/**
 * Gets or sets the visual arrow at the target end of edges that use this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyle%23targetArrow">Online Documentation</a>
 */
final var targetArrow: IArrow
/**
 * Performs a [YObject.memberwiseClone][yfiles.lang.YObject.memberwiseClone]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BezierEdgeStyle%23BezierEdgeStyle-method-clone">Online Documentation</a>
 */
 final override   fun clone():BezierEdgeStyle

companion object : ClassMetadata<BezierEdgeStyle> {
}
}

inline fun BezierEdgeStyle(
    block: BezierEdgeStyle.() -> Unit
): BezierEdgeStyle {
    return BezierEdgeStyle()
        .apply(block)
}
