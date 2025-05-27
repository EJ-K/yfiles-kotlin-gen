// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enum constants to define the clustering algorithm applied by the [OrganicLayout]
 * @see [OrganicLayout.clusteringPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy">Online Documentation</a>
 */
external sealed class OrganicLayoutClusteringPolicy: YEnum<OrganicLayoutClusteringPolicy> {
   companion object: EnumMetadata<OrganicLayoutClusteringPolicy> {
       /**
 * A policy that indicates that no automatic clustering is applied to the input graph.
 * 
 * Value - `0`
 * @see [OrganicLayout.clusteringPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy%23NONE">Online Documentation</a>
 */
val NONE: OrganicLayoutClusteringPolicy

/**
 * A clustering policy that clusters the nodes using the *louvain modularity method*.
 * 
 * Value - `1`
 * @see [OrganicLayout.clusteringPolicy]
 * @see [Groups.louvainModularity][yfiles.algorithms.Groups.louvainModularity]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy%23LOUVAIN_MODULARITY">Online Documentation</a>
 */
val LOUVAIN_MODULARITY: OrganicLayoutClusteringPolicy

/**
 * A clustering policy that clusters the nodes using *edge betweenness centrality*.
 * 
 * Value - `2`
 * @see [OrganicLayout.clusteringPolicy]
 * @see [OrganicLayout.clusteringQuality]
 * @see [Groups.edgeBetweennessClustering][yfiles.algorithms.Groups.edgeBetweennessClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy%23EDGE_BETWEENNESS">Online Documentation</a>
 */
val EDGE_BETWEENNESS: OrganicLayoutClusteringPolicy

/**
 * A clustering policy that clusters the nodes using the *label propagation algorithm*.
 * 
 * Value - `3`
 * @see [OrganicLayout.clusteringPolicy]
 * @see [Groups.labelPropagation][yfiles.algorithms.Groups.labelPropagation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy%23LABEL_PROPAGATION">Online Documentation</a>
 */
val LABEL_PROPAGATION: OrganicLayoutClusteringPolicy

/**
 * A clustering policy that considers *user-specified* node clusters.
 * 
 * Value - `4`
 * @see [OrganicLayout.clusteringPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutClusteringPolicy%23USER_DEFINED">Online Documentation</a>
 */
val USER_DEFINED: OrganicLayoutClusteringPolicy
   }
}
