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
 * Allows to scale the visualization of an [IPortStyle] depending on the zoom level.
 * @see [PortStyleDecorationInstaller][yfiles.view.PortStyleDecorationInstaller]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorPortStyleDecorator">Online Documentation</a>
 * 
 * @constructor Creates a new instance wrapping the provided style.
 * @param [wrapped] The port style to wrap. If no wrapped style is provided, [IPort.style][yfiles.graph.IPort.style] is used instead
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorPortStyleDecorator%23IndicatorPortStyleDecorator-constructor-IndicatorPortStyleDecorator">Online Documentation</a>
 * 
 * @property wrapped
 * Gets the wrapped port style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorPortStyleDecorator%23wrapped">Online Documentation</a>
 */
external open class IndicatorPortStyleDecorator  (
final val wrapped: IPortStyle? = definedExternally) : IPortStyle {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorPortStyleDecorator%23renderer">Online Documentation</a>
 */
final override val renderer: IPortStyleRenderer
/**
 * Gets or sets how the style is affected by the current zoom level.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorPortStyleDecorator%23zoomPolicy">Online Documentation</a>
 */
final var zoomPolicy: StyleDecorationZoomPolicy
/**
 * Returns a memberwise clone of this instance.
 * @return A memberwise clone of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorPortStyleDecorator%23IndicatorPortStyleDecorator-method-clone">Online Documentation</a>
 */
 final override   fun clone():IndicatorPortStyleDecorator

companion object : ClassMetadata<IndicatorPortStyleDecorator> {
}
}

inline fun IndicatorPortStyleDecorator(
    block: IndicatorPortStyleDecorator.() -> Unit
): IndicatorPortStyleDecorator {
    return IndicatorPortStyleDecorator()
        .apply(block)
}
