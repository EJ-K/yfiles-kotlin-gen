// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Point
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata

/**
 * A port style decorator that uses a node style instance to render the port.
 * @see [ShapePortStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStylePortStyleAdapter">Online Documentation</a>
 * 
 * @constructor Creates a port style that uses the provided node style to render the port.
 * @param [nodeStyle] The style to use for rendering the port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStylePortStyleAdapter%23NodeStylePortStyleAdapter-constructor-NodeStylePortStyleAdapter">Online Documentation</a>
 */
external class NodeStylePortStyleAdapter (
  nodeStyle: INodeStyle?  = definedExternally,
) : IPortStyle {
  /**
   * Gets the [INodeStyle] that is used for rendering the port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStylePortStyleAdapter%23nodeStyle">Online Documentation</a>
   */
  final var nodeStyle: INodeStyle
  
  /**
   * Gets or sets an offset for the port visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStylePortStyleAdapter%23offset">Online Documentation</a>
   */
  final var offset: Point
  
  /**
   * Gets or sets the size of the port's visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStylePortStyleAdapter%23renderSize">Online Documentation</a>
   */
  final var renderSize: Size
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStylePortStyleAdapter%23renderer">Online Documentation</a>
   */
  final override val renderer: IPortStyleRenderer
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStylePortStyleAdapter%23NodeStylePortStyleAdapter-method-clone">Online Documentation</a>
   */
  override fun clone(): NodeStylePortStyleAdapter
  
  companion object : ClassMetadata<NodeStylePortStyleAdapter> {
  }
}

inline fun NodeStylePortStyleAdapter(
    block: NodeStylePortStyleAdapter.() -> Unit
): NodeStylePortStyleAdapter {
    return NodeStylePortStyleAdapter()
        .apply(block)
}
