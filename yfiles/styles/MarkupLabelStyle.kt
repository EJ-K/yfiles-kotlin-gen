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
 * A label style that interprets the label's [text][yfiles.graph.ILabel] as markup and renders the label using rich text features.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using an [ILabelStyleRenderer] implementation as renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23MarkupLabelStyle-constructor-MarkupLabelStyle">Online Documentation</a>
 */
external class MarkupLabelStyle () : ILabelStyle {
  /**
   * Gets or sets a value indicating whether the label should be flipped 180 degrees automatically, if it would be oriented downwards, otherwise.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23autoFlip">Online Documentation</a>
   */
  final var autoFlip: Boolean
  
  /**
   * Gets or sets the brush to use for the background box of the label.
   * 
   * The default value is `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23backgroundFill">Online Documentation</a>
   */
  final var backgroundFill: Fill?
  
  /**
   * Gets or sets the pen to use for the background box of the label.
   * 
   * The default value is `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23backgroundStroke">Online Documentation</a>
   */
  final var backgroundStroke: Stroke?
  
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets the typeface to use for the label.
   * 
   * The default value is an instance of [font][MarkupLabelStyle] for `Arial`.
   * @throws ArgumentError value cannot be null!
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23font">Online Documentation</a>
   */
  final var font: Font
  
  /**
   * Gets or sets the text alignment.
   * 
   * The default value is [LEFT][HorizontalTextAlignment].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23horizontalTextAlignment">Online Documentation</a>
   */
  final var horizontalTextAlignment: HorizontalTextAlignment
  
  /**
   * Gets or sets the maximum preferred size allowed for the label.
   * @see [minimumSize]
   * @see [padding]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23maximumSize">Online Documentation</a>
   */
  final var maximumSize: Size
  
  /**
   * Gets or sets the minimum preferred size allowed for the label.
   * @see [maximumSize]
   * @see [padding]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23minimumSize">Online Documentation</a>
   */
  final var minimumSize: Size
  
  /**
   * Gets or sets the padding of the label.
   * @see [minimumSize]
   * @see [maximumSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23padding">Online Documentation</a>
   */
  final var padding: Insets
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: ILabelStyleRenderer
  
  /**
   * Gets or sets the shape of the label's background.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23shape">Online Documentation</a>
   */
  final var shape: LabelShape
  
  /**
   * Gets or sets the brush to use for the label's text.
   * 
   * The default value is [BLACK][yfiles.view.Color].
   * @throws ArgumentError value cannot be null!
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23textFill">Online Documentation</a>
   */
  final var textFill: Fill
  
  /**
   * Gets or sets the size of the text.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23textSize">Online Documentation</a>
   */
  final var textSize: Double
  
  /**
   * Gets or sets the padding between the wrapped text and the [textWrappingShape][MarkupLabelStyle].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23textWrappingPadding">Online Documentation</a>
   */
  final var textWrappingPadding: Double
  
  /**
   * Gets or sets the shape the label text shall be wrapped in when rendered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23textWrappingShape">Online Documentation</a>
   */
  final var textWrappingShape: TextWrappingShape
  
  /**
   * Gets or sets the vertical text alignment to use if the label is assigned more space than needed.
   * 
   * The default value is [TOP][VerticalTextAlignment].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23verticalTextAlignment">Online Documentation</a>
   */
  final var verticalTextAlignment: VerticalTextAlignment
  
  /**
   * Gets or sets the text wrapping and trimming behavior.
   * 
   * The default value is [TRIM_CHARACTER_ELLIPSIS][TextWrapping].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23wrapping">Online Documentation</a>
   */
  final var wrapping: TextWrapping
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23MarkupLabelStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): MarkupLabelStyle
  
  companion object : ClassMetadata<MarkupLabelStyle> {
  }
}

inline fun MarkupLabelStyle(
    block: MarkupLabelStyle.() -> Unit
): MarkupLabelStyle {
    return MarkupLabelStyle()
        .apply(block)
}
