// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

/**
 * Specifies how [yfiles.graph.ILabel]s at [yfiles.graph.IPort]s should be treated by the layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy">Online Documentation</a>
 */

sealed external class PortLabelPolicy {
  /**
   * The port label is not visible to the layout algorithm.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy%23NONE">Online Documentation</a>
   */
  object NONE: PortLabelPolicy
  
  /**
   * The port label is converted to a node label.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy%23NODE_LABEL">Online Documentation</a>
   */
  object NODE_LABEL: PortLabelPolicy
  
  /**
   * The port label is converted to an edge label.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy%23EDGE_LABEL">Online Documentation</a>
   */
  object EDGE_LABEL: PortLabelPolicy
  
  /**
   * The port label is converted to an edge label if the port has exactly one incident edge, and to a node label otherwise.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLabelPolicy%23AUTO">Online Documentation</a>
   */
  object AUTO: PortLabelPolicy
}
