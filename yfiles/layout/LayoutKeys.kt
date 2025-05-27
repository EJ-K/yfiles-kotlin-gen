// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.lang.Id

/**
 * Helper class that provides unique identifiers for some general purpose [data providers][yfiles.algorithms.IDataProvider].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys">Online Documentation</a>
 */
external object LayoutKeys {
/**
 * A data provider key for looking up the selected state of the edges in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
/**
 * A data provider key for looking up the selected state of the nodes in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23AFFECTED_NODES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for looking up a unique identifier for each edge in a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23EDGE_ID_DP_KEY">Online Documentation</a>
 */
 val EDGE_ID_DP_KEY: EdgeDpKey<Id>
/**
 * A data provider key for looking up a unique identifier for each node in a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23NODE_ID_DP_KEY">Online Documentation</a>
 */
 val NODE_ID_DP_KEY: NodeDpKey<Id>
/**
 * A data provider key for specifying the type of the nodes in the graph.
 * @see [OrganicLayout.parallelSubstructureStyle][yfiles.organic.OrganicLayout.parallelSubstructureStyle]
 * @see [OrganicLayout.starSubstructureStyle][yfiles.organic.OrganicLayout.starSubstructureStyle]
 * @see [OrganicLayout.cycleSubstructureStyle][yfiles.organic.OrganicLayout.cycleSubstructureStyle]
 * @see [OrganicLayout.chainSubstructureStyle][yfiles.organic.OrganicLayout.chainSubstructureStyle]
 * @see [OrganicLayout.parallelSubstructureTypeSeparation][yfiles.organic.OrganicLayout.parallelSubstructureTypeSeparation]
 * @see [OrganicLayout.starSubstructureTypeSeparation][yfiles.organic.OrganicLayout.starSubstructureTypeSeparation]
 * @see [OrthogonalLayout.treeStyle][yfiles.orthogonal.OrthogonalLayout.treeStyle]
 * @see [OrthogonalLayout.cycleStyle][yfiles.orthogonal.OrthogonalLayout.cycleStyle]
 * @see [OrthogonalLayout.chainStyle][yfiles.orthogonal.OrthogonalLayout.chainStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23NODE_TYPE_DP_KEY">Online Documentation</a>
 */
 val NODE_TYPE_DP_KEY: NodeDpKey<Any>
}
