// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.view.StyleDecorationZoomPolicy

/**
 * Allows to scale the visualization of an [INodeStyle] depending on the zoom level.
 * @see [NodeStyleDecorationInstaller][yfiles.view.NodeStyleDecorationInstaller]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorNodeStyleDecorator">Online Documentation</a>
 * 
 * @constructor Creates a new instance wrapping the provided style.
 * @param [wrapped] The node style to wrap. If no wrapped style is provided, [INode.style][yfiles.graph.INode.style] is used instead
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorNodeStyleDecorator%23IndicatorNodeStyleDecorator-constructor-IndicatorNodeStyleDecorator">Online Documentation</a>
 * 
 * @property wrapped
 * Gets the wrapped node style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorNodeStyleDecorator%23wrapped">Online Documentation</a>
 */
external open class IndicatorNodeStyleDecorator  (
final val wrapped: INodeStyle? = definedExternally) : INodeStyle {

/**
 * Gets or sets the padding the node layout is increased by.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorNodeStyleDecorator%23padding">Online Documentation</a>
 */
final var padding: Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorNodeStyleDecorator%23renderer">Online Documentation</a>
 */
final override val renderer: INodeStyleRenderer
/**
 * Gets or sets how the style is affected by the current zoom level.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorNodeStyleDecorator%23zoomPolicy">Online Documentation</a>
 */
final var zoomPolicy: StyleDecorationZoomPolicy
/**
 * Returns a memberwise clone of this instance.
 * @return A memberwise clone of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorNodeStyleDecorator%23IndicatorNodeStyleDecorator-method-clone">Online Documentation</a>
 */
 final override   fun clone():IndicatorNodeStyleDecorator

companion object : ClassMetadata<IndicatorNodeStyleDecorator> {
}
}

inline fun IndicatorNodeStyleDecorator(
    block: IndicatorNodeStyleDecorator.() -> Unit
): IndicatorNodeStyleDecorator {
    return IndicatorNodeStyleDecorator()
        .apply(block)
}
