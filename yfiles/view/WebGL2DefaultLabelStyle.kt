// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.styles.TextWrappingShape

/**
 * A label style for use in WebGL2 rendering.
 * @see [WebGL2IconLabelStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle">Online Documentation</a>
 * 
 * @constructor Creates a new label style that is rendered with WebGL2.
 * @param [font] The font for the label's text. Defaults to '12px Arial'.
 * @param [textColor] The color of the label's text. Defaults to [Color.BLACK].
 * @param [backgroundColor] The color of the label's background. Defaults to [Color.TRANSPARENT], which does not render a background.
 * @param [backgroundStroke] The color of the label's background border. Defaults to [WebGL2Stroke.NONE], which does not render a stroke.
 * @param [textAlignment] The horizontal alignment of the label's text. Defaults to [HorizontalTextAlignment.LEFT].
 * @param [insets] The padding of the text within the label's bounds. Defaults to `0`.
 * @param [shape] The shape of the label's background. Defaults to [WebGL2LabelShape.RECTANGLE]
 * @param [effect] The effect around the label. Defaults to [WebGL2Effect.NONE].
 * @param [samplingRate] The super-sampling rate to render text at a higher resolution into the intermediate bitmap. When no value is specified, the rate is determined dynamically from the font size. For 12px it will be `2.0` and it will go up as far as `10.0` for smaller font sizes. For fonts larger than 64px it will be `0.5` and for the font sizes in between the rate will be interpolated accordingly. This works well for many fonts when `textureRendering` is set to [WebGL2TextureRendering.SDF].
 * @param [textureRendering] Rendering hint on how to resolve text blurriness on large zoom values. Defaults to [WebGL2TextureRendering.SDF].
 * @param [wrapping] The wrapping and trimming behavior for the label.
 * @param [textWrappingShape] The shape the label text shall be wrapped in.
 * @param [textWrappingPadding] The padding between the wrapped text and the text wrapping shape.
 * @param [verticalTextAlignment] The vertical text alignment to use if the label is assigned more space than needed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23WebGL2DefaultLabelStyle-constructor-WebGL2DefaultLabelStyle">Online Documentation</a>
 */
external  class WebGL2DefaultLabelStyle  ( font: Font?  = definedExternally,
 textColor: Color?  = definedExternally,
 backgroundColor: Color?  = definedExternally,
 backgroundStroke: WebGL2Stroke?  = definedExternally,
 textAlignment: HorizontalTextAlignment  = definedExternally,
 insets: Double  = definedExternally,
 shape: WebGL2LabelShape  = definedExternally,
 effect: WebGL2Effect  = definedExternally,
 samplingRate: Int  = definedExternally,
 textureRendering: WebGL2TextureRendering  = definedExternally,
 wrapping: TextWrapping  = definedExternally,
 textWrappingShape: TextWrappingShape  = definedExternally,
 textWrappingPadding: Double  = definedExternally,
 verticalTextAlignment: VerticalTextAlignment  = definedExternally) : YObject {

/**
 * Gets the color of the label's background.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23backgroundColor">Online Documentation</a>
 */
final val backgroundColor: Color
/**
 * Gets the color and thickness of the label's background border.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23backgroundStroke">Online Documentation</a>
 */
final val backgroundStroke: WebGL2Stroke
/**
 * Gets the set of applied effects on this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23effect">Online Documentation</a>
 */
final val effect: WebGL2Effect
/**
 * Gets the font for the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23font">Online Documentation</a>
 */
final val font: Font
/**
 * Gets the padding of the text within the label's bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23insets">Online Documentation</a>
 */
final val insets: Double
/**
 * Gets a super sampling rate to render text at a higher resolution.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23samplingRate">Online Documentation</a>
 */
final val samplingRate: Int
/**
 * Gets the shape of the label's background.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23shape">Online Documentation</a>
 */
final val shape: WebGL2LabelShape
/**
 * Gets the horizontal text alignment for the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23textAlignment">Online Documentation</a>
 */
final val textAlignment: HorizontalTextAlignment
/**
 * Gets the color of the label's text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23textColor">Online Documentation</a>
 */
final val textColor: Color
/**
 * Gets the padding between the wrapped text and the [textWrappingShape].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23textWrappingPadding">Online Documentation</a>
 */
final val textWrappingPadding: Double
/**
 * Gets the shape the label text shall be wrapped in when rendered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23textWrappingShape">Online Documentation</a>
 */
final val textWrappingShape: TextWrappingShape
/**
 * Gets the rendering hint on how to resolve text blurriness on large zoom values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23textureRendering">Online Documentation</a>
 */
final val textureRendering: WebGL2TextureRendering
/**
 * Gets the vertical text alignment to use if the label is assigned more space than needed.
 * 
 * The default value is [VerticalTextAlignment.TOP].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23verticalTextAlignment">Online Documentation</a>
 */
final val verticalTextAlignment: VerticalTextAlignment
/**
 * Gets the text wrapping and trimming behavior.
 * 
 * The default value is [TextWrapping.NONE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DefaultLabelStyle%23wrapping">Online Documentation</a>
 */
final val wrapping: TextWrapping

companion object : ClassMetadata<WebGL2DefaultLabelStyle> {
}
}
