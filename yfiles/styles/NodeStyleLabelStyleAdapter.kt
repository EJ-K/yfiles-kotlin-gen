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

/**
 * A label style decorator that uses a node style instance to render the background and a label style instance to render the foreground of a label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleLabelStyleAdapter">Online Documentation</a>
 * 
 * @constructor Creates a label style that uses the provided node style to render the background and the label style to render the foreground of this style.
 * @param [nodeStyle] The style to use for rendering the background of the label.
 * @param [labelStyle] The style to use for rendering the foreground of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleLabelStyleAdapter%23NodeStyleLabelStyleAdapter-constructor-NodeStyleLabelStyleAdapter">Online Documentation</a>
 */
open external class NodeStyleLabelStyleAdapter (
  nodeStyle: INodeStyle?  = definedExternally,
  labelStyle: ILabelStyle?  = definedExternally,
) : ILabelStyle {
  /**
   * Gets a value indicating whether the label should be flipped 180 degrees automatically, if it would be oriented downwards, otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleLabelStyleAdapter%23autoFlip">Online Documentation</a>
   */
  final var autoFlip: Boolean
  
  /**
   * Gets the [ILabelStyle] that is used for rendering the foreground of the label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleLabelStyleAdapter%23labelStyle">Online Documentation</a>
   */
  final var labelStyle: ILabelStyle
  
  /**
   * Gets or sets the padding to apply for the [labelStyle][NodeStyleLabelStyleAdapter].
   * 
   * The default is `(0,0,0,0)`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleLabelStyleAdapter%23labelStylePadding">Online Documentation</a>
   */
  final var labelStylePadding: Insets
  
  /**
   * Gets the [INodeStyle] that is used for rendering the background of the label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleLabelStyleAdapter%23nodeStyle">Online Documentation</a>
   */
  final var nodeStyle: INodeStyle
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleLabelStyleAdapter%23renderer">Online Documentation</a>
   */
  final override val renderer: ILabelStyleRenderer
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleLabelStyleAdapter%23NodeStyleLabelStyleAdapter-method-clone">Online Documentation</a>
   */
  override fun clone(): NodeStyleLabelStyleAdapter
  
  companion object : ClassMetadata<NodeStyleLabelStyleAdapter> {
  }
}

inline fun NodeStyleLabelStyleAdapter(
    block: NodeStyleLabelStyleAdapter.() -> Unit
): NodeStyleLabelStyleAdapter {
    return NodeStyleLabelStyleAdapter()
        .apply(block)
}
