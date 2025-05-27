// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.collections.ItemMapping
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * Specifies sequence constraints for `TNode` and `TEdge` for a [HierarchicalLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-constructor-SequenceConstraintData">Online Documentation</a>
 */
external class SequenceConstraintData<TNode : TItem, TEdge : TItem, TItem> ()  {
  /**
   * Gets or sets the mapping from nodes or edges to an [IComparable] (for example a number or string) defining their sequence sort order.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23itemComparables">Online Documentation</a>
   */
  final var itemComparables: ItemMapping<TItem, IComparable<*>>
  
  /**
   * Clears all previously defined constraints.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-clearConstraints">Online Documentation</a>
   */
  fun clearConstraints()
  
  /**
   * Adds a constraint that places a `TEdge` at the start of the sequence.
   * @param [edge] the edge that should be placed at the start
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeEdgeAtHead">Online Documentation</a>
   */
  fun placeEdgeAtHead(
    edge: TEdge,
  )
  
  /**
   * Adds a constraint that places a `TEdge` at the end of the sequence.
   * @param [edge] the edge that should be placed at the end
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeEdgeAtTail">Online Documentation</a>
   */
  fun placeEdgeAtTail(
    edge: TEdge,
  )
  
  /**
   * Adds a constraint that forces the `afterEdge` of type `TEdge` to lie after the `beforeEdge` of type `TEdge`.
   * @param [beforeEdge] the first edge
   * @param [afterEdge] the edge that should be placed after the first edge
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeEdgeBeforeEdge">Online Documentation</a>
   */
  fun placeEdgeBeforeEdge(
    beforeEdge: TEdge,
    afterEdge: TEdge,
  )
  
  /**
   * Adds a constraint that forces the `afterNode` of type `TNode` to lie after the `beforeEdge` of type `TEdge`.
   * @param [beforeEdge] the edge
   * @param [afterNode] the node that should be placed after the edge
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeEdgeBeforeNode">Online Documentation</a>
   */
  fun placeEdgeBeforeNode(
    beforeEdge: TEdge,
    afterNode: TNode,
  )
  
  /**
   * Adds a constraint that places a `TNode` at the start of the sequence.
   * @param [node] the node that should be placed at the start
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeNodeAtHead">Online Documentation</a>
   */
  fun placeNodeAtHead(
    node: TNode,
  )
  
  /**
   * Adds a constraint that places a `TNode` at the end of the sequence.
   * @param [node] the node that should be placed at the end
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeNodeAtTail">Online Documentation</a>
   */
  fun placeNodeAtTail(
    node: TNode,
  )
  
  /**
   * Adds a constraint that forces the `afterEdge` of type `TEdge` to lie after the `beforeNode` of type `TNode`.
   * @param [beforeNode] the node
   * @param [afterEdge] the edge that should be placed after the node
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeNodeBeforeEdge">Online Documentation</a>
   */
  fun placeNodeBeforeEdge(
    beforeNode: TNode,
    afterEdge: TEdge,
  )
  
  /**
   * Adds a constraint that forces the `afterNode` of type `TNode` to lie after the `beforeNode` of type `TNode`.
   * @param [beforeNode] the first node
   * @param [afterNode] the node that should be placed after the first node
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SequenceConstraintData%23SequenceConstraintData-method-placeNodeBeforeNode">Online Documentation</a>
   */
  fun placeNodeBeforeNode(
    beforeNode: TNode,
    afterNode: TNode,
  )
  
  companion object : ClassMetadata<SequenceConstraintData<*, *, *>> {
  }
}
