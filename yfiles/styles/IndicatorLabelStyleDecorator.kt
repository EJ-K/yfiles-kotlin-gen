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
 * Allows to scale the visualization of an [ILabelStyle] depending on the zoom level.
 * @see [LabelStyleDecorationInstaller][yfiles.view.LabelStyleDecorationInstaller]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorLabelStyleDecorator">Online Documentation</a>
 * 
 * @constructor Creates a new instance wrapping the provided style.
 * @param [wrapped] The label style to wrap. If no wrapped style is provided, [ILabel.style][yfiles.graph.ILabel.style] is used instead
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorLabelStyleDecorator%23IndicatorLabelStyleDecorator-constructor-IndicatorLabelStyleDecorator">Online Documentation</a>
 * 
 * @property wrapped
 * Gets the wrapped label style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorLabelStyleDecorator%23wrapped">Online Documentation</a>
 */
external open class IndicatorLabelStyleDecorator  (
final val wrapped: ILabelStyle? = definedExternally) : ILabelStyle {

/**
 * Gets or sets the padding the label layout is increased by.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorLabelStyleDecorator%23padding">Online Documentation</a>
 */
final var padding: Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorLabelStyleDecorator%23renderer">Online Documentation</a>
 */
final override val renderer: ILabelStyleRenderer
/**
 * Gets or sets how the style is affected by the current zoom level.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorLabelStyleDecorator%23zoomPolicy">Online Documentation</a>
 */
final var zoomPolicy: StyleDecorationZoomPolicy
/**
 * Returns a memberwise clone of this instance.
 * @return A memberwise clone of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndicatorLabelStyleDecorator%23IndicatorLabelStyleDecorator-method-clone">Online Documentation</a>
 */
 final override   fun clone():IndicatorLabelStyleDecorator

companion object : ClassMetadata<IndicatorLabelStyleDecorator> {
}
}

inline fun IndicatorLabelStyleDecorator(
    block: IndicatorLabelStyleDecorator.() -> Unit
): IndicatorLabelStyleDecorator {
    return IndicatorLabelStyleDecorator()
        .apply(block)
}
