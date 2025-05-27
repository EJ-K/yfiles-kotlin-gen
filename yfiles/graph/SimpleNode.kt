// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.geometry.IRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata
import yfiles.styles.INodeStyle

/**
 * A mutable implementation of the [INode] interface that can be used without an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode">Online Documentation</a>
 * 
 * @constructor Creates a default node with default [lookup][Graph], [VOID_NODE_STYLE][INodeStyle] as style, an empty [layout][SimpleNode], and no labels nor ports.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23SimpleNode-constructor-SimpleNode">Online Documentation</a>
 */
external class SimpleNode () : INode {
  /**
   * Gets or sets the collection of [labels][ILabel] that are owned by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23labels">Online Documentation</a>
   */
  final override var labels: IListEnumerable<ILabel>
  
  /**
   * Gets or sets the layout of the node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23layout">Online Documentation</a>
   */
  final override var layout: IRectangle
  
  /**
   * Gets or sets the collection of [ports][IPort] that are owned by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23ports">Online Documentation</a>
   */
  final override var ports: IListEnumerable<IPort>
  
  /**
   * Gets or sets the style that is responsible for the visual representation of this node in a [CanvasComponent][yfiles.view.CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23style">Online Documentation</a>
   */
  final override var style: INodeStyle
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23tag">Online Documentation</a>
   */
  final override var tag: Tag?
  
  /**
   * Gets a [NodeDecorator] to modify the ports [ILookup][yfiles.collections.ILookup].
   * @return A [NodeDecorator] for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23SimpleNode-method-getDecorator">Online Documentation</a>
   */
  fun getDecorator(): NodeDecorator
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleNode%23SimpleNode-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  companion object : ClassMetadata<SimpleNode> {
  }
}

inline fun SimpleNode(
    block: SimpleNode.() -> Unit
): SimpleNode {
    return SimpleNode()
        .apply(block)
}
