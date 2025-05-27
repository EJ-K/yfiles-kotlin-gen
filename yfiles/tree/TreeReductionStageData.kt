// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.collections.ICollection
import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.lang.ClassMetadata
import yfiles.layout.EdgeBundleDescriptor
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [TreeReductionStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStageData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStageData%23TreeReductionStageData-constructor-TreeReductionStageData">Online Documentation</a>
 */
external class TreeReductionStageData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping of edges to their [EdgeBundleDescriptor].
   * @see [EdgeBundleDescriptor]
   * @see [TreeReductionStage.edgeBundling]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStageData%23edgeBundleDescriptors">Online Documentation</a>
   */
  final var edgeBundleDescriptors: ItemMapping<TEdge, EdgeBundleDescriptor>
  
  /**
   * Gets or sets the collection of edges explicitly marked as not belonging to a tree.
   * @see [TreeReductionStage.NON_TREE_EDGES_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStageData%23nonTreeEdges">Online Documentation</a>
   */
  final var nonTreeEdges: ItemCollection<TEdge>
  
  /**
   * Gets the edge collection that after the layout run will contain all edges that were selected to become non-tree edges by the [TreeReductionStage].
   * @see [TreeReductionStage.NON_TREE_EDGES_RESULT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStageData%23nonTreeEdgesResult">Online Documentation</a>
   */
  final val nonTreeEdgesResult: ICollection<out TEdge>
  
  companion object : ClassMetadata<TreeReductionStageData<*, *, *, *>> {
  }
}
