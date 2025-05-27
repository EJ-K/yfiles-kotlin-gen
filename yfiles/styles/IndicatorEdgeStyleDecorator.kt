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
import yfiles.view.StyleDecorationZoomPolicy

/**
 * Allows to scale the visualization of an [IEdgeStyle] depending on the zoom level.
 * @see [EdgeStyleDecorationInstaller][yfiles.view.EdgeStyleDecorationInstaller]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorEdgeStyleDecorator">Online Documentation</a>
 * 
 * @constructor Creates a new instance wrapping the provided style.
 * @param [wrapped] The edge style to wrap. If no wrapped style is provided, [IEdge.style][yfiles.graph.IEdge.style] is used instead
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorEdgeStyleDecorator%23IndicatorEdgeStyleDecorator-constructor-IndicatorEdgeStyleDecorator">Online Documentation</a>
 * 
 * @property wrapped
 * Gets the wrapped edge style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorEdgeStyleDecorator%23wrapped">Online Documentation</a>
 */
external open class IndicatorEdgeStyleDecorator  (
final val wrapped: IEdgeStyle? = definedExternally) : IEdgeStyle {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorEdgeStyleDecorator%23renderer">Online Documentation</a>
 */
final override val renderer: IEdgeStyleRenderer
/**
 * Gets or sets how the style is affected by the current zoom level.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorEdgeStyleDecorator%23zoomPolicy">Online Documentation</a>
 */
final var zoomPolicy: StyleDecorationZoomPolicy
/**
 * Returns a memberwise clone of this instance.
 * @return A memberwise clone of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorEdgeStyleDecorator%23IndicatorEdgeStyleDecorator-method-clone">Online Documentation</a>
 */
 final override   fun clone():IndicatorEdgeStyleDecorator

companion object : ClassMetadata<IndicatorEdgeStyleDecorator> {
}
}

inline fun IndicatorEdgeStyleDecorator(
    block: IndicatorEdgeStyleDecorator.() -> Unit
): IndicatorEdgeStyleDecorator {
    return IndicatorEdgeStyleDecorator()
        .apply(block)
}
