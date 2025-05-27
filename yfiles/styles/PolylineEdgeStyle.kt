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
 * A polygonal [IEdgeStyle] where straight line segments are used to connect the bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided renderer.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23PolylineEdgeStyle-constructor-PolylineEdgeStyle(PolylineEdgeStyleRenderer)">Online Documentation</a>
 * 
 * @property renderer
 * Gets the renderer implementation that has been supplied to this instance in the constructor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23renderer">Online Documentation</a>
 */
external open class PolylineEdgeStyle  (
final override val renderer: PolylineEdgeStyleRenderer = definedExternally) : IEdgeStyle {

/**
 * Gets or sets a CSS class that will be applied to the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the smoothing length used for creating smooth bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23smoothingLength">Online Documentation</a>
 */
final var smoothingLength: Double
/**
 * Gets or sets the visual arrow at the source end of edges that use this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23sourceArrow">Online Documentation</a>
 */
final var sourceArrow: IArrow
/**
 * Gets or sets the [Stroke] for the line.
 * 
 * The default value is [Stroke.BLACK].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23stroke">Online Documentation</a>
 */
final var stroke: Stroke?
/**
 * Gets or sets the visual arrow at the target end of edges that use this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23targetArrow">Online Documentation</a>
 */
final var targetArrow: IArrow
/**
 * Performs a [YObject.memberwiseClone][yfiles.lang.YObject.memberwiseClone]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PolylineEdgeStyle%23PolylineEdgeStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():PolylineEdgeStyle

companion object : ClassMetadata<PolylineEdgeStyle> {
}
}

inline fun PolylineEdgeStyle(
    block: PolylineEdgeStyle.() -> Unit
): PolylineEdgeStyle {
    return PolylineEdgeStyle()
        .apply(block)
}
