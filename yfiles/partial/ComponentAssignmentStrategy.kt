// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

/**
 * Enum representing various strategies for assigning nodes to subgraph components.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentAssignmentStrategy">Online Documentation</a>
 */

sealed external class ComponentAssignmentStrategy {
  /**
   * A strategy that assigns each node to a distinct subgraph component.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentAssignmentStrategy%23SINGLE">Online Documentation</a>
   */
  object SINGLE: ComponentAssignmentStrategy
  
  /**
   * A strategy where subgraph components correspond to the graph's connected components.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentAssignmentStrategy%23CONNECTED">Online Documentation</a>
   */
  object CONNECTED: ComponentAssignmentStrategy
  
  /**
   * A strategy where subgraph components are defined by clusters determined by a clustering algorithm based on edge betweenness centrality.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentAssignmentStrategy%23CLUSTERING">Online Documentation</a>
   */
  object CLUSTERING: ComponentAssignmentStrategy
}
