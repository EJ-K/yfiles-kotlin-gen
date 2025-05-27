// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.collections.ItemMapping
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [TreeMapLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayoutData%23TreeMapLayoutData-constructor-TreeMapLayoutData">Online Documentation</a>
 */
external class TreeMapLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the comparison function that defines the order in which child nodes are placed inside their parent node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayoutData%23childNodeComparator">Online Documentation</a>
   */
  final var childNodeComparator: Comparison1<TNode>?
  
  /**
   * Gets or sets the mapping from nodes to the weight value used for the tree map layout.
   * @see [TreeMapLayout.NODE_WEIGHT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayoutData%23nodeWeights">Online Documentation</a>
   */
  final var nodeWeights: ItemMapping<TNode, Double>
  
  companion object : ClassMetadata<TreeMapLayoutData<*, *, *, *>> {
  }
}
