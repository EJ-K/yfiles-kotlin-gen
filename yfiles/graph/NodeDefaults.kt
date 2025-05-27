// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.styles.INodeStyle

/**
 * A canonical implementation of the [INodeDefaults] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDefaults">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [NodeDefaults] class using default properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDefaults%23NodeDefaults-constructor-NodeDefaults">Online Documentation</a>
 */
open external class NodeDefaults () : INodeDefaults {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDefaults%23labels">Online Documentation</a>
   */
  final override var labels: ILabelDefaults
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDefaults%23ports">Online Documentation</a>
   */
  final override var ports: IPortDefaults
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDefaults%23shareStyleInstance">Online Documentation</a>
   */
  final override var shareStyleInstance: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDefaults%23size">Online Documentation</a>
   */
  final override var size: Size
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDefaults%23style">Online Documentation</a>
   */
  final override var style: INodeStyle
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDefaults%23NodeDefaults-method-getStyleInstance">Online Documentation</a>
   */
  override fun getStyleInstance(): INodeStyle
  
  companion object : ClassMetadata<NodeDefaults> {
  }
}

inline fun NodeDefaults(
    block: NodeDefaults.() -> Unit
): NodeDefaults {
    return NodeDefaults()
        .apply(block)
}
