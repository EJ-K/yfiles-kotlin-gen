// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ICloneable
import yfiles.lang.InterfaceMetadata

/**
 * Style implementation for [IStripe][yfiles.graph.IStripe] instances in an [ITable][yfiles.graph.ITable].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeStyle">Online Documentation</a>
 */
external interface IStripeStyle : ICloneable<IStripeStyle> {
/**
 * Gets the renderer implementation that can be queried for implementations that provide details about the visual appearance and visual behavior for a given stripe and this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeStyle%23renderer">Online Documentation</a>
 */
val renderer: IStripeStyleRenderer

companion object : InterfaceMetadata<IStripeStyle> {
}
}
