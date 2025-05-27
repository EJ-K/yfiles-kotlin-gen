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
import yfiles.lang.ClassMetadata
import yfiles.view.Fill
import yfiles.view.Font
import yfiles.view.HorizontalTextAlignment
import yfiles.view.Stroke
import yfiles.view.TextWrapping
import yfiles.view.VerticalTextAlignment

/**
 * A basic label style which renders the label's [ILabel.text][yfiles.graph.ILabel.text] and optionally a [background][backgroundFill] and [border][backgroundStroke].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided renderer.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23DefaultLabelStyle-constructor-DefaultLabelStyle(ILabelStyleRenderer)">Online Documentation</a>
 * 
 * @property renderer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23renderer">Online Documentation</a>
 */
external open class DefaultLabelStyle  (
final override val renderer: ILabelStyleRenderer = definedExternally) : ILabelStyle {

/**
 * Gets or sets a value indicating whether the label should be flipped 180 degrees automatically, if it would be oriented downwards, otherwise.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23autoFlip">Online Documentation</a>
 */
final var autoFlip: Boolean
/**
 * Gets or sets the brush to use for the background box of the label.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23backgroundFill">Online Documentation</a>
 */
final var backgroundFill: Fill?
/**
 * Gets or sets the pen to use for the background box of the label.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23backgroundStroke">Online Documentation</a>
 */
final var backgroundStroke: Stroke?
/**
 * Gets or sets a value that determines whether text should be clipped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23clipText">Online Documentation</a>
 */
final var clipText: Boolean
/**
 * Gets or sets a CSS class that will be applied to the visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the typeface to use for the label.
 * 
 * The default value is an instance of [font] for `Arial`.
 * @throws ArgumentError value cannot be null!
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23font">Online Documentation</a>
 */
final var font: Font
/**
 * Gets or sets the text alignment.
 * 
 * The default value is [HorizontalTextAlignment.LEFT].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23horizontalTextAlignment">Online Documentation</a>
 */
final var horizontalTextAlignment: HorizontalTextAlignment
/**
 * Gets or sets the insets for the label.
 * @see [minimumSize]
 * @see [maximumSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23insets">Online Documentation</a>
 */
final var insets: Insets
/**
 * Gets or sets the maximum preferred size allowed for the label.
 * @see [minimumSize]
 * @see [insets]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23maximumSize">Online Documentation</a>
 */
final var maximumSize: Size
/**
 * Gets or sets the minimum preferred size allowed for the label.
 * @see [maximumSize]
 * @see [insets]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23minimumSize">Online Documentation</a>
 */
final var minimumSize: Size
/**
 * Gets or sets the shape of the label's background.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23shape">Online Documentation</a>
 */
final var shape: LabelShape
/**
 * Gets or sets the brush to use for the label's text.
 * 
 * The default value is [Fill.BLACK].
 * @throws ArgumentError value cannot be null!
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23textFill">Online Documentation</a>
 */
final var textFill: Fill
/**
 * Gets or sets the size of the text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23textSize">Online Documentation</a>
 */
final var textSize: Double
/**
 * Gets or sets the padding between the wrapped text and the [textWrappingShape].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23textWrappingPadding">Online Documentation</a>
 */
final var textWrappingPadding: Double
/**
 * Gets or sets the shape the label text shall be wrapped in when rendered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23textWrappingShape">Online Documentation</a>
 */
final var textWrappingShape: TextWrappingShape
/**
 * Gets or sets the vertical text alignment to use if the label is assigned more space than needed.
 * 
 * The default value is [VerticalTextAlignment.TOP].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23verticalTextAlignment">Online Documentation</a>
 */
final var verticalTextAlignment: VerticalTextAlignment
/**
 * Gets or sets the text wrapping and trimming behavior.
 * 
 * The default value is [TextWrapping.NONE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23wrapping">Online Documentation</a>
 */
final var wrapping: TextWrapping
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23DefaultLabelStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():DefaultLabelStyle

companion object : ClassMetadata<DefaultLabelStyle> {
/**
 * Gets or sets a value that is added to the preferred width and height of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23enlargementAbsolute">Online Documentation</a>
 */
final var enlargementAbsolute: Double
/**
 * Gets or sets a value that multiplies the preferred width and height of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelStyle%23enlargementRelative">Online Documentation</a>
 */
final var enlargementRelative: Double
}
}

inline fun DefaultLabelStyle(
    block: DefaultLabelStyle.() -> Unit
): DefaultLabelStyle {
    return DefaultLabelStyle()
        .apply(block)
}
