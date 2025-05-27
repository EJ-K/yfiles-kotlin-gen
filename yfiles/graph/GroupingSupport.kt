// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.collections.IListEnumerable
import yfiles.geometry.Rect
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata

/**
 * Provides less frequently used methods for analyzing and managing grouped graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport">Online Documentation</a>
 * 
 * @constructor Creates a new instance which operates on the given `graph`.
 * @param [graph] The graph to use for operations on this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-constructor-GroupingSupport">Online Documentation</a>
 */
external class GroupingSupport (
  graph: IGraph,
)  {
  /**
   * Calculates the minimum area to enclose by the given group node with respect to its [IGroupBoundsCalculator].
   * @param [groupNode] The group node to calculate the minimum enclosed area of.
   * @return The area to enclose for the given group node. This is [EMPTY][Rect] if the node is not a group node, or if it doesn't have any children.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-calculateMinimumEnclosedArea">Online Documentation</a>
   */
  fun calculateMinimumEnclosedArea(
    groupNode: INode,
  ): Rect
  
  /**
   * Enlarges all group nodes in the graph so that the [minimum enclosed area][GroupingSupport] is respected.
   * @see [enlargeGroupNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-enlargeAllGroupNodes()">Online Documentation</a>
   */
  fun enlargeAllGroupNodes()
  
  /**
   * Enlarges all group nodes in the graph in an interactive scenario, so that the [minimum enclosed area][GroupingSupport] is respected.
   * @param [context] The context to use for the [IReshapeHandler][yfiles.input.IReshapeHandler]s.
   * @see [enlargeGroupNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-enlargeAllGroupNodes(IInputModeContext)">Online Documentation</a>
   */
  fun enlargeAllGroupNodes(
    context: IInputModeContext,
  )
  
  /**
   * Enlarges the given group node to ensure that the [minimum enclosed][GroupingSupport] area is inside its bounds.
   * @param [groupNode] The group node to resize.
   * @param [ancestors] if set to `true` all ancestor group nodes will be resized, too, if necessary
   * @see [enlargeGroupNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-enlargeGroupNode(INode,boolean)">Online Documentation</a>
   */
  fun enlargeGroupNode(
    groupNode: INode,
    ancestors: Boolean,
  )
  
  /**
   * Enlarges the group nodes in an interactive scenario, using [IReshapeHandler][yfiles.input.IReshapeHandler] implementations of the group nodes to perform the actual resizing.
   * @param [context] The context to use for the [IReshapeHandler][yfiles.input.IReshapeHandler]s.
   * @param [node] The node to enlarge appropriately.
   * @param [ancestors] if set to `true` ancestors the ancestor group nodes will be adjusted, too, if necessary.
   * @see [IReshapeHandler][yfiles.input.IReshapeHandler]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-enlargeGroupNode(IInputModeContext,INode,boolean)">Online Documentation</a>
   */
  fun enlargeGroupNode(
    context: IInputModeContext,
    node: INode,
    ancestors: Boolean,
  )
  
  /**
   * Gets the path to root traversing all [parents][IGraph] of the given item.
   * @param [node] The node to start.
   * @return A readonly list that includes the node but not the root, unless they are identical and all parents in between them.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-getAncestors">Online Documentation</a>
   */
  fun getAncestors(
    node: INode?,
  ): IListEnumerable<INode>
  
  /**
   * Returns all descendants of the provided node that are part of the grouped graph.
   * @param [node] The root node to get the descendants from.
   * @return An enumeration of the children of the node at the time of this invocation in reverse DFS prefix order.
   * @see [IGraph.getChildren]
   * @see [getDescendantsBottomUp]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-getDescendants">Online Documentation</a>
   */
  fun getDescendants(
    node: INode,
  ): IEnumerable<INode>
  
  /**
   * Returns all descendants of the provided node that are part of the grouped graph.
   * @param [node] The root node to get the descendants from.
   * @return An enumeration of the children of the node at the time of this invocation in DFS postfix order.
   * @see [IGraph.getChildren]
   * @see [getDescendants]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-getDescendantsBottomUp">Online Documentation</a>
   */
  fun getDescendantsBottomUp(
    node: INode,
  ): IEnumerable<INode>
  
  /**
   * Determines the nearest common ancestor of the provided nodes in the graph.
   * @param [nodes] The nodes to find the nearest common ancestor of.
   * @return The nearest common ancestor of the provided nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-getNearestCommonAncestor(INode[])">Online Documentation</a>
   */
  fun getNearestCommonAncestor(
    vararg nodes: INode,
  ): INode?
  
  /**
   * Determines the nearest common ancestor of the provided nodes in the graph.
   * @param [nodes] The nodes to find the nearest common ancestor of.
   * @return The nearest common ancestor of the provided nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-getNearestCommonAncestor(IEnumerable)">Online Documentation</a>
   */
  fun getNearestCommonAncestor(
    nodes: IEnumerable<INode>,
  ): INode?
  
  /**
   * Determines whether there are group nodes in the graph.
   * @return `true` if there are [group][IGraph].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-hasGroupNodes">Online Documentation</a>
   */
  fun hasGroupNodes(): Boolean
  
  /**
   * Determines whether `ancestor` is an ancestor of `node` in the grouped graph.
   * @param [node] The node to check.
   * @param [ancestor] The ancestor to check.
   * @return Whether `ancestor` is an ancestor of `node`.
   * @see [getDescendants]
   * @see [getDescendantsBottomUp]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingSupport%23GroupingSupport-method-isDescendant">Online Documentation</a>
   */
  fun isDescendant(
    node: INode,
    ancestor: INode,
  ): Boolean
  
  companion object : ClassMetadata<GroupingSupport> {
  }
}
