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
import yfiles.geometry.Size
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata

/**
 * A label style that [wraps][wrapped] another [ILabelStyle] and draws an icon in addition to the text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided icon and renderer.
 * @param [icon] The icon to draw.
 * @param [renderer] The custom renderer for this style instance. If `null` the [default implementation][IconLabelStyleRenderer] will be used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23IconLabelStyle-constructor-IconLabelStyle">Online Documentation</a>
 */
external open class IconLabelStyle  ( icon: String?  = definedExternally,
 renderer: ILabelStyleRenderer?  = definedExternally) : ILabelStyle {

/**
 * Gets a value indicating whether to automatically flip the rendering should the [layout][yfiles.graph.ILabel.layout]'s [up vector][yfiles.geometry.IOrientedRectangle.upY] point downwards.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23autoFlip">Online Documentation</a>
 */
final var autoFlip: Boolean
/**
 * Gets or sets a CSS class that will be applied to the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the URL of the icon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23icon">Online Documentation</a>
 */
final var icon: String?
/**
 * Gets or sets the parameter that specifies the icon placement.
 * @throws ArgumentError `value` is null.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23iconPlacement">Online Documentation</a>
 */
final var iconPlacement: ILabelModelParameter
/**
 * Gets or sets the size of the icon to paint for the label.
 * 
 * The default value is [Size.EMPTY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23iconSize">Online Documentation</a>
 */
final var iconSize: Size
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23renderer">Online Documentation</a>
 */
final override val renderer: ILabelStyleRenderer
/**
 * Gets or sets the style that renders the text of the label.
 * @throws ArgumentError `value` is null.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23wrapped">Online Documentation</a>
 */
final var wrapped: ILabelStyle
/**
 * Gets or sets the insets that should be applied for the [layout][yfiles.graph.ILabel.layout] of the [wrapped style][wrapped] rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23wrappedInsets">Online Documentation</a>
 */
final var wrappedInsets: Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23IconLabelStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():IconLabelStyle

companion object : ClassMetadata<IconLabelStyle> {
}
}

inline fun IconLabelStyle(
    block: IconLabelStyle.() -> Unit
): IconLabelStyle {
    return IconLabelStyle()
        .apply(block)
}
