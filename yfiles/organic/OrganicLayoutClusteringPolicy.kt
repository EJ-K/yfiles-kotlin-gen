// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

/**
 * Enum constants to define the clustering algorithm applied by the [OrganicLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy">Online Documentation</a>
 */

sealed external class OrganicLayoutClusteringPolicy {
  /**
   * A policy that indicates that no automatic clustering is applied to the input graph.
   * 
   * Value - `0`
   * @see [OrganicLayout.clusteringPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy%23NONE">Online Documentation</a>
   */
  object NONE: OrganicLayoutClusteringPolicy
  
  /**
   * A clustering policy that clusters the nodes using the *louvain modularity method*.
   * 
   * Value - `1`
   * @see [OrganicLayout.clusteringPolicy]
   * @see [yfiles.analysis.LayoutGraphAlgorithms.louvainModularity]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy%23LOUVAIN_MODULARITY">Online Documentation</a>
   */
  object LOUVAIN_MODULARITY: OrganicLayoutClusteringPolicy
  
  /**
   * A clustering policy that clusters the nodes using *edge betweenness centrality*.
   * 
   * Value - `2`
   * @see [OrganicLayout.clusteringPolicy]
   * @see [OrganicLayout.qualityTimeRatio]
   * @see [yfiles.analysis.LayoutGraphAlgorithms.edgeBetweennessClustering]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy%23EDGE_BETWEENNESS">Online Documentation</a>
   */
  object EDGE_BETWEENNESS: OrganicLayoutClusteringPolicy
  
  /**
   * A clustering policy that clusters the nodes using the *label propagation algorithm*.
   * 
   * Value - `3`
   * @see [OrganicLayout.clusteringPolicy]
   * @see [yfiles.analysis.LayoutGraphAlgorithms.labelPropagation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy%23LABEL_PROPAGATION">Online Documentation</a>
   */
  object LABEL_PROPAGATION: OrganicLayoutClusteringPolicy
}
