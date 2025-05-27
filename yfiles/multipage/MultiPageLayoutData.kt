// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.collections.ItemMapping
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.LayoutData
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel

/**
 * Specifies custom data for the [MultiPageLayout] and automatically takes care of handling item IDs, providing a translation back to original items, via methods like [getOriginalItem][MultiPageLayoutData] .
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23MultiPageLayoutData-constructor-MultiPageLayoutData">Online Documentation</a>
 */
external class MultiPageLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping for specifying which multi-edges may share a connector node.
   * @see [MultiPageLayout.MULTI_EDGE_CONNECTOR_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23multiEdgeConnectorIds">Online Documentation</a>
   */
  final var multiEdgeConnectorIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets or sets the mapping from nodes to their cluster id.
   * @see [MultiPageLayout.NODE_CLUSTER_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23nodeClusterIds">Online Documentation</a>
   */
  final var nodeClusterIds: ItemMapping<TNode, Id>
  
  /**
   * Returns a node of the original input graph that corresponds to the provided node of the [LayoutGraph][yfiles.layout.LayoutGraph] returned by the [MultiPageLayout].
   * @param [layoutNode] a node of the page graph
   * @param [result] the result of the [MultiPageLayout]
   * @return The corresponding node of the original graph or `null` if the node does not correspond to a node in the original graph, e.g. if it is an auxiliary node
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23MultiPageLayoutData-method-getOriginalItem(LayoutNode,MultiPageLayoutResult)">Online Documentation</a>
   */
  fun getOriginalItem(
    layoutNode: LayoutNode,
    result: MultiPageLayoutResult,
  ): TNode?
  
  /**
   * Returns an edge of the original input graph that corresponds to the provided edge of the [LayoutGraph][yfiles.layout.LayoutGraph] returned by the [MultiPageLayout].
   * @param [layoutEdge] an edge of the page graph
   * @param [result] the result of the [MultiPageLayout]
   * @return The corresponding edge of the original graph or `null` if the edge does not correspond to an edge in the original graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23MultiPageLayoutData-method-getOriginalItem(LayoutEdge,MultiPageLayoutResult)">Online Documentation</a>
   */
  fun getOriginalItem(
    layoutEdge: LayoutEdge,
    result: MultiPageLayoutResult,
  ): TEdge?
  
  /**
   * Returns the label of the original input graph that corresponds to the provided node label of the [LayoutGraph][yfiles.layout.LayoutGraph] returned by the [MultiPageLayout].
   * @param [layoutLabel] a node label of the page graph
   * @param [result] the result of the [MultiPageLayout]
   * @return The corresponding label of the original graph or `null` if the node label does not correspond to a label in the original graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23MultiPageLayoutData-method-getOriginalItem(LayoutNodeLabel,MultiPageLayoutResult)">Online Documentation</a>
   */
  fun getOriginalItem(
    layoutLabel: LayoutNodeLabel,
    result: MultiPageLayoutResult,
  ): TNodeLabel?
  
  /**
   * Returns the label of the original input graph that corresponds to the provided edge label of the [LayoutGraph][yfiles.layout.LayoutGraph] returned by the [MultiPageLayout].
   * @param [layoutLabel] an edge label of the page graph
   * @param [result] the result of the [MultiPageLayout]
   * @return The corresponding label of the original graph or `null` if the edge label does not correspond to a label in the original graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23MultiPageLayoutData-method-getOriginalItem(LayoutEdgeLabel,MultiPageLayoutResult)">Online Documentation</a>
   */
  fun getOriginalItem(
    layoutLabel: LayoutEdgeLabel,
    result: MultiPageLayoutResult,
  ): TEdgeLabel?
  
  companion object : ClassMetadata<MultiPageLayoutData<*, *, *, *>> {
  }
}
